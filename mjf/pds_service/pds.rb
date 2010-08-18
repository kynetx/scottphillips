require 'sinatra/base'
require 'mongoid'
require 'models/endpoint'
require 'lib/ws_accounts'
require 'lib/ws_errorstack'



class PDS < Sinatra::Base
  
  configure do 
    # default settings for mongo
    set :mongo,  {
      :host => "unionstation.kobj.net/kynetx",
      :port => 27017,
      :database => "kpds",
      :auto_create_indexes => false,
      :allow_dynamic_fields => true,
      :include_root_in_json => false,
      :parameterize_keys => true,
      :persist_in_safe_mode => false,
      :raise_not_found_error => true,
      :reconnect_time => 3
    }

  end
  configure :development do
    set :log, Logger.new(STDOUT)
    
    # override the host to use localhost for development
    mongo[:host] = 'localhost'

  end

  configure :production do
    set :log, Logger.new("log/production.log")
    log.level = Logger::WARN
    mongo[:host] = 'localhost'
  end

  Mongoid.configure do |config|
    log.debug mongo.inspect
    config.from_hash(mongo.stringify_keys)
    config.logger = log
  end

  helpers do 
    def log; options.log end
  end
 

  before do
  end

  error do 
    exception = request.env['sinatra.error']
    log.error "ERROR: #{exception.message}"
    WS_ErrorStack.run(:submit, exception)
  end


  
  get '/ping' do
    log.info request.env.inspect
    puts "--"
    log.info Endpoint.all.inspect
    content_type :json
    return {:ping => "pong"}.to_json
  end

  
  get '/register/endpoint' do
    result = {}
    begin
      # eventually, we may want to move register/endpoint to the am_api so we can do OAuth instead of username/pw
      if params[:endpoint] && params[:username] && params[:password]
        # check auth
        accounts = WS_Accounts.new
        auth_result = accounts.auth(params[:username], params[:password])
        if auth_result["message"] != "valid login"
          result = {:error => "Invalid Login"}
        else
          endpoint_check = Endpoint.first(:conditions => {:endpoint => params[:endpoint]})
          log.info endpoint_check.inspect
          if endpoint_check
            result = {:error => "Endpoint with that name already registered."}
          else
            endpoint = Endpoint.new({
              :endpoint => params[:endpoint],
              :user_id => auth_result["KynetxID"]
            })
            endpoint.save
            result = endpoint.clone
          end
        end
      else
        result = {:error => "Not all parameters were passed (endpoint, username, password)."}
      end
    rescue Exception => e
      WS_ErrorStack.run(:submit, e)
      result = {:error => "Unable to register your endpoint at this time. Try again later."}
    end
    
    content_type :json
    return result.to_json

  end

  get '/user/:username' do

  end

end
