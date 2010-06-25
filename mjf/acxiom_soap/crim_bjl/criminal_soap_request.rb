require 'soap_request2'
require 'json'


class CriminalSoapRequest < SoapRequest
  COMPLEX_DATA_KEYS = %(OFFENSES ALIASES SENTENCES)
  
  def initialize(cache=false)
    super({
      :endpoint => "http://insightgateways.com",
      :path => "/crimsor.cfc",
      :username => "dnb99",
      :password => "hF3@K9Z0",
      :cache => cache,
      :use_ssl => false
      })

      # The criteria hash has 1 or more of the following keys:
      # :name (name of an offender. Last First or First Last will work)
      # :birthdate (birthdate of offender or offenders in YYYYMMDD.  Can use wildcard such as 1987* for all offenders born in 1987)
      # :state (2 letter abbreviation for the state the offender lives in or was convicted in)
      # :offense (Type of offense, such as “AGGRAVATED ASSAULT”)
      # :conviction_date (The date the offender was convicted in the YYYMMDD format. Specifying “20020101” will result in a list of of offenders with offense date of January 1st, 2002.  A wildcard (*) may be used to broaden the search on this tag.  As an example, “2002*” will yield a list of offenders that committed an offense in 2002.)
      # :include_null_dobs (Indicates whether records with null DOB fields are to be included in a search. Applies only to searches that include DOB and at least one other search parameter as search critieria - it has no meaning for any other type of searches. Valid values are “yes” and “no”. The default value is “no”.)


      # defaults
      @default_criteria = {}
      @default_criteria[:name] = ""
      @default_criteria[:state] = ""
      @default_criteria[:birthdate] = ""
      @default_criteria[:offense] = ""
      @default_criteria[:conviction_date] = ""
      @default_criteria[:include_null_dobs] = "no"


      @template = '<TAG xsi:type="soapenc:string" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">?</TAG>' + "\n"

    end

  def get_interface(func, format = :hash)
    interface = {}
    interface["getCount"] = {}.replace(@default_criteria)
    interface["getResults"] = {}.replace(@default_criteria)
    interface["getResults"][:start_row] = "1"
    interface["getResults"][:max_rows] = "50"


    result = func == :all ? interface : interface[func]

    case format
    when :hash then return result
    when :xml then return result.to_xml
    when :json then return result.to_json
    else return result
    end

  end

  def get_results(criteria, format = :hash)
    params = get_interface("getResults").merge(criteria)
    response = run_request("getResults", params)
    
    case format
    when :hash then return parse_response(response)
    when :xml then return parse_response(response).to_xml
    when :json then return parse_response(response).to_json
    when :raw then return response
    else return parse_response(response)
    end
    
  end

  def get_count(criteria)
    params = get_interface("getCount").merge(criteria)
    return run_request("getCount", params)  
  end


  private

  def build_criteria(criteria)
    # Add the standard params.
    criteria[:user_id] = @username
    criteria[:password] = @password
    criteria[:version] = "1.10"
    criteria[:client_code] = "KPDS Search"

    params = ""
    criteria.each do |k, v| 
      begin
        tag = k == :user_id ? "UserID" : k.to_s.camelize
        params += @template.gsub("TAG", tag).gsub("?", v)
      rescue
        raise "Unable to generate params using key: '#{k.to_s}' and value: '#{v.to_s}'"
      end
    end

    return params
  end

  def build_request(func, criteria)
    params = build_criteria(criteria)
    req = <<-XML 
    <soapenv:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:def="http://DefaultNamespace">
    <soapenv:Header/>
    <soapenv:Body>
    <def:#{func} soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
    #{params}
    </def:#{func}>
    </soapenv:Body>
    </soapenv:Envelope>
    XML

    #puts "REQUEST: \n#{req}"

    return req 	
  end

  def run_request(func, criteria)
    @req = build_request(func, criteria)

    begin
      run @req
      response = to_h

      status = ""
      codes = ""
      if response["ns1:#{func}Response"]
        codes = response["ns1:#{func}Response"]["#{func}Return"]["item"] 
        codes.each do |code|
          status = code["value"]; break if code["key"] == "STATUS"
        end
      elsif response["soapenv:Fault"]
        status = "ERROR: #{response["soapenv:Fault"]["faultstring"]} \n REQUEST \n #{@req}"
      else
        status = "ERROR: Unknown response. \n #{response.inspect}"
      end

      if status == "YES"
        return codes
      else
        return "Response returned with a status of '#{status}'. \n RESPONSE \n #{response.inspect}" 
      end

    rescue Exception => e
      raise "Invalid Response. #{e.message} \n #{e.backtrace}"
    end
  end


  def parse_response(response)
    result_meta = {}
    offender_data = []

    response.each { |result| result_meta.merge!(result.rehash) unless result["key"] == "RESULTS" }


    if result_meta["ROWSRETURNED"].to_i > 0 && result_meta["STATUS"] == "YES"
      # get offenders
      soap_matches = get_key_from_array("RESULTS", response)
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
      
      # extract offender data
      soap_offenders.each do |soap_offender|
        so = soap_offender["item"].rehash["OFFENDER"]

        soap_offender_details = get_key_from_array("RECORD",so["item"])
        offender_detail = {}

        soap_offender_detail_items = get_kv_from_item(soap_offender_details)
        soap_offender_detail_items.each do |item|      
          offender_detail.merge!(item) unless COMPLEX_DATA_KEYS.include? item.keys.first      
        end

        extract_complex_data("OFFENSES", soap_offender_detail_items, offender_detail)
        extract_complex_data("ALIASES", soap_offender_detail_items, offender_detail)
        extract_complex_data("SENTENCES", soap_offender_detail_items, offender_detail)

        offender_data.push offender_detail
      end
    end
    return {:meta => result_meta, :offenders => offender_data}
  end



  # ------ Parsing helper methods ------
  def get_kv_from_item(items)  
    arr = []
    items["item"].each do |item|
      arr.push item.rehash
    end
    return arr
  end

  def get_key_from_array(key, arr, rehash=true)
    raise "Got #{arr.class} when expecting an Array." if arr.class.to_s != "Array"
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

    soap_detail_arr.each do |soap_details|      
      detail_items = get_kv_from_item(soap_details["item"].rehash[complex_data_map[type]])
      detail[type].push detail_items
    end

  end

end

class Hash
  
  # rehash takes a hash that looks like this {"key" = "SOMEKEY",  "value" => "SOMEVAL"}
  # and turns it into this: {"SOMEKEY" => "SOMEVAL"}
  # it also turns {"key" = "SOMEKEY",  "value" => {"xsi:type" => "soapenc:string"}}
  # into this: {"key" = "SOMEKEY",  "value" => ""}
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
      raise "NOT KEY/VALUE: #{self.examine("ERROR: NOT KEY/VALUE")}"
    end
    return new_hash    
  end
end

class Array
  
  def rehash
    raise "You got an array when you were expecting a Hash."
    return self
  end
  
  # as_hash converts a 2 element array into a hash with the first element being the key
  def as_hash
    raise "Array must have 2 elements." if self.length != 2
    return {self.first => self.last}
  end
  
end


  # TEST

  #require 'yaml'

  #c = CriminalSoapRequest.new

  #puts c.get_interface(:all, :json)
  #puts "="*20
  #results = c.get_count({:name => "Derek Ortiz", :state => "IL"})
  #puts YAML::dump(results)
  #puts "="*20
  #results = c.get_results({:name => "Derek Ortiz", :state => "IL", :max_rows => "2"})
  #puts YAML::dump(results)

  #puts "="*20
  #puts results.inspect
  #puts "="*20
