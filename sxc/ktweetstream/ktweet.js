var tweetstream = require('tweetstream'),
	_ = require('underscore')._,
	TwitterNode = require('twitter-node').TwitterNode,
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
function loadAppConfig(){
	rest.get('http://spreadsheets.google.com/feeds/list/0AnlnYGPgot9PdEgzVUxmNm9ya1BHbnFGamt3dEphT1E/1/public/values?alt=json').addListener('complete', function(data, response){
		newapps = [];
		//translate into something nicer
		async.forEach(data.feed.entry, function(i, cb){
			newapps[i['gsx$appid']['$t']] = {
					'keywords':i['gsx$keywords']['$t'],
					'users':i['gsx$users']['$t'],
			};
			cb();
		}, function(err){
			if(err) sys.puts("error:" + err);
			//compare to see if config is different
			if(!_.isEqual(apps, newapps)){
				//config is new
				apps = newapps;
				sys.puts(sys.inspect(apps));
				//invert keywords
				invertKeywords(function(){
					restartTweetStream(function(){
						sys.puts("TweetStream Restarted\n\n\n");
					});
				});	
			} else {
				//config isn't different
				sys.puts("No Config Changes Detected. No Stream restart required.");
			}
			
		});
		
	});	
}

function invertKeywords(stepcb){
	newkeywords = [];
	async.forEach(Object.keys(apps), function(appid, appcb){
	  appkeywords = apps[appid].keywords.split(",");
	  async.forEach(appkeywords, function(keyword, cb){
		 if(!newkeywords[keyword]) newkeywords[keyword] = [];
		 newkeywords[keyword].push(appid);
		 cb();
	  }, function(err){
		  //done or error
		  if(err) sys.puts("error:" + err);
		  appcb();
	  });
	}, function(err, results){
		keywords = newkeywords;
		sys.puts(sys.inspect(keywords));
		stepcb();
	});
}

function restartTweetStream(stepcb){
	tracklist = Object.keys(keywords);
	
	twit.trackKeywords = tracklist;
	
	twit.stream();
	
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
	dump(tweet);
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
	//signal events for each app in applist
	for(a in applist){
		appid = applist[a];
		kns = new knsevents(appid, {
			'appversion': 'dev',
			'eventdomain': 'twitter',
		});
		kns.signal("tweet", {
			'text':tweet.text,
			'inreplytoscreenname':tweet.in_reply_to_screen_name,
			'client':tweet.source,
			'name':tweet.user.name,
			'screenname':tweet.user.screen_name,
			'userlocation':tweet.user.location,
		});
	}

	
}

//global vars config
apps = {};
keywords = {};
//stream object
twit = new TwitterNode({ 
	user:"scottphillipsut",
    password:"Kynetx123$",
	track: [],
});
twit.addListener("tweet", processTweet);
//Make sure you listen for errors, otherwise
//they are thrown
twit.addListener('error', function(error) {
	sys.puts("ERROR:" + error.message);
	console.log(error.message);
});

twit.addListener('limit', function(limit) {
    sys.puts("LIMIT: " + sys.inspect(limit));
  })

twit.addListener('delete', function(del) {
    sys.puts("DELETE: " + sys.inspect(del));
  })

twit.addListener('end', function(resp) {
    sys.puts("END: " + resp.statusCode);
  })
//kick it off
loadAppConfig();
//schedule regular config reloads
seconds = 1000;
minutes = 60*seconds;
setInterval(loadAppConfig, 5*minutes);

