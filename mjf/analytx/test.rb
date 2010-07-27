require 'lib/config'
  
include ANALYTX::Config

c = configure :development do 
  set :test, "hello world"
  set :fizz, "Bazz"
  puts "Hello from the block"
end
puts c.settings.inspect

