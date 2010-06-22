#!/usr/bin/env ruby 
# require 'rubygems'
# require 'httparty'
# $DEBUG = true

# class Soap
#   include HTTParty
#   base_uri 'https://idtest.acxiom.com'
# 
#   def initialize(user, pass)
#     self.class.basic_auth user, pass
#     self.class.headers({"SOAPAction" => ""})
#   end
# 
#   def post(text)
#     self.class.post('/abilitec-postal/1.0', :query => {:xml => text})
#   end
# end
require 'rubygems'
require 'net/http' 
require 'uri'
require 'crack'

user = "flipy"
pass = "s5v@0fZp"
zip = "83401"
request = <<-EOF
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://id.acxiom.com/abilitec-postal/1.0">
   <soapenv:Header/>
   <soapenv:Body>
      <ns:cleanAddress>
         <PostalInput_1>
            <!--Zero or more repetitions:-->
            <addresses>
               <!--Zero or more repetitions:-->
               <addressLines>3674 Capstone Dr</addressLines>
               <city>Idaho Falls</city>
               <postalCode>#{zip}</postalCode>
               <state>ID</state>
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

require 'net/https'
require 'open-uri'


# Set Headers
headers = {
  'Content-type'=> 'text/xml; charset=utf-8',
  'SOAPAction'=> '""',
  'User-Agent'=> 'Ruby',
  'Host'=>  'idtest.axciom.com',
  'Content-Length'=> request.length
}

#create session object
uri = URI.parse("https://idtest.acxiom.com")
path = '/abilitec-postal/1.0'
http_session = Net::HTTP.new(uri.host, uri.port)
http_session.use_ssl = true

#start the http session
response = {}
http_session.start { |http|
  # create the request
  req = Net::HTTP::Post.new(path)
  req.basic_auth user, pass
  headers.each{|key, val| req.add_field(key, val)}
  # Post the request
  resp, data = http.request(req, request)
  puts 'Code = ' + resp.code
  puts 'Message = ' + resp.message
  resp.each { |key, val| puts key + ' = ' + val }
  response = Crack::XML.parse(data)
  
}

puts response["soapenv:Envelope"]["soapenv:Body"]["ns1:cleanAddressResponse"]["result"].keys.join("\n")



