var knsevents = require('./kns-events');

exports.testappid = function(test){
	kns = new knsevents('a8x8', {'appversion':'dev'});
	test.equals(kns.appid(), 'a8x8');
	test.equals(kns.appid('a8x1'), 'a8x1');
	test.equals(kns.appid(), 'a8x1');
	test.done();
};

exports.testversion = function(test){
	kns = new knsevents('a8x8', {'appversion':'dev'});
	test.equals(kns.appversion(), 'dev');
	test.equals(kns.appversion('production'), 'production');
	test.equals(kns.appversion(), 'production');
	//default with empty options
	kns = new knsevents('a8x8', {});
	test.equals(kns.appversion(), 'production');
	//default with no options
	kns = new knsevents('a8x8');
	test.equals(kns.appversion(), 'production');
	test.done();
};

exports.testdirective = function(test){
	kns = new knsevents('a8x82', {'appversion':'dev'});
	kns.on("sampledirective", function(eventargs){
		test.equals(eventargs['arg'],'value');
		test.done(); //only one expected.
	});
	
	kns.signal("myevent", {'eventarg':'argvalue'});
	
	test.expect(1);
	setTimeout(function(){ test.done(); }, 1000);//give it a second, it's going to space!
	
};


exports.testdirective = function(test){
	kns = new knsevents('a8x82', {'appversion':'dev'});
	
	expected = 0;
	
	kns.on("countervalue", function(eventargs){
		test.equals(eventargs['value'],''+expected);
		expected += 1;
	});
	
	kns.signal("startcounter");
	kns.signal("inccounter");
	kns.signal("inccounter");
	
	test.expect(3);
	setTimeout(function(){ test.done(); }, 5000);//give it a second, it's going to space!
	
};
