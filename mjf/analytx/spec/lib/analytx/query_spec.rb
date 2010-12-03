require 'lib/analytx/query'


describe "Analytx Query Class" do
  
  before :all do 
    @q = ANALYTX::SQL::Query.new({})

  end

  it 'should be valid' do
    @q.should be_kind_of ANALYTX::SQL::Query
    @q.valid.should == true
  end
end

