#!/usr/bin/env ruby

require "soap_request2"


#$DEBUG = true

class CriminalTestConnection < SoapRequest

  def initialize

    super({
      :endpoint => "http://insightgateways.com",
      :path => "/crimsor.cfc",
      :username => "dnb99",
      :password => "hF3@K9Z0",
      :cache => false,
      :use_ssl => false
    })
	
  end

  def do_test
    @req = <<-XML
<soapenv:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:def="http://DefaultNamespace">
   <soapenv:Header/>
   <soapenv:Body>
      <def:testConnection soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
	 <UserID xsi:type="soapenc:string" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">#{@username}</UserID>
	 <Password xsi:type="soapenc:string" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">#{@password}</Password>
	 <Version xsi:type="soapenc:string" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/">1.10</Version>
      </def:testConnection>
   </soapenv:Body>
</soapenv:Envelope>
    XML

    run(@req)
    response = to_h

    codes = response["ns1:testConnectionResponse"]["testConnectionReturn"]["item"]

    status = ""
    codes.each do |code|
      status = code["value"] if code["key"] == "STATUS"
    end
    puts status

    return status
  end
end


# TEST

c = CriminalTestConnection.new
c.do_test

