chrome.extension.sendRequest({action: 'loadruntime', hostname: document.location.hostname}, function(response) {
    if (response.runtime)
    {
        if (typeof(KOBJ) == "undefined")
        {
            eval(response.runtime);
        }

        KOBJ.in_bx_extention = true;
        KOBJ.can_ajax_post = true;

        for (app in response.applications)
        {
            KOBJ.add_config_and_run({'rids':['a93x7'],'a93x7:kynetx_app_version':'dev',
                init:{    eval_host:'192.168.80.136',
                    callback_host:'192.168.80.136',
                    init_host:'192.168.80.136'
                }
            });
        }

    }

});


// This will be seen by the runtime and will let it know that it can do
// much larger request to the server.
function async_url_request(url, callback, extra_params) {
    var params = extra_params;
    chrome.extension.sendRequest({'action': 'send_data','url' : url}, function(response) {
        eval(callback + "(url,response,params)");
    });
}
;

