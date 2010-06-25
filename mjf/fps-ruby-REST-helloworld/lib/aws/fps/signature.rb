# Copyright 2007 Amazon Technologies, Inc.  Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. You may obtain a copy of the License at:
#
# http://aws.amazon.com/apache2.0
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
# See the License for the specific language governing permissions and limitations under the License.
module AWS
  module FPS
    module Signature
      # case-insensitive sort by Hash key
      def fps_sort params
        params.sort_by { |key,value| key.downcase }
      end
      # HMAC SHA1 sign a string
      def fps_sign string
        digest = OpenSSL::Digest::Digest.new('sha1')
        hmac = OpenSSL::HMAC.digest(digest, SECRET_ACCESS_KEY, string)
        Base64.encode64(hmac).chomp
      end
      # params are URL-encoded, also add '=' and '&'
      def fps_urlencode params
        params.collect {|key, value| key+"="+CGI.escape(value)}.join("&")
      end
      def fps_join params
        params.collect {|key, value| key+"="+value}.join("&")
      end
    end # Signature
  end
end