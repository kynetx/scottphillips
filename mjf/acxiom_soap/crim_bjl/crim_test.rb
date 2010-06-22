require 'criminal_soap_request'

PERFORM_CACHING = true

c = CriminalSoapRequest.new(PERFORM_CACHING)
result = c.get_results({:name => "Brian David Mitchell", :state => "CA", :max_rows => "2"}, :json)

puts result.inspect

