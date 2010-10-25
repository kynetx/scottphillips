function async_url_request(url, callback, extra_params) {
    safari.self.tab.dispatchMessage("send_data", {url : url, extra_params: extra_params, callback: callback});
}

function handleMessage(msgEvent) {
    var messageName = msgEvent.name;
    var messageData = msgEvent.message;

    if (messageName === "loadruntime") {

        if (!response.run_rule) {
            return;
        }

        eval(response.runtime);

        KOBJ.in_bx_extention = true;
        KOBJ.can_ajax_post = true;
        KOBJ.add_config_and_run({'rids':response.apps});

    }
    if (messageName === "send_data") {
        KOBJ.log("Got Request for  " + url + " - " + messageData.extra_params.data_type);
        var extra_params = messageData.extra_params;
        var response = Base64.encode(messageData.response);
        extra_params.base64 = true;
        var url = messageData.url

        KOBJ.log(url);
        eval(callback + "(url,response,extra_params)");

    }
    if (message.action == 'tab_data') {
        sendResponse = app_to_command_name;
    }
    if (message.action == 'menu_clicked') {
        menu_items[message["app_id"]][message["caption"]]();
    }
}

safari.self.addEventListener("message", handleMessage, false);


safari.self.tab.dispatchMessage("loadruntime", {hostname : window.location.hostname});


/*
 ======================================================
 GREASE MONKEY COMPATABILITY METHODS
 ======================================================
 */
var script_resources = {};

function GM_register_resource(appid, name, url) {
    if (typeof(script_resources[appid] == "undefined" )) {
        script_resources[appid] = {};
    }
    script_resources[appid][name] = url;
}

function GM_deleteValue(appid, name) {
    window.localStorage.removeItem(name);
}

function GM_getValue(appid, name, default_value) {
    var result = window.localStorage.getItem(name);
    if (result) {
        return result;
    }
    return default_value || null;
}


function GM_listValues(appid) {
    var keys = [];
    for (var i = 0; i < window.localStorage.length; i++) {
        keys.push(window.localStorage.key(i))
    }
    return keys;
}

function GM_setValue(appid, name, value) {
    window.localStorage.setItem(name, value);
}

function GM_getResourceText(appid, resourceName) {
    if (script_resources[appid][resourceName]) {
        return chrome.extension.getBackgroundPage().sync_request(script_resources[appid][resourceName], "GET");
    }
    else {
        return "";
    }
}

function GM_getResourceURL(appid, resourceName) {
    if (script_resources[appid][resourceName]) {
        return script_resources[appid][resourceName];
    }
    else {
        return "";
    }

}

function GM_addStyle(appid, css) {
    $KOBJ("head").append($KOBJ("<style>").text(css));
}

function GM_xmlhttpRequest(appid, details) {
    var thedetails = details;
    chrome.extension.sendRequest({'action': 'send_data_2','url' : details.url}, function(response) {
        alert("got reposne")
        thedetails.onload(response);
    });


}

// Need this at some point
unsafeWindow = window;

function GM_log(appid, message) {
    KOBJ.log(message);

}

function GM_openInTab(appid, url) {
    chrome.extension.sendRequest({'action': 'new_tab','url' : url}, function(response) {
    });
}

/*
 ======================================================
 Menu Item Management
 ======================================================
 */
var menu_items = {};
var menu_updated = false;


function GM_registerMenuCommand(appid, caption, commandFunc, accelKey, accelModifiers, accessKey) {
    if (!menu_items[appid]) {
        menu_items[appid] = {};
    }
    if (!menu_items[appid][caption]) {
        menu_items[appid][caption] = commandFunc;
    }
    menu_updated = true;

}


function updateMenu() {
    // need to do this because function references can not be pushed back to background page.
    if(!menu_updated)
    {
        return;
    }
    menu_updated = false;
    var app_to_command_name = {};
    for (var app in menu_items) {
        if (!app_to_command_name[app]) {
            app_to_command_name[app] = [];
        }
        for (var item in menu_items[app]) {
            KOBJ.log(item)
            app_to_command_name[app].push(item)
        }
    }

    chrome.extension.sendRequest({'action': 'refresh_menu', menu_items : app_to_command_name});

}
