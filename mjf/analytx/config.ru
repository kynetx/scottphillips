require 'rubygems'
require 'rack'
require 'rack/contrib'
require 'query1dot0'

map "/api/0.1/" do
  run Query1dot0
end

