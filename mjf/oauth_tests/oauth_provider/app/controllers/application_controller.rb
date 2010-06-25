# Filters added to this controller apply to all controllers in the application.
# Likewise, all the methods added will be available for all controllers.

class ApplicationController < ActionController::Base
  helper :all # include all helpers, all the time
  protect_from_forgery # See ActionController::RequestForgeryProtection for details

  # Scrub sensitive parameters from your log
  # filter_parameter_logging :password
  
  filter_parameter_logging :password

  helper_method :is_current_user, :current_user, :login_required

  private
  

  def current_user_session
    return @current_user_session if defined?(@current_user_session)
    @current_user_session = UserSession.find
  end

  def is_current_user
    return @is_current_user if defined?(@is_current_user)
    @is_current_user = current_user_session && current_user_session.record
  end
  
  def current_user
    if is_current_user
      current_user_session.user
    else
      "-"
    end
  end
  
  def login_required
    return is_current_user
  end
  
  def check_logged_in
    unless is_current_user
      redirect_to login_url
    end
  end
  
end
