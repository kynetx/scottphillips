require 'rubygems'
require 'net/https'
require 'open-uri'
require 'crack' 
require 'active_support'
require 'digest/sha1'
require 'timeout'

class SoapRequest
  attr_reader :uri, :path, :password, :request, :response, :success, :cache
  
  def initialize(opts={})
    default_opts = {
      :endpoint => "",
      :path => "",
      :username => "",
      :password => "",
      :cache => false,
      :use_ssl => true
    }
    default_opts.merge!(opts)
    @uri = default_opts[:endpoint]
    @path = default_opts[:path]
    @username = default_opts[:username]
    @password = default_opts[:password]
    @cache = default_opts[:cache]
    @use_ssl = default_opts[:use_ssl]
    @request = ""
    @response = ""
  end
  
  def run(req)
    @request = req
    

    if @cache
      key = Digest::SHA1.hexdigest(req)
      cache = ActiveSupport::Cache.lookup_store(:mem_cache_store)
      @response = cache.fetch(key, :expires_in => 1.hour) { perform_request }
    else
      begin
	@response = perform_request 
      rescue
	raise "Unable to perform request: #{$!}"
      end
    end
    
    unless @response.empty?
      return @response 
    else
      raise "Request returned an empty response."
    end
    
  end
  
  def to_h 
    return {} if @response.empty?    
    r = Crack::XML.parse(@response)
    begin      
      return r["soapenv:Envelope"]["soapenv:Body"] if r["soapenv:Envelope"]
      return r["env:Envelope"]["env:Body"] if r["env:Envelope"]
      return r
    rescue
      return r
    end
  end
  
  
  private
  
  def perform_request
    #puts "Performing Request"
    data = ""
    #create session object
    uri = URI.parse(@uri)
    http_session = Net::HTTP.new(uri.host, uri.port)
    http_session.use_ssl = @use_ssl
    
    #puts "Step 1 Complete"
    headers = {
      'Content-type'=> 'text/xml; charset=utf-8',
      'SOAPAction'=> '""',
      'User-Agent'=> 'Kynetx',
      'Host'=>  uri.host,
      'Content-Length'=> @request.length
    }

    #start the http session
    timeout(999999) do
      #puts "Session Started"
      http_session.start { |http|
	# create the request
	#puts "Sending Request..."
	req = Net::HTTP::Post.new(@path)
	req.basic_auth @username, @password
	headers.each{|key, val| req.add_field(key, val)}
	# Post the request
	puts "REQUEST\n#{@request}"
	resp, data = http.request(req, @request)
	puts 'Code = ' + resp.code 
	puts 'Message = ' + resp.message 
	resp.each { |key, val| puts key + ' = ' + val } 
      }
    end
    return data
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


class String 
  def camelize(first_letter_in_uppercase = true)
    lower_case_and_underscored_word = self
    if first_letter_in_uppercase
      lower_case_and_underscored_word.to_s.gsub(/\/(.?)/) { "::" + $1.upcase }.gsub(/(^|_)(.)/) { $2.upcase }
    else
      lower_case_and_underscored_word.first + camelize(lower_case_and_underscored_word)[1..-1]
    end
  end
  
  def xml_tag
    return self.camelize.sub(/./) {|s| s.downcase} 
  end
end


class Hash

  def to_xml
    results = ""
    self.each do |k, v|
      if v.class.to_s == "Hash"
	results += "<#{k.to_s.xml_tag}>"
	results += v.to_xml
	results += "</#{k.to_s.xml_tag}>"
      else
	results += "<#{k.to_s.xml_tag}>#{v.to_s}</#{k.to_s.xml_tag}>"
      end
    end    
    return results
  end

end

