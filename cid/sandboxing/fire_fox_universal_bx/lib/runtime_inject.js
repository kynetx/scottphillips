xhr = require("xhr");

var req = new XMLHttpRequest();  
req.open('GET', 'http://init.kobj.net/js/shared/kobj-static.js', false);   
req.send(null);  
if(req.status == 200)  {
  eval(req.responseText)
}
