# Copyright 2007 Amazon Technologies, Inc.  Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. You may obtain a copy of the License at:
#
# http://aws.amazon.com/apache2.0
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
# See the License for the specific language governing permissions and limitations under the License.
module AWS
  module FPS
    # AWS::FPS::CBUI.url return_params, cbui_params
    class CBUI
      class << self
        include AWS::FPS::Signature
        def make_url cbui_params, return_params, return_path
          # create URL encoded returnURL param
          return_url = RETURN_BASE + "/" + return_path + "?" + fps_join(return_params)
          # add already URL encoded 'returnURL' and Amazon Web Services Access Key
          params = { 'returnURL' => return_url, 'callerKey' => ACCESS_KEY }.merge cbui_params
          params = fps_sort(params)
          params = fps_urlencode(params)
          # sign path and URL encoded params
          sig_path = "/cobranded-ui/actions/start?" + params
          signature = fps_sign(sig_path)
          url =  PIPELINE + params + "&awsSignature=" + CGI.escape(signature)
          return url
        end
      end
    end # CBUI
  end
end