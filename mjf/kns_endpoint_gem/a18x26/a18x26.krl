ruleset a18x26 {
  meta {
    name "Test Ruby Endpoint"
    description <<
      Test Ruby Endpoint
    >>
    author "Michael Farmer"
    // Uncomment this line to require Markeplace purchase to use this app.
    // authz require user
    logging off
  }

  dispatch {
    // Some example dispatch domains
    // domain "exmple.com"
    // domain "other.example.com"
  }

  global {
  
  }

  rule first_rule is active {
    select when my_endpoint echo

      send_directive("OK") with message = "SUCCESS";
  }
}
