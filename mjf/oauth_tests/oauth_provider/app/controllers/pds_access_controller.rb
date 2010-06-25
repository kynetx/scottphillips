class PdsAccessController < ApplicationController
  before_filter :oauth_required, :only => [:data_element]
  
  def data_element
    if @user
    
      p = PDSData.new
      puts "--------- Incoming PDS Request ---------"
      puts @user.username
      puts
      puts current_token
      puts "----------------------------------------"
      a = p.do_acxiom_request @user, params[:id]
      lbl = p.lookup_label params[:id]
     
      render :json => { lbl => a }
    else
      puts "ERROR: USER NOT FOUND"
      puts "TOKEN: #{current_token}"
      render :json => { "error" => "User not found"}
      
    end
    
  end
  
  
  def check_address
    p = PDSData.new
    @result = p.check_address current_user
    flash[:error] = "Unable to find your address!" unless @result[:found]
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
