require 'lib/webservice'

class WS_Accounts < WebService

  def initialize
    super
    @endpoint = "https://accounts.kynetx.com/api/0.1/"
  end

  def auth(username, password)
    ws(:get, :auth, {:username => username, :password => password})
  end


end
