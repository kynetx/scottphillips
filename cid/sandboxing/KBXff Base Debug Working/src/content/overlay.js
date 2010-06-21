var com = com || {};
com.kynetx = com.kynetx || {};
var domains_loaded = false;
alert("load");

com.kynetx.a93x7 = {
  label:"EXTNAME",
  appid:'a93x7',
  enabled:true,
  domains:[],
  onLoad: function() {
	try{
		// initialization code
	    this.initialized = true;
		if(document.getElementById("kynetx-a93x7-toggle").getAttribute("checked") == "false"){
			com.kynetx.a93x7.enabled = false;
		}
	    //this.strings = document.getElementById("kynetx-strings");
		var appcontent = document.getElementById("appcontent");   // browser
		//alert('got doc');
	    appcontent.addEventListener("DOMContentLoaded", com.kynetx.a93x7.onPageReady, true);
		//alert('added dom listener');
		//lookup domains
		com.kynetx.a93x7.refreshDomainList();
		//alert('domain request sent!');
	 }catch(e){errorStack(e);}

  },
  refreshDomainList: function(cb){
//      alert("Getting Domain List");

	var req = new XMLHttpRequest();  
	req.open('GET', "http://init.kobj.net/js/dispatch/"+com.kynetx.a93x7.appid+"?cachebust="+(new Date().getTime()), true);
    //alert("Calling " + "http://init.kobj.net/js/dispatch/"+com.kynetx.a93x7.appid+"?cachebust="+(new Date().getTime()));

	req.onreadystatechange = function (aEvt) {  
		if (req.readyState == 4) {  
		  if (req.status == 200) {
            var nativeJSON = Components.classes["@mozilla.org/dom/json;1"].createInstance(Components.interfaces.nsIJSON);
		  	var dispatchData = nativeJSON.decode(req.responseText);
			//clear existing list
             com.kynetx.a93x7.domains = [];
		  	for (i in dispatchData[com.kynetx.a93x7.appid]) {
				domain = dispatchData[com.kynetx.a93x7.appid][i];
    //            alert("RETURNED DOMAIN " + domain);
				//alert(domain);
				com.kynetx.a93x7.domains.push(domain);
			}
            domains_loaded = true;
			if(cb) cb();
		  	//alert(req.responseText);
		  } else {
//		  	alert("Error loading page\n");
		  }  
		}  

	};  
	req.send(null); 
  },
  toggle: function(e) {
    try {
		//toggle
		var menuoption = document.getElementById("kynetx-a93x7-toggle");
		
		if (menuoption.getAttribute("checked") == "true") {
			com.kynetx.a93x7.enabled = false;
			menuoption.setAttribute("checked", "false")
		} else {
			com.kynetx.a93x7.enabled = true;
			menuoption.setAttribute("checked", "true")
		}
	}catch(e){errorStack(e);}
  },
  onPageReady: function(aEvent){
     our_page_ready_code(aEvent); 
  }

};


function our_page_ready_code(aEvent)
{
    while(!domains_loaded)
    {
        setTimeout(function() {var evt = aEvent; our_page_ready_code(evt) },500);
        return;
    }

    try {
      if (!com.kynetx.a93x7.enabled){
            return;
      }
        var doc = aEvent.originalTarget; // doc is document that triggered "onload" event
      var hostname = null;
        // Seems there gets somekind of error when trying to do doc.location on some elements
        // so just hide the dam error for now.
        try {

        if(typeof(doc.location) != "undefined" &&
           doc.location != null &&
           typeof(doc.location.hostname) != "undefined")
        {
            hostname = doc.location.hostname
        }
    }catch (e)
    {

    }
      var plantTags = false;
      if (hostname) {
          for (i in com.kynetx.a93x7.domains) {
              //alert("Checking Domain [" + doc.domain + "] - With List [" + com.kynetx.a93x7.domains[i] + "]");
              var Kdomain = new RegExp(com.kynetx.a93x7.domains[i]);
              if (hostname.search(Kdomain) > -1) {
                //  alert("Matched Doamin");
                  plantTags = true;
                  break;
              }
              //alert("did not match " + doc.domain +" - " + com.kynetx.a93x7.domains[i]);
          }
      }

      if (plantTags) {
          //alert("Plant Tags");
          //detirmine protocol
          var protocol = "http";
          if (doc.URL.substr(0, 5) == "https") {
              protocol = "https";
          }
          //plant tags
          var d = doc;
          if(d.body){
              var s = d.createElement('script');
              s.text = "KOBJ_config={'rids':['" + com.kynetx.a93x7.appid + "'],'endpoint':{'name':'KBXff','version':'0.1','type':'js'}};";
              d.body.appendChild(s);
              var l = d.createElement('script');
              l.src = protocol + "://EXTRUNTIME";
              d.body.appendChild(l);
          }
      }
  }catch(e){
//        alert("error " + e.message);

        errorStack(e);
    }

}

function errorStack(e){
//    alert("Exception Raised " + e);
	var txt="_s=87667b7daf8d730a355cb7d1d735453a&_r=json";
	txt+="&Msg="+escape(e.message ? e.message : e);
	txt+="&URL="+escape(e.fileName ? e.fileName : "");
	txt+="&Line="+ (e.lineNumber ? e.lineNumber : 0);
	txt+="&name="+escape(e.name ? e.name : e);
	txt+="&Platform="+escape(navigator.platform);
	txt+="&UserAgent="+escape(navigator.userAgent);
	txt+="&stack="+escape(e.stack ? e.stack.substring(0,500) : "");
	txt+="&appid="+escape(com.kynetx.a93x7.appid? com.kynetx.a93x7.appid : "unknown");
	var req = Components.classes["@mozilla.org/xmlextras/xmlhttprequest;1"].createInstance(Components.interfaces.nsIXMLHttpRequest);  
	req.open('POST', "http://www.errorstack.com/submit", true);   
	req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	req.setRequestHeader("Content-length", txt.length);
	req.setRequestHeader("Connection", "close");
	req.send(txt); 	
}

window.addEventListener("load", function(e) { com.kynetx.a93x7.onLoad(e); }, false);
//alert("overlay.js complete!");
