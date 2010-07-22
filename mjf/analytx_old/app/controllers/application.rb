# Filters added to this controller apply to all controllers in the application.
# Likewise, all the methods added will be available for all controllers.

require File.join(RAILS_ROOT, 'lib', 'db_wrapper')

class ApplicationController < ActionController::Base
  helper :all # include all helpers, all the time

  # See ActionController::RequestForgeryProtection for details
  # Uncomment the :secret if you're not using the cookie session store
  protect_from_forgery # :secret => '5c39e149fe6379a741bd5e8beed0927c'
  
  # See ActionController::Base for details 
  # Uncomment this to filter the contents of submitted sensitive data parameters
  # from your application log (in this case, all fields with names like "password"). 
  # filter_parameter_logging :password
end
