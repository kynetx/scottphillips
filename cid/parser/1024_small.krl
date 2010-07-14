ruleset 1024 {

  meta {
        description <<
			Production copy of the Azigo 1024 rule     
		>>
		name "1024 Production"
        logging off       
 		key errorstack "d895cc0802263e1c523349091752b25"
		key google  { "bob" : 10 }
		key kpds "data"
    
    }

global {

}

    rule aaa is active {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
emit <<
>>
        if (page:param("datasets") like "(^|,)aaa(,|$)")
        then
every {
            annotate_search_results(aaa_selector) with namea = "remindme" and bob = "joe";
            annotate_search_results(aaa_selector) with namea = "remindme" and bob = "joe";
       } 
        callbacks {
            success {
                click class = "KOBJ_aaa" 
            }
		}
    }

}
