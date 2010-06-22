require 'soap_request'
def hello_world
  puts 
	
end

user = "flipy"
pass = "s5v@0fZp"
zip = "83401"
req = <<-EOF
<?xml version='1.0' encoding='UTF-8'?>
<env:Envelope xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/'
              xmlns:env='http://schemas.xmlsoap.org/soap/envelope/'
              xmlns:xsd='http://www.w3.org/2001/XMLSchema'
              xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'  
              xmlns:ns0='http://id.acxiom.com/infobase-metadata/1.0'>
  <env:Body>
    <ns0:getOrdersDetail>
      <MetadataInfobaseInput_1>
        <customerId>flipy</customerId>
        <orderId>2642</orderId>
      </MetadataInfobaseInput_1>
    </ns0:getOrdersDetail>
  </env:Body>  
</env:Envelope>
EOF

uri = "https://idtest.acxiom.com"
path = '/infobase-metadata/1.0'

s = SoapRequest.new(uri, path, user, pass)
s.do req

elements = s.to_h["ns1:getOrdersDetailResponse"]["result"]["product"]["elements"]

elements.each do |element|
  element.each do |k, v|
    puts "#{k} ==> #{v.inspect}"
  end
end
