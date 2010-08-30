require 'httparty'
module Kynetx

  class Endpoint

    @@events = {}
    @@directives = {}

    def initialize
    end


    def self.event(e, params={}, &block)
      
      @@events[e] = { :params => params }

      @@events[e][:block] = block_given? ? block : lambda { |p| p }
     

    end

    def self.directive(d, &block)
      raise "Directive must supply a block." unless block_given?
      @@directives[d] = block
    end

    def self.ruleset(r); @@ruleset = r end

    def self.domain(d); @@domain = d end



    def signal(e, params)
      run_event(e, params)
    end


    private

    def run_event(e, params)
 
      # setup the parameters and call the block

      @@events[e][:block].call(params) 

      # run the event
 
      resp = HTTParty.get "http://cs.kobj.net/blue/event/#{@@domain.to_s}/#{e.to_s}/#{@@ruleset.to_s}", :query => params

      # execute the returned directives
      directive_output = []
      resp["directives"].each do |d|
        o = run_directive(d["name"].to_sym, symbolize_keys(d["options"])) if @@directives.keys.include?(d["name"].to_sym)
        directive_output.push o
      end

      return directive_output
      
    end


    def run_directive(d, params)
      begin
        return @@directives[d].call(params)
      rescue Exception => e
        puts "Error in directive (#{d.to_s}): #{e.message}\n#{e.backtrace.join("\n")}"
      end

    end

    def symbolize_keys(hash)  
      hash.inject({}){|result, (key, value)|  
        new_key = case key  
                  when String then key.to_sym  
                  else key  
                  end  
        new_value = case value  
                  when Hash then symbolize_keys(value)  
                  else value  
                  end  
      result[new_key] = new_value  
      result  
      }  
    end 
    


  end


end

