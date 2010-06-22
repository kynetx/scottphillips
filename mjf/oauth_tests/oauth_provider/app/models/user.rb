class User < ActiveRecord::Base
  acts_as_authentic
  #attr_accessible :username, :email, :password
  
  has_many :client_applications, :dependent => :delete_all
  has_many :tokens, :class_name=>"OauthToken",:order=>"authorized_at desc",:include=>[:client_application], :dependent => :delete_all
  
  after_save :sync_peers
  before_destroy :remove_tokens, :remove_from_peer
  
  def full_name
    return first_name + " " + last_name
  end
  
  def sync_peers
    sp = SyncPeers.new(self)  
    sp.user_sync
  end
  
  def remove_from_peer
    sp = SyncPeers.new(self)
    sp.user_destroy
  end

  def remove_tokens
    OauthToken.destroy self.tokens    
  end
  
end
