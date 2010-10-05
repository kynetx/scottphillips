class UsersController < ApplicationController


  def generate_ken
    return ""
  end

  #  Returns JSON
  # {"app_id":
  #   { "auth_required":false,
  #     "domains" : ["goodle.com","bob.com"]
  #   }
  # }
  def get_user_info
    # First check for KEN ID Being Passed In
    # If not found search for cookie that was set when app was "installed".

    @ken = nil;
    @user = nil;
    if !params[:ken].blank?
      @ken = Ken.find_by_guid(params[:ken])
      @user = User.find_by_ken_id(@ken.id);
    elsif !cookies[:ken].blank?
      @ken = Ken.find_by_guid(cookies[:ken])
      @user = User.find_by_ken_id(@ken.id);
      logger.debug("found a ken "  + cookies[:ken]);
    else
      logger.debug("No Ken Found" );
      @ken = Ken.create({:guid => Time.now.to_i.to_s});
      cookies[:ken] = {
              :value => @ken.guid,
              :expires => 1.year.from_now,
              :domain => '.mykobj.net'
      }
    end

    render :json => {"user" => (@user ? @user.bx_attributes : {}),
                     "domains_to_applications" => @ken.bx_domains_to_applications,
                     "applications" => @ken.bx_applications,
                     "ken_id" => @ken.guid
    }

  end


  def show_login

  end

  def login
    @user = User.find_by_login(params[:login])
    if(!@user)
      render :show_login
      return
    end
  end

  # GET /users
  # GET /users.xml
  def index
    @users = User.all

    respond_to do |format|
      format.html # index.html.erb
      format.xml { render :xml => @users }
    end
  end

  # GET /users/1
  # GET /users/1.xml
  def show
    @user = User.find(params[:id])

    respond_to do |format|
      format.html # show.html.erb
      format.xml { render :xml => @user }
    end
  end

  # GET /users/new
  # GET /users/new.xml
  def new
    @user = User.new

    respond_to do |format|
      format.html # new.html.erb
      format.xml { render :xml => @user }
    end
  end

  # GET /users/1/edit
  def edit
    @user = User.find(params[:id])
  end

  # POST /users
  # POST /users.xml
  def create
    @user = User.new(params[:user])

    respond_to do |format|
      if @user.save
        format.html { redirect_to(@user, :notice => 'User was successfully created.') }
        format.xml { render :xml => @user, :status => :created, :location => @user }
      else
        format.html { render :action => "new" }
        format.xml { render :xml => @user.errors, :status => :unprocessable_entity }
      end
    end
  end

  # PUT /users/1
  # PUT /users/1.xml
  def update
    @user = User.find(params[:id])

    respond_to do |format|
      if @user.update_attributes(params[:user])
        format.html { redirect_to(@user, :notice => 'User was successfully updated.') }
        format.xml { head :ok }
      else
        format.html { render :action => "edit" }
        format.xml { render :xml => @user.errors, :status => :unprocessable_entity }
      end
    end
  end

  # DELETE /users/1
  # DELETE /users/1.xml
  def destroy
    @user = User.find(params[:id])
    @user.destroy

    respond_to do |format|
      format.html { redirect_to(users_url) }
      format.xml { head :ok }
    end
  end
end
