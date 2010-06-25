class Blog < ActiveRecord::Base
  attr_accessible :title, :post
  
  belongs_to :user, :class_name => "User", :foreign_key => "user_id"
  

end
