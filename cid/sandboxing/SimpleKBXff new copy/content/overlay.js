function async_url_request(url,callback,extra_params) {
	var params = extra_params;
	
	var safeurl = XPCSafeJSObjectWrapper(url);
	var req = new XMLHttpRequest(); 
	req.open('GET', safeurl, true);  
	req.onreadystatechange = function (aEvt) {
		if (req.readyState == 4) {
		  if (req.status == 200) {
			callback(url,response,params);
		  } else {
		  }
		}
	};
	req.send(null);
}

function kynetx_onLoad() {
	try{
		// initialization code
	    this.initialized = true;
		if(document.getElementById("kynetx-a8x15-toggle").getAttribute("checked") == "false"){
			com.kynetx.a8x15.enabled = false;
		}
	    //this.strings = document.getElementById("kynetx-strings");
		var appcontent = document.getElementById("appcontent");   // browser
		//alert('got doc');
	    appcontent.addEventListener("DOMContentLoaded", kynetx_onPageReady, true);
	 } catch(e) { errorStack(e); }

}


function kynetx_onPageReady(aEvent) {
   if (aEvent.originalTarget instanceof HTMLDocument) {
    var win = aEvent.originalTarget.defaultView;
    if (win.frameElement) {
    	return;
    }
    win = win.top;
	var sandbox = null;

  	try {
		var safeWin = aEvent.target.defaultView;
//		var unsafeWin = safeWin.wrappedJSObject;
		var unsafeWin = safeWin;

	    var unsafeLoc = new XPCNativeWrapper(unsafeWin, "location").location;
    	var href = new XPCNativeWrapper(unsafeLoc, "href").href;
  		var url = "http://static.kobj.net/kobj-static-20100524184304.js";
			
		var req = new XMLHttpRequest();
		req.open('GET', url, true);
		req.onreadystatechange = function (aEvt) {
			if (req.readyState == 4) {
			  if (req.status == 200) {

				alert("about to eval");
				injectScripts(req.responseText, href, unsafeWin, window);    	
				alert("add and run config");
				injectScripts("alert(KOBJ_Sandbox);KOBJ.add_config_and_run({'rids':['a93x7'],'a93x7:kynetx_app_version':'dev',init:{eval_host:'192.168.15.9',callback_host:'192.168.15.9',init_host:'192.168.15.9'}});", href, unsafeWin, window);    	
			  } else {
			  }
			}
		};
		req.send(null); 
	}catch(e){errorStack(e);}
	
    gBrowser.removeEventListener("load", kynetx_onLoad, true);
  }
}

var sandbox = null;


function injectScripts(script, url, unsafeContentWin, chromeWin) {
    var script;
    var logger;
    var console;
    var storage;
    var xmlhttpRequester;
    var resources;
    var safeWin = new XPCNativeWrapper(unsafeContentWin);
    var safeDoc = safeWin.document;
      if(sandbox == null)
      {
      	sandbox = new Components.utils.Sandbox(safeWin);
	    sandbox.window = safeWin;
    	sandbox.document = sandbox.window.document;
      	sandbox.unsafeWindow = unsafeContentWin;
      	sandbox.async_url_request = async_url_request;
      	sandbox.console = console;
//      	sandbox.KOBJ_Sandbox = true;
//      	sandbox.KOBJ = {};
      	sandbox.__proto__ = safeWin;
	  }
      var contents = script;

      var scriptSrc = "\n" + // error line-number calculations depend on these
                         contents +
                         "\n";

  	try {
//      if (!Components.utils..evalInSandbox(scriptSrc, sandbox))
  //    {
//        Components.utils.evalInSandbox("(function(){"+ scriptSrc +"})()",
        Components.utils.evalInSandbox(scriptSrc ,
                            sandbox); // wrap anyway on early return
    //  }
	}catch(e){
		if(e.lineNumber)
		{
		alert(e.lineNumber);
		}
	errorStack(e);
	
	}

}



function errorStack(e){
	alert(e.message);
	alert(e.stack);
}

window.addEventListener("load", function () {
  // Add a callback to be run every time a document loads.
  // note that this includes frames/iframes within the document
  gBrowser.addEventListener("load", kynetx_onLoad, true);
}, false);



//window.addEventListener("load", kynetx_onLoad, false);
//alert("overlay.js complete!");
