var sys = require('sys');

var irc = require('irc');
var client = new irc.Client('irc.freenode.net', 'ScottPhillips', {
    channels: ['#kynetx'],
});

client.addListener('error', function(message) {
	sys.puts("Error:");
	sys.puts(message);	
});

client.addListener('message', function (from, to, message) {
    sys.puts(from + ' => ' + to + ': ' + message);
});

client.addListener('pm', function (nick, text) {
	sys.puts("Private Message: "+nick+"::"+text);
	matcharray = text.match(/^pleasesay\s(.*)/);
	if(matcharray != null){
		client.say("#kynetx", matcharray[1]);
	} else {
		client.say(nick, "Do you really expect me to answer someone like you?");
		client.say("TelegramSam", "SP private message from "+nick+": "+text);
	}
	sys.puts(matcharray);
});

client.say('#kynetx', "I'm a bot!");

sys.puts("Script Complete!");
