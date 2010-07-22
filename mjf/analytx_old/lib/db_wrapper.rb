require 'dbi'

class ManualConnection 
  attr_accessor :name, :driver, :host, :schema, :port, :user, :pass, :as_sysdba
  
  def initialize(defaults={})
    @name = defaults[:name]
    @driver = defaults[:driver]
    @host = defaults[:host]
    @schema = defaults[:schema]
    @user = defaults[:user]
    @pass = defaults[:pass]
    @port = defaults[:port]
    @as_sysdba = defaults[:as_sysdba]
  end
  
end


class DBRecordset < Array
    
  def field_names
    
    if @fields.nil?
      @fields = self.first.nil? ? nil : self.first.keys
    end
    
    return @fields

  end
  alias fields field_names
  
  def fields_with_type
    return nil if self.first.nil?
    fields = []
    self.first.each do |r|
      h = {}
      h[:field] = r.first
      h[:type] = r.last.class.to_s
      fields << h
    end
    
    return fields
  end
  
  def as_table(delimeter=",", fields_first_col = true)
    
    return "" if self.empty?
    
    out = ""
    out += self.field_names.join(delimeter) + "\n"
    self.each do |row|
      line = ""
      field_names.each do |field|
        line += row[field].to_s + ','
      end
      out += line.gsub(/,$/, "\n")
      
    end
    
    return out
  end
  
  def array_of_arrays(fields)
    a = []
    self.each do |row|
      n = []
      fields.each do |f|
        n.push row[f]
      end
      a.push n
    end
    
    return a
  end
  
  
  
end

class DBConnection 
    attr_reader :driver, :host, :user_name, :pass, :schema, :port, :as_sysdba, :last_query
    attr_writer :max_rows
  
    def initialize(conn, options={})
      @db_options = {
        :auto_commit => true,
        :max_rows => -1,
        :logging => true
      }
      @db_options.merge! options
      @conn_name = conn.name
      @host = conn.host
      @driver = conn.driver
      @user_name = conn.user
      @pass = conn.pass
      @schema = conn.schema
      @port = conn.port
      @as_sysdba = conn.as_sysdba
      @last_query = ''
      @max_rows = @db_options[:max_rows]
      # get the log file from the init_log method
      @log = nil
      init_log
      @dbh = nil
    end
  
    def h
      @dbh
    end
  
    def close
      @dbh.disconnect if @dbh
      @log.info "Disconnected."
    end
  
    alias disconnect close
  
    def qry(query_string='', requery=true)
      if query_string.empty?
        raise "Unable to run an empty query."        
      end
    
      begin
        @log.debug '-- ' + query_string
        sth = @dbh.execute(query_string)
        @last_query = query_string
      rescue
        raise "Your query returned an error: #{query_string}: #{$!}"
      end
      rows = DBRecordset.new
      @log.debug('Max rows to return: ' + @max_rows.to_s) if @max_rows != -1 
      sth.fetch_hash do |row|
        rows.push row
        break if rows.length == @max_rows
      end 
      sth.finish if sth
      @log.debug "Rows returned: #{rows.length.to_s}"
      return rows
    end
  
    def qry_one (query_string='')
      return qry(query_string).first
    end
  
    def requery
      if @last_query.empty?
        raise "No query to run!"
      else
        qry @last_query
      end
    end
  
    def auto_commit(set_value)
      @db_options[:auto_commit] = set_value
    end
  
    def do(dml_string, *bindvars)
    
      if dml_string.empty? 
        raise "Cannot run an emptry query."
      end
      rows_affected = 0
      @log.debug '-- ' + dml_string
      begin
        rows_affected = @dbh.do(dml_string, *bindvars)
        @last_query = dml_string
        @dbh.commit if @db_options[:auto_commit]
      rescue
        raise "Your dml/ddl returned an error: #{dml_string}: #{$!}"
      end
      @log.debug "Rows affected: #{rows_affected.to_s}"
      return rows_affected
    end
   
    def commit
      @dbh.commit
      @log.debug "Successfully committed."
    end
  
    def rollback
      @dbh.rollback
      @log.debug "Successfully rolled back."
    end
  
    
  
    private
  
    def init_log
      if ! (defined? LOG)
        @log = DefaultLogger.new(@db_options[:logging])
      else
        @log = LOG
      end

    end
    
    class DefaultLogger
      
      def initialize(do_logging)
        @do_logging = do_logging
      end
      
      
      def log(message="")
        puts message if @do_logging
      end 
      
      alias debug log
      alias info log
      alias warn log
      alias error log
      alias fatal log
    end
    

end

class OraConnection < DBConnection 
  
  def initialize(conn, options={})
    super(conn, options)
    @log.info "Connecting to: #{conn.name}"
    @log.info "Connecting #{conn.user}@#{conn.host} " << ('AS SYSDBA' if conn.as_sysdba).to_s

    if conn.as_sysdba
      @dbh = DBI.connect("DBI:OCI8:#{@host}",@user_name,@pass, {'Privilege' => :SYSDBA})
    else
      @dbh = DBI.connect("DBI:OCI8:#{@host}",@user_name,@pass)
    end
    @log.info "Successfully connected to #{conn.name}."
  end
  
  def schema_list
    raise "You must be sysdba to generate a schema list." if ! @as_sysdba

    @log.debug "Generating Schema List..."
    rows = qry "SELECT DISTINCT OWNER FROM ALL_OBJECTS", false
    schemas = []
    rows.each do |row|
      schemas.push row["OWNER"]
    end
    return schemas.sort
  end
end

class MySQLConnection < DBConnection 
  
  def initialize(conn, options={})
    super(conn, options)
    @log.info "Connecting to: #{conn.name}"
    @port ||= 3306
    @dbh = DBI.connect("DBI:Mysql:database=#{@schema};host=#{@host};port=#{@port}", @user_name, @pass)    
    @log.debug "DBI:Mysql:database=#{@schema};host=#{@host};port=#{@port}"
    @log.info "Successfully connected to #{conn.name}."
  end
  
  def schema_list
    #TODO Fix this
    return nil
  end
  
  def get_last_insert_id
    row = qry_one("SELECT LAST_INSERT_ID() AS ID")
    raise "Unable to get last inserted ID" if ! row || row['ID'].to_s == '0'
    return row["ID"]
  end
  
end
