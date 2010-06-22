require 'date'

class DataFormatter
  
  def self.get_formatter(params={}, rows = [])
    
    formatters = {
      "table" => "GenericFormatter",
      "pivot" => "PivotFormatter",
      "google_table" => "GoogleDataTableFormatter",
      "csv" => "CSVFormatter"
    }
    
    type = params[:format]
    if formatters[type]
      return const_get(formatters[type]).new(rows, params)
    else 
      return const_get(formatters["table"]).new(rows, params)
    end
    
  end
  
end

class GenericFormatter
  attr_reader :data
  
  def initialize(rows, p)
    @data = rows
    @params = p
  end
  
  def do_format
    return @data
  end
  
end

class PivotFormatter < GenericFormatter
  # This formatter returns the data ready for flot charts
  
  def do_format
    x_field = @params[:pivot_by].upcase
    x_field = "J_TIMESTAMP" if x_field == "DAY" && @params[:as_timestamp] == "true"
  
    # format is [{series1}, {series2}, ...]
    new_data = []

    # create the series hash
    @data.field_names.each do |f|
      if f != x_field # don't do a series for the pivot field
        series = {}
        series["label"] = f
        new_data.push series
      end
    end

    #populate the data with a single pass
    @data.each do |d|
      new_data.each do |series|
        series["data"] ||= []        
        key = d[x_field].to_i
        key = d[x_field].to_s unless @params[:as_timestamp] == "true"        
        series["data"].push [key, d[series["label"]].to_i]  
      end
    end
    return new_data
  end
end

class CSVFormatter < GenericFormatter

  def do_format
    # using a built in method of the DBRecordset class to return
    # the data as a comma delimited table
    return @data.as_table
  end
end

class GoogleChartFormatter < GenericFormatter
  def do_format
    # TODO
  end
end
  
class GoogleDataTableFormatter < GenericFormatter
  def do_format
    # CAUTION: Very brittle code here.  There is an rspec to test this called test_df.rspec
    h = {}
    f_index = "A"
    cols = []

    if @params[:temporal].upcase == "DAY" && @params[:as_timestamp] == "true"
      cols << {"id" => f_index, "label" => "TIMESTAMP", "type" => 'number'}
      f_index = f_index.next
    end
    
    if @params[:temporal].upcase == "DAY" && @params[:as_timestamp] != "true"
      cols << {"id" => f_index, "label" => "DAY", "type" => 'date'}
      f_index = f_index.next
    end
    
    added_date = false
    @data.fields_with_type.each do |f|
      if f[:field] == 'DAY' || f[:field] == 'J_TIMESTAMP'
      else
        cols << {"id" => f_index, "label" => f[:field], "type" => 'number'}
        f_index = f_index.next
      end
    end    
    
    h["cols"] = cols    
    rows = []
    
    @data.each do |row|        
        gt_row = {"c" => []}
        if @params[:temporal].upcase == "DAY" && @params[:as_timestamp] == "true"
          gt_row["c"] << {"v" => row["J_TIMESTAMP"].to_i, "f" => "TIMESTAMP"}
        end
        
        if @params[:temporal].upcase == "DAY" && @params[:as_timestamp] != "true"
          gt_row["c"] << {
            "v" => get_js_date(row["DAY"].to_s), 
            "f" => row["DAY"].to_s
            }
        end
        
        row.each do |f, v|
          if f == 'DAY' || f == 'J_TIMESTAMP'
          else
            gt_row["c"] << { "v" => v.to_i, "f" => v.to_s }
          end
        end
        
      rows << gt_row
    end
    h["rows"] = rows
    return h
  end
  
  
  private
  
  def get_js_date(day)
    d = Date.strptime(day.to_s)    
    return "new Date(#{d.year}, #{d.month - 1}, #{d.day}, 0, 0, 0)"
  end
  
  # def get_type(dbi_type)
  #     puts "dbi_type: #{dbi_type}"
  #     dbi_type_map = {
  #       "TrueClass" => 'boolean',
  #       "FalseClass" => 'boolean',
  #       "BigDecimal" => 'number',
  #       "Float" => 'number',
  #       "Integer" => 'number',
  #       "Fixnum" => 'number',
  #       "String" => 'string'
  #     }
  #     
  #     t = dbi_type_map[dbi_type]
  #     t ||= 'string'
  #     puts "new_type: #{t}"
  #     return t
  #   end
end


class XMLFormatter < GenericFormatter
  def do_format

  end
end

class HTMLTableFormatter < GenericFormatter
  def do_format

  end
end