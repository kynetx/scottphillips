var appid = "a93x7"; 
var domains = [];
var errorstackkey = "5a378563d1cb9a5860295d6476536e7d";
var full_runtime = null;
var sandbox = null;
var safeWin = null;
var our_doc = null;
var rule = null;


function errorStack(e)
{
    var txt = "_s=" + errorstackkey + "&_r=json";
    txt += "&Msg=" + escape(e.message ? e.message : e);
    txt += "&ScriptURL=" + escape(e.fileName ? e.fileName : "Dynamic");
    txt += "&PageURL=" + escape(document.location.href);
    txt += "&Line=" + (e.lineNumber ? e.lineNumber : 0);
    txt += "&name=" + escape(e.name ? e.name : e);
    txt += "&Platform=" + escape(navigator.platform);
    txt += "&UserAgent=" + escape(navigator.userAgent);
    txt += "&RuleID=" + escape(appid); 
    txt += "&stack=" + escape(e.stack ? e.stack : "Unknown Stack");
	sync_request("http://www.errorstack.com/submit?" + txt,"POST");
}

function split_post_data(url)
{
	return {
		url: url.substring(0,url.indexOf("?",0)), 
		data: url.substring(url.indexOf("?",0) + 1,url.length)
	};
}

function sync_request(url,method)
{
	var data = null;
	// method = "POST";
	if(method == "POST")
	{
		var result = split_post_data(url);
		url = result.url;
		data = result.data;
	}
	var req = new XMLHttpRequest();
	req.open(method, url, false);  
	if(method == "POST")
	{
		 req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	}                           
    req.send(data);
    return req.responseText;
}


function async_url_request(url,callback,extra_params) {
	var result = sync_request(url,"GET");
	var params = extra_params;
	alert("callback " + url );
	alert("result" + result);
	sandbox.ajax_url_data = url;
	sandbox.ajax_extra_params = params;
	sandbox.ajax_result = result;
	
	Components.utils.evalInSandbox(callback + "(ajax_url_data,ajax_result,ajax_extra_params)", sandbox, "1.8", "http://www.kynetx.com/ajax.js", 79);
}


function page_ready(event)
{
	
	try
	{
		our_doc = event.originalTarget;  
		if (our_doc instanceof HTMLDocument) {  
			if (our_doc.defaultView.frameElement == null) {  
					safeWin = new XPCNativeWrapper(window,"document");

					sandbox = new Components.utils.Sandbox(safeWin);
					sandbox.document = our_doc;
					sandbox.window = safeWin;					
					sandbox.navigator = safeWin.navigator;
					sandbox.__proto__ = safeWin;
					sandbox.async_url_request = async_url_request;
					
					Components.utils.evalInSandbox(full_runtime, sandbox, "1.8", "http://static.kobj.net/kobj-static-20100611185038.js", 79);			
					Components.utils.evalInSandbox("KOBJ.in_bx_extention = true;KOBJ.can_ajax_post = true;", sandbox, "1.8", "http://www.kynetx.com/bxsettings.js", 80);			
					alert(sandbox.KOBJ.in_bx_extention)
					Components.utils.evalInSandbox("alert($KOBJ('#cidtest').html());",sandbox);
					Components.utils.evalInSandbox("KOBJ.add_config_and_run({'rids':['a93x7'],'a93x7:kynetx_app_version':'dev',init:{	eval_host:'192.168.80.136',callback_host:'192.168.80.136',init_host:'192.168.80.136'}});", sandbox, "1.8", "http://www.kynetx.com/appinstall.js", 81);							
					// alert(our_doc.body.innerHTML);
				}
		}
		
	}
	catch(e)
	{ 
		alert("In Error" + e.message + e.stack);
//		errorStack(e); 
	}	
}

try
{
	full_runtime = sync_request("http://static.kobj.net/kobj-static-20100611222702.js","GET");

	var result = sync_request("http://init.kobj.net/js/dispatch/" + appid + "?cachebust="+(new Date().getTime()),"GET");
	domains = eval("(" + result + ")");
	domains = domains[appid];
	// rule = sync_request("http://localhost/~ciddennis/good.js","GET");
}
catch(e)
{ 
	alert(e);
	errorStack(e); 
}

  
window.addEventListener("load", function(e) { 
	document.addEventListener("DOMContentLoaded", function(ee) { page_ready(ee) }, false);
}, false);

