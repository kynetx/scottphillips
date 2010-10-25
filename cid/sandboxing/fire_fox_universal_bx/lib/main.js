var contextMenu = require("context-menu");
var widgets = require("widget");
var pageMod = require("page-mod");
var xhr = require("xhr");
var windows = require("windows").browserWindows;
var self = require("self");
var simpleStorage = require("simple-storage");
var request = require("request");


var applications = {};
var domains_to_applications = {};
var user = {};
var errorstackkey = "5a378563d1cb9a5860295d6476536e7d";
var full_runtime = null;
var kynetx_account_server = "http://www.mykobj.net:3000";
var kynetx_runtime_url = "http://static.kobj.net/kobj-static-20101011153552.js";


//TODO: Remove hard code login
simpleStorage.storage = {"ken" : "1286488357"};

// Create a new context menu item.
var menuItem = contextMenu.Item({

    label: "Kynetx Account Stuff",

    // A CSS selector. Matching on this selector triggers the
    // display of our context menu.
    context: "a[href]",

    // When the context menu item is clicked, perform a Google
    // search for the link text.
    onClick: function (contextObj, item) {
        windows.openWindow({  url: kynetx_account_server + "/users/show_login",
            onOpen: function(window) {

            }});
    }
});
contextMenu.add(menuItem);
// App Loaded
exports.main = function (options, callbacks) {
};
// App Unloaded
exports.onUnload = function (reason) {
};


function read_user_info() {
    // Go ask server for user info.  If the server decides what is right based on its knowledge of
    // the browser and user using cookies and such.
    var url = kynetx_account_server + "/users/get_user_info.json";
    if (simpleStorage.storage && simpleStorage.storage["ken"]) {
        url += "?ken=" + simpleStorage.storage["ken"];
    }

    var latestTweetRequest = request.Request({
        url: url,
        onComplete: function () {
            console.error("We did the request " + this.response.text)
            var data = this.response.json;
            user = data.user;
            domains_to_applications = data.domains_to_applications;
            applications = data.applications;
            simpleStorage.storage = {"ken" :data.ken_id};

            console.error("we have a ken " + data.ken_id)
        }
    }).get();

}


/*
 Load the runtime
 */
function load_runtime() {
    var req = new xhr.XMLHttpRequest();
    req.open('GET', kynetx_runtime_url, false);
    req.send(null);
    if (req.status == 200) {
        console.error("loaded runtime")
        full_runtime = req.responseText;
    }
}

console.error("loading user info")


/*
 Here we watch for things on kobjnet
 */
pageMod.add(new pageMod.PageMod({
    include: ["*.mykobj.net"],
    contentScriptWhen: 'ready',
    contentScriptURL: [self.data.url("jquery.js"),self.data.url("kobj_interact.js")],
    onAttach: function onAttach(worker, mod) {
        // you can handle errors that occur in the content scripts
        // by adding listener to the error events
        worker.on('error', function(error) {
            console.error(error.message);
        });
        worker.on('message', function(data) {
            user = data.user;
            domains_to_applications = data.domains_to_applications;
            console.log("doamin DAta" + data.domains_to_applications)
            applications = data.applications;
            simpleStorage.storage = {"ken" :data.ken_id};
        });
    }
}));

function apps_to_execute(page_domain) {
    var apps = [];
    for (var domain in domains_to_applications) {
        console.log("domain of  " + domain)
        var value = domains_to_applications[domain];

        var Kdomain = new RegExp(domain);
        if (page_domain.search(Kdomain) > -1) {
            console.log("domain of  matched   " + domain)
            apps = apps.concat(value)
        }
    }
    return apps;
}

function split_post_data(url) {
    return {
        url: url.substring(0, url.indexOf("?", 0)),
        data: url.substring(url.indexOf("?", 0) + 1, url.length)
    };
}

/*
 All other pages
 */
pageMod.add(new pageMod.PageMod({
    include: ["*"],
    contentScriptWhen: 'ready',
    contentScriptURL: [self.data.url("runtime.js"),self.data.url("runtime_inject.js")],
    onAttach: function onAttach(worker, mod) {
        // you can handle errors that occur in the content scripts
        // by adding listener to the error events
        worker.on('error', function(error) {
            console.error(error.message);
        });
        worker.on('message', function(data) {
            console.error("got message " + data.action);

            if (data.action == "loadruntime") {
                var apps = apps_to_execute(data.hostname);
                console.error("nubmer of apps " + apps.length);
                if (apps.length > 0) {
                    console.error("sent apps back " + apps.toString());
                    worker.postMessage({action:"loadruntime", runtime: full_runtime, apps:apps});
                }
            }
            if (data.action == "async_url_request") {

                if (data.url.length > 1500) {
                    var urlresult = split_post_data(data.url);
                    request.Request({
                        url: urlresult.url,
                        content: urlresult.data,
                        onComplete: function () {
                            worker.postMessage({action:"callback", callback: data.callback, url: data.url, response: this.response.text, extra_params:data.extra_params});

                        }
                    }).post();
                }
                else {
                    request.Request({
                        url: data.url,
                        onComplete: function () {
                            worker.postMessage({action:"callback", callback: data.callback, url: data.url, response: this.response.text, extra_params:data.extra_params});

                        }
                    }).get();

                }

            }
        });
    }
}));

load_runtime();
read_user_info();

