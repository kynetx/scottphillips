
var additionalInfo = {
  "action": "sayhi"
};

chrome.extension.connect().postMessage(additionalInfo);

var port = chrome.extension.connect();

document.getElementById('myCustomEventDiv').addEventListener('myCustomEvent', function() {
  var eventData = document.getElementById('myCustomEventDiv').innerText;
  port.postMessage({message: "myCustomEvent", values: eventData});
});