require 'rubygems'
require 'bundler'
Bundler.setup

require 'sinatra'
require 'pds'

map "/pds/0.1/" do
  run PDS
end

