require 'timeout'
# $DEBUG = true

class SyncPeers
  include Timeout
  attr_reader :user
  
  def initialize(user)
    raise "User cannot be nil!" if user.nil?
    @user = user
  end

  def user_sync
    puts "USER_SYNC" if $DEBUG 
    
    # You can add conditions for which peers to sync here:
    peers = TokenSync.find :all
    
    #perform the sync with all the found peers
    send_message peers, "update", :address_json => build_user_json
  end
  
  def token_sync
    puts "TOKEN_SYNC" if $DEBUG
    peers = TokenSync.find :all
    send_message peers, "update", :token_json => build_token_json
  end
  
  def sync_all
    puts "SYNC EVERYTHING" if $DEBUG
    all_json = {:address_json => build_user_json, :token_json => build_token_json}
    peers = TokenSync.find :all
    send_message peers, "update", all_json
  end
  
  def user_destroy
    puts "DESTROY USER" if $DEBUG
    peers = TokenSync.find :all
    send_message peers,  "destroy", {:user_id => @user["id"]}
  end
  
  def token_destroy(token)
    puts "DESTROY TOKEN" if $DEBUG
    peers = TokenSync.find :all
    send_message peers, "destroy", {:token_id => token["id"]}
  end
  
  def ca_destroy(client_application)
    puts "DESTROY CLIENT_APPLICATION" if $DEBUG
    peers = TokenSync.find :all
    send_message peers, "destroy", {:client_application_id => client_application["id"]}
  end
  
  private 

  def send_message(peers, method, data)
    errors = []
    peers.each do |peer|
      begin
        # timeout if request takes longer than 10 seconds
        timeout(10) {
          url = URI.parse(peer.callback_url + "/#{method}")
          req = Net::HTTP::Post.new(url.path)
          req.set_form_data(data)
          http = Net::HTTP.new(url.host, url.port)
          # http.use_ssl = true if url.port == 443
          response = http.start {|h| h.request(req)}          
          puts "REPLY:"  if $DEBUG
          puts response.body.to_s  if $DEBUG
          
          return_message = JSON.parse(response.body.to_s)
          raise "Peer returned an error: #{return_message["message"]}" if return_message["message"] != "OK"
          
        }
      rescue  Exception => e
        errors << "There was an error communicating with the peer: #{peer.peer_name}. Error: #{e.message}"
      end
    end
    raise "There were errors communicating with the peers: #{errors.join("  ::  ")}" unless errors.empty?
  end

  
  def build_user_json
    address = {
      :id => @user["id"],
      :username => @user.username,
      :first_name => @user.first_name,
      :last_name => @user.last_name,
      :street_address => @user.street_address,
      :street_city => @user.street_city,
      :street_st => @user.street_st,
      :street_zip => @user.street_zip
    }
    return address.to_json
  end
  
  def build_token_json  
    return  {:apps => @user.client_applications, :tokens => @user.tokens}.to_json
  end
  
end