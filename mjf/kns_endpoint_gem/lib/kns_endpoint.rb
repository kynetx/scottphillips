

module Kynetx
  module Endpoint
    def self.included(base)
      
      base.class_eval do 
        extend ClassMethods
      end

      base.instance_eval do 
        include InstanceMethods
      end

    end
    
    module ClassMethods

      # defines the domain of the kns endpoint
      # example:
      #   domains :ruby_endpoint
      #
      def domain(d)
        EndpointDefinition.domain = d
      end

      def ruleset(rid)
        EndpointDefinition.rid = rid
      end

      def kns_event(name, &block)
        EndpointDefinition.register_event(name, block)
      end

    end

    module InstanceMethods
      def events
        EntpointDefinition.events
      end
      
      def inspect
        EndpointDefinition.inspect
      end

     
      
      def trigger_event(event, args)
        run_event(event, args)
      end

      private


      def run_event(e, args)
        event = EndpointDefinition.events[e]
        puts "Triggering: #{e.inspect} with #{args.inspect}"
        event[:event_block].call(event, args)
        # connect to KNS and evaluate the ruleset
        #
        run_callback(event, "Test" )
      end


      def run_callback(e, directives)
        instance_eval(e[:send_directives_to].to_s + "(" + directives + ")")
      end

    end

    class EndpointDefinition

      @@domain = ""
      @@rid = ""
      @@events = {}

      class << self
        
        def domain=(d)
          @@domain = d
        end

        def domain
          @@domain
        end

        def rid=(r)
          @@rid = r
        end

        def rid
          @@rid
        end

        def register_event(name, block)
          @@events[name] = {:event_block => block, :params => {}, :send_directives_to => nil}
        end

        def events
          @@events
        end

        def inspect
          {:domain => @@domain.to_s, :ruleset => @@rid.to_s, :events => @@events.to_s}.inspect
        end
      end

    end


#
#    # defines the ruleset_id of the app to call
#    # this is required
#    # example:
#    #   ruleset_id :a99x999
#    def ruleset_id(rid)
#      @ruleset_id = rid
#    end
#
#    # creates an event that can be called with trigger_event
#    # example
#    #   kns_event :echo {|p| params p; send_directives_to :my_message }
#    def kns_event(event, &block)
#      register_event(event, block)
#    end
#    
#    def trigger_event(event, params)
#      @events[event].call(params)
#      fire_kns_event(event)
#    end
#
#    def directives
#      @directives || {}
#    end
#
#
#    protected
#
#    # method used to define a callback method for when the event is completed
#    # and directives are returned
#    def send_directives_to(dest_method)
#        
#    end
#
#    # parameters passed to the event. 
#    def params(*args)
#      @params = args
#    end
#
#    def register_event(event, block)
#      @events ||= {}
#      @events[event.to_sym] = block
#    end
#
#    def fire_kns_event(event)
#      puts "FIRING KNS EVENT"
#    end
#
  end
end
