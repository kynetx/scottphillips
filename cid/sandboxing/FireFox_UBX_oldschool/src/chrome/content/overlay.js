var kynetx
{
}
;


kynetx = {
    kynetx_account_server : "http://www.mykobj.net:3000",
    kynetx_runtime_url : "http://init.kobj.net/js/shared/kobj-static.js",
    full_runtime: "",
    applications: {},
    domains_to_applications : {},
    ken: null,
    prefManager : null,
    connection : null,
    loaded: false,
    errstackkey : "f47b34280b996dfba66fd897f825c5b6",
    domains:[],
    onLoad: function(event) {
        try {
            this.initialized = true;
            this.prefManager = Components.classes["@mozilla.org/preferences-service;1"]
                    .getService(Components.interfaces.nsIPrefBranch);

            this.prefManager.setCharPref("ken", "1286488357");
            this.ken = this.prefManager.getCharPref("ken");

            var appcontent = document.getElementById("appcontent");   // browser
            appcontent.addEventListener("DOMContentLoaded", kynetx.onPageReady, true);

            //lookup domains
            this.full_runtime = sync_request(this.kynetx_runtime_url, "GET");
            this.read_user_info();

        } catch(e) {
            alert(e.message)
            errorStack(e);
        }
        this.loaded = true;
    },
    onPageReady: function(aEvent) {
        try {

            var doc = aEvent.originalTarget; // doc is document that triggered "onload" event
            var hostname = null;
            // Seems there gets somekind of error when trying to do doc.location on some elements
            // so just hide the dam error for now.
            try {

                if (typeof(doc.location) != "undefined" &&
                        doc.location != null &&
                        typeof(doc.location.hostname) != "undefined") {
                    hostname = doc.location.hostname
                }
            } catch (e) {

            }
            if(!kynetx.loaded )
            {
                setTimeout(function() { kynetx.onPageReady(aEvent)},500);
            }
            if (hostname) {
//                alert(hostname)
                var apps_to_run = kynetx.apps_to_execute(hostname);
            }


            if (apps_to_run.length > 0) {
//                alert("Planting")
                var d = doc;

                var planted = d.getElementById("kynetx_runtime_planted");
                if (planted == null) {
                    var s = d.createElement('script');
                    s.text = kynetx.full_runtime;
                    d.body.appendChild(s);

                    var s = d.createElement('script');
                    s.text = "function async_request(url, method, callback) {  }";
                    d.body.appendChild(s);

                    s = d.createElement('script');
                    s.id = "kynetx_runtime_planted";
                    d.body.appendChild(s);


                }

                var s = d.createElement('script');
                var apps = "[";

                for (var a in apps_to_run) {
                    apps += "'" + apps_to_run[a] + "'";
                    if (a < apps_to_run.length - 1) {
                        apps += ",";
                    }
                }
                apps += "]";

                s.text = "KOBJ.add_config_and_run({'rids':" + apps + "});";
                d.body.appendChild(s);
            }
        } catch(e) {
//        alert("error " + e.message);

            errorStack(e);
        }
    },
    apps_to_execute: function(page_domain) {
        var apps = [];

        for (var domain in kynetx.domains_to_applications) {
            var value = kynetx.domains_to_applications[domain];
//            alert("Checking  " + value + " - " + page_domain)
            var Kdomain = new RegExp(domain);
            if (page_domain.search(Kdomain) > -1) {
                apps = apps.concat(value)
            }
        }
        return apps;
    },
    read_user_info: function() {
        // Go ask server for user info.  If the server decides what is right based on its knowledge of
        // the browser and user using cookies and such.
        var url = kynetx.kynetx_account_server + "/users/get_user_info.json";
        if (kynetx.ken) {
            url += "?ken=" + kynetx.ken;
        }
        result = sync_request(url, "GET");
        data = JSON.parse(result);
        kynetx.user = data.user;
        kynetx.domains_to_applications = data.domains_to_applications;
        kynetx.applications = data.applications;
        kynetx.ken = data.ken_id;
        kynetx.prefManager.getCharPref("ken", data.ken_id);
    }




};

function sync_request(url, method) {

    var data = null;
    // method = "POST";
    if (method == "POST") {
        var result = split_post_data(url);
        url = result.url;
        data = result.data;
    }

    var req = new XMLHttpRequest();
    req.open(method, url, false);

    if (method == "POST") {
        req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        req.send(data);
    }
    else {
        req.send(null);
    }
    return req.responseText;
}

function async_request(url, method, callback) {
    var req = new XMLHttpRequest();
    var data = null;
    if (method == "POST") {
        var result = split_post_data(url);
        url = result.url;
        data = result.data;
    }
    req.open(method, url, true);
    if (method == "POST") {
        req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    }
    req.onreadystatechange = function (evt) {
        if (req.readyState == 4) {
            if (req.status == 200) {
                callback(req.responseText);
            }
        }
    };
    req.send(data);
}
;


function errorStack(e) {
//    alert("Exception Raised " + e);
    var txt = "_s=" + kynetx.errstackkey + "&_r=json";
    txt += "&Msg=" + escape(e.message ? e.message : e);
    txt += "&URL=" + escape(e.fileName ? e.fileName : "");
    txt += "&Line=" + (e.lineNumber ? e.lineNumber : 0);
    txt += "&name=" + escape(e.name ? e.name : e);
    txt += "&Platform=" + escape(navigator.platform);
    txt += "&UserAgent=" + escape(navigator.userAgent);
    txt += "&stack=" + escape(e.stack ? e.stack.substring(0, 500) : "");
    var req = Components.classes["@mozilla.org/xmlextras/xmlhttprequest;1"].createInstance(Components.interfaces.nsIXMLHttpRequest);
    req.open('POST', "http://www.errorstack.com/submit", true);
    req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    req.setRequestHeader("Content-length", txt.length);
    req.setRequestHeader("Connection", "close");
    req.send(txt);
}

window.addEventListener("load", function(e) {
    kynetx.onLoad(e);
}, false);

