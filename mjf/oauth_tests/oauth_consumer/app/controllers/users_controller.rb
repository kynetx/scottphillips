class UsersController < ApplicationController
  def index
    @users = User.all
    @tt = TwitterToken.find :first
    
    if @tt
      @access_token = OAuth::AccessToken.new(UsersController.consumer,
        @tt.token,
        @tt.secret)
    end

    if @access_token
      begin
        key = Digest::SHA1.hexdigest('/statuses/friends.json' + @access_token.token)
        response = Rails.cache.fetch(key) { @access_token.get('/statuses/friends.json').body }
     
        @friends = JSON.parse(response)
      rescue
        flash[:error] = "ERROR: #{response}"
        @friends = []
      end
    else
      @friends = []
      puts "no joy"
    end
  end
  
  def new
    @user = User.new
  end
  
  def create
    @user = User.new(params[:user])
    if @user.save
      flash[:notice] = "Successfully created user."
      redirect_to users_url
    else
      render :action => 'new'
    end
  end
  
  def edit
    @user = User.find(params[:id])
  end
  
  def update
    @user = User.find(params[:id])
    if @user.update_attributes(params[:user])
      flash[:notice] = "Successfully updated user."
      redirect_to users_url
    else
      render :action => 'edit'
    end
  end
  
  def destroy
    @user = User.find(params[:id])
    @user.destroy
    flash[:notice] = "Successfully destroyed user."
    redirect_to users_url
  end
  
  
  
  private
  
  def self.consumer
    @consumer ||= OAuth::Consumer.new(
      "Rz2o2jUZkgY77pUKi6GdxQ",
      "mOK2TEwCKBzJzJkUV0O6EbGAt73kmJK3gDcB3issMA",
      { :site=>"http://twitter.com" }
    )
    
  end
end
