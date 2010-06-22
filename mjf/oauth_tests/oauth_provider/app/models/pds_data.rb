

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



class PDSData
  
  # Check the address against the Acxiom interface
  def check_address(user)
    r = postal user, true
    result = {}
    if r["deliveryPointValidation"]["match"] == "true"
      result[:found] = true
      result[:address] = r["parsedAddress"]
    else
      result[:found] = false
    end
    return result     
  end
  
  
  def do_acxiom_request(data, element)
    r = address(data, "    ", true)
    val = ""
    r["IBEOutput"].each do |elements|
      if elements["name"].to_i == element.to_i
        val = elements["value"]
      end
    end
    
    return val 
  end
  
  def lookup_label(element)
    return $elements[element.to_s]
  end
  
  
  private
  
  def postal(data={}, cache=true)
    addr = data[:street_address].upcase
    city = data[:street_city].upcase
    state = data[:street_st].upcase
    zip = data[:street_zip]
    
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
    rescue Exception => e
      raise "Unable to get a valid postal address: #{e.message} :: #{e.backtrace}"
    end
    
  end
  
  def address(data={}, zip4="    ", cache=true)
    fname = data[:first_name].upcase
    lname = data[:last_name].upcase
    addr = data[:street_address].upcase
    city = data[:street_city].upcase
    state = data[:street_st].upcase
    zip = data[:street_zip]
    
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
