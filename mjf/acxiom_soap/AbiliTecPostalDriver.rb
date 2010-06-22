require 'AbiliTecPostal.rb'
require 'AbiliTecPostalMappingRegistry.rb'
require 'soap/rpc/driver'

class PostalEndpoint < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http://idtest.acxiom.com:80/abilitec-postal/1.0"

  Methods = [
    [ "",
      "cleanAddress",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://id.acxiom.com/abilitec-postal/1.0", "cleanAddress"]],
        ["out", "result", ["::SOAP::SOAPElement", "http://id.acxiom.com/abilitec-postal/1.0", "cleanAddressResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"InputValidationException"=>{:encodingstyle=>"document", :ns=>"http://id.acxiom.com/abilitec-postal/1.0", :use=>"literal", :namespace=>nil, :name=>"InputValidationException"}, "SystemUnavailableException"=>{:encodingstyle=>"document", :ns=>"http://id.acxiom.com/abilitec-postal/1.0", :use=>"literal", :namespace=>nil, :name=>"SystemUnavailableException"}, "InputLimitException"=>{:encodingstyle=>"document", :ns=>"http://id.acxiom.com/abilitec-postal/1.0", :use=>"literal", :namespace=>nil, :name=>"InputLimitException"}} }
    ]
  ]

  def initialize(endpoint_url = nil)
    endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = AbiliTecPostalMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = AbiliTecPostalMappingRegistry::LiteralRegistry
    init_methods
  end

private

  def init_methods
    Methods.each do |definitions|
      opt = definitions.last
      if opt[:request_style] == :document
        add_document_operation(*definitions)
      else
        add_rpc_operation(*definitions)
        qname = definitions[0]
        name = definitions[2]
        if qname.name != name and qname.name.capitalize == name.capitalize
          ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
            __send__(name, *arg)
          end
        end
      end
    end
  end
end

