
class DashboardController < ApplicationController
  layout 'layouts/main'
  
  def initialize
    super
    @db = MySQLConnection.new(ManualConnection.new(DB_SETTINGS), CONN_SETTINGS)
  end
  
  def index
    @ruleset_ids = @db.qry("SELECT * FROM DIM_RULESET_IDS ORDER BY RULESET_ID");  
    session[:ruleset_id] ||= @ruleset_ids.first["RULESET_ID"]
    default_range = calc_date(0, 7)
    session[:start_date] ||= default_range[:start]
    session[:end_date] ||= default_range[:end]
    @date_range = get_range(session[:start_date], session[:end_date])
    @kns_params = "client_id=#{session[:ruleset_id]}&num_range=#{@date_range}&kpi=rse,rf,brse&temporal=day&format=google_table&callback=drawGoogleChart"
  end
  
  def change_ruleset_id
    session[:ruleset_id] = params[:ruleset_id]
    redirect_to :action=>"index"
  end
  
  def change_range
    # param[:start] will set the start 
    if params[:start]
      session[:start_date] = params[:start].gsub('_','-')
    end
    
    if params[:end]
      session[:end_date] = params[:end].gsub('_','-')
    end
      
    
    
    # param [:end] will set the end
    
    # set the session start and end
    
    # return the range in numbers (0-10)
    render :text => "OK"
  end
  
  def google_playground
    
  end
  
  
  
  
end
