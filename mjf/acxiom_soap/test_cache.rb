require 'rubygems'
require 'active_support'
cache = ActiveSupport::Cache.lookup_store('localhost:12')
puts cache.methods

##<ActiveSupport::Cache::MemCacheStore:0x1018b6ad0 @data=<MemCache: 1 servers, ns: nil, ro: false>>