# Copyright 2007 Amazon Technologies, Inc.  Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. You may obtain a copy of the License at:
#
# http://aws.amazon.com/apache2.0
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
# See the License for the specific language governing permissions and limitations under the License.
module AWS
  module FPS
    # AWS::FPS::Query.call params
    class Query
      class << self
        include AWS::FPS::Signature
        # accepts Amazon FPS parameters, returns false if HTTP error otherwise returns XML service response
        def do params
          query = build_query params
          xml_response = send_query query
          return xml_response
        end
        def build_query params
          defaults =  { 'AWSAccessKeyId' => ACCESS_KEY, 
                        'SignatureVersion' => SIGNATURE_VERSION,
                        'Version' => VERSION,
                        'Timestamp' => Time.now.gmtime.iso8601 }
          params = params.merge defaults
          # case-insensitive sort params by Hash key, returns Array
          params = fps_sort(params)
          # create digest of concatenated params
          signature = fps_sign(params.to_s)
          # url encode and join params with "&" and "=" to form full request
          query = '/?' + fps_urlencode(params).to_s + "&Signature=" + CGI.escape(signature)
        end
        # actually queries Amazon FPS service and returns XML service response
        def send_query query
          url = ENDPOINT + query
          # send Amazon FPS query to endpoint
          url = URI.parse(url)
          http = Net::HTTP.new(url.host, url.port)
          http.use_ssl = true
          req = Net::HTTP::Get.new(query)
          response = http.start { |http|
            http.request(req)
          }
          xml_response = response.body.to_s
          xml_response.gsub! "ns3:", ""
          xml_response.gsub! "ns2:", ""
          # 200s and 401s HTTP responses return XML
          case response
            when Net::HTTPSuccess then 
              return xml_response
            when Net::HTTPUnauthorized then
              return xml_response
            when Net::HTTPInternalServerError then
              return xml_response
            when Net::HTTPBadRequest then
              return xml_response
            else
              false
          end
        end
      end
    end # Query
  end
end