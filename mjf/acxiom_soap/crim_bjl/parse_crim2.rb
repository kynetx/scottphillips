require 'criminal_soap_request'
require 'yaml'
require 'pp'
PERFORM_CACHING = false



class Hash
  
  def rehash
    new_hash = {}
    if self.keys.include?("key") && self.keys.include?("value")
      
      if self["value"] == {"xsi:type" => "soapenc:string"}
        self["value"] = ""
      elsif self["value"].class.to_s == "String"
        self["value"].strip!
      end
      
      new_hash[self["key"]] = self["value"]
      
    else
      puts "NOT KEY/VALUE: #{self.examine("ERROR: NOT KEY/VALUE")}"
    end
    
    
    # new_hash[:type] = self["xsi:type"] if self.key?("xsi:type")

    return new_hash
    
  end
  
  
  def examine(msg=nil, k=nil)
    puts "="*50
    puts "HASH (#{self.length}) KEYS #{msg.to_s}"
    puts self.keys.join("\n")
    puts "---------\nKEY(#{k}):#{self[k].inspect}\n-----------" if k.class.to_s == "String"
    puts "HASH DATA:\n#{self.inspect}" if k == :all
    # puts "-"*50
    
  end
  
end

class Array
  
  def rehash
    puts "You got an array when you were expecting a Hash"
    return self
  end
  
  def examine(msg=nil, show_contents = nil)
    puts "="*50
    puts "ARRAY (#{self.length}) #{msg.to_s}"
    puts self.inspect if show_contents == :all
    puts self.first.inspect if show_contents == :first
    puts self.last.inspect if show_contents == :last
    puts self[show_contents].inspect if show_contents.class.to_s == "Fixnum"
    # puts "-"*50
  end
  
  def as_hash
    # converts a 2 element array into a hash with the first element being the key
    raise "cannot perform as_hash on an array with more than 2 elements" if self.length != 2
    return {self.first => self.last}
  end
  
end

class String
  
  def examine(msg=nil, *args)
    puts "="*50
    puts "STRING #{msg.to_s}\n#{self.inspect}"
  end
  
end

class NilClass
  def examine(msg=nil, *args)
    2.times { puts }
    puts "="*50
    puts "NIL: #{msg}"
  end
end

#------------- Custom Methods

COMPLEX_DATA_KEYS = %(OFFENSES ALIASES SENTENCES)

def get_kv_from_item(items)  
  arr = []
  items["item"].each do |item|
    arr.push item.rehash
  end
  return arr
end

def get_key_from_array(key, arr, rehash=true)
  raise "Got #{arr.class} when expecting an array." if arr.class.to_s != "Array"
  val = ""
  if rehash
    arr.each { |v| val = v.rehash[key]; break unless v.rehash[key].nil? }
  else
    arr.each { |v| val = v[key]; break unless v[key].nil? }
  end
  return val
end

def extract_complex_data(type, soap_detail_items, detail)
  detail[type] = []
  
  # get the detail
  soap_detail = get_key_from_array(type,soap_detail_items, false)
  
  return if soap_detail["value"].nil?
  
  #make sure they are in an array, they aren't if only 1 is returned
  soap_detail_arr = []
  if soap_detail["value"].class.to_s == "Array"
    soap_detail_arr = soap_detail["value"]
  else
    soap_detail_arr = [soap_detail["value"]]
  end
  
  complex_data_map = {
    "OFFENSES" => "OFFENSE",
    "ALIASES" => "ALIAS",
    "SENTENCES" => "SENTENCE"
  }
        
  #soap_detail_arr.examine("Soap Detail Array", :first)    
        
  soap_detail_arr.each do |soap_details|      
    detail_items = get_kv_from_item(soap_details["item"].rehash[complex_data_map[type]])
    detail[type].push detail_items
  end
  
end

def header(msg=nil)
  puts
  puts ("-"*20) + msg.to_s + ("-"*20)
end

c = CriminalSoapRequest.new(PERFORM_CACHING)
# results = c.get_results({:name => "Jose Bijarro", :state => "IL", :max_rows => "2"})
#results = c.get_results({:name => "Derek Ortiz", :state => "IL", :max_rows => "2"})
results = c.get_results({:name => "BOB JONES", :state => "NY", :max_rows => "2"})


result_meta = {}
offender_data = []

results.each { |result|  result_meta.merge!(result.rehash) unless result["key"] == "RESULTS" }


if result_meta["ROWSRETURNED"].to_i > 0 && result_meta["STATUS"] == "YES"
  # get offenders
  # header "Good Search with #{result_meta["ROWSRETURNED"].to_i} offender(s)."
  
  soap_matches = get_key_from_array("RESULTS", results)
  
  # soap_matches["value"].examine "soap matches"
  
  soap_offenders = []
  if soap_matches["value"].class.to_s == "Hash"
    # returned only 1 result
    soap_offenders.push soap_matches["value"]
  elsif soap_matches["value"].class.to_s == "Array"
    # returned > 1 results
    soap_offenders = soap_matches["value"]
  else
    raise "Unparsable result."
  end
    
  # soap_offenders.examine("SOAP Offenders")
  
  # extract offender data
  soap_offenders.each do |soap_offender|
    header "New Offender"
    so = soap_offender["item"].rehash["OFFENDER"]
    
    soap_offender_details = get_key_from_array("RECORD",so["item"])
    offender_detail = {}
    
    soap_offender_detail_items = get_kv_from_item(soap_offender_details)
    soap_offender_detail_items.each do |item|      
      offender_detail.merge!(item) unless COMPLEX_DATA_KEYS.include? item.keys.first      
    end
    
    # header "Extract Offenses"
    extract_complex_data("OFFENSES", soap_offender_detail_items, offender_detail)
    # offender_detail["OFFENSES"].examine "Offenses"
    
    # header "Extract Aliases"
    extract_complex_data("ALIASES", soap_offender_detail_items, offender_detail)
    # offender_detail["ALIASES"].examine "Aliases"
    
    # header "Extract Sentences"
    extract_complex_data("SENTENCES", soap_offender_detail_items, offender_detail)
    # offender_detail["SENTENCES"].examine "Sentences"
    
    
    offender_data.push offender_detail
    # offender_data.examine("offender_data (should increment with each offender)")

  end
  

end

10.times {puts}
header "Final output"
crim_data = {:meta => result_meta, :offenders => offender_data}
puts crim_data.to_json