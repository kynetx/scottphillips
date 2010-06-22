class BlogsController < ApplicationController
  def index
    @lt = TestlocalToken.find :first
    consumer = OAuth::Consumer.new(
      OAUTH_CREDENTIALS[:testlocal][:key],
      OAUTH_CREDENTIALS[:testlocal][:secret],
      { :site=>"http://localhost:3000" }
    )
    
    if @lt
      @access_token = OAuth::AccessToken.new(consumer,
        @lt.token,
        @lt.secret)
    else
      flash[:error] = "No access!"
    end

    if @access_token
      begin
        response = @access_token.get('/test.json')
        @full_response = response
        @friends = JSON.parse(response.body)
      rescue
        flash[:error] = "ERROR:<br>#{$!}"
        puts 
        puts
        puts '---------------- RESPONSE -----------------'
        puts @full_response
        puts '-------------------------------------------'
      end
    else
      @friends = []
      puts "no joy"
    end
  end
end
