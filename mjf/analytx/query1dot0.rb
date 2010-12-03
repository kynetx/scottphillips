require 'rubygems'
require 'sinatra/base'
require 'json'
require 'lib/common'
require 'lib/analytx/sql'


class Query1dot0 < Sinatra::Base
  include ANALYTX::Common
  
  configure :development do
    set :log, :stdout 
    set :data_warehouse, {
      :host => '127.0.0.1',
      :port => 4444,
      :user => 'analysis',
      :password => 'AnalyzeThis'
    }
  end

  configure :production do
    set :log, {:file => 'query', :age => 'daily'}
    set :data_warehouse, {
      :host => 'unionstation',
      :port => 3306,
      :user => 'analysis',
      :password => 'AnalyzeThis'
    }
  end
 

  before do
  end

  error do 
    exception = request.env['sinatra.error']
    log.error "ERROR: #{exception.message}"
  end

  
  get '/ping' do
    content_type :json
    log.info "PING REQUEST: "
    dw_status = "Up"
    begin
      tables = db.tables
      tables.each do |t|
        log.debug "-- DB-Table: #{t.to_s}"
      end
    rescue Exception => e
      log.fatal "Unable to connect to the Data Warehouse. \n #{e.message}"
      dw_status = "Down"
    end

    return {:ping => "pong", :dw_status => dw_status}.to_json
  end 


  get '/query' do
    
    results = {}
    begin
      begin kpis = symbolize(params[:k].split(",")); rescue; raise "Invalid KPI Parameters"; end
      begin dims = symbolize(params[:d].split(",")); rescue; raise "Invalid Dimension Parameters"; end
      begin
        conditions = {}
        params.each {|k,v| conditions[k.to_sym] = v if k.start_with? "where_"}
        conditions.merge!({:range => params[:r].to_sym}) if params[:r]
      rescue Exception => e
        log.error e.message
        raise "Invalid condition parameters"
      end
      log.debug "KPIS: #{kpis.inspect}"
      log.debug "DIMS: #{dims.inspect}"
      log.debug "COND: #{conditions.inspect}"
      qry = ANALYTX::SQL.sql(kpis, dims, conditions)
      log.debug "\n\n#{qry}\n\n"
      results = format_results db[qry].all
    rescue Exception => e
      log.error e.inspect
      log.error e.backtrace.join("\n")
      results = [{:valid => false, :data => "", :error => e.message}.to_json, :json]
    end

    log.debug results.inspect

    content_type results.last
    return results.first

  end

  get '/interface' do
    results = {}
    content_type :json
    return ANALYTX::SQL.interface.to_json
  end

  get '/explicit_logging/:ruleset/:range' do
    results = {}
    begin
      sql = <<-SQL
        SELECT 
          TXN_ID
          , EXEC_DATE
          , CALLBACK_INFO AS LOGGED_VALUE
          , METHOD
          , RULE_NAME
          , ST.PAGES_ALL.URL
          , ST.PAGES_ALL.HOST
          , ST.PAGES_ALL.PATH
          , ST.PAGES_ALL.FILE
        FROM ST.CALLBACKS_ALL
        JOIN DIM_DATE ON DIM_DATE.FULL_DATE = DATE(ST.CALLBACKS_ALL.EXEC_DATE)
        JOIN ST.PAGES_ALL ON ST.PAGES_ALL.PAGE_SHA1 = ST.CALLBACKS_ALL.PAGE_SHA1 AND ST.PAGES_ALL.PAGE_CRC = ST.CALLBACKS_ALL.PAGE_CRC
      SQL

      conditions = {
        :range => params[:range]
      }

      where_clause = ANALYTX::SQL.where(conditions, false)
      where_clause += <<-SQL
        AND ST.CALLBACKS_ALL.CALLING_RID = '#{params[:ruleset]}'
        AND CALLBACK_TYPE = 'explicit'
      SQL

      sql += where_clause
      qry_result = db[sql].all

      # try to parse the logged_value as json if possible
      qry_result.each do |row|
        begin
          row[:LOGGED_VALUE] = JSON.parse(row[:LOGGED_VALUE])
        rescue JSON::ParserError
          #skip
          #log.info "unable to json parse"
        rescue Exception => e
          #skip
          #log.info e.message
        end
      end

      results = format_results qry_result

    rescue Exception => e
      log.error e.inspect
      log.error e.backtrace.join("\n")
      results = [{:valid => false, :data => "", :error => e.message}.to_json, :json] 
    end

    content_type results.last
    return results.first
  end


  private

  def symbolize(collection)
    return collection.map{|v| v.to_sym}
  end

  def format_results(data)
    return [{:valid => true, :data => data}.to_json, :json]
    
  end
    

end
