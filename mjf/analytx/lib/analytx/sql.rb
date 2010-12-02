module ANALYTX
  module SQL

    COLUMNS = [
      {:name => :login, :table => "DIM_ACCOUNTS", :column => "LOGIN", :type => :dimension},
      {:name => :email, :table => "DIM_ACCOUNTS", :column => "EMAIL", :type => :dimension},
      {:name => :callback_info, :table => "DIM_CALLBACK_INFO", :column => "CALLBACK_INFO", :type => :dimension},
      {:name => :callback_sense, :table => "DIM_CALLBACK_SENSES", :column => "CALLBACK_SENSE", :type => :dimension},
      {:name => :callback_type, :table => "DIM_CALLBACK_TYPES", :column => "CALLBACK_TYPE", :type => :dimension},
      {:name => :ruleset, :table => "DIM_RULESET_IDS", :column => "RULESET_ID", :type => :dimension},
      {:name => :day, :table => "DIM_DATE", :column => "FULL_DATE", :type => :dimension},
      {:name => :day_num_of_week, :table => "DIM_DATE", :column => "DAY_NUM_OF_WEEK", :type => :dimension},
      {:name => :day_num_of_month, :table => "DIM_DATE", :column => "DAY_NUM_OF_MONTH", :type => :dimension},
      {:name => :day_of_week, :table => "DIM_DATE", :column => "DAY_OF_WEEK_NAME", :type => :dimension},
      {:name => :day_of_week_abbr, :table => "DIM_DATE", :column => "DAY_OF_WEEK_NAME_ABBR", :type => :dimension},
      {:name => :interval_15, :table => "DIM_TIME", :column => "INTERVAL_15", :type => :dimension},
      {:name => :interval_30, :table => "DIM_TIME", :column => "INTERVAL_30", :type => :dimension},
      {:name => :hour, :table => "DIM_TIME", :column => "TIME_HOUR", :type => :dimension},
      {:name => :minute, :table => "DIM_TIME", :column => "TIME_MINUTE", :type => :dimension},
      {:name => :am_pm, :table => "DIM_TIME", :column => "AM_PM", :type => :dimension},
      {:name => :month_number, :table => "DIM_DATE", :column => "MONTH_NUM_OF_YEAR", :type => :dimension},
      {:name => :month, :table => "DIM_DATE", :column => "MONTH_NAME", :type => :dimension},
      {:name => :month_abbr, :table => "DIM_DATE", :column => "MONTH_NAME_ABBR", :type => :dimension},
      {:name => :quarter, :table => "DIM_DATE", :column => "QUARTER_NUM", :type => :dimension},
      {:name => :quarter_abbr, :table => "DIM_DATE", :column => "QUARTER_ABBR", :type => :dimension},
      {:name => :year, :table => "DIM_DATE", :column => "YEAR_NUM", :type => :dimension},
      {:name => :yyyymmdd, :table => "DIM_DATE", :column => "YYYYMMDD", :type => :dimension},
      {:name => :ddmonyyyy, :table => "DIM_DATE", :column => "DDMONYYYY", :type => :dimension},
      {:name => :method, :table => "DIM_METHODS", :column => "METHOD", :type => :dimension},
      {:name => :rule, :table => "DIM_RULES", :column => "RULE_NAME", :type => :dimension},



      {:name => :rse, :table => "FACT_KNS_TOTALS", :column => "RSE", :type => :fact},
      {:name => :brse, :table => "FACT_KNS_TOTALS", :column => "BILLABLE_RSE", :type => :fact},
      {:name => :rules, :table => "FACT_KNS_TOTALS", :column => "RULES", :type => :fact},
      {:name => :rules_fired, :table => "FACT_KNS_TOTALS", :column => "RULES_FIRED", :type => :fact},
      {:name => :actions, :table => "FACT_KNS_TOTALS", :column => "ACTIONS", :type => :fact},
      {:name => :callbacks, :table => "FACT_KNS_TOTALS", :column => "CALLBACKS", :type => :fact},
      {:name => :rules, :table => "FACT_DAILY_RULES", :column => "NUM_RULES", :type => :fact},
      {:name => :rules_fired, :table => "FACT_DAILY_RULES", :column => "RULES_FIRED", :type => :fact},
      {:name => :actions, :table => "FACT_DAILY_RULES", :column => "NUM_ACTIONS", :type => :fact},
    ]

    TABLES = [
      {:name => "DIM_ACCOUNTS", :type => :dimension, :key => "ACCOUNT_KEY"},
      {:name => "DIM_CALLBACK_INFO", :type => :dimension, :key => "CALLBACK_INFO_KEY"},
      {:name => "DIM_CALLBACK_SENSES", :type => :dimension, :key => "CALLBACK_SENSE_KEY"},
      {:name => "DIM_CALLBACK_TYPES", :type => :dimension, :key => "CALLBACK_TYPE_KEY"},
      {:name => "DIM_RULESET_IDS", :type => :dimension, :key => "RULESET_ID_KEY"},
      {:name => "DIM_RULES", :type => :dimension, :key => "RULE_KEY"},
      {:name => "DIM_DATE", :type => :dimension, :key => "DATE_KEY"},
      {:name => "DIM_TIME", :type => :dimension, :key => "TIME_KEY"},
      {:name => "DIM_METHODS", :type => :dimension, :key => "METHOD_KEY"},
      {:name => "FACT_CALLBACKS", :type => :fact, :keys => %w(TIME_KEY DATE_KEY ACCOUNT_KEY RULESET_ID_KEY METHOD_KEY RULE_KEY CALLBACK_TYPE_KEY CALLBACK_SENSE_KEY CALLBACK_INFO_KEY)},
      {:name => "FACT_KNS_TOTALS", :type => :fact, :keys => %w(TIME_KEY DATE_KEY ACCOUNT_KEY RULESET_ID_KEY)},
      {:name => "FACT_DAILY_RULES", :type => :fact, :keys => %w(DATE_KEY ACCOUNT_KEY RULESET_ID_KEY RULE_KEY)},

    ]

    PRESET_RANGES = [
      {:name => :current_day, :table => "DIM_DATE", :column => "IS_CURRENT_DAY", :value => 1},
      {:name => :current_week, :table => "DIM_DATE", :column => "IS_CURRENT_WEEK", :value => 1},
      {:name => :current_month, :table => "DIM_DATE", :column => "IS_CURRENT_MONTH", :value => 1},
      {:name => :previous_day, :table => "DIM_DATE", :column => "IS_PREVIOUS_DAY", :value => 1},
      {:name => :previous_week, :table => "DIM_DATE", :column => "IS_PREVIOUS_WEEK", :value => 1},
      {:name => :previous_month, :table => "DIM_DATE", :column => "IS_PREVIOUS_MONTH", :value => 1},
      {:name => :last_three_months, :table => "DIM_DATE", :column => "IS_LAST_THREE_MONTHS", :value => 1},
      {:name => :last_four_months, :table => "DIM_DATE", :column => "IS_LAST_FOUR_MONTHS", :value => 1},
      {:name => :last_thirty_days, :table => "DIM_DATE", :column => "IS_LAST_THIRTY", :value => 1},
    ]

    @@kpis = nil
    @@dimensions = nil
    @@group_by = nil

    def self.kpis
      return @@kpis if @@kpis
      @@kpis = COLUMNS.collect {|r| r[:name] if r[:type] == :fact}
      @@kpis.delete_if{|x| x.nil? }.uniq!
      return @@kpis
    end
    
    def self.dimensions
      return @@dimensions if @@dimensions
      @@dimensions = COLUMNS.collect {|r| r[:name] if r[:type] == :dimension}
      @@dimensions.delete_if{|x| x.nil? }.uniq!
      return @@dimensions
    end

    def self.interface
      ranges = PRESET_RANGES.map{ |c| c[:name] }
      return {:kpis => self.kpis, :dims => self.dimensions, :ranges => ranges}
    end

    def self.select(kpis, dims)
      raise "Expecting an array." unless kpis.class == Array && dims.class == Array

      k_cols = col_info(kpis, :fact)
      d_cols = col_info(dims, :dimension)

      statements = []
      group_by_statements = []
      d_cols.each do |dc|
        statements.push("`#{dc[:table]}`.`#{dc[:column]}` AS `#{dc[:name].to_s.upcase}`")
        group_by_statements.push("`#{dc[:table]}`.`#{dc[:column]}`")
      end
      @@group_by = "GROUP BY\n" + group_by_statements.join(",\n")

      k_cols.each do |kc|
        statements.push("CAST(SUM(`#{kc[:table]}`.`#{kc[:column]}`) AS CHAR) AS `#{kc[:name].to_s.upcase}`")
      end
      

      return "SELECT\n" + statements.join(",\n") + "\n"
    end

    def self.from(kpis, dimensions, conditions)
      f_tables = []
      d_tables = []
      col_info(kpis, :fact).each do |col|
        f_tables << TABLES.select{|t| t[:name] == col[:table]}
      end
      
      dimensions.flatten!
      col_info(dimensions, :dimension).each do |col|
        d_tables << TABLES.select{|t| t[:name] == col[:table]}
      end

      cond_cols = get_condition_columns(conditions)
      cond_cols.each do |col|
        d_tables << TABLES.select{|t| t[:name] == col[:table]}
      end
      
      f_tables = f_tables.uniq.flatten
      d_tables = d_tables.uniq.flatten


      raise "Invalid fact tables" unless f_tables.length == 1

      fact_table = f_tables.first[:name]

      return "FROM `#{fact_table}`\n" + self.joins(fact_table, d_tables.collect{|d| d[:name]})
    end

    def self.joins(fact, *dimensions)
      dimensions.flatten!
      f_table = TABLES.select {|t| t[:name] == fact && t[:type] == :fact}.first
      d_tables = TABLES.select {|t| dimensions.include?(t[:name]) && t[:type] == :dimension}

      #Some Error Checking
      raise "First table must be a fact table." unless f_table
      raise "Must pass at least 2 arguments." if dimensions.empty?
      raise "Invalid dimensions passed. #{dimensions.inspect}" unless dimensions.length == d_tables.length
      
      #Construct the JOINS
      join = ""
      d_tables.each do |dt|
        raise "Invalid Keys" unless f_table[:keys].include?(dt[:key])
        join += "JOIN `#{dt[:name]}` ON `#{dt[:name]}`.`#{dt[:key]}` = `#{f_table[:name]}`.`#{dt[:key]}`\n"
      end

      return join
    end


    # conditions is a hash that looks like this:
    # {:where_login => "some_login",
    #  :where_ruleset => "a999x9999",
    #  :range => "current_day"}
    def self.where(conditions)
      raise "Error: where_login parameter is required." unless conditions[:where_login] && conditions[:where_login].length > 1
      
      condition_cols = get_condition_columns(conditions)

      condition_cols.map! {|c| "`#{c[:table]}`.`#{c[:column]}` = '#{c[:value]}'"}
      where_clause = "WHERE\n" + condition_cols.join("\nAND ")


      return where_clause + "\n"
      
    end

    def self.group_by(kpis, *dimensions)
      return @@group_by if @@group_by
      self.select(kpis, dimensions.flatten)
      return @@group_by
      
    end

    def self.sql(kpis, dimensions, conditions)
      return self.select(kpis, dimensions) +
             self.from(kpis,dimensions, conditions) +
             self.where(conditions) +
             self.group_by(kpis, dimensions)
    end


    private

    # given an array of symbols, this will return an array of columns from the COLUMNS const array
    # pass an optional type to ensure it only selects the proper type
    def self.col_info(cols, type=nil)
      new_cols = []
      if type
        new_cols = cols.map {|col| COLUMNS.select{|c| c[:name] == col && c[:type] == type}.first}
      else
        new_cols = cols.map {|col| COLUMNS.select{|c| c[:name] == col }.first} 
      end
      #performs a simple check to make sure everything was found
      raise "Invalid columns." if new_cols.include? nil
      raise "Invalid columns." unless new_cols.length == cols.length
      return new_cols
    end

    def self.get_condition_columns(conditions)
      condition_cols = []

      found_range = false
      conditions.each do |k,v|
        if k.to_s.start_with? "where"
          field_name = k.to_s.split("_").last
          col = COLUMNS.select {|c| c[:name] == field_name.to_sym && c[:type] = :dimension}.first
          raise "Error: Undefined parameter (#{field_name})." unless col
          col[:value] = v
          condition_cols << col
        elsif k.to_s == "range"
          found_range = true
          condition_cols << PRESET_RANGES.select {|pr| pr[:name] == v.to_sym}.first

        else
          raise "Undetermined condition (#{k})."
        end
          
      end
      # default to previous day if range was not found
      condition_cols << PRESET_RANGES.select {|pr| pr[:name] == :previous_day}.first unless found_range

      return condition_cols
    end


    
  end
end
