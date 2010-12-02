require "lib/analytx"
require "rubygems"
require 'active_support/ordered_hash'

describe ANALYTX::SQL do
  before :all do
    kpis = [:rse, :brse]
    dims =  [:login, :email, :day, :ruleset]
    valid_conditions = ActiveSupport::OrderedHash.new
    valid_conditions.merge!({
      :range => "current_day",
      :where_login => "mikefarmer",
      :where_ruleset => "a18x23"
    })
    @valid_join = ANALYTX::SQL.joins("FACT_KNS_TOTALS", "DIM_ACCOUNTS", "DIM_RULESET_IDS", "DIM_DATE")
    @valid_select = ANALYTX::SQL.select(kpis, dims)
    @valid_from = ANALYTX::SQL.from(kpis, dims, valid_conditions)
    @valid_where = ANALYTX::SQL.where(valid_conditions)
    @valid_group_by = ANALYTX::SQL.group_by(kpis, dims)
    @valid_sql = ANALYTX::SQL.sql(kpis,dims,valid_conditions)

    @select_stmt = <<-SQL
SELECT
`DIM_ACCOUNTS`.`LOGIN` AS `LOGIN`,
`DIM_ACCOUNTS`.`EMAIL` AS `EMAIL`,
`DIM_DATE`.`FULL_DATE` AS `DAY`,
`DIM_RULESET_IDS`.`RULESET_ID` AS `RULESET`,
CAST(SUM(`FACT_KNS_TOTALS`.`RSE`) AS CHAR) AS `RSE`,
CAST(SUM(`FACT_KNS_TOTALS`.`BILLABLE_RSE`) AS CHAR) AS `BRSE`
    SQL

    @join_stmt = <<-SQL
JOIN `DIM_ACCOUNTS` ON `DIM_ACCOUNTS`.`ACCOUNT_KEY` = `FACT_KNS_TOTALS`.`ACCOUNT_KEY`
JOIN `DIM_RULESET_IDS` ON `DIM_RULESET_IDS`.`RULESET_ID_KEY` = `FACT_KNS_TOTALS`.`RULESET_ID_KEY`
JOIN `DIM_DATE` ON `DIM_DATE`.`DATE_KEY` = `FACT_KNS_TOTALS`.`DATE_KEY`
    SQL

    @from_stmt = "FROM `FACT_KNS_TOTALS`\n" + @join_stmt

    @where_stmt = <<-SQL
WHERE
`DIM_DATE`.`IS_CURRENT_DAY` = '1'
AND `DIM_ACCOUNTS`.`LOGIN` = 'mikefarmer'
AND `DIM_RULESET_IDS`.`RULESET_ID` = 'a18x23'
    SQL

    @group_by_stmt = <<-SQL
GROUP BY
`DIM_ACCOUNTS`.`LOGIN`,
`DIM_ACCOUNTS`.`EMAIL`,
`DIM_DATE`.`FULL_DATE`,
`DIM_RULESET_IDS`.`RULESET_ID`
    SQL

    @sql_stmt = @select_stmt + @from_stmt + @where_stmt + @group_by_stmt

  end

  it "should return valid kpis" do
    ANALYTX::SQL.kpis.should include(:brse)
    ANALYTX::SQL.kpis.should_not include(:login)
  end

  it "should return valid dimensions" do
    ANALYTX::SQL.dimensions.should include(:login)
    ANALYTX::SQL.dimensions.should_not include(:brse)

  end

  # SELECT

  it "should not throw an exception on a valid select" do
    lambda { @valid_select }.should_not raise_exception
  end

  it "should return a valid select" do
    @valid_select.should eql @select_stmt
  end

  it "should validate dims and kpis" do
    kpis = [:rse, :ruleset]
    lambda {ANALYTX::SQL.select(kpis, [])}.
      should raise_exception(Exception, "Invalid columns.")
    
    dims = [:rse, :login]
    lambda {ANALYTX::SQL.select([], dims)}.
      should raise_exception(Exception, "Invalid columns.")
    
  end

  it "should put a 0 as a KPI that isn't in the fact table" do
    1.should eql 2
  end
  

  # FROM

  it "should not throw an exception on a valid from" do
    lambda { @valid_select }.should_not raise_exception
  end

  it "should return a valid from statement" do
    @valid_from.should eql @from_stmt
  end
  
  it "should include all tables in both SELECT and WHERE" do
    kpis = [:rse]
    dims = [:day, :ruleset]
    valid_conditions = {:where_login => "mikefarmer"}

     ANALYTX::SQL.from(kpis, dims, valid_conditions).
       should eql @from_stmt 


  end

  # JOIN
 
  it "should not throw an exception on a valid join" do
    lambda { @valid_join }.should_not raise_exception
  end
  
  it "should only allow a fact table as the first argument" do
    lambda { ANALYTX::SQL.joins('FACT_KNS_TOTALS', "FAKE")}.
      should_not raise_exception(Exception, /First table.*/)
    lambda { ANALYTX::SQL.joins('DIM_ACCOUNTS', "FAKE")}.
      should raise_exception(Exception, /First table.*/)
  end

  it "should take a series of at least 1 dimension" do

    lambda { ANALYTX::SQL.joins("FACT_KNS_TOTALS", "DIM_ACCOUNTS", "FACT_KNS_TOTALS")}.
      should raise_exception(Exception, /Invalid dimensions passed.*/)

    lambda { ANALYTX::SQL.joins("FACT_KNS_TOTALS", "DIM_ACCOUNTS", "FAKE")}.
      should raise_exception(Exception, /Invalid dimensions passed.*/)

    lambda { ANALYTX::SQL.joins("FACT_KNS_TOTALS")}.
      should raise_exception(Exception, "Must pass at least 2 arguments.")

  end



  it "should return a valid join statement" do
    @valid_join.should eql @join_stmt  
  end

  # WHERE

  it "should return a valid where statement" do
    lambda { @valid_where }.should_not raise_exception
    @valid_where.should eql @where_stmt
  end

  it "should require a where_login condition" do
    conditions = {
      :where_email => 'some@email'
    }

    lambda { ANALYTX::SQL.where(conditions) }.
      should raise_exception(Exception, "Error: where_login parameter is required.")

  end

  it "all where_ conditions should map to a column" do
    conditions = {
      :where_login => "mikefarmer",
      :where_flippy => 100
    }

    lambda { ANALYTX::SQL.where(conditions) }.
      should raise_exception(Exception, /Error: Undefined parameter.*/)
    

  end


  # GROUP BY
  
  it "should return a valid group by clause" do
    @valid_group_by.should eql @group_by_stmt.chomp
  end

  it "show not throw an exception with a valid group by" do
    lambda { @valid_group_by }.should_not raise_exception
  end


  # SQL

  it "should return a valid SQL statement" do
    @valid_sql.should eql @sql_stmt.chomp
  end

  # DEFINITIONS

  it "should not allow two column names from the same table" do
    1.should eql 2
  end

  it "should only have one definition for each table" do
    1.should eql 2
  end

end
