ruleset 1024 {
    rule ebates is active {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)ebates(,|$)")
        then  {
            annotate_search_results(ebates_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        emit <<  >>; }
        callbacks {
            success {
                click class = "KOBJ_ebates" 
            }
        }
    }
    rule sadv is active {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()
        pre {
          dismissed = ent:dismissed;
      
          upgradeReminder = << 
            <div id="kobj_upgrade_notice" style="background-color: #000000; padding: 1pt; -moz-border-radius: 5px; -webkit-border-radius: 5px; border: solid 2px black;">
              <img src='http://frag.kobj.net/clients/azigo_citi_demo/images/azigo_logo_black_34.png'>
               <div  style="padding: 3pt;
                            -moz-border-radius: 5px;
                            -webkit-border-radius: 5px;
                            background-color: #FFFFFF;
                            width: 225px;
                            text-align: center;
                            color: black;">
                  <p class="content">A new version of Student Advantage card is available. To continue getting reminders for Student Advantage, please download the new card from <a target='_blank' style="color:#710100; text-decoration:underline;" href='http://www.azigo.com/landing/sadv-upgrade.html'>here</a>.</p>
                  <div class="dismiss">Remind me tomorrow!</div>
              </div>
            </div>
          >>;
        }
                       emit <<  >>
        if (page:param("datasets") like "(^|,)sadv(,|$)") && (ent:dismissed == 0 within 24 hours)
        then
             {

          float_html("absolute", "top: 50px", "right: 50px", upgradeReminder);
          watch(".dismiss", "click");        
        
            }
    }
    rule mark_as_read_and_dismiss_content is active {
      select when web click ".dismiss"
      {
        set_element_attr("#kobj_upgrade_notice", "style", "display: none;");
      }
      fired {
        ent:dismissed += 1 from 1;
      }
    }
    rule aaa_newui_goolge is active {
        select using "^http://www.google.com|^http://www.bing.com" setting ()

        pre {
        }
        emit <<
        >>
        if (page:param("datasets") like "(^|,)aaawa(,|$)")
        then
            every {
                annotate_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac-test/fetch?callback=?&jsonData=true&source=aaaw" and
                        outer_div_css = {"float" : "none", "margin-left" : "0px", "padding-right" : "0px"} and
                        inner_div_css = {"margin-left" : "0px", "padding-right" : "0px", "padding-top" : "5px"} and
                        li_css = {"padding-left" : "0px", "white-space" : "normal"} and
                        placement = "after" and
                        domains = {"www.bing.com" : {"modify" : ".sa_cc"}};
                annotate_local_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac-test/fetch?callback=?&jsonData=true&source=aaaw" and
                        placement = "after" and
                        domains = {"www.bing.com" : {"modify" : ".sc_ol1"}};
            }
        
        callbacks {
            success {
                click class = "flyout-reminder-button" 
            }
        }
    }
    rule aaa_newui_yahoo is active {
        select using "^http://search.yahoo.com" setting ()

        pre {
        }
        emit <<
        >>
        if (page:param("datasets") like "(^|,)aaawa(,|$)")
        then
            every {
                annotate_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac-test/fetch?callback=?&jsonData=true&source=aaaw" and
                        outer_div_css = {"float" : "none", "height" : "40px", "margin-left" : "0px", "margin-top" : "-10px", "padding-right" : "0px"} and
                        inner_div_css = {"margin-left" : "0px", "padding-right" : "0px"} and
                        li_css = {"padding-left" : "0px", "white-space" : "normal"} and
                        placement = "after" and
                        domains = {"search.yahoo.com" : {"selector" : "#web > ol > li", "modify" : "div.res"}};
                annotate_local_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac-test/fetch?callback=?&jsonData=true&source=aaaw" and
                        placement = "after" and
                        domains = {"search.yahoo.com" : {"modify" : ".qlmr"}};
            }
        
        callbacks {
            success {
                click class = "flyout-reminder-button" 
            }
        }
    }
    rule aaa_newui_spotlight is active {
        select using "^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
        }
        if (page:param("datasets") like "(^|,)aaawa(,|$)")
        then
                            emit <<
KOBJ.spotlight('aaaw');                       >>
;
        
        callbacks {
            success {
                click class = "flyout-reminder-button" 
            }
        }
    }
    rule aaa_newui_spotlight_google is active {
        select using "^http://www.google.com" setting ()

        pre {
        }
        if (page:param("datasets") like "(^|,)aaawa(,|$)")
        then
                            emit <<
KOBJ.spotlight('aaaw');         KOBJ.watchDOM("#rso",function() {  			$K('#spotlight-main-flyout').remove();  			KOBJ.spotlight('aaaw');  		 }  	 );                    >>
;
        
        callbacks {
            success {
                click class = "flyout-reminder-button" 
            }
        }
    }

}