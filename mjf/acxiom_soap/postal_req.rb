require 'soap_request'

user = "flipy"
pass = "s5v@0fZp"
addr = "86 west 1100 south"
city = "farmington"
state = "UT"
zip = "84025"
#zip4 = 2126
req = <<-EOF
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

uri = "https://idtest.acxiom.com"
path = '/abilitec-postal/1.0'

s = SoapRequest.new(uri, path, user, pass)
s.do req

puts s.to_h.inspect
