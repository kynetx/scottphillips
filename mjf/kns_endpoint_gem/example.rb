require 'lib/kns_endpoint'


class MyEndpoint
  include Kynetx::Endpoint

  domain :my_endpoint
  ruleset :a18x26

  kns_event :echo do |event, message|

    event[:params] = {:say => message}
    event[:send_directives_to] = :show_message

    #params :msg => message
    #send_directives_to :show_message
  end


  def show_message(directives)

    puts directives.inspect

    
  end

end

# Test it out!
#
ep = MyEndpoint.new
ep.signal_event(:echo, "Hello World!")
puts ep.inspect

#puts MyEndpoint.new

