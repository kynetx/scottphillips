class BlogsController < ApplicationController
  before_filter :check_logged_in
  
  def index
    puts "#{current_user.id}"
    @blogs = Blog.find_all_by_user_id current_user.id
    respond_to do |format|
      format.html
      format.xml  { render :xml => @blogs }
      format.json { render :json => @blogs }
    end
  end
  
  def new
    @blog = Blog.new
  end
  
  def create
    @blog = Blog.new(params[:blog])
    @blog.user = current_user
    if @blog.save
      flash[:notice] = "Successfully created blog."
      redirect_to blogs_url
    else
      render :action => 'new'
    end
  end
  
  def edit
    @blog = Blog.find(params[:id])
  end
  
  def update
    @blog = Blog.find(params[:id])
    if @blog.update_attributes(params[:blog])
      flash[:notice] = "Successfully updated blog."
      redirect_to blogs_url
    else
      render :action => 'edit'
    end
  end
  
  def destroy
    @blog = Blog.find(params[:id])
    @blog.destroy
    flash[:notice] = "Successfully destroyed blog."
    redirect_to blogs_url
  end

  private
  
  def check_logged_in
    unless is_current_user
      render :partial => "not_logged_in", :layout => true
    end
  end
  
end
