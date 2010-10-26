/*
 ======================================================
 GREASE MONKEY COMPATABILITY METHODS
 ======================================================
 */


//function generate_kynetx_event(action, data) {
//    var a = document.createEvent("Events")
//    a.initEvent("KynetxExtensionEvent", true, false)
//
//    var element = document.createElement("KynetxEventElement");
//    element.setAttribute("action", action);
//    element.setAttribute("data", data);
//    document.documentElement.appendChild(element);
//
//    element.dispatchEvent(a)
//}


function GM_addStyle(appid, css) {
    $KOBJ("head").append($KOBJ("<style>").text(css));
}

// Need this at some point
unsafeWindow = window;

function GM_log(appid, message) {
    KOBJ.log(message);

}

function GM_openInTab(appid, url) {
    window.open(url);
}

function GM_register_resource(appid, name, url) {
    if (typeof(kynetx.gm_script_resources[appid] == "undefined" )) {
        kynetx.gm_script_resources[appid] = {};
    }
    kynetx.gm_script_resources[appid][name] = url;
}
;


function GM_deleteValue(appid, name) {
    window.localStorage.removeItem(app_id + "-" + name);
}
;

function GM_getValue(appid, name, default_value) {

    var result = window.localStorage.getItem(name);
    if (result) {
        return result;
    }
    return default_value || null;
}
;


function GM_listValues(appid) {
    var keys = [];
    for (var i = 0; i < window.localStorage.length; i++) {
        keys.push(window.localStorage.key(i))
    }
    return keys;
}
;

function GM_setValue(appid, name, value) {
    window.localStorage.setItem(name, value);
}
;


function GM_test(label) {
    var menuItem = document.createElement("menuitem");
    menuItem._commandFunc = function( ) { alert("hi")};
    menuItem.setAttribute("label", label);
    menuItem.setAttribute("oncommand", "this._commandFunc()");

}


///*
// ======================================================
// Menu Item Management
// ======================================================
// */
//var menu_items = {};
//var menu_updated = false;
//
//
//function GM_registerMenuCommand(appid, caption, commandFunc, accelKey, accelModifiers, accessKey) {
//    if (!menu_items[appid]) {
//        menu_items[appid] = {};
//    }
//    if (!menu_items[appid][caption]) {
//        menu_items[appid][caption] = commandFunc;
//    }
//    menu_updated = true;
//
//}
//
//
//function updateMenu() {
//    // need to do this because function references can not be pushed back to background page.
//    if (!menu_updated) {
//        return;
//    }
//    menu_updated = false;
//    var app_to_command_name = {};
//    for (var app in menu_items) {
//        if (!app_to_command_name[app]) {
//            app_to_command_name[app] = [];
//        }
//        for (var item in menu_items[app]) {
//            KOBJ.log(item)
//            app_to_command_name[app].push(item)
//        }
//    }
//
//    chrome.extension.sendRequest({'action': 'refresh_menu', menu_items : app_to_command_name});
//
//}
