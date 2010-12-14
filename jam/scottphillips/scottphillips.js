var sys = require('sys');
var config = require('./config')['config'];

var irc = require('./lib/irc');

/* kynetx lib/setup */
var knsevents = require('kns');

// sets up an application with the needed parameters
kns = new knsevents(config.appid, {
  'appversion': 'dev',
  'eventdomain': 'irc',
  'logging':'true'
});

sys.puts(sys.inspect(config));

var client = new irc.Client(config.host, config.port);

client.connect(config.user);

// On connect, join the given channel;
client.addListener('001', function() {
  console.log("Connected!");
  for(var i = 0; i < config.channels.length; i++){
    this.send('JOIN', config.channels[i]);
  }
});

// A user joined the channel
client.addListener('JOIN', function(prefix, channel, text) {
  var user = irc.user(prefix);
  kns.signal("joined", {"user":user, "channel":channel});
});

// A user left the channel
client.addListener('PART', function(prefix, channel, text) {
  var user = irc.user(prefix);
  kns.signal("leave", {"user":user, "channel":channel});
});

// Oh crap! We disconnected!
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

// Regular message
client.addListener('PRIVMSG', function(prefix, channel, text) {
  var user = irc.user(prefix);

  kns.signal("recieved", {'text':text,'channel':channel,'user':user});
});


// directive handlers (callbacks)

// error
kns.on("error", function(error){
  console.log("ERROR:");
  console.log(error);
  client.send("PRIVMSG", config.channel, ":There was an error connecting to KNS");
});

// say something in the channel
kns.on("say", function(eventargs){
  if(eventargs.to && eventargs.text){
    client.send("PRIVMSG", eventargs.to, ":" +eventargs.text);
  }
});
