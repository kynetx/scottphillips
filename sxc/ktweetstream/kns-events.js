var events = require("events"),
    rest = require('../restler/lib/restler');

module.exports = KNS;

function KNS(appid, version){
	this.appid = appid;
	this.appversion = version || "production";
	events.EventEmitter.call(this);
}

KNS.super_ = events.EventEmitter;
KNS.prototype = Object.create(events.EventEmitter.prototype, {
	constructor: {
		value: KNS,
		enumerable: false
	}
})

KNS.prototype.signal = function(name, context) {
	var self = this;
	self.emit("sampledirective", {'arg':'value', 'appid':this.appid, 'appversion':this.appversion});
}
