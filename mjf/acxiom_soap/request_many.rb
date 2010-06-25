#!/usr/local/bin/ruby

require 'soap_request'
require 'json'

USE_MEMCACHE = false

addresses = [
  {:fname => "MICHAEL", :lname => "FARMER", :addr => "3674 Capstone Dr", :city => "Idaho Falls", :state => "ID", :zip => "83401"},
  {:fname => "DAVID", :lname => "MCNAMEE", :addr => "86 west 1100 south", :city => "farmington", :state => "UT", :zip => "84025"},
  # {:fname => "Larry", :lname => "Wells", :addr => "1119 E 100 S", :city => "lindon", :state => "UT", :zip => "84042"},
  #  {:fname => "Eric", :lname => "Farmer", :addr => "1833 Church Way", :city => "Eagle Mountain", :state => "UT", :zip => "84005"},
  #  {:fname => "Tony", :lname => "Barlow", :addr => "327 Cholla Drive", :city => "Washington", :state => "UT", :zip => "84780"},
  #  {:fname => "Joe", :lname => "Badaddr", :addr => "36777 Capstone Dr", :city => "Idaho Falls", :state => "GA", :zip => "10000"},
  #  {:fname => "Richard", :lname => "Bowman", :addr => "11 Wayland St.", :city => "N. Cohocton", :state => "NY", :zip => "14808"},
  #  {:fname => "Timothy", :lname => "Barlow", :addr => "579 W 1300 N", :city => "Pleasant Grove", :state => "UT", :zip => "84062"},
   {:fname => "Kevin", :lname => "Liles", :addr => "16 Southshore Cir", :city => "Maumelle", :state => "AR", :zip => "72113"}
  ]
  
puts addresses.to_json

addresses.each do |d|
  puts "Checking Address for #{d[:fname]} #{d[:lname]}... "
  h = AxciomRequest.postal d, USE_MEMCACHE
  
  if h["deliveryPointValidation"]["match"] == "true"
    puts "valid."
    a = AxciomRequest.address d, "    ", USE_MEMCACHE
    a["IBEOutput"].each do |values|
      if $elements[values["name"]].nil? 
	      puts "Unknown(#{values["name"]}) :: #{values["value"].to_s}"
      else
	      puts "#{$elements[values["name"]].to_s} (#{values["name"]}) :: #{values["value"].to_s}"
      end
    end
  else
    puts "invalid."
  end
  puts
  puts "-" * 30
  puts
  
end
