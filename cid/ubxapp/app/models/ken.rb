class Ken < ActiveRecord::Base
  has_many :apps


  def bx_domains_to_applications
    domains = {};

    apps.each do |app|
      logger.debug "have an app" + app.app_name
      app.domains.each do |domain|
        logger.debug "have an domain" + app.app_name + " - " + domain.name
        if(domains[domain.name])
          domains[domain.name].push(app.app_name)
        else
          domains[domain.name] = [app.app_name]
        end
      end

    end

    return domains

  end

  def bx_applications
    all_app = {};

    apps.each do |app|
      all_app[app.app_name] = {:auth_requird => app.auth_required}
    end

    return all_app
  end


end
