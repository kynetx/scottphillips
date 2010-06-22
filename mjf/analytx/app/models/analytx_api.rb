

class AnalytxAPI
  attr_reader :data
  
  def initialize(params)
    conn = ManualConnection.new(DB_SETTINGS)    
    @db = MySQLConnection.new(conn, CONN_SETTINGS)
    @params = params
    @data = get_data  
    
  end
  
  protected
  
  def validate_params
    errors = []    
    begin
      # Check that the required fields are present
      
      @required_params.each do |p|
        if  @params.keys.include?(p.to_sym)
          errors.push "All required parameters were not met (client_id, kpi, temporal)."
          return errors
        end
      end
      
      
      if errors.length == 0
        #Check everything else:

        #Check that the provided kpis are valid
        
        @params[:kpi].split(',').each { |x| errors.push "'#{x}' is an invalid kpi (#{@valid_kpis.join(',')})" unless @valid_kpis.include?(x.downcase) }

        #Check that the temporal parameter is valid
        if @params[:temporal]
          errors.push "'#{@params[:temporal]}' is an invalid temporal value (#{@valid_temporal.join(',')})." unless @valid_temporal.include?(@params[:temporal].downcase)
        else
          errors.push "'temporal' parameter is invalid"
        end

        #Check the num_range parameter
        if @params[:num_range] && ! @params[:num_range].to_s.match(/\d*-\d*/)
          errors.push "'#{@params[:num_range]}' is an invalid number range."  
        end

        #Check the abs_range parameter
        if @params[:abs_range] && ! @params[:abs_range].to_s.match(/\d{8}-\d{8}/)
          errors.push "'#{@params[:abs_range]}' is an invalid absolute range (yyyymmdd-yyyymmdd)"
        end

        #Check the rel_range parameter
        if @params[:rel_range] && ! @valid_rel_range.include?(@params[:rel_range].downcase)
          errors.push "'#{@params[:rel_range]}' is not a valid relative range (#{@valid_rel_range.join(',')})"
        end

      end
    rescue
      errors.push "Error in parameters: #{$!}\nOther Errors found:\n-- #{errors.join(";\n-- ")}"
    end

    return errors
  end
  
  
  
  def get_temporal(fact_table)

    field = ""
    
    temporal_fields     = {
      "HALF_HOUR"   => "CONCAT(t.HUMAN_HOUR,':',t.INTERVAL_30,' ',t.AM_PM)",
      "HOUR"        => "CONCAT(t.HUMAN_HOUR,':00',' ', t.AM_PM)",
      "DAY"         => "UNIX_TIMESTAMP(d.FULL_DATE) * 1000 AS J_TIMESTAMP, DATE_FORMAT(d.FULL_DATE, '%Y-%m-%d')",
      "WEEK_NUMBER" => "d.WEEK_OF_YEAR",
      "MONTH"       => "d.MONTH_NAME",
      "YEAR"        => "d.YEAR_NUM",
    }
   
    field = temporal_fields[@params[:temporal].upcase]
    group = field
    group = "UNIX_TIMESTAMP(d.FULL_DATE) * 1000, d.FULL_DATE" if @params[:temporal].upcase == "DAY"
    from = ""
    if ["HALF_HOUR", "HOUR"].include?(@params[:temporal].upcase)
      from = "FROM #{fact_table} f
        JOIN DIM_DATE d ON d.DATE_KEY = f.DATE_KEY
        JOIN DIM_TIME t ON t.TIME_KEY = f.TIME_KEY"
    else
      from = "FROM #{fact_table} f
        JOIN DIM_DATE d ON d.DATE_KEY = f.DATE_KEY"
    end
    

    return {:temporal => field, :from => from, :group_by => group}
  end


  def get_kpis
    k  = ""    
    kpis = {
      "RSE" => ", SUM(RSE) RSE",
      "RF"  => ", SUM(RULES_FIRED) RULES_FIRED",
      "AF"  => ", SUM(ACTIONS) ACTIONS_FIRED",
      "CB"  => ", SUM(CALLBACKS) CALLBACKS",
      "BRSE" => ", SUM(BILLABLE_RSE) BILLABLE_RSE"
    }
    
    @params[:kpi].split(',').each { |kpi| k += kpis[kpi.upcase] }
    return k
  end
  
  def get_ruleset_ids
    # added for legacy support
    ruleset_id = @params[:client_id]
    ruleset_id ||= @params[:ruleset_id]
    
    w_list = ""
    if ruleset_id.include?(',')
      r_list = ruleset_id.split(',')
      w_list = "IN ('#{r_list.join("','")}')"
    else
      w_list = " = '#{ruleset_id}'"
    end
    
    if ruleset_id == 'kynetx_all'
      w_list = ' IS NOT NULL'
    end
  
    return "(c.RULESET_ID #{w_list})"  
  end
  
  def get_date_range
    r = ""
    today = DateTime.now().to_date
    named_ranges = {
      "TODAY"          => "AND d.IS_CURRENT_DAY = 1",
      "YESTERDAY"      => "AND d.IS_PREVIOUS_DAY = 1",
      "CURRENT_WEEK"   => "AND d.IS_CURRENT_WEEK = 1",
      "PREVIOUS_WEEK"  => "AND d.IS_PREVIOUS_WEEK = 1",
      "CURRENT_MONTH"  => "AND d.IS_CURRENT_MONTH = 1",
      "PREVIOUS_MONTH" => "AND d.IS_PREVIOUS_MONTH = 1"
    }
    
    
    if @params[:num_range]
      last_day, num_days = @params[:num_range].split('-')
      d = calc_date(last_day, num_days)
      return "AND d.FULL_DATE BETWEEN '#{d[:start]}' AND '#{d[:end]}'"
    end

    if @params[:abs_range]
      start_date, end_date = @params[:abs_range].split('-')
      return "AND d.FULL_DATE BETWEEN '#{start_date}' AND '#{end_date}'"
    end

    if @params[:rel_range]
      return named_ranges[@params[:rel_range].upcase]
    end

    d = calc_date(0, 30)
    r = "AND d.FULL_DATE BETWEEN '#{d[:start]}' AND '#{d[:end]}'"
    return r

  end

  
  

end