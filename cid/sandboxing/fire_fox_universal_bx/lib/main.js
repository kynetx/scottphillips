contextMenu = require("context-menu");

// Create a new context menu item.
var menuItem = contextMenu.Item({

  label: "Search with Google",

  // A CSS selector. Matching on this selector triggers the
  // display of our context menu.
  context: "a[href]",

  // When the context menu item is clicked, perform a Google
  // search for the link text.
  onClick: function (contextObj, item) {
    var anchor = contextObj.node;
    console.log("searching for " + anchor.textContent);
    var searchUrl = "http://www.google.com/search?q=" +
                    anchor.textContent;
    contextObj.window.location.href = searchUrl;
  }
});
contextMenu.add(menuItem);
// App Loaded
exports.main = function (options, callbacks) {};
// App Unloaded
exports.onUnload = function (reason) {};

// If you want to work with the DOM, then you should set `contentScriptWhen`
// to `'ready'`.
var pageMod = require("page-mod");

xhr = require("xhr");

var req = new xhr.XMLHttpRequest();  
req.open('GET', 'http://static.kobj.net/kobj-static-20100930201338.js', false);   
req.send(null);  
var rt = "";
if(req.status == 200)  {
  rt = req.responseText;
}


pageMod.add(new pageMod.PageMod({
  include: ["*"],
  contentScriptWhen: 'ready',
  contentScript: "KOBJ_config={'a93x7:kynetx_app_version':'dev','rids':['a93x7']};" + rt + ";KOBJ.sayhello();"
}));

