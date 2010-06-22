require 'date'

class DateTime 
  def to_date
    return Date.new(self.year, self.month, self.day)
  end

end

class Date
  def to_date
    return self
  end
end

def get_range(start_date, end_date)
  if start_date.class.to_s == "String"
    s = Date.strptime(start_date, '%Y-%m-%d')
  elsif (start_date.class.to_s == "Date" || start_date.class.to_s == "DateTime")
    s = start_date.to_date
  end 
  raise "Invalid start date" unless s
  
  if end_date.class.to_s == "String"
    e = Date.strptime(end_date, '%Y-%m-%d')
  elsif (end_date.class.to_s == "Date" || end_date.class.to_s == "DateTime")
    e = end_date.to_date
  end
  raise "Invalid end date" unless e
  
  today = DateTime.now().to_date
  end_num = (today - e).to_i
  num_days = (e - s).to_i
  return "#{end_num}-#{num_days}"
end

def calc_date(end_of_range, num_days)
  end_date = (DateTime.now() - end_of_range.to_i).to_date
  start_date = end_date - num_days.to_i                  
  return {:start => start_date.strftime('%Y-%m-%d'), :end => end_date.strftime('%Y-%m-%d')}
end
