var tweetstream = require('tweetstream'),
    sys = require('sys'),
	rest = require('../restler/lib/restler'),
	knsevents = require('./kns-events');

kns = new knsevents('a8x8', 'dev');

kns.on("sampledirective", function(eventargs){
	console.log("directive options");
	console.log(sys.inspect(eventargs));
});

kns.signal("myevent", {'eventarg':'argvalue'});



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
	})/*.addListener('complete', function(data, response) {
	  //do nothing.
	});*/
}

