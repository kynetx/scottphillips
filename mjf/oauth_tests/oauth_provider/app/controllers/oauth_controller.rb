require 'oauth/controllers/provider_controller'
class OauthController < ApplicationController
  include OAuth::Controllers::ProviderController
  
  # before_filter :check_logged_in
  
  # Override this to match your authorization page form
  # It currently expects a checkbox called authorize
  # def user_authorizes_token?
  #   params[:authorize] == '1'
  # end
  
  # def check_logged_in
  #    unless is_current_user
  #      redirect_to login_url
  #    end
  #    
  #  end
  
end
