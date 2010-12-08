var sys = require('sys');
var config = require('./config').config;

var irc = require('./lib/irc');
var fs = require('fs');
var path = require('path');

/* kynetx lib/setup */
var knsevents = require('./lib/kns-events.js');

kns = new knsevents('a41x140', {
	'appversion': 'dev',
  'eventdomain': 'irc'
});

sys.puts(sys.inspect(config));

var client = new irc.Client(config.host, config.port),
  inChannel = false;

client.connect(config.user);

client.addListener('001', function() {
  sys.puts('001!');
  this.send('JOIN', config.channel);
});

client.addListener('JOIN', function(prefix, channel, text) {
  inChannel = true;

  var user = irc.user(prefix);
  kns.signal("joined", {"user":user, "channel":channel});
});

client.addListener('PART', function(prefix, channel, text) {
  var user = irc.user(prefix);
  kns.signal("leave", {"user":user, "channel":channel});
});

client.addListener('DISCONNECT', function() {
  puts('Disconnected, re-connect in 5s');
  setTimeout(function() {
    puts('Trying to connect again ...');

    inChannel = false;
    client.connect(config.user);
    setTimeout(function() {
      if (!inChannel) {
        puts('Re-connect timeout');
        client.disconnect();
        client.emit('DISCONNECT', 'timeout');
      }
    }, 5000);
  }, 5000);
});

client.addListener('PRIVMSG', function(prefix, channel, text) {
  switch (text) {
    case '!source':
    case '!src':
      this.send('PRIVMSG', channel, ':Source is here: '+config.srcUrl);
      break;
    case '!logs':
    case '!log':
      this.send('PRIVMSG', channel, ':Logs are here: '+config.logUrl);
      break;
  }

  var user = irc.user(prefix);

  kns.signal("recieved", {'text':text,'channel':channel,'user':user});

});


kns.on("say", function(eventargs){
  if(eventargs.to && eventargs.text){
    client.send("PRIVMSG", eventargs.to, ":" +eventargs.text);
  }
});

kns.on("mode", function(eventargs){
  if(eventargs.user && eventargs.mode && eventargs.channel){
    client.send("MODE", eventargs.channel, eventargs.mode + " " + eventargs.user);
  }
});

kns.on("kick", function(eventargs){
  if(eventargs.user && eventargs.channel){
    client.send("KICK", eventargs.channel, eventargs.user + " :" + eventargs.user);
  }
});
