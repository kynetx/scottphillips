module DSL

  def self.included(base)
    base.class_eval do
      extend ClassMethods

    end

    base.instance_eval do
      include InstanceMethods

    end
    
  end
  
  module ClassMethods
  
    def store(val)
      DSL::Storage.store val
    end
    

    def storage
      DSL::Storage.storage
    end

  end

  module InstanceMethods
    def storage
      return DSL::Storage.storage
    end

  end


  class Storage
    
    @@storage = []

    def self.store(val)
      @@storage << val
    end

    def self.storage
      @@storage
    end

  end


end

class Testing

  include DSL

  store "first"  

  def display_storage
    puts storage.inspect
  end

end

puts "CLASS"
puts Testing.methods.grep(/sto.*|say/).sort.join("\n")
puts Testing.storage.inspect
begin
  Testing.display_storage
rescue
  puts "Worked!"
end
puts "--"

puts "INSTANCE"
t = Testing.new
puts t.methods.grep(/sto.*|say/).sort.join("\n")
puts t.storage.inspect
t.display_storage
