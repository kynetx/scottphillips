var events = require("events"),
	sys = require('sys'),
	async = require('async'),
    rest = require('../restler/lib/restler');

module.exports = KNS;

function KNS(appid, _opts){
	opts = _opts || {};
	this._appid = appid;
	this._eventdomain = opts["eventdomain"] || "node";
	this._appversion = opts["appversion"] || "production";
	events.EventEmitter.call(this);
}

KNS.super_ = events.EventEmitter;
KNS.prototype = Object.create(events.EventEmitter.prototype, {
	constructor: {
		value: KNS,
		enumerable: false
	}
});

KNS.prototype.signal = function(eventname, context) {
	var self = this;
	var url = 'http://cs.kobj.net/blue/event/'+this._eventdomain+'/'+eventname+'/'+this._appid+'/';

	//version handling
	if(self._appversion != "production"){
		context[''+this._appid+':kynetx_app_version'] = self._appversion;
	}

	rest.post(url, {
	  data: context,
	}).addListener('complete', function(data, response) {
		//parse json response
		//emit a rawresponse event that can be used to display full kns response
		//sys.puts(data);
		var regex_sc1 = /(^[\/]{2}[^\n]*)|([\n]{1,}[\/]{2}[^\n]*)/g;
		nocomments = data.replace(regex_sc1, "");
		ddoc = JSON.parse(nocomments);

		async.forEachSeries(ddoc['directives'], function(d){
			self.emit(d['name'], d['options']);
		}, function(err){
			//all methods are done.
		});
	});
};

KNS.prototype.appid = function(newappid) {
	if(newappid){
		this._appid = newappid;
	}
	return this._appid;
};

KNS.prototype.appversion = function(newversion) {
	if(newversion){
		this._appversion = newversion;
	}
	return this._appversion;
};