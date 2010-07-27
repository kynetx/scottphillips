require 'rubygems'
require 'rack'
require 'rack/contrib'
require 'lib/config'
require 'query1dot0'

#include ANALYTX::GlobalConfig
#
#configure :development do
#  set :log, :stdout 
#  set :data_warehouse, {
#    :host => '127.0.0.1',
#    :port => 4444,
#    :user => 'analysis',
#    :password => 'AnalyzeThis'
#  }
#end
#
#configure :production do
#  set :log, {:file => 'query', :age => 'daily'}
#  set :data_warehouse, {
#    :host => 'unionstation',
#    :port => 3306,
#    :user => 'analysis',
#    :password => 'AnalyzeThis'
#  }
#
#end

map "/api/0.1/query/" do
  fizz = "BAZZ!"
  run Query1dot0
end

