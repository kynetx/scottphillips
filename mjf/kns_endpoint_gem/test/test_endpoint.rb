require '../lib/endpoint'
describe Kynetx::Endpoint do

  before :all do
    class TestEndpoint < Kynetx::Endpoint
      ruleset :a18x26
      domain :test_endpoint
      
      event :echo

      event :echo_hello  do |p|
        p[:message] = "Hello #{p[:message]}"
      end

      directive :say do |d|
        d[:message]
      end
    end

    @endpoint = TestEndpoint.new
  end

  it "event should run a simple rule" do
    @endpoint.signal(:echo, :message => "Hello World").should include("Hello World")
  end

  it "event should take a block" do
    @endpoint.signal(:echo_hello, :message => "World").should include("Hello World")
  end


end
