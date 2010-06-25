class TestApiController < ApplicationController
  before_filter :oauth_required
  
  def index
    puts "--------- Incoming PDS Request ---------"
    puts @user.username
    puts
    puts current_token
    puts "----------------------------------------"

    @blogs = Blog.find_all_by_user_id @user.id
    respond_to do |format|
      format.html { render :layout => false }
      format.xml  { render :xml => @blogs }
      format.json { render :json => @blogs }
    end

  end
  
  
  private
  
  
  def authorized?
    #find out which user is performing the request
    puts "--------- CURRENT_TOKEN / ACCESS_TOKEN --------"
    puts current_token.inspect
    
    @user = current_token.user
    
    
    # you could put some more checking here to see if the user has any rights
    # if they don't then you would return false
    return ! @user.nil?
  end
end
