class PdsController < ApplicationController
  
  def index

  end
  
  def get_element
    result = "Nothing returned for #{params[:element]}."
    @lt = TestlocalToken.find :first
    consumer = OAuth::Consumer.new(
      OAUTH_CREDENTIALS[:testlocal][:key],
      OAUTH_CREDENTIALS[:testlocal][:secret],
      { :site=>"http://kpds.kynetx.com" }
    )
    
    if @lt
      @access_token = OAuth::AccessToken.new(consumer,
        @lt.token,
        @lt.secret)
    else
      result = "No access!"
    end

    if @access_token
      begin
        response = @access_token.get('/infobase/' + params[:element])
        @full_response = response
        result = JSON.parse(response.body)
      rescue Exception => e
        result = "ERROR:<br>#{e.message}"
        puts 
        puts
        puts '---------------- RESPONSE -----------------'
        puts @full_response
        puts '-------------------------------------------'
      end
      #DEBUG: remove this from logging
      #puts "JOY: #{result.inspect}"
    else
      result = "No Access!"
      puts "no joy"
    end
    
    render :json => result, :layout => false
  end

end
