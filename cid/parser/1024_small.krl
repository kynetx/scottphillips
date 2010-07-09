ruleset 1024 {

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
            annotate_search_results(aaa_selector) with name = "remindme" and bob = "joe";
            annotate_search_results(aaa_selector) with name = "remindme" and bob = "joe";
       } 
        callbacks {
            success {
                click class = "KOBJ_aaa" 
            }
		}
    }

}
