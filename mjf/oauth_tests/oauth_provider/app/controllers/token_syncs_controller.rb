class TokenSyncsController < ApplicationController
  before_filter :check_logged_in, :only => [:show, :edit, :update]
  
  def index
    @token_syncs = TokenSync.all
  end
  
  def show
    @token_sync = TokenSync.find(params[:id])
  end
  
  def new
    @token_sync = TokenSync.new
  end
  
  def create
    @token_sync = TokenSync.new(params[:token_sync])
    if @token_sync.save
      flash[:notice] = "Successfully created token sync."
      redirect_to @token_sync
    else
      render :action => 'new'
    end
  end
  
  def edit
    @token_sync = TokenSync.find(params[:id])
  end
  
  def update
    @token_sync = TokenSync.find(params[:id])
    if @token_sync.update_attributes(params[:token_sync])
      flash[:notice] = "Successfully updated token sync."
      redirect_to @token_sync
    else
      render :action => 'edit'
    end
  end
  
  def destroy
    @token_sync = TokenSync.find(params[:id])
    @token_sync.destroy
    flash[:notice] = "Successfully destroyed token sync."
    redirect_to token_syncs_url
  end
  
  def resync
    result = {}
    user = User.find_by_id params[:id]
    if user      
      begin
        sp = SyncPeers.new user
        sp.sync_all 
        result = {"message" => "OK"}
      rescue Exception => e
        result = {"message" => e.message}
      end
    else
      result = {"message" => "Unknown user for id: #{params[:id]}"}
    end
    
    respond_to do |format|
      format.html { render :text => result["message"] }
      format.json { render :json => result }
      format.xml  { render :xml => result }
    end
    
  end
  
  
end
