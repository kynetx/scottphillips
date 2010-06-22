#!/usr/bin/env ruby
require 'AbiliTecPostalDriver.rb'

endpoint_url = ARGV.shift
obj = PostalEndpoint.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   cleanAddress(parameters)
#
# ARGS
#   parameters      CleanAddress - {http://id.acxiom.com/abilitec-postal/1.0}cleanAddress
#
# RETURNS
#   result          CleanAddressResponse - {http://id.acxiom.com/abilitec-postal/1.0}cleanAddressResponse
#
# RAISES
#   inputLimitException InputLimitException - {http://id.acxiom.com/abilitec-postal/1.0}InputLimitException
#   inputValidationException InputValidationException - {http://id.acxiom.com/abilitec-postal/1.0}InputValidationException
#   systemUnavailableException SystemUnavailableException - {http://id.acxiom.com/abilitec-postal/1.0}SystemUnavailableException
#
parameters = nil
puts obj.cleanAddress(parameters)


