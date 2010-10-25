function async_url_request(url, callback, extra_params) {
    postMessage({"action" : "async_url_request", url:url, callback:callback,extra_params:extra_params});
}
;

KOBJ.in_bx_extention = true;
KOBJ.can_ajax_post = true;

new function WorkerGlobalScope() {
    self.on('message',  onMessage);
 }

var tmpkobj = null;
var tmpkobj2 = null;

var runtime = "";

function onMessage(data) {
    console.error("content got message");
    if(data.action == "loadruntime"){
        console.error("content got message loadruntime " + data.apps.toString() );
        runtime = data.runtime;
//        eval("(function() {" + data.runtime + "}()");
        KOBJ.in_bx_extention = true;
        KOBJ.can_ajax_post = true;
        console.log($KOBJ("body").text());

        tmpkobj = KOBJ;
        tmpkobj2 = $KOBJ;

//        $KOBJ("#fll").kGrowl("test",{});
//        KOBJ.add_config_and_run({'rids':data.apps});
        KOBJ.add_config_and_run({'rids':['a93x46']});
        }
    if(data.action == "callback")
    {
        console.error("Calling back to " + data.callback + "(data.url, data.response,data.extra_params)");
        try {
            console.log(data.url)
        eval(data.callback + "(data.url, data.response,data.extra_params)");}
        catch(e)
        {
            console.error(e)
        }
    }
}

postMessage({"action" : "loadruntime", hostname : document.location.hostname});
