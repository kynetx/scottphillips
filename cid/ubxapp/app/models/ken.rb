class Ken < ActiveRecord::Base
  has_many :apps


  def bx_domains_to_applications
    domains = {};

    apps.each do |app|
      app.domains.each do |domain|
        if(domains[domain.name])
          domain[domain.name].push(app.app_name)
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
