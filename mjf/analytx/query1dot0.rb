require 'rubygems'
require 'sinatra/base'
require 'json'
require 'logger'
require 'lib/common'
require 'lib/config'


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
 
  #ANALYTX::GlobalConfig.global_settings[environment].each {|k, v| set k, v}

  before do
    log.info settings.data_warehouse.inspect
    log.info fizz
  end

  error do 
    exception = request.env['sinatra.error']
    log.error "ERROR: #{exception.message}"
  end

  
  get '/' do
    return "hi"
  end
#get '/ping' do
#    content_type :json
#    log.info "PING REQUEST: "
#    dw_status = "Up"
#    begin
#      tables = db.tables
#      tables.each do |t|
#        log.debug "-- DB-Table: #{t.to_s}"
#      end
#    rescue Exception => e
#      log.error "Unable to connect to the Data Warehouse. \n #{e.message}"
#      dw_status = "Down"
#    end
#
#    return {:ping => "pong", :dw_status => dw_status}.to_json
#  end 
#


end
