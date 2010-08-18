require 'net/http'
require 'net/https'
require 'uri'

class WebService
  def initialize
    @endpoint = ""
  end

  protected

  def ws(http_type, method, opts={})
    results = ""
    begin
      # timeout if request takes longer than 10 seconds
      timeout(10) {
        req = nil
        url = ""
        if http_type == :get
          url = URI.parse(@endpoint + method.to_s + opts.to_params)
          req = Net::HTTP::Get.new(url.to_s)
        elsif http_type == :post
          url = URI.parse(@endpoint + method.to_s)
          req = Net::HTTP::Post.new(url.path)
          req.set_form_data(opts)
        else
          url = URI.parse(@endpoint + method.to_s + opts.to_params)
          req = Net::HTTP::Get.new(url.to_s)
        end
        http = Net::HTTP.new(url.host, url.port)
        http.use_ssl = true if url.port == 443
        http.set_debug_output STDOUT if $DEBUG
        
        response = http.start {|h| 
          h.request(req)
        }          
        puts "REPLY:"  if $DEBUG
        puts response.body.to_s  if $DEBUG

        results = JSON.parse(response.body.to_s) rescue "Unexpected results from the web service."
      }
    rescue  Exception => e
      results = "There was an error communicating with the #{@endpoint}: /#{method}. Error: #{$!}\n#{e.backtrace.join("\n")}"

    end
    return results
  end

  def self.run(method, opts={})
    e = new
    results = e.send method, opts
    return results
  end

  private

  
end

class Hash
  def to_params
    params = []
    self.each {|k,v| params.push "#{k.to_s}=#{v.to_s}" }
    return "?" + params.join("&")
  end
end

