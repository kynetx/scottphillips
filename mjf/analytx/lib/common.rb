require 'rubygems'
require 'logger'
require 'sequel'

module ANALYTX
  
  module Common
    def log
      return @log if @log
    
      if settings.log.class == Symbol
        @log ||= Logger.new(STDOUT) if settings.log == :stdout
      else
        @log = settings.log[:logger] if settings.log[:logger] 
        @log ||= Logger.new("log/#{settings.log[:file]}-#{Date.today.strftime('%Y%m%d')}.log", settings.log[:shift_age]) if settings.log[:file] 
      end
      return @log
    end

    def db
      return @db if @db
      @db = Sequel.connect({:adapter => 'mysql2', :database => 'ANALYTX', :logger => log}.merge(settings.data_warehouse))
    end

    def validate_query
      puts "PARAMS: #{params.inspect}"
      # TODO: Build out this validation
      return true
    end

    def construct_query
      # TODO: Build out construction
      return "SELECT SUM(BILLABLE_RSE) AS BRSE FROM ANALYTX.FACT_KNS_TOTALS WHERE DATE_KEY = 939"
    end

    def format_results(ds)
      # TODO: Build out formatter
      return {:data => ds.all.to_json, :content_type => :json }
    end
    
  end

end

