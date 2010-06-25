class HomesController < ApplicationController
  def show
    session[:user] = "bob"
  end
  
  def get_apps
    respond_to do |format|
      format.html # index.html.erb
      format.json { render :text => {"ax99d" => "bob", "ax999" => "joe"}.to_json }
    end
  end
    
end