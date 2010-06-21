var com = com || {};
com.kynetx = com.kynetx || {};

com.kynetx.a8x15 = {
  label:"EXTNAME",
  appid:'a8x15',
  enabled:true,
  domains:[],
  runtimesource:"",
  datasetsource:"",
  onLoad: function() {
	try{
		// initialization code
	    this.initialized = true;
		if(document.getElementById("kynetx-a8x15-toggle").getAttribute("checked") == "false"){
			com.kynetx.a8x15.enabled = false;
		}
	    //this.strings = document.getElementById("kynetx-strings");
		var appcontent = document.getElementById("appcontent");   // browser
		//alert('got doc');
	    appcontent.addEventListener("DOMContentLoaded", com.kynetx.a8x15.onPageReady, true);
		//alert('added dom listener');
		//lookup domains
		com.kynetx.a8x15.refreshDomainList();
		//load runtime
		com.kynetx.a8x15.refreshRuntime();
		//load datasets
		com.kynetx.a8x15.refreshDataset();
		//alert('domain request sent!');
	 }catch(e){errorStack(e);}

  },
  refreshDomainList: function(cb){
	var req = new XMLHttpRequest();  
	req.open('GET', "http://init.kobj.net/js/dispatch/"+com.kynetx.a8x15.appid+"?cachebust="+(new Date().getTime()), true);  
	req.onreadystatechange = function (aEvt) {  
		if (req.readyState == 4) {  
		  if (req.status == 200) {
		  	var nativeJSON = Components.classes["@mozilla.org/dom/json;1"].createInstance(Components.interfaces.nsIJSON);
		  	var dispatchData = nativeJSON.decode(req.responseText);
			//clear existing list
			while (com.kynetx.a8x15.domains.length) {
				com.kynetx.a8x15.domains.pop();
			}
		  	for (i in dispatchData[com.kynetx.a8x15.appid]) {
				domain = dispatchData[com.kynetx.a8x15.appid][i];
				//alert(domain);
				com.kynetx.a8x15.domains.push(domain);
			}
			if(cb) cb();
		  	//alert(req.responseText);
		  } else {
		  	//alert("Error loading page\n");
		  }  
		}  
	};  
	req.send(null); 
  },
  refreshRuntime: function(cb){
	var req = new XMLHttpRequest(); 
	req.open('GET', "http://static.kobj.net/kobj-static-20100524184304.js", true);  
	//http://static.kobj.net/kobj-static-20100121213428.js (pjw)
	//http://static.kobj.net/kobj-static-20100125165946.js (sam)
	req.onreadystatechange = function (aEvt) {
		if (req.readyState == 4) {
		  if (req.status == 200) {
		  	com.kynetx.a8x15.runtimesource = req.responseText;
			if(cb) cb();
		  	//alert(req.responseText);
		  } else {
		  	//alert("Error loading page\n");
		  }
		}
	};
	req.send(null); 
  },
  refreshDataset: function(cb){
	var req = new XMLHttpRequest(); 
	req.open('GET', "http://init.kobj.net/js/datasets/"+com.kynetx.a8x15.appid+"/", true);  
	req.onreadystatechange = function (aEvt) {
		if (req.readyState == 4) {
		  if (req.status == 200) {
		  	com.kynetx.a8x15.datasetsource = req.responseText;
			if(cb) cb();
		  	//alert(req.responseText);
		  } else {
		  	//alert("Error loading page\n");
		  }
		}
	};
	req.send(null); 
  },
  toggle: function(e) {
    try {
		//toggle
		var menuoption = document.getElementById("kynetx-a8x15-toggle");
		
		if (menuoption.getAttribute("checked") == "true") {
			com.kynetx.a8x15.enabled = false;
			menuoption.setAttribute("checked", "false")
		} else {
			com.kynetx.a8x15.enabled = true;
			menuoption.setAttribute("checked", "true")
		}
	}catch(e){errorStack(e);}
  },
  KOBJ_getwithimage: function(url){
  	var safeurl = XPCSafeJSObjectWrapper(url);
  	var req = new XMLHttpRequest(); 
	req.open('GET', safeurl, true);  
	req.send(null);
  },
  KOBJ_require: function(url, sandbox) {
  	var safeurl = XPCSafeJSObjectWrapper(url);
	dump("Require: " + safeurl + "\n");
	var req = new XMLHttpRequest(); 
	req.open('GET', safeurl, true);  
	req.onreadystatechange = function (aEvt) {
		if (req.readyState == 4) {
		  if (req.status == 200) {
		  	Components.utils.evalInSandbox(req.responseText, sandbox);
			dump("eval'd require response\n");
		  	//alert(req.responseText);
		  } else {
		  	//alert("Error loading page\n");
		  }
		}
	};
	req.send(null);
  },
  KOBJ_getJSONP: function(url, data, cb, sandbox){
		var cbmethod = "getJSONCB" +(new Date().getTime());
		dump("JSONP!: "+cbmethod+"\n");
		sandbox[cbmethod] = cb;
		//window[cbmethod] = cb;
		var jQuery = Components.utils.evalInSandbox("$K", sandbox);
		var fullURL = url.replace("=?", "="+cbmethod+"&") + jQuery.param(data);
		dump(fullURL + "\n\n");
		com.kynetx.a8x15.KOBJ_require(fullURL, sandbox);
  },
  onPageReady: function(aEvent){
  	try {
		if (!com.kynetx.a8x15.enabled){
  			return;
		}
  		var doc = aEvent.originalTarget; // doc is document that triggered "onload" event
		var plantTags = true;
		if (doc.domain) {
			for (i in com.kynetx.a8x15.domains) {
				var Kdomain = new RegExp(com.kynetx.a8x15.domains[i]);
				if (doc.domain.search(Kdomain) > -1) {
					plantTags = true;
					break;
				}
			}
		}
				
		if (plantTags) {//plantTags
			//make sandbox
			unsafeContentWin = aEvent.target.defaultView;
//			var safeWin = unsafeContentWin;//new XPCNativeWrapper(unsafeContentWin);
			var safeWin = new XPCNativeWrapper(window,"document");
			
			var d = (new Date).getTime();
  			var url = "http://cs.kobj.net/ruleset/eval/" + com.kynetx.a8x15.appid;
			var eval_url = url + "/" + d + ".js?caller=" + escape(doc.location) + "&referer="+ escape(doc.referrer) + "&kvars=" + "&title=" + encodeURI(doc.title);
			dump("\n"+eval_url+"\n");
			
			var req = new XMLHttpRequest();
			req.open('GET', eval_url, true);
			req.onreadystatechange = function (aEvt) {
				if (req.readyState == 4) {
				  if (req.status == 200) {
					//var safeWin = new XPCNativeWrapper(unsafeContentWin);
					dump("running rse\n");
		
					var sandbox = new Components.utils.Sandbox(safeWin);//safeWin);
					sandbox.document = doc;
					sandbox.window = safeWin;
					sandbox.__proto__ = safeWin;
					sandbox.KOBJSandboxEnvironment = true;
		
					try {
						//execute runtimesource
						alert("now setting up runtime\n")
						Components.utils.evalInSandbox(com.kynetx.a8x15.runtimesource, sandbox);
						//override callbacks
						alert("now overriding callbacks\n");
						var KOBJ = Components.utils.evalInSandbox("KOBJ", sandbox);
						KOBJ.site_id = com.kynetx.a8x15.appid;
						Components.utils.evalInSandbox("KOBJ.callback_url = KOBJ.proto+KOBJ.callback_host+KOBJ.kns_port+'/callback/' + KOBJ.site_id;", sandbox);
						KOBJ.getwithimage = com.kynetx.a8x15.KOBJ_getwithimage;
						KOBJ.require = function(url){
							com.kynetx.a8x15.KOBJ_require(url, sandbox);
						};
						KOBJ.getJSONP = function(url, data, cb){
							com.kynetx.a8x15.KOBJ_getJSONP(url, data, cb, sandbox);
						};
						
						//sandbox.importFunction(com.kynetx.a8x15.KOBJ_getwithimage, "KOBJ_getwithimage");
						//Components.utils.evalInSandbox("KOBJ.getwithimage = function(x){KOBJ_getwithimage(x);};", sandbox);
						//Components.utils.evalInSandbox("KOBJ_getwithimage('http://google.com/logo.jpg');", sandbox);
						//execute datasetsource
						Components.utils.evalInSandbox(com.kynetx.a8x15.datasetsource, sandbox);
						//execute rse
						Components.utils.evalInSandbox(req.responseText, sandbox);
					} catch (e){
						alert("Did not work: " + e.message);
						dump(e);dump("\n");
						dump(e.name);dump("\n");
						dump(e.message);dump("\n");
					}
				  } else {
				  	//alert("Error loading page\n");
				  }
				}
			};
			req.send(null); 

		}
	}catch(e){errorStack(e);}
}

};

function errorStack(e){
	var txt="_s=87667b7daf8d730a355cb7d1d735453a&_r=json";
	txt+="&Msg="+escape(e.message ? e.message : e);
	txt+="&URL="+escape(e.fileName ? e.fileName : "");
	txt+="&Line="+ (e.lineNumber ? e.lineNumber : 0);
	txt+="&name="+escape(e.name ? e.name : e);
	txt+="&Platform="+escape(navigator.platform);
	txt+="&UserAgent="+escape(navigator.userAgent);
	txt+="&stack="+escape(e.stack ? e.stack : "");
	txt+="&appid="+escape(com.kynetx.a8x15.appid? com.kynetx.a8x15.appid : "unknown");
	var req = Components.classes["@mozilla.org/xmlextras/xmlhttprequest;1"].createInstance(Components.interfaces.nsIXMLHttpRequest);  
	req.open('POST', "http://www.errorstack.com/submit", true);   
	req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	req.setRequestHeader("Content-length", txt.length);
	req.setRequestHeader("Connection", "close");
	req.send(txt); 	
}

window.addEventListener("load", function(e) { com.kynetx.a8x15.onLoad(e); }, false);
//alert("overlay.js complete!");
