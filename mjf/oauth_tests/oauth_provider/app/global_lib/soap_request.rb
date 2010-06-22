require 'rubygems'
require 'net/https'
require 'open-uri'
require 'crack' 
require 'digest/sha1'

class SoapRequest
  attr_reader :uri, :path, :request, :response
  
  def initialize(path_to_endpoint, production_endpoint=false)
    @uri = production_endpoint ? PROD_ENDPOINT : TEST_ENDPOINT
    @path = path_to_endpoint
    @username = ACXIOM_USER
    @password = ACXIOM_PASS
    @request = ""
    @response = ""
  end
  
  def do(req, cache=true)
    @request = req
    if cache 
      key = Digest::SHA1.hexdigest(req)
      @response = Rails.cache.fetch(key) { perform_request }
    else
      @response = perform_request 
    end
    
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
      'Host'=>  'idtest.Acxiom.com',
      'Content-Length'=> @request.length
    }

    #create session object
    uri = URI.parse(@uri)
    http_session = Net::HTTP.new(uri.host, uri.port)
    http_session.use_ssl = true

    #start the http session
    http_session.start do |http|
      # create the request
      req = Net::HTTP::Post.new(@path)
      req.basic_auth @username, @password
      headers.each{|key, val| req.add_field(key, val)}
      # Post the request
      resp, data = http.request(req, @request)
      puts 'Code = ' + resp.code if $DEBUG
      puts 'Message = ' + resp.message if $DEBUG
      resp.each { |key, val| puts key + ' = ' + val } if $DEBUG
    end

    return data
  end
  
end


# get rid of the SSL warning
# class Net::HTTP
#   alias_method :old_initialize, :initialize
#   def initialize(*args)
#     old_initialize(*args)
#     @ssl_context = OpenSSL::SSL::SSLContext.new
#     @ssl_context.verify_mode = OpenSSL::SSL::VERIFY_NONE
#   end
# end