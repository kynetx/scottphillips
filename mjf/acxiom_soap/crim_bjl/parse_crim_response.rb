require 'criminal_soap_request'
require 'yaml'
PERFORM_CACHING = true


def flatten_hash(h)
  r = {}

  if h["value"] == {"xsi:type" => "soapenc:string"}
    h["value"] = ""
  elsif h["value"].class.to_s == "String"
    h["value"].strip!
  end

  r[h["key"]] = h["value"]
  return r
end

def extract_offenses(offenses_hash)
  results = []

  
  puts "Number of Offenses: " + offenses_hash["value"].length.to_s

  offenses_hash["value"].each do |offense|
    begin
      puts "OFFENSE: #{offense.inspect}"
      if offense.keys.include?("item")
        offense_items = offense["item"]["value"]["item"]
      else
	puts "Unrecognized format: \n #{YAML.dump(offense)}"
      end
      
      offense = {}
      offense_items.each do |oi|
	offense.merge!(flatten_hash(oi))
      end
      results << offense

    rescue
      puts "ERROR"
      puts offense.inspect
      puts "-"*10
      puts offenses_hash.inspect
      raise $!
    end
    
  end

  return results
end



c = CriminalSoapRequest.new(PERFORM_CACHING)
results = c.get_results({:name => "Derek Ortiz", :state => "IL", :max_rows => "2"})


result_meta = {}
match_data = []

results.each do |result_info|
  # Get the meta
  result_meta.merge!(flatten_hash(result_info)) unless result_info["key"] == "RESULTS"

  # disect the RESULTS
  if result_info["key"] == "RESULTS"
    data = result_info["value"]
    matches = result_info["value"]["value"]

    puts "Num Matches #{matches.length.to_s}"

    matches.each do |match|
      puts "="*50
      puts "OFFENDER"
      m = flatten_hash(match["item"])
     
      offender_items = m["OFFENDER"]["item"]
      
      record = record_type = arecord_type = nil

      offender_items.each do |o_item|
	      oi = flatten_hash(o_item)

      	record = oi["RECORD"] if oi["RECORD"]
      	record_type = oi["RECORDTYPE"] if oi["RECORDTYPE"]
      	arecord_type = oi["ARECORDTYPE"]  if oi["ARECORDTYPE"]
      end
      
      mdata = {
      	:record_type => record_type,
      	:arecord_type => arecord_type,
      	:personal_data => {}
      }
      
      records = record["item"]
      

      records.each do |rec|
	      r = flatten_hash(rec)
      	new_key = r.keys.first
      	# val = r[new_key] == {"xsi:type" => "soapenc:string"} ? "" : r[new_key]
      	# add personal data
      	if r[new_key].class.to_s == "String"
      	  mdata[:personal_data].merge!(r)
      	else
      	  puts "MO DATA: #{new_key} of type #{r[new_key].class}"
      	  mdata[:offenses] = extract_offenses(r[new_key]) if new_key == "OFFENSES"
      	end

      end



      #puts "Record Keys: #{record["item"].first.keys.join(", ")}"


      match_data << mdata      
    end

  end

end

puts result_meta.inspect
puts match_data.first.inspect
