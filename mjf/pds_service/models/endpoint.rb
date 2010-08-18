require 'digest/sha1'

class Endpoint
  include Mongoid::Document

  field :endpoint
  field :token
  
  # field user is a hash that looks like this: {:id => ##, :username => "some_user", :name => "Some User"}
  field :user_id, :type => Integer
  
  after_create :generate_token

  
  protected

  def generate_token
    token_str = Time.now.strftime("%Y%m%d%T") + "--S3cReTT!!--#{self.endpoint}"
    self.token = Digest::SHA1.hexdigest(token_str).upcase

  end


end
