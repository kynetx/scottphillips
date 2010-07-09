ruleset 1024 {
    meta {
        name "1024 Production"
        description <<
Production copy of the Azigo 1024 rule     
>>
        logging off        key errorstack "d895cc0802263e1c523349091752b25"
    
    }
    dispatch {
        domain "www.google.com"
        domain "maps.google.com"
        domain "search.yahoo.com"
        domain "local.yahoo.com"
        domain "www.bing.com"
        domain "search.microsoft.com"
    }
    global {
        dataset aaa <- "http://service.azigo.com/updates/kynetx/datasets/aaa.json" cachable
;        dataset aarp <- "http://service.azigo.com/updates/kynetx/datasets/aarp.json" cachable
;        dataset amex <- "http://service.azigo.com/updates/kynetx/datasets/amex.json" cachable
;        dataset ebates <- "http://service.azigo.com/updates/kynetx/datasets/ebates.json?flush=1" cachable
;        dataset lemay <- "http://service.azigo.com/updates/kynetx/datasets/lemay.json" cachable
;        dataset mod <- "http://service.azigo.com/updates/kynetx/datasets/mod.json" cachable
;        dataset sadv <- "http://service.azigo.com/updates/kynetx/datasets/sadv.json?ds=sadv" cachable
;        dataset upromise <- "http://service.azigo.com/updates/kynetx/datasets/upromise.json" cachable
;        dataset aaawa <- "http://service.azigo.com/updates/kynetx/datasets/aaawd.json" cachable
;        css  <<#spotlight-reminders-wrapper{    	height:24px;    	background:#e4effd;    	padding:0 0 0 9px;    	margin:15px 0;    	font-size:small;    }        .remindme-reminders-wrapper{    	height:24px;    	background:white;    	padding:0;    	margin:0;    	font-size:small;    	width:450px;    }        p.descriptive-text{    	float:right;    	margin:4px 9px 0 0;    	padding:0;    	color:#7a7a7a;    	font-size:small;    }        ul.spotlightReminders{    	float:left;    	margin:0;    	padding:0;    	list-style:none;    	height:24px;    }        ul.spotlightReminders li{    	display:block;    	float:left !important;    	margin:3px 3px 0 0;    }        ul.spotlightReminders li.azigo-logo{    	margin:4px 0 0 0;    }        ul.spotlightReminders li.txt-reminder{    	padding:0 0 0 4px;    	margin:4px 3px 0 0;    	color:#2b30d1;    }        .clear{    	clear:both;    }               .remindme-flyout-wrapper{    	border: 3px solid #e471ac;    	width:450px;    	margin:0 0 0 20px;    	position: absolute;            background-color: white;    	display: none;    	z-index: 1;    	text-align:left;    }        .flyout-pointer{    	background:url("http://www.azigo.com/images/rm/FlyoutPoint.png") no-repeat;    	height:11px;    	width:15px;    	position:relative;    	margin:-11px 0 0 20px;    }        .flyout-reminder-details{    	padding:8px 10px;    	border-bottom:1px solid #c2c2c2;            color: black;    	float: left;    }        p.flyout-reminder-url{    	margin:0 0 5px 0;    	padding:0;    }        .flyout-reminder-details ul{    	margin:0;    	padding:0;    	list-style:none;    	line-height:14px;    }        .flyout-reminder-details ul li{    	display:block;    	float:left !important;    	margin:0 4px 0 0;    	padding:0;    }        .flyout-reminder-details ul li.flyout-reminder-url{    	margin:0 0 5px 0;    	padding:0;    	width:250px;    }        .flyout-reminder-details ul li.flyout-reminder-text{    	width:230px;    }        .flyout-reminder-details ul li.flyout-reminder-button{    	margin:0;    }        a.flyout-reminder-button{    	display:block;    	font-size:10px;    	font-weight:bold;    	font-family:Verdana, sans-serif, Arial, Helvetica;    	background:#57b6e3;    	text-align:center;    	text-decoration:none;    	height:16px;    	width:96px;    	color:#fff;    	padding:2px 0 0 0;    	margin:0;    }            .clearfix:after {        content: ".";        display: block;        clear: both;        visibility: hidden;        line-height: 0;        height: 0;    }        .clearfix {        display: inline-block;    }        html[xmlns] .clearfix {        display: block;    }        * html .clearfix {        height: 1%;    }           .flyout-wrapper{    	border: 3px solid #e471ac;    	width:450px;    	margin:-15px 0 0 29px;    	position: absolute;            background-color: white;    	display: none;    	z-index: 1;    }                .flyout-reminder-details{    	padding:8px 10px;    	border-bottom:1px solid #c2c2c2;    	font-size: small;            width:430px;    }    >>
;            emit <<
var globalData = {                                    "Source" : "aaaw",    				"RemindMeIconUrl" : "http://www.azigo.com/images/rm/crd/aaa_18x24.png",                                    "FlyoutIconUrl" : "http://www.azigo.com/images/rm/crd/aaa_60x90.png"    			 };        	function remindMeSelector(obj) {                    var annotationContent;    		var remindMeDomain = obj.name.replace(/http:\/\/([A-Za-z0-9.-]+)\/.*/,"$1");            	remindMeDomain = remindMeDomain.replace("http://","");    		remindMeDomain = remindMeDomain.replace("www.","");    		remindMeDomain = remindMeDomain.replace("www1.","");    		remindMeDomain = remindMeDomain.replace(/\.[^.]+$/,"");                    remindMeDomain = remindMeDomain.replace(/[&]/g,"and");                    remindMeDomain = remindMeDomain.replace(/\s+/g,"");    		remindMeDomain = remindMeDomain.replace(/[']/g,"");    		remindMeDomain = remindMeDomain.replace(/[-]/g,"");                    remindMeDomain = remindMeDomain.toLowerCase();                        var remindMeDivId = "remindMe_"+remindMeDomain;                    var remindMeFlyoutDivId = "remindMeFlyout_"+remindMeDomain;    		var remindMeWrapper = "remindMeWrapper_"+remindMeDomain;        		if($K("#"+remindMeDivId).length == 0) {    		   var remindMeMainDiv = createRemindMeDiv(remindMeDivId);                       var remindMeFlyoutDiv = createRemindMeFlyoutDiv(remindMeFlyoutDivId);        		   remindMeFlyoutDiv.append(    			getFlyoutDetails(                                                     obj.name,                                                     obj.link,                                                      globalData.FlyoutIconUrl,                                                      obj.text,                                                      obj.icon                                              )    		   );         	           var remindMeDiv = $K("<div></div>");                           var wrapperDiv = $K("<div id='"+remindMeWrapper+"' class='remindme-reminders-wrapper'></div>");    		   wrapperDiv.append(remindMeMainDiv);        		   remindMeDiv.append(wrapperDiv);        	           remindMeDiv.append(remindMeFlyoutDiv);                           annotationContent = remindMeDiv;                       registerEvents(remindMeDivId, remindMeFlyoutDivId, false);                    }                    else {                        if($K("#"+remindMeDivId).find("#img_"+globalData.Source+"_remindMe").length) {                            return false;                       }        		   if($K("#"+remindMeDivId).children(".txt-reminder").length) {                          $K("#"+remindMeDivId).children(".txt-reminder").after(                                                  makeListItem(    		                                    null,     		                                    null,     		                                    $K("<img id='img_"+globalData.Source+"_remindMe' src='"+globalData.RemindMeIconUrl+"' />")    		                              )                          );                       }        		   if($K("#"+remindMeFlyoutDivId).length) {    			$K("#"+remindMeFlyoutDivId).append(    			                   getFlyoutDetails(                                                                    obj.name,                                                                    obj.link,                                                                     globalData.FlyoutIconUrl,                                                                     obj.text,                                                                     obj.icon                                               )    		        );      		   }        		     		   var spanReminders = $K("#"+remindMeDivId).children(".txt-reminder").children(".spanRemindMeNReminders");                       if (spanReminders.length > 0)                       {                           var totalReminders = parseInt(spanReminders.text());                           if (!isNaN(totalReminders))                           {    	                    totalReminders = totalReminders + 1;                                spanReminders.text(String(totalReminders));    	                    if(totalReminders == 1) {    		               $K("#"+remindMeDivId).children(".txt-reminder").children(".spanRemindMeTextReminders").text("Reminder");    	                    }    	                    else {    		               $K("#"+remindMeDivId).children(".txt-reminder").children(".spanRemindMeTextReminders").text("Reminders");    	                    }                           }                    		   }                       annotationContent = false;                    }    	     return annotationContent;            }                function registerEvents(remindMeDivId, remindMeFlyoutDivId, isSpotlightEvent) {		    	     $K("#"+remindMeDivId).live('mouseover', function () {    		   $K('#'+remindMeDivId).css({'cursor':'hand','cursor':'pointer'});                       $K('#'+remindMeFlyoutDivId).show();    	     });        	     $K("#"+remindMeDivId).live('mouseout', function () {                                              if(isSpotlightEvent) {                          $K("#spotlight-reminders-wrapper").live('mouseover', function() {                               $K('#'+remindMeFlyoutDivId).show();                                                     });                          $K("#spotlight-reminders-wrapper").live('mouseout', function() {                               $K('#'+remindMeFlyoutDivId).hide();       			   $K("#spotlight-reminders-wrapper").die('mouseover');    			   $K("#spotlight-reminders-wrapper").die('mouseout');                          });                       }    		   else {    			$K("#"+remindMeDivId).parent().mouseover(function() {                               $K('#'+remindMeFlyoutDivId).show();        			});                          $K("#"+remindMeDivId).parent().mouseout(function() {                               $K('#'+remindMeFlyoutDivId).hide();       			   $K("#"+remindMeDivId).parent().unbind('mouseover');    			   $K("#"+remindMeDivId).parent().unbind('mouseout');                          });    		   }        		   $K('#'+remindMeFlyoutDivId).hide();    	     });        	     $K("#"+remindMeFlyoutDivId).live('mouseover', function () {            	   $K('#'+remindMeFlyoutDivId).show();    	     });        	     $K("#"+remindMeFlyoutDivId).live('mouseout', function () {    		   $K('#'+remindMeFlyoutDivId).hide();    		   if(isSpotlightEvent) {    			   $K("#spotlight-reminders-wrapper").die('mouseover');    			   $K("#spotlight-reminders-wrapper").die('mouseout');    		   }    		   else {    			   $K("#"+remindMeDivId).parent().unbind('mouseover');    			   $K("#"+remindMeDivId).parent().unbind('mouseout');    		   }                 });            }        	function createRemindMeDiv(remindMeDivId) {                 var remindMeMainUl = $K("<ul></ul>");                 remindMeMainUl.attr({"id":remindMeDivId, "class":"spotlightReminders"});                     remindMeMainUl.append(                      makeListItem(null, "azigo-logo", $K("<img src='http://www.azigo.com/images/rm/azigo_16x16.png' />"))                 );                     remindMeMainUl.append(                      makeListItem(    		     "remindme-txt-reminder",     		     "txt-reminder",     		     "<span class='spanRemindMeNReminders'>1</span> <span class='spanRemindMeTextReminders'>Reminder</span>"    		  )                 );                     remindMeMainUl.append(                      makeListItem(    		     null,     		     null,     		     $K("<img id='img_"+globalData.Source+"_remindMe' src='"+globalData.RemindMeIconUrl+"' />")    		  )                 );                     remindMeMainUl.append(                      makeListItem(null, null, $K("<img src='http://www.azigo.com/images/rm/FlyoutIndicator.png' />"))                 );                     return remindMeMainUl;            }        	function createRemindMeFlyoutDiv(remindMeFlyoutDivId)            {    	    var remindMeFlyoutDiv = $K("<div></div>");    	    remindMeFlyoutDiv.attr({"id":remindMeFlyoutDivId, "class":"remindme-flyout-wrapper"});    	    remindMeFlyoutDiv.append($K("<div></div>").attr("class", "flyout-pointer"));                return remindMeFlyoutDiv;            }        	function makeListItem(listItemId, listItemClass, listItemContent) {                 var listItem = $K("<li></li>");                 if(listItemClass != null) {                     listItem.attr("class", listItemClass);                 }    	     if(listItemId != null) {    	         listItem.attr("id", listItemId);    	     }                 listItem.append(listItemContent);                 return listItem;                    }        	function makeAnchorTag(aUrl, aClass, aText)            {                 var anchorTag = $K("<a></a>");                 anchorTag.attr("href", aUrl);                 if(aClass != null) {                     anchorTag.attr("class", aClass);                 }                 anchorTag.append(aText);                 return anchorTag;            }                    function getFlyoutDetails(clientName, clientUrl, clientLogo, displayText, buttonType)        { 	             	var flyoutDetailsDiv = $K("<div></div>");    	flyoutDetailsDiv.attr("class","flyout-reminder-details clearfix");                var flyoutDetailsUl = $K("<ul></ul>");                flyoutDetailsUl.append(    		makeListItem(null, null, $K("<img src='"+clientLogo+"' />"))    	);            flyoutDetailsUl.append(                    makeListItem(null, "flyout-reminder-url", makeAnchorTag(clientUrl, null, clientName))            );            flyoutDetailsUl.append(    		makeListItem(null, "flyout-reminder-text", displayText)    	);    	var discountButton = "";    	  		discountButton = makeAnchorTag(clientUrl, "flyout-reminder-button", "Click and Save");    	          flyoutDetailsUl.append(    		makeListItem(null, null, discountButton)    	);                        flyoutDetailsDiv.append(flyoutDetailsUl);                    	return flyoutDetailsDiv;        }            KOBJ.spotlight = function (source) {                function datasetcallback(d){            if(d) {               var response = d.response;               if(response) {                   if(response.docs.length > 0) {                   	    displaySpotlight(response);                   }               }            }      	        }                    var q = String(top.location).replace(/^.*[\?&][qp]=([^&]+).*$/, "$1");        var remoteUrl = "http://service.azigo.com/solr/nutchfilter.jsp?q="+q+"&fq=source:"+source+"&callback=?";            $K.getJSON(remoteUrl,datasetcallback);                    function createSpotlightMainDiv()        {    	 var spotlightMainDiv = $K("<div></div>");    	 spotlightMainDiv.attr("id", "spotlight-reminders-wrapper");                 var spotlightMainUl = $K("<ul></ul>");             spotlightMainUl.attr({"id":"spotlightReminders", "class":"spotlightReminders"});                 spotlightMainUl.append(                        makeListItem(null, 'azigo-logo', $K("<img src='http://www.azigo.com/images/rm/azigo_16x16.png' />"))             );                 var spotlightReminderNSpan = $K("<span></span>");             spotlightReminderNSpan.attr("id", "spanNReminders");             spotlightReminderNSpan.text("0");                 var spotlightReminderTextSpan = $K("<span></span>");             spotlightReminderTextSpan.attr("id", "spanTextReminders");             spotlightReminderTextSpan.text("Reminders");                 spotlightMainUl.append(                               makeListItem(    				"spotlight-txt-reminder",     				"txt-reminder",     				"<span id='spanNReminders'>0</span> <span id='spanTextReminders'>Reminders</span>"    			   )             );                 spotlightMainUl.append(                        makeListItem(null, null, $K("<img src='http://www.azigo.com/images/rm/FlyoutIndicator.png' />"))             );                 var spotlightMainP = $K("<p></p>");             spotlightMainP.attr("class", "descriptive-text");             spotlightMainP.text("My Sponsored Links");                 spotlightMainDiv.append(spotlightMainUl);             spotlightMainDiv.append(spotlightMainP);                 return spotlightMainDiv;        }                    function createSpotlightFlyoutDiv()        {    	var spotlightFlyoutDiv = $K("<div></div>");    	spotlightFlyoutDiv.attr({"id":"spotlightFlyoutDiv", "class":"flyout-wrapper"});    	spotlightFlyoutDiv.append($K("<div></div>").attr("class", "flyout-pointer"));            return spotlightFlyoutDiv;        }                    function flyoutContentCallback(data)        {            if($K('#spotlightFlyoutDiv').length) {               $K.each(data, function(){                            $K('#spotlightFlyoutDiv').append(    			                  getFlyoutDetails(                                                     this.name,                                                     this.link,                                                      globalData.FlyoutIconUrl,                                                      this.text,                                                      this.icon                                              )                            );                        }               );            }        }                        function displaySpotlight(response)        {            var logoUrl = globalData.RemindMeIconUrl;                if($K("#spotlight-reminders-wrapper").length == 0) {    	    var spotlightMainDiv = createSpotlightMainDiv();                var spotlightFlyoutDiv = createSpotlightFlyoutDiv();     	    var spotlightDiv = $K("<div id='spotlight-main-flyout'></div>");    	    spotlightDiv.append(spotlightMainDiv);    	    spotlightDiv.append(spotlightFlyoutDiv);                if($K("#res").length) {                    $K("#res").prepend(spotlightDiv);                }                else if($K("#web").length) {                    $K("#web").prepend(spotlightDiv);                }                else if($K("#results").length) {                    $K("#results").prepend(spotlightDiv);                }            }                  	registerEvents("spotlightReminders", "spotlightFlyoutDiv", true);        	        	if($K("#img_"+source+"_spotlight").length) {                return;            }                if($K("#spotlight-txt-reminder").length) {                 $K("#spotlight-txt-reminder").after("<li><img id='img_"+source+"_spotlight' src='"+logoUrl+"' /></li>");            }            var spanReminders = $K("#spanNReminders");            if (spanReminders.length > 0)            {                var totalReminders = parseInt(spanReminders.text());               if (!isNaN(totalReminders))               {    	       if(response.docs.length > 3) {    		   totalReminders = totalReminders + 3;    	       }    	       else {                   	   totalReminders = totalReminders + response.docs.length;    	       }                   spanReminders.text(String(totalReminders));    	       if(totalReminders == 1) {    		   $K("#spanTextReminders").text("Reminder");    	       }    	       else {    		   $K("#spanTextReminders").text("Reminders");    	       }               }            }                    	var jsonData = "";    	var index = 1;    	$K.each(response.docs, function(){    				if(index > 1)    				    jsonData += ",";    				jsonData += "'KOBJL"+index+"':{'url':'"+this.url+"'}";    				index++;    				if(index > 3)    				   return false;    			});                var jsonUrl = "https://service.azigo.com/remindmeac/fetch?callback=?&jsonData=true&source="+source;            $K.getJSON(jsonUrl, "annotatedata={"+jsonData+"}", flyoutContentCallback);      }    };                >>
;            emit <<
var url_prefix = "http://frag.kobj.net/clients/1024/images/";        var link_text = {    	"aaa": "<div style='padding-top: 13px'>AAA</div>",    	"aarp": "<div style='padding-top: 13px'>AARP</div>",    	"aarp_img": "<img style='padding-top: 3px' src='" + url_prefix + "aarp_logo_34.png' border='0'>",    	"amex": "<div style='padding-top: 5px'>American<br/>Express</div>",    	"bcc": "<img style='padding-top: 5px' src='" + url_prefix + "bcc_logo_34.png' border='0'>",    	"ebates": "<img style='padding-top: 7px;height:28px' src='" + url_prefix + "ebates_logo_34.png' border='0'>",    	"lemay": "<img style='padding-top: 7px' src='" + url_prefix + "lemay_logo_25.png' border='0'>",    	"mod_text": "<div style='padding-top: 13px'>MoD</div>",    	"mod": "<img style='padding-top: 3px' src='" + url_prefix + "mod_logo_34.png' border='0' >",    	"sadv": "<img style='padding-top: 3px' src='" + url_prefix + "sadv_logo_34.png' border='0' >",    	"sadv_txt": "<div style='padding-top: 7px'>Student<br/>Advantage</div>",    	"upromise": "<div style='padding-top: 13px'>UPromise</div>",    	"boa": "<img style='padding-top: 3px' src='" + url_prefix + "boa_logo_34.png' border='0'>",    	"sep": "<div style='padding-top: 13px'>|</div>",    	"aaawa_text": "<div style='padding-top: 13px'>AAA</div>",    	"aaawa": "<img style='padding-top: 5px' src='" + url_prefix + "aaa_logo_34.png' border='0'>"    };            function make_selector(key){        	var func = function(obj){    	  try {        	  function mk_anchor (o, key) {    	    return $K('<a href=' + o.link + '/>').attr(    	      {"class": 'KOBJ_'+key,    	       "title": o.text || "Click here for discounts!"    	      }).html(link_text[key]);    	  }    	  var entryURL = $K(obj).find("span.url, cite").text();    	  var host = KOBJ.get_host(entryURL);    	  var o = KOBJ.pick(KOBJ['data'][key][host]);    	    	  if(!o){    	  	o = KOBJ.pick(KOBJ['data'][key]["www." + host]);    	  	  	  }                              if(!o){                  o = KOBJ.pick(KOBJ['data'][key][host.replace(/^www./, "")]);              }        	    	  if(key == 'aaawa' && host == 'www.premiumoutlets.com'){    	  	if(!entryURL.match(/^www\.premiumoutlets\.com(\/seattle|\/ |$)/)){    	  		  	  		  	  		return false;    	  	}    	  }    	    	    	  if(key == 'aaawa' && host == 'www.diamondparking.com'){    	  	if(!entryURL.match(/^www\.diamondparking\.com\/Airport\/Spokane.aspx/)){    	  		  	  		  	  		return false;    	  	}    	  }    	    	  if(o) {    	     return mk_anchor(o,key);    	  } else {    	    return false;    	  }            	} catch(e) {    		var txt="_s=1d895cc0802263e1c523349091752b25&_r=img";    		txt+="&Msg="+escape(e.message ? e.message : e);    		txt+="&URL="+escape(e.fileName ? e.fileName : "");    		txt+="&Line="+ (e.lineNumber ? e.lineNumber : 0);    		txt+="&name="+escape(e.name ? e.name : e);    		txt+="&Platform="+escape(navigator.platform);    		txt+="&UserAgent="+escape(navigator.userAgent);    		txt+="&stack="+escape(e.stack ? e.stack : "");    		var i = document.createElement("img");    		i.setAttribute("src", "http://www.errorstack.com/submit?" + txt);    		document.body.appendChild(i);    	    	}            	};    	return func;    }        function make_selector_exact_match(key){    	var func = function(obj){    	  try {        	  function mk_anchor (o, key) {    	    return $K('<a href=' + o.link + '/>').attr(    	      {"class": 'KOBJ_'+key,    	       "title": o.text || "Click here for discounts!"    	      }).html(link_text[key]);    	  }    	  var otherURL = $K(obj).find("span.url, cite").text();              var entryURL = $K(obj).find("span.url, cite").text().replace(/\s+.*$/, "").replace(/\/$/, "").replace(/^www\./, "").toLowerCase();    	              var o = KOBJ.pick(KOBJ['data'][key][entryURL]);    	    	  if(o) {    	     return mk_anchor(o,key);    	  } else {    	    return false;    	  }            	} catch(e) {    		var txt="_s=1d895cc0802263e1c523349091752b25&_r=img";    		txt+="&Msg="+escape(e.message ? e.message : e);    		txt+="&URL="+escape(e.fileName ? e.fileName : "");    		txt+="&Line="+ (e.lineNumber ? e.lineNumber : 0);    		txt+="&name="+escape(e.name ? e.name : e);    		txt+="&Platform="+escape(navigator.platform);    		txt+="&UserAgent="+escape(navigator.userAgent);    		txt+="&stack="+escape(e.stack ? e.stack : "");    		var i = document.createElement("img");    		i.setAttribute("src", "http://www.errorstack.com/submit?" + txt);    		document.body.appendChild(i);    	    	}            	};    	return func;    }        aaa_selector = make_selector('aaa');    aarp_selector = make_selector('aarp');    amex_selector = make_selector('amex');    ebates_selector = make_selector('ebates');    lemay_selector = make_selector('lemay');    mod_selector = make_selector('mod');    sadv_selector = make_selector('sadv');    upromise_selector = make_selector('upromise');    aaawa_selector = make_selector_exact_match('aaawa');            function get_host(s) {     var h = "";     try {       h = s.match(/^(?:\w+:\/\/)?([\w.]+)/)[1];     } catch(err) {     }     return h;    }        function pick (o) {        if (o) {            return o[Math.floor(Math.random()*o.length)];        } else {            return o;        }    }                    >>
;    }
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
    rule aaawa is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)aaawa(,|$)")
        then
            annotate_search_results(aaawa_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_aaawa" 
            }
        }
    }
    rule aarp is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)aarp(,|$)")
        then
            annotate_search_results(aarp_selector)
            with
                    name = "remindme" and
                    head_image = (url_prefix + "remindme_bar40_l.png") and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_aarp" 
            }
        }
    }
    rule amex is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)amex(,|$)")
        then
            annotate_search_results(amex_selector)
            with
                    name = "remindme" and
                    head_image = (url_prefix + "remindme_bar40_l.png") and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_amex" 
            }
        }
    }
    rule ebates is active {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)ebates(,|$)")
        then
            annotate_search_results(ebates_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_ebates" 
            }
        }
    }
    rule lemay is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)lemay(,|$)")
        then
            annotate_search_results(lemay_selector)
            with
                    name = "remindme" and
                    head_image = (url_prefix + "remindme_bar40_l.png") and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_lemay" 
            }
        }
    }
    rule mod is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)mod(,|$)")
        then
            annotate_search_results(mod_selector)
            with
                    name = "remindme" and
                    head_image = (url_prefix + "remindme_bar40_l.png") and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_mod" 
            }
        }
    }
    rule sadv is active {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)sadv(,|$)")
        then
            annotate_search_results(sadv_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_sadv" 
            }
        }
    }
    rule upromise is inactive {
        select using "^http://www.google.com|^http://search.yahoo.com|^http://www.bing.com" setting ()

        pre {
            url_prefix = "http://frag.kobj.net/clients/1024/images/";
        }
        if (page:param("datasets") like "(^|,)upromise(,|$)")
        then
            annotate_search_results(upromise_selector)
            with
                    name = "remindme" and
                    head_image = "http://www.azigo.com/sales-demo/remindme_bar40_l.png" and
                    tail_image = (url_prefix + "remindme_bar40_r.png") and
                    height = "40px" and
                    left_margin = "46px";
        
        callbacks {
            success {
                click class = "KOBJ_upromise" 
            }
        }
    }
    rule bccgooglemaps is inactive {
        select using "^http://maps.google.com" setting ()

        pre {
        }
        if (page:param("datasets") like "bcc")
        then
                            emit <<
var KOBJ_bcc_html = function(bcc_data, container_tag) {     var bcc_html = $K('<img>').attr(        {"src": "http://frag.kobj.net/clients/15/images/BCC_logo.png",         "border": "0",         "align": "left",         "valign": "middle"         });       if(bcc_data.link) {       bcc_html = $K('<a>').attr(         {"class": "KOBJ_bcc",          "href": bcc_data.link,  	"title": bcc_data.text  	}).append(bcc_html);     }       var td1 = $K('<td>').append(bcc_html);     var td2 = $K('<td>').attr(                  {"bgcolor": '#ccffcc'  		}).text(bcc_data.text);       bcc_html = $K('<table>').css('padding','10px').append(                      $K('<tr>').append(td1).append(td2)  		    );       return $K(container_tag).append(bcc_html);  };      var KOBJ_bcc_googlemaps_ol= function() {   $K("div.local div.res div.one").each(function() {     var pn = $K(this).find("span#sxphone").text().replace(/\(|\)|-|\.|\s/g,'');     var o = KOBJ.pick(KOBJ.bcc[pn]);     if(o)  {       $K(this).find("div.sa").after(KOBJ_bcc_html(o, '<div>'));     };     });   return true;  };  $K("form#q_form").submit(function(e){    setTimeout("(KOBJ_bcc_googlemaps_ol());",2000);  });                        >>
;
        
        callbacks {
            success {
                click class = "KOBJ_bcc" 
            }
        }
    }
    rule bccyahoolocal is inactive {
        select using "^http://local.yahoo.com" setting ()

        pre {
        }
        if (page:param("datasets") like "bcc")
        then
                            emit <<
var KOBJ_bcc_html = function(bcc_data, container_tag) {     var bcc_html = $K('<img>').attr(        {"src": "http://frag.kobj.net/clients/15/images/BCC_logo.png",         "border": "0",         "align": "left",         "valign": "middle"         });       if(bcc_data.link) {       bcc_html = $K('<a>').attr(         {"class": "KOBJ_bcc",          "href": bcc_data.link,  	"title": bcc_data.text  	}).append(bcc_html);     }       var td1 = $K('<td>').append(bcc_html);     var td2 = $K('<td>').attr(                  {"bgcolor": '#ccffcc'  		}).text(bcc_data.text);       bcc_html = $K('<table>').css('padding','10px').append(                      $K('<tr>').append(td1).append(td2)  		    );       return $K(container_tag).append(bcc_html);  };      $K("#yls-results tbody").each(function() {   var pn = $K(this).find("span.tel").text().replace(/\(|\)|-|\.|\s/g,'');   var o = KOBJ.pick(KOBJ.bcc[pn]);   if(o)  {     $K(this).find("td.yls-rs-bizinfo").append(KOBJ_bcc_html(o, '<div>'));   }  });                        >>
;
        
        callbacks {
            success {
                click class = "KOBJ_bcc" 
            }
        }
    }
    rule bccbostonsearch is inactive {
        select using "^http://search.boston.com" setting ()

        pre {
        }
        if (page:param("datasets") like "bcc")
        then
                            emit <<
var KOBJ_bcc_html = function(bcc_data, container_tag) {     var bcc_html = $K('<img>').attr(        {"src": "http://frag.kobj.net/clients/15/images/BCC_logo.png",         "border": "0",         "align": "left",         "valign": "middle"         });       if(bcc_data.link) {       bcc_html = $K('<a>').attr(         {"class": "KOBJ_bcc",          "href": bcc_data.link,  	"title": bcc_data.text  	}).append(bcc_html);     }       var td1 = $K('<td>').append(bcc_html);     var td2 = $K('<td>').attr(                  {"bgcolor": '#ccffcc'  		}).text(bcc_data.text);       bcc_html = $K('<table>').css('padding','10px').append(                      $K('<tr>').append(td1).append(td2)  		    );       return $K(container_tag).append(bcc_html);  };    $K("ul.listingLayout ol.linklist > li").each(function() {   var pn = $K(this).find("ul.linklistNoBullets li:eq(1)").text().split("|").pop();   pn = pn.replace(/\(|\)|-|\.|\s/g,'');   var o = KOBJ.pick(KOBJ.bcc[pn]);   if(o)  {     $K(this).find("ul.linklistNoBullets").append(KOBJ_bcc_html(o, '<li>'));   }    });                          >>
;
        
        callbacks {
            success {
                click class = "KOBJ_bcc" 
            }
        }
    }
    rule bccyelp is inactive {
        select using "^http://www.yelp.com" setting ()

        pre {
        }
        if (page:param("datasets") like "bcc")
        then
                            emit <<
var KOBJ_bcc_html = function(bcc_data, container_tag) {     var bcc_html = $K('<img>').attr(        {"src": "http://frag.kobj.net/clients/15/images/BCC_logo.png",         "border": "0",         "align": "left",         "valign": "middle"         });       if(bcc_data.link) {       bcc_html = $K('<a>').attr(         {"class": "KOBJ_bcc",          "href": bcc_data.link,  	"title": bcc_data.text  	}).append(bcc_html);     }       var td1 = $K('<td>').append(bcc_html);     var td2 = $K('<td>').attr(                  {"bgcolor": '#ccffcc'  		}).text(bcc_data.text);       bcc_html = $K('<table>').css('padding','10px').append(                      $K('<tr>').append(td1).append(td2)  		    );       return $K(container_tag).append(bcc_html);  };    var KOBJ_insert_bcc_ol= function(rlist_selector, phone_selector) {    $K(rlist_selector).each(function() {     var pn = $K(this).find(phone_selector).text().replace(/\(|\)|-|\.|\s/g,'');     var o = KOBJ.pick(KOBJ.bcc[pn]);     if(o)  {       $K(this).append(KOBJ_bcc_html(o, '<div>'));     }    });    return true;  };    var KOBJ_bcc_yelp_binder = function() {    $K("#searchLayoutFilters li").click(function(e){      setTimeout(      "KOBJ_insert_bcc_ol('#businessresults div.businessresult','div.phone');KOBJ_bcc_yelp_binder();",      5000);    });  };    KOBJ_insert_bcc_ol('#businessresults div.businessresult','div.phone');  KOBJ_bcc_yelp_binder();                      >>
;
        
        callbacks {
            success {
                click class = "KOBJ_bcc" 
            }
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
                        remote = "https://service.azigo.com/remindmeac/fetch?callback=?&jsonData=true&source=aaaw" and
                        outer_div_css = {"float" : "none", "margin-left" : "0px", "padding-right" : "0px"} and
                        inner_div_css = {"margin-left" : "0px", "padding-right" : "0px", "padding-top" : "5px"} and
                        li_css = {"padding-left" : "0px", "white-space" : "normal"} and
                        placement = "after" and
                        domains = {"www.bing.com" : {"modify" : ".sa_cc"}};
                annotate_local_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac/fetch?callback=?&jsonData=true&source=aaaw" and
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
                        remote = "https://service.azigo.com/remindmeac/fetch?callback=?&jsonData=true&source=aaaw" and
                        outer_div_css = {"float" : "none", "height" : "40px", "margin-left" : "0px", "margin-top" : "-10px", "padding-right" : "0px"} and
                        inner_div_css = {"margin-left" : "0px", "padding-right" : "0px"} and
                        li_css = {"padding-left" : "0px", "white-space" : "normal"} and
                        placement = "after" and
                        domains = {"search.yahoo.com" : {"selector" : "#web > ol > li", "modify" : "div.res"}};
                annotate_local_search_results(remindMeSelector)
                with
                        remote = "https://service.azigo.com/remindmeac/fetch?callback=?&jsonData=true&source=aaaw" and
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
