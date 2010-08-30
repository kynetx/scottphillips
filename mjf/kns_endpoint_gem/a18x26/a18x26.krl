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
  }

  global {
  
  }

  rule first_rule is active {
    select when test_endpoint echo
      pre {
        m = event:param("message");
      }
      {
        send_directive("say") with message = m;
      }
  }

  rule second_rule is active {
    select when test_endpoint echo_hello
      pre {
        m = event:param("message");
      }
      {
        send_directive("say") with message = m;
      }
  }
  


}
