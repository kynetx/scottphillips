#!/usr/local/bin/ruby

require 'rubygems'
require 'etl_base'
require 'pathname'
require File.join(ETL_ROOT, 'lib', 'db_wrapper')
require File.join(ETL_ROOT, 'lib', 'etl_connections')
require File.join(ETL_ROOT, 'helpers', 'zip_helper')
include ConnectionFactory
include ZipHelper

db = ConnectionFactory::connection('mysql_localhost_ST')

dir = '/Users/mikefarmer/kynetx_test/billeo'

path = Pathname.new dir

#RULESET_ID,REPORT_DATE,REPORT_HOUR,BILLABLE_RSE

# `REPORT_DATE` date NOT NULL,
#   `REPORT_HOUR` char(2) NOT NULL,
#   `RULESET_ID` varchar(255) NOT NULL,
#   `BILLABLE_RSE` int(11) NOT NULL,

db.do "DELETE FROM BILLABLE_RSE"

path.children.each do |file|
  each_zipped_line(file) do |line|
    values =  line.chomp.split(",")
    if values.first != 'RULESET_ID'
      db.do "INSERT INTO BILLABLE_RSE (RULESET_ID, REPORT_DATE, REPORT_HOUR, BILLABLE_RSE) VALUES (?,?,?,?)",
        values[0],
        values[1],
        values[2],
        values[3]
    end
  end
end

