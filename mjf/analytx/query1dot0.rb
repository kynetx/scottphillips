require 'rubygems'
require 'sinatra/base'
require 'json'
require 'lib/common'
require 'lib/sql'


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
      log.info "KPIS: #{kpis.inspect}"
      log.info "DIMS: #{dims.inspect}"
      log.info "COND: #{conditions.inspect}"
      qry = ANALYTX::SQL.sql(kpis, dims, conditions)
      log.info "\n\n#{qry}\n\n"
      results = format_results db[qry].all
    rescue Exception => e
      log.error e.inspect
      log.error e.backtrace.join("\n")
      results = [{:valid => false, :data => "", :error => e.message}.to_json, :json]
    end

    log.info results.inspect

    content_type results.last
    return results.first

  end

  get '/interface' do
    results = {}
    content_type :json
    return ANALYTX::SQL.interface.to_json
  end


  private

  def symbolize(collection)
    return collection.map{|v| v.to_sym}
  end

  def format_results(data)
    return [{:valid => true, :data => data}.to_json, :json]
    
  end
    

end
