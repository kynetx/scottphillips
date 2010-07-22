require 'digest/sha1'

class KNSTotals < AnalytxAPI
  
  def get_data
    data = []
    
    # Added for legacy support
    if @params.keys.include?(:ruleset_id)
      @required_params = [:kpi, :ruleset_id, :temporal]
    else
      @required_params = [:kpi, :client_id, :temporal]
    end
    
    
    @valid_kpis = %w(rse rf af cb brse)
    @valid_temporal = %w(half_hour hour day week_number month year)
    @valid_rel_range = %w(today yesterday current_week previous_week current_month previous_month)
    
    errors = validate_params
    return errors.join("\n") if errors.length > 0

    begin
      
      
      
      
      temporal = get_temporal("FACT_KNS_TOTALS")
      
      limit = @params[:limit]
      limit ||= 1000
    
      totals_qry = "SELECT 
        #{temporal[:temporal]} AS '#{@params[:temporal].upcase}'
        #{get_kpis}
        #{temporal[:from]}
        JOIN DIM_RULESET_IDS c ON c.RULESET_ID_KEY = f.RULESET_ID_KEY
        WHERE #{get_ruleset_ids}
        #{get_date_range}
        GROUP BY #{temporal[:group_by]}
        LIMIT #{limit}"
      cache_key = Digest::SHA1.hexdigest(totals_qry)
      data = Rails.cache.fetch(cache_key, :expires_in => 15.minutes) { @db.qry totals_qry }
      
    rescue
      puts "ERROR GETTING DATA: #{$!}"
      return nil
    end
    
    return data.nil? ? [] : data
  end
        
end
