ruleset 1024 {

    rule aaa is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)aaa(,|$)")
        then
            annotate_search_results(aaa_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_aaa" 
            }
        }
    }

}
