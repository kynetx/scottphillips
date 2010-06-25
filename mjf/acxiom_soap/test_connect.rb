#!/usr/bin/env ruby
require 'rubygems'
gem 'soap4r'

require 'AbiliTecPostalDriver'
$DEBUG = true

driver = PostalEndpoint.new("https://idtest.acxiom.com/abilitec-postal/1.0")
puts "Driver created."
wsdl = "" #"https://idprod.acxiom.com/abilitec-postal/1.0?WSDL"
user = "flipy"
pass = "s5v@0fZp"
driver.options["protocol.http.basic_auth"] << [user,pass]

puts driver.inspect
puts driver.methods.sort
driver.wiredump_file_base = "dump"


addr = UnparsedAddress.new()
addr.addressLines = ["3674 Capstone Dr"]
addr.city = "Idaho Falls"
addr.state = "ID"
addr.postalCode = "83401"
addr.urbanization = nil

po = PostalOptions.new(false)

pi = PostalInput.new([addr], po)

puts driver.cleanAddress(pi)


# devsupport@axciom.com