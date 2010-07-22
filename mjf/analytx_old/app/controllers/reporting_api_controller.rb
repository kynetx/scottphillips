class ReportingApiController < ApplicationController
  
  def api_ref
    render :layout => "layouts/main" 
  end
  
  def kns_totals    
    # get the data from the KNSTotals model
    @k = KNSTotals.new(params)
    
    out = {}
    begin
      # puts "DATA IN: #{@k.data.inspect}"
      formatter = DataFormatter.get_formatter(params, @k.data)
      # puts "FORMATTER: #{formatter.class}"
      out = formatter.do_format().to_json.gsub(/"(new Date[^"]*)"/, '\1')
      # puts "OUTPUT: #{out}"
    rescue
      out = {:error => "No data"}
    end
  
    render :json => out, :callback => params[:callback]
  end

  def test

  end
  
  
end
