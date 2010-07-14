ruleset 10 {

    meta {
      description <<
      Ruleset for testing something or other.
      >>
    }

 /* safdksadflsadfs */

    rule test0 is active {
        select using "/test/" setting()

	alert("hello");

    }
}

