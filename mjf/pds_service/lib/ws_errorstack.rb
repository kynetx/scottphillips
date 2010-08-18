require 'lib/webservice'

class WS_ErrorStack < WebService

  def initialize
    super
    @endpoint = "http://www.errorstack.com/"
  end

  def submit(exception)
    ws(:post, :submit, {
      :_s => "61f3519e8bd7d7049255e4529dac7fba", 
      :_r => "json",
      :postingIP => "0.0.0.0",
      :createdDate => Time.now.to_s,
      :error => exception.message,
      :backtrace => exception.backtrace.join(",")
    })
  end


end

