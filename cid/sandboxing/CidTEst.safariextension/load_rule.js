var i_am_done = false;
var top_doc = null;
function async_url_request(url,callback,params)
{
	safari.self.tab.dispatchMessage("load_sync_url_post",{url: url, callback: callback, params:params });
}

function load_url(url)
{
	safari.self.tab.dispatchMessage("load_sync_url_post",{url: url});
}

function load_url_response(theMessageEvent) {
   if (theMessageEvent.name === "load_sync_url_response") {
	  if(theMessageEvent.message.callback) {
		eval(theMessageEvent.message.callback + "(theMessageEvent.message.url,theMessageEvent.message.response,theMessageEvent.message.params)");
	  	// theMessageEvent.message.callback(theMessageEvent.message.url,theMessageEvent.message.response,theMessageEvent.message.params);
	  }
      else
	  {
		try
		{
		  eval("(KOBJ_config={'rids':['a93x7'],'a93x7:kynetx_app_version':'dev',init:{eval_host:'cs.kobj.net',callback_host:'log.kobj.net'}})");		
	      eval( theMessageEvent.message.response );
		}
		catch (e)
		{
			console.log(e);
		}
	  }
   }
}

function isItOkay(event) {
    var url = event.url;
   const element = event.target;

   if (!i_am_done ) {
	    i_am_done = true;
		safari.self.addEventListener("message", load_url_response, false);
		load_url("http://static.kobj.net/kobj-static-20100609233627.js");
    }

}

document.addEventListener("beforeload", isItOkay, true);




	
	
