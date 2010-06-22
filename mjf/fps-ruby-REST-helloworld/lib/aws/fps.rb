# Copyright 2007 Amazon Technologies, Inc.  Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. You may obtain a copy of the License at:
#
# http://aws.amazon.com/apache2.0
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
# See the License for the specific language governing permissions and limitations under the License.
require 'net/https'
require 'time'
require 'openssl'
require 'base64'
require 'yaml'
module AWS
  module FPS
    # strings are UTF-8 encoded
    $KCODE = "u"
    # load AWS config
    path = File.expand_path "#{RAILS_ROOT}/config/amazon_fps.yml"
    h = YAML.load_file path
    config = h['development'].symbolize_keys
    # set default params and set AWS keys
    ACCESS_KEY = config[:access_key]
    SECRET_ACCESS_KEY = config[:secret_access_key]
    RETURN_BASE = config[:return_base]
    PIPELINE = config[:pipeline]
    ENDPOINT = config[:endpoint]
    VERSION = config[:version]
    SIGNATURE_VERSION = "1"
  end
  module VERSION #:nodoc:
    MAJOR = 0
    MINOR = 1
    TINY  = 3

    STRING = [MAJOR, MINOR, TINY].join('.')
  end
end