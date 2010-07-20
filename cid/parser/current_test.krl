// dispatch with some rules

ruleset a10 {

    meta {
/*
      description <<
      Ruleset for testing something or other.
      >>
     authz require user
      name  "tst"
      author "bob"
      logging on
      use module joetest alias bobjones
      use css resource "bobcss string"
      use css resource bobcssvar
      use javascript resource "bobjs string"
      use javascript  resource bobjsvar


      key errorstack "192345"
      key googleanalytics  "fg593940"

      key twitter {
        "consumer_key": "jPlIPAk1g848tonC2yNA",
        "consumer_secret" : "3HNb7NfksjflskIm2BuxKPSg6JYvMtLahvkMt6Std5SO0"
      }
      key googleanalytics "kfjsklfjslkfjslkfs"

     key googleanalytics "kfjsklfjslkfjslkfs"
     key twitter {
        "consumer_key": 583758935739,
        "consumer_secret" : "3HNb7NfksjflskIm2BuxKPSg6JYvMtLahvkMt6Std5SO0"
      }
*/
    }

         dispatch {
/*
      domain "www.google.com" -> "966337974"
      domain "google.com" -> "966337974"
      domain "www.circuitcity.com" -> "966337982"
*/
    }

     global {
 /*         emit << dsfasdfasdfasdfasdfasdfasdf 
          asdfasdfasf >>;

  		datasource foozle <- "http://www.windley.com/rss.xml" cachable for 3 hours;
  		datasource foozlc <- "http://www.windley.com/rss.xml" cachable for 3 day;
  		datasource foozlea:XML <- "http://www.windley.com/rss.xml" cachable;
  		datasource foozleb <- "http://www.windley.com/rss.xml";

		css << safjasldfkjas;lkdfjasfd every >>;
		
		css "asdfasdfasdfasfdasdf";
		
		
		bob  = <<asdfasdfaoe>>;
		joe = <|afasdfsadfasdfasd|>;
		
	 	foo = function(a,b) {
	                      fooz = 3;
	                      boaz = "string";
	                      doc = << Testing #{boaz} >>;
						   fooa = function(c,d) {
					                      foozc = 3;
					                      boazc = "string";
					                      docc = << Testing #{boazc} >>;
					                      xc
										};
	
	                      x
	                  };
	
		simple = simple + 1;
		
		

		preoptest = a + b  < c + d > e + f;

		simplea = simplea + 1 + 3 + 4;

		mike = (mike + 1 * 5 / joe - alliace) ||  (rmike + bob * rjoe - ralliace);
		
		joe = seen "bob" in app:joe within 1 hour;
		bob = "asdfsad";
		
		bob = joe [ a + b ];
		
		
		
		
		mike = app:joe;

     	currentest = ent:mike;
		currentesta = history ( a + b) ent:joe;
		
		
		joe = [ mike, bob, city ] ||  [jack, 10, "bobbo every"];
		
		
		hashtest = { "bob" : (a + 5) , "joe" : "mike" , "moke" : [ a, b, c] };
		hashtest = { "bob" : "joe"};

		hashtest = { "bob" : "joe", "mike":"jackl"};
		
		
		mike = jack:mike ( a + b , c + d );
		mikea = mike ( a + b , c + d );

			joe = seen "bob" in app:joe within 1+a+b hour;
			
			
	   jack = not a;
	   joe = seen "bob" in app:joe within a + b days;

	 joe = seen "bob" before "joe" in app:mike;

	 joe = app:jack eq a + b within 1+a+b hour;


	 joe = app:jack within 1+a hour;
*/

	a = b.pick( a + b ).has(c+d);

/*	a = b.pick( a + b, c + d ).has(l ,d).split("adfdfd");
*/

     }

/*
  rule testa is active {
        select using "/test/" setting()
        pre { 
        } 
				
        { 


		emit << asdfasfd >>;
			replace( );
			replace( );
			replace( );
			
			dispatch();
			
			domain();
			use();
			javascript();
			resource();
			logging();
			on();
			off();
			authz();
			require();
			user();
			replace( );
			every();
			everyone();
		}
		
    }

    rule testb is active {
        select using "/test/" setting()
        pre { 
        } 
		{
        	replace("test","test");
		}
    }
*/
}
