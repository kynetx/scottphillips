require 'rubygems'
require 'logger'
require 'sequel'

module ANALYTX
  
  module Common
    def log
      return @log if @log

      #@log = settings.log[:logger] if settings.log[:logger]
      #@log = Logger.new(STDOUT) if settings.log == :stdout
      #@log = Logger.new("log/#{settings.log[:file]}-#{Date.today.strftime('%Y%m%d')}.log", settings.log[:shift_age]) if settings.log[:file]
      return Logger.new(STDOUT)

      return @log
    end

    def db
      return @db if @db
      @db = Sequel.connect({:adapter => 'mysql', :database => 'ANALYTX', :logger => log}.merge(settings.data_warehouse))
    end

    
  end

end

