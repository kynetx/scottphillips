require 'soap_request'

user = "flipy"
pass = "s5v@0fZp"
fname = "DAVID"
lname = "MCNAMEE"
addr = "86 west 1100 south"
city = "farmington"
state = "UT"
zip = "84025"
zip4 = "2126"
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
               <postalCode>#{state}</postalCode>
               <state>#{zip}</state>
               <urbanization/>
            </unparsedAddress>
         </NameAddressInfobaseInput_1>
      </ns:getByNameAddress>
   </soapenv:Body>
</soapenv:Envelope>
EOF

uri = "https://idtest.acxiom.com"
path = '/infobase-nameAddress/1.0'

s = SoapRequest.new(uri, path, user, pass)
s.do req

puts s.request
puts "-----"
puts s.response