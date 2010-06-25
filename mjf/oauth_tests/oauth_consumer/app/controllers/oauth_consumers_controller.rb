require 'oauth/controllers/consumer_controller'
class OauthConsumersController < ApplicationController
  include Oauth::Controllers::ConsumerController
  
  def index
    if current_user
      @consumer_tokens=ConsumerToken.all :conditions=>{:user_id=>current_user.id}
      @services=OAUTH_CREDENTIALS.keys-@consumer_tokens.collect{|c| c.class.service_name}
    end
  end
  
  # def show
  #     #     super    
  #     #     
  #     #     #token.client.get('/statuses/public_timeline.json')
  #     #     
  #     #     # session[:token] = @token.secret
  #     #     # session[:request_token] = @request_token
  #     unless @token
  #       begin
  #         puts "------------------------"
  #         puts "------ NEW REQUEST -----"
  #         puts "No Token"
  #         puts "consumer class: #{@consumer.class.to_s}"
  #         # puts "huh"
  #         #     puts "consumer: #{@consumer.consumer.inspect}"
  #         #     puts
  #    
  #         puts "params: #{params.inspect}"
  #         puts "callback_oauth_consumer_url: #{callback_oauth_consumer_url(params[:id])}"
  #         puts
  #         
  #         @request_token=@consumer.get_request_token(callback_oauth_consumer_url(params[:id]))
  #         puts "------------------------"
  #         puts "REQUEST TOKEN:"
  #         puts "#{@request_token.inspect}"
  #         session[@request_token.token]=@request_token.secret
  #         if @request_token.callback_confirmed?
  #           redirect_to @request_token.authorize_url
  #         else
  #           redirect_to(@request_token.authorize_url + "&oauth_callback=#{callback_oauth_consumer_url(params[:id])}")
  #         end
  #       rescue Exception => e
  #         puts e.message
  #         # puts e.backtrace
  #         flash[:error] = "FINAL ERROR:<br>#{$!}"
  #       end
  #     end
  # 
  #   end
  
  
  
  protected
  
  # Change this to decide where you want to redirect user to after callback is finished.
  # params[:id] holds the service name so you could use this to redirect to various parts
  # of your application depending on what service you're connecting to.
  def go_back
    redirect_to root_url
  end
  
  def login_required
    true
  end
  
  def current_user
     User.find_by_id 1
  end

end
