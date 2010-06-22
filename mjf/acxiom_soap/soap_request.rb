require 'rubygems'
require 'net/https'
require 'open-uri'
require 'crack' 
require 'active_support'
require 'digest/sha1'

AXCIOM_USER = "flipy"
AXCIOM_PASS = "s5v@0fZp"
AXCIOM_ORDER_ID = '2642'
TEST_ENDPOINT = "https://idtest.acxiom.com"
PROD_ENDPOINT = "https://idprod.acxiom.com"

$elements = {
'7795' => 'Investments - Stocks / Bonds',
'8165' => 'Vehicle - Truck/Motorcycle/RV Owner',
'8600' => 'Adult Age Ranges Present in Household',
'8601' => 'Children''s Age Ranges - New',
'8602' => 'Number of Children - New',
'8604' => 'Occupation - 1st Individual',
'8606' => 'Home Owner / Renter',
'8607' => 'Length of Residence',
'8608' => 'Dwelling Type',
'8609' => 'Marital Status in the Household',
'8614' => 'Base Record Verification Date',
'8615' => 'Mail Order Buyer',
'8616' => 'Age in Two-Year Increments - 1st Individual',
'8619' => 'Working Woman',
'8620' => 'Mail Order Responder',
'8621' => 'Credit Card Indicator',
'8622' => 'Presence of Children - New',
'8626' => 'Age in Two-Year Increments - Input Individual',
'8628' => 'Number of Adults',
'8629' => 'Household Size',
'8637' => 'Occupation - Input Individual',
'8641' => 'Income - Estimated Household',
'8642' => 'Home Market Value',
'8647' => 'Vehicle - Known Owned Number',
'8648' => 'Vehicle - Dominant Lifestyle Indicator',
'8688' => 'Gender - Input Individual',
'9300' => 'Personicx Cluster Code',
'9509' => 'Education - 1st Individual',
'9514' => 'Education - Input Individual',
'9533' => 'Race Code - Input Individual'
}

class SoapRequest
  attr_reader :uri, :path, :password, :request, :response, :success
  
  def initialize(path, prod=false)
    @uri = prod ? PROD_ENDPOINT : TEST_ENDPOINT
    @path = path
    @username = AXCIOM_USER
    @password = AXCIOM_PASS
    @request = ""
    @response = ""
  end
  
  def do(req, cache=true)
    @request = req
    

    if cache 
      key = Digest::SHA1.hexdigest(req)
      cache = ActiveSupport::Cache.lookup_store(:mem_cache_store)
      @response = cache.fetch(key) { perform_request }
    else
      @response = perform_request 
    end
    #@response = perform_request
    
    # puts "REQUEST"
    # puts @request
    # 
    # puts "RESPONSE"
    # puts @response
    
    unless @response.empty?
      return @response 
    else
      raise "Unable to process request: #{$!}"
    end
    
  end
  
  def to_h 
    return {} if @response.empty?    
    r = Crack::XML.parse(@response)
    r["soapenv:Envelope"]["soapenv:Body"]
  end
  
  
  private
  
  def perform_request
    data = ""
    headers = {
      'Content-type'=> 'text/xml; charset=utf-8',
      'SOAPAction'=> '""',
      'User-Agent'=> 'Ruby',
      'Host'=>  'idtest.axciom.com',
      'Content-Length'=> @request.length
    }

    #create session object
    uri = URI.parse(@uri)
    http_session = Net::HTTP.new(uri.host, uri.port)
    http_session.use_ssl = true

    #start the http session
    http_session.start { |http|
      # create the request
      req = Net::HTTP::Post.new(@path)
      req.basic_auth @username, @password
      headers.each{|key, val| req.add_field(key, val)}
      # Post the request
      resp, data = http.request(req, @request)
      puts 'Code = ' + resp.code if $DEBUG
      puts 'Message = ' + resp.message if $DEBUG
      resp.each { |key, val| puts key + ' = ' + val } if $DEBUG
    }

    return data
  end
  
end

class AxciomRequest
  
  def self.postal(data={}, cache=true)
    addr = data[:addr].upcase
    city = data[:city].upcase
    state = data[:state].upcase
    zip = data[:zip]
    
    s = SoapRequest.new('/abilitec-postal/1.0')
    req = req = <<-EOF
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://id.acxiom.com/abilitec-postal/1.0">
       <soapenv:Header/>
       <soapenv:Body>
          <ns:cleanAddress>
             <PostalInput_1>
                <!--Zero or more repetitions:-->
                <addresses>
                   <!--Zero or more repetitions:-->
                   <addressLines>#{addr}</addressLines>
                   <city>#{city}</city>
                   <postalCode>#{zip}</postalCode>
                   <state>#{state}</state>
                   <urbanization/>
                </addresses>
                <options>
                   <useLACSLink>false</useLACSLink>
                </options>
             </PostalInput_1>
          </ns:cleanAddress>
       </soapenv:Body>
    </soapenv:Envelope>
    EOF
    
    begin
      s.do(req, cache)
      return s.to_h["ns1:cleanAddressResponse"]["result"]
    rescue
      raise "Unable to get a valid postal address: #{$!}"
    end
    
  end
  
  def self.address(data={}, zip4="    ", cache=true)
    fname = data[:fname].upcase
    lname = data[:lname].upcase
    addr = data[:addr].upcase
    city = data[:city].upcase
    state = data[:state].upcase
    zip = data[:zip]
    
    s = SoapRequest.new("/infobase-nameAddress/1.0")
    req = <<-EOF
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://id.acxiom.com/infobase-nameAddress/1.0">
       <soapenv:Header/>
       <soapenv:Body>
          <ns:getByNameAddress>
             <NameAddressInfobaseInput_1>
                <!--Zero or more repetitions:-->
                <customData>
                   <name>ZIP</name>
                   <value>#{zip}</value>
                </customData>
                <customData>
                   <name>ZIP4</name>
                   <value>#{zip4}</value>
                </customData>
                <name>
                   <firstName>#{fname}</firstName>
                   <lastName>#{lname}</lastName>
                   <middleInitial/>
                   <suffix/>
                </name>
                <orderId>2642</orderId>
                <unparsedAddress>
                   <!--Zero or more repetitions:-->
                   <addressLines>#{addr}</addressLines>
                   <city>#{city}</city>
                   <postalCode>#{zip}</postalCode>
                   <state>#{state}</state>
                   <urbanization/>
                </unparsedAddress>
             </NameAddressInfobaseInput_1>
          </ns:getByNameAddress>
       </soapenv:Body>
    </soapenv:Envelope>
    EOF
    
    begin
      s.do(req, cache)
      
      return s.to_h["ns1:getByNameAddressResponse"]["result"]
    rescue
      raise "Unable to get address data: #{$!} :: #{s.response}"
    end
  end
  
  
  
end

# get rid of the SSL warning
class Net::HTTP
  alias_method :old_initialize, :initialize
  def initialize(*args)
    old_initialize(*args)
    @ssl_context = OpenSSL::SSL::SSLContext.new
    @ssl_context.verify_mode = OpenSSL::SSL::VERIFY_NONE
  end
end
