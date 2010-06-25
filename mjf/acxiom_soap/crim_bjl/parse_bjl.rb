DEBUG = true
require 'bjl_soap_request'

class Hash  
  
  def examine(msg=nil, k=nil)
    puts "="*50
    puts "HASH (#{self.length}) KEYS #{msg.to_s}"
    puts self.keys.join("\n")
    puts "---------\nKEY(#{k}):#{self[k].inspect}\n-----------" if k.class.to_s == "String"
    puts "HASH DATA:\n#{self.inspect}" if k == :all
    # puts "-"*50
    
  end
  
end

class Array
  
  
  def examine(msg=nil, show_contents = nil)
    puts "="*50
    puts "ARRAY (#{self.length}) #{msg.to_s}"
    puts self.inspect if show_contents == :all
    puts self.first.inspect if show_contents == :first
    puts self.last.inspect if show_contents == :last
    puts self[show_contents].inspect if show_contents.class.to_s == "Fixnum"
    # puts "-"*50
  end
  
  
end

class String
  
  def examine(msg=nil, *args)
    puts "="*50
    puts "STRING #{msg.to_s}\n#{self.inspect}"
  end
  
end

class NilClass
  def examine(msg=nil, *args)
    2.times { puts }
    puts "="*50
    puts "NIL: #{msg}"
  end
end
# TEST

USE_PRODUCTION = false
PERFORM_CACHING = false

b = BJLSoapRequest.new(USE_PRODUCTION, PERFORM_CACHING)

sample = {}

def make_simple(r)
  simple = {}
  r.each do |item|
    puts item.examine
    simple["bjlCase"] = item if item
  end
  
  
  return simple
end



puts b.get_interface(:all, :json)
puts "="*50
# b.get_by_any_name({:first_name => "MICHAEL", :last_name => "FARMER"})
# puts "="*50
r = b.get_by_defendant_name_address({:name => {:first_name => "BOB", :last_name => "JONES"}, :address => {:address_line => "11438 128th St", :state => "NY"}}, :json)
# puts "="*50
# b.get_by_full_search(:any_name => {:first_name => "MICHAEL", :last_name => "FARMER"})
# puts "="*50
# b.get_by_defendant_ssn("528257658")

# make_simple(r)
puts r



