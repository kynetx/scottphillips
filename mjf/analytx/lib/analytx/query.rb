module ANALYTX
  module SQL
    class Query
      attr_reader :kpis, :dims, :conditions, :statements, :errors

      def initialize(params)
        @kpis, @dims, @conditions = nil
        @statements = []
        @errors = []
        begin
          begin @kpis = symbolize(params[:k].split(",")); rescue; @errors.push "Invalid KPI Parameters"; end
          begin @dims = symbolize(params[:d].split(",")); rescue; @errors.push "Invalid Dimension Parameters"; end
          begin
            @conditions = {}
            params.each {|k,v| @conditions[k.to_sym] = v if k.start_with? "where_"}
            @conditions.merge!({:range => params[:r].to_sym}) if params[:r]
          rescue Exception => e
            @errors.push "Invalid condition parameters"
          end
        rescue Exception => e
          puts e.inspect
          puts e.backtrace.join("\n")
        end

        analyze

      end

      def sql
        
      end

      def valid
        true
      end


      private 

      def analyze
        # check that all kpis are actually kpis
        # check that all dims are actually dims
        # extract the fact tables
        # generate the statements
        # check that the statements are compatible

        
      end



    end


  end
end
