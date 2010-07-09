ruleset aaaa {
	meta {
        name "1024 Production"
		key errorstack "stringvalue"
		key errorstack "numkey":1999
		key errorstack "key":"value"
		
        description <<
Production copy of the Azigo 1024 rule     
>>
	    authz  require user

        logging off        
		key errorstack "d895cc0802263e1c523349091752b25"
		
		use module  mydata alias somedata
		
		use css resource "this is a test"
		
		use javascript resource "more test"
		
		use javascript resource ajsname
		
		use css resource acssname
     
    }

}