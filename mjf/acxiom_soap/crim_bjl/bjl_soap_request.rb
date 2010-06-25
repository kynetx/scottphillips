require 'soap_request2'
require 'json'


class BJLSoapRequest < SoapRequest

  def initialize(production=true, cache=false)
    endpoint = production ? "https://idriskprod.acxiom.com" : "https://idrisktest.acxiom.com"

    super({
      :endpoint => endpoint,
      :path => "/risk-bjl/1.0",
      :username => "dnb99",
      :password => "hF3@K9Z0",
      :cache => cache,
      :use_ssl => true
    })

  end

  def get_interface(func, format = :hash)
    interface = {}
    interface["getByAnyName"] = {
      :first_name => "",
      :last_name => ""}

    interface["getByDefendantNameAddress"] = {
      :address => {
        :address_line => "",
        :city => "",
        :po_box => "",
        :state => "",
        :street_direction => "",
        :street_name => "",
        :street_number => "",
        :street_type => "",
        :unit_number => "",
        :zip => "",
        :zip4 => ""
      },
      :name => {
        :first_name => "",
        :last_name => ""
      }}

    interface["getByDefendantSSN"] = {
      :ssn => ""}

    interface["getByFullSearch"] =  {
      :amount_high => "",
      :amount_low => "",
      :any_name => {
        :first_name => "",
        :last_name => "",
      },
      :attorney => "",
      :case_number => "",
      :case_type => "",
      :court_name => "",
      :defendant => {
        :address => {
          :address_line => "",
          :city => "",
          :po_box => "",
          :state => "",
          :street_direction => "",
          :street_name => "",
          :street_number => "",
          :street_type => "",
          :unit_number => "",
          :zip => "",
          :zip4 => ""
          },
        :name => "",
        :ssn => ""
      },
      :filing_date_end => "",
      :filing_date_start => "",
      :filing_description => "",
      :plaintiff => "",
      :unlawful_detailment_flag => ""
    }

    result = func == :all ? interface : interface[func]
       
    case format
    when :hash then return result
    when :xml then return result.to_xml
    when :json then return result.to_json
    else return result
    end
    
  end


  def get_by_any_name(criteria, format = :hash)
    default_tags = get_interface("getByAnyName")
    default_tags.merge!(criteria)
    run_request("getByAnyName", default_tags)
    case format
    when :hash then return strip_head("getByAnyName")
    when :json then return strip_head("getByAnyName").to_json
    when :xml  then return strip_head("getByAnyName").to_xml
    when :raw  then return @response
    else 
      return strip_head("getByAnyName")
    end
  end


  def get_by_defendant_name_address(criteria, format = :hash)
    default_tags = get_interface("getByDefendantNameAddress")
    default_tags.merge!(criteria)    
    run_request("getByDefendantNameAddress", default_tags)
    case format
    when :hash then return strip_head("getByDefendantNameAddress")
    when :json then return strip_head("getByDefendantNameAddress").to_json
    when :xml  then return strip_head("getByDefendantNameAddress").to_xml
    when :raw  then return @response
    else 
      return strip_head("getByDefendantNameAddress")
    end
  end

  def get_by_defendant_ssn(ssn, format = :hash)
    run_request("getByDefendantSSN", {:ssn => ssn})
    case format
    when :hash then return strip_head("getByDefendantSSN")
    when :json then return strip_head("getByDefendantSSN").to_json
    when :xml  then return strip_head("getByDefendantSSN").to_xml
    when :raw  then return @response
    else 
      return strip_head("getByAnyName")
    end
  end
  
  def get_by_full_search(criteria, format = :hash)
    default_tags = get_interface("getByFullSearch")
    default_tags.merge!(criteria)    
    run_request("getByFullSearch", default_tags)
    case format
    when :hash then return strip_head("getByFullSearch")
    when :json then return strip_head("getByFullSearch").to_json
    when :xml  then return strip_head("getByFullSearch").to_xml
    when :raw  then return @response
    else 
      return strip_head("getByAnyName")
    end
  end
  
  def strip_head(func)
    h = to_h
    begin
      return h["ns2:#{func}Response"]["return"]
    rescue
      return h
    end
    
  end
  
  private

  def build_request(func, input)
    
    req = <<-XML 
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://id.acxiom.com/risk-bjl/1.0">
   <soapenv:Header>
      <ns:RiskHeader>
         <clientIP>209.41.75.73</clientIP>
	 <reasonCode>2</reasonCode>
      </ns:RiskHeader>
   </soapenv:Header>
   <soapenv:Body>
      <ns:#{func}>
         <input>
	  #{input.to_xml}
         </input>
      </ns:#{func}>
   </soapenv:Body>
</soapenv:Envelope>
    XML

    return req
  end


  def run_request(func, input)
    req = build_request(func, input)
    run req
  end
end
