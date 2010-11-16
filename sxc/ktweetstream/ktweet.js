var tweetstream = require('tweetstream'),
    sys = require('sys'),
    csv = require('node-csv'),
	knsevents = require('./kns-events'),
	async = require('async'),
	rest = require('../restler/lib/restler');

function dump(o){
	sys.puts(sys.inspect(o));	
}

/*
kns = new knsevents('a8x82', {
	'appversion': 'dev'
});

kns.on("sampledirective", function(eventargs){
	console.log("directive options");
	console.log(sys.inspect(eventargs));
});

kns.signal("myevent", {'eventarg':'argvalue'});
*/
function loadAppConfig(stepcb){
	rest.get('http://spreadsheets.google.com/feeds/list/0AnlnYGPgot9PdEgzVUxmNm9ya1BHbnFGamt3dEphT1E/1/public/values?alt=json').addListener('complete', function(data, response){
		//translate into something nicer
		async.forEach(data.feed.entry, function(i, cb){
			apps[i['gsx$appid']['$t']] = {
					'keywords':i['gsx$keywords']['$t'],
					'users':i['gsx$users']['$t'],
			};
			cb();
		}, function(err){
			if(err) sys.puts("error:" + err);
			sys.puts(sys.inspect(apps));
			stepcb();
		});
		
	});	
}

function invertKeywords(stepcb){
	async.forEach(Object.keys(apps), function(appid, appcb){
	  appkeywords = apps[appid].keywords.split(",");
	  async.forEach(appkeywords, function(keyword, cb){
		 if(!keywords[keyword]) keywords[keyword] = [];
		 keywords[keyword].push(appid);
		 cb();
	  }, function(err){
		  //done or error
		  if(err) sys.puts("error:" + err);
		  appcb();
	  });
	}, function(err, results){
		sys.puts(sys.inspect(keywords));
		stepcb();
	});
}

function startTweetStream(stepcb){
	tracklist = Object.keys(keywords);
	
	stream = tweetstream.createTweetStream({ 
		username:"TelegramSam",
        password:"4ichabod5",
		track: tracklist,
    });
	stream.addListener("tweet", processTweet);
	
	stepcb();
}

function tokenizeTweet(tweettext){
	tokenre = /([\w']+)/ig;
	matches = [];
	while(true){
		extract = tokenre.exec(tweettext);
		if(extract == null) break;
		matches.push(extract[1].toLowerCase());
	}
	return matches;
}
function processTweet(tweet){
	//do stuff with tweet
	dump(tweet.text);

	tokens = tokenizeTweet(tweet.text);
	
	appstruct = {};
	for(i in tokens){
		t = tokens[i];
		kwapps = keywords[t];
		for(x in kwapps){
			appstruct[kwapps[x]] = true;
		}
	}
	applist = Object.keys(appstruct);

	dump(applist);
	
}

//global vars config

apps = {};
keywords = {};
//kick it off
async.series([loadAppConfig, invertKeywords, startTweetStream]);

/*
var stream = tweetstream.createTweetStream({ username:"TelegramSam"
                                           , password:"4ichabod5" 
										   , track: ["kynetx","webhook","iiw"]
                                           });
stream.addListener("tweet", function (tweet) {
		//sys.puts(sys.inspect(tweet));
		//saveTweet(tweet);
});

function saveTweet(tweet){
	rest.post('http://spreadsheets.google.com/formResponse?formkey=dGY1RndBLWNHaFhlMmtGMnZUTjBGN3c6MQ&amp;ifq', {
	  data: { 
	  	  'entry.0.single': tweet.text
		, 'entry.1.single': tweet.user.screen_name
		, 'entry.2.single': tweet.user.name
		, 'entry.3.single': tweet.user.followers_count
		, 'entry.4.single': tweet.user.location
		
		},
	}).addListener('complete', function(data, response) {
	  //do nothing.
	});
}

*/
