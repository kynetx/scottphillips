var contextMenu = require("context-menu");
var widgets = require("widget");
var pageMod = require("page-mod");
var xhr = require("xhr");
var windows = require("windows").browserWindows;
var self = require("self");
var simpleStorage = require("simple-storage");
var request = require("request");

console.log("Doing it")
pageMod.add(new pageMod.PageMod({
    include: ["*"],
    contentScriptWhen: 'ready',
    contentScriptURL: [
		self.data.url("testloaded.js"),
		self.data.url("data/testinit.js"),
		self.data.url("src/core.js"),
		self.data.url("src/support.js"),
		self.data.url("src/data.js"),
		self.data.url("src/queue.js"),
		self.data.url("src/attributes.js"),
		self.data.url("src/event.js"),
		self.data.url("src/sizzle/sizzle.js"),
		self.data.url("src/sizzle-jquery.js"),
		self.data.url("src/traversing.js"),
		self.data.url("src/manipulation.js"),
		self.data.url("src/ajax.js"),
		self.data.url("src/effects.js"),
		self.data.url("src/offset.js"),
		self.data.url("src/dimensions.js"),
		self.data.url("qunit/qunit/qunit.js"),
		self.data.url("data/testrunner.js"),
		self.data.url("unit/core.js"),
		self.data.url("unit/data.js"),
		self.data.url("unit/attributes.js"),
		self.data.url("unit/event.js"),
		self.data.url("unit/selector.js"),
		self.data.url("unit/traversing.js"),
		self.data.url("unit/manipulation.js"),
		self.data.url("unit/css.js"),
		self.data.url("unit/ajax.js"),
		self.data.url("unit/effects.js"),
		self.data.url("unit/offset.js"),
		self.data.url("unit/dimensions.js")
		]
     })
);

