chrome.extension.sendRequest({action: 'loadruntime', hostname: document.location.hostname}, function(response) {
    if (!response.run_rule) {
        return;
    }

    eval(response.runtime)

    KOBJ.in_bx_extention = true;
    KOBJ.can_ajax_post = true;

    KOBJ.add_config_and_run({'rids':['a93x7'],'a93x7:kynetx_app_version':'dev',
        init:{    eval_host:'192.168.80.136',
            callback_host:'192.168.80.136',
            init_host:'192.168.80.136'
        }
    });


});


function async_url_request(url, callback, extra_params) {
    var params = extra_params;
    chrome.extension.sendRequest({'action': 'send_data','url' : url}, function(response) {
        // KOBJ.log("Got Request for  "  + url + " - " + params);
        eval(callback + "(url,response,params)");
    });
}
;


//document.getElementById('myCustomEventDiv').addEventListener('myCustomEvent', function() {
//
//  var eventData = document.getElementById('myCustomEventDiv').innerText;
//  chrome.extension.sendRequest({action: 'sayhello', values: "hi from page"}, function(response) {
//
//  });
//});