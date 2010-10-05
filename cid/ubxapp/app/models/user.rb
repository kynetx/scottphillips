class User < ActiveRecord::Base
  belongs_to :ken
  has_many :apps

  def bx_attributes
    {:login => login }
  end
end
