ruleset a41x140 {
  meta {
    name "IRC Bot"
    description <<
      IRC Bot
    >>
    author ""
    // Uncomment this line to require Marketplace purchase to use this app.
    // authz require user
     logging off
  }

  dispatch {
    // Some example dispatch domains
    // domain "example.com"
    // domain "other.example.com"
  }

  global {

    datasource shakespeare:HTML <- "http://www.pangloss.com/seidel/Shaker/" cachable for 1 seconds;
    datasource BOFH:HTML <- "http://pages.cs.wisc.edu/~ballard/bofh/bofhserver.pl" cachable for 1 seconds;
    datasource random:HTML <- "http://en.wikipedia.org/wiki/Special:Random" cachable for 1 seconds;
    datasource stringBinWrite <- "http://api.stringbin.com/1/write?pin=f22DrSyArBgHLKciIvWRN" cachable for 1 seconds;
    datasource stringBinRead <- "http://api.stringbin.com/1/read?pin=f22DrSyArBgHLKciIvWRN" cachable for 1 seconds;
    datasource translate <- "https://www.googleapis.com/language/translate/v2?key=AIzaSyC9ikbb0auy0HQTzIf6GY08oYBBvrcBC10" cachable for 5 days;
  
    getChannel = function(parameters){
      parameters.pick("$.channel").match(re/^#/) => parameters.pick("$.channel") | parameters.pick("$.user");
    };
  }

  rule test {
    select when irc recieved text "~test"
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);

        variable = ent:count;
      }
      {
        send_directive("say") with text = variable and to = channel;
      }
      fired {
        ent:count += 1 from 10;
      }
  }

  rule help {
    select when irc recieved text "~help"
      pre {
        eventParams = event:params();
        channel = page:env("user");

        general = <<ScottPhillips is a bot run through sending events to Kynetx and responding using directives. ScottPhillips supports several commands including (but not limited to since there may be easter eggs):>>;

        insult = <<    ~insult <username>: Will send a shakespearian insult to <username>. Insults are from http://www.pangloss.com/seidel/Shaker/>>;

        random = <<    ~random: Gets a random word from a random Wikipedia article and sends the word back as a message.>>;

        welcome = <<   ~welcome: <username>: Welcomes <username> into the channel.>>;

        rolldie = <<   ~rolldie: Returns a random number between 1-4. Guaranteed to be random.>>;

        excuse = <<   ~excuse: Gives an excuse gotten from http://pages.cs.wisc.edu/~ballard/bofh/bofhserver.pl>>;

        karma_plus = <<   <username>++: Increases the Karma of <username>.>>;

        karma_minus = <<   <username>--: Decreases the Karma of <username>.>>;

        karma_get = <<   ~karma <username>: Returns the Karma of <username>.>>;

        s = <<s/<text>/<replace>: Does a search and replace on your last message.>>;

        say = <<~say <message> <channel>: Posts <message> in <channel>.>>;

        translate = <<~translate <message/username> <desiredLanguageCode>: Translates <message> or <username>'s last message into the language specified by the <desiredLanguageCode>. ja for Japanese, es for Spanish, etc.>>;
      }
      if( channel neq "AlexOlson" ) then {
        send_directive("say") with text = general and to = channel;
        send_directive("say") with text = insult and to = channel;
        send_directive("say") with text = random and to = channel;
        send_directive("say") with text = welcome and to = channel;
        send_directive("say") with text = rolldie and to = channel;
        send_directive("say") with text = excuse and to = channel;
        send_directive("say") with text = karma_plus and to = channel;
        send_directive("say") with text = karma_minus and to = channel;
        send_directive("say") with text = karma_get and to = channel;
        send_directive("say") with text = s and to = channel;
        send_directive("say") with text = say and to = channel;
        send_directive("say") with text = translate and to = channel;
      }
      fired {
        last;
      }
  }

  rule help_ako {
    select when irc recieved text "~help"
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        text = <<You need more help than we can give you, #{user}...>>;
     
      }
      if( user eq "AlexOlson" ) then {
        send_directive("say") with text = "#{text}" and to = channel;
      }
      fired {
        last;
      }
  }

  rule substitute {
    select when irc recieved text "s/(.*?)/(.*?)/(.*)" setting (toreplace, replacewith, flags)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        data = currentHash.pick("$.#{user}");

        regex = <<re/#{toreplace}/#{flags}>>;
        newText = data.pick("$.text").replace("#{regex}".as("regexp"),replacewith);

        textToSay = "#{user} meant: #{newText}";
      }

      send_directive("say") with text = "#{textToSay}" and to = channel and users = currentHash.encode();
      fired {
        last;
      }
  }

  rule substitute_no_end_slash {
    select when irc recieved text "s/(.*?)/(.*)" setting (toreplace, replacewith, flags)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        data = currentHash.pick("$.#{user}");

        regex = <<re/#{toreplace}/#{flags}>>;
        newText = data.pick("$.text").replace("#{regex}".as("regexp"),replacewith);

        textToSay = "#{user} meant: #{newText}";
      }

      send_directive("say") with text = "#{textToSay}" and to = channel and users = currentHash.encode();
      fired {
        last;
      }
  }


  rule karma {
    select when irc recieved text ".*?(\w+)([\+\-]{2}).*?" setting (username,command)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        data = currentHash.pick("$.#{username}");

        currentHash = app:users => app:users | {};

        karma = currentHash.pick("$.#{username}.karma");

        karmaCount = (karma.as("str") neq "[]") => karma | 0;

        newKarma = (command eq "++") => karmaCount.as("num")+1 |
          (command eq "--") => karmaCount.as("num")-1 | karmaCount.as("num");

        info = {
          "karma":newKarma,
          "user":user,
          "text":text
        };

        new = currentHash.put({"#{username}":info});
        textToSay = "#{username}'s karma is #{newKarma}";

        data = app:karmaed;

        limiter = (not (seen user in app:karmaed within 1 minutes));
      }

      if(username neq user && limiter && ( command eq "++" || command eq "--") && username neq "ScottPhillips") then {  
        send_directive("say") with text = "#{textToSay}" and to = channel and karma = karma and limit = limiter;
      }
      fired {
        set app:users new;
        mark app:karmaed with user;
        last;
      }
  }

  rule scott_karma {
    select when irc recieved text ".*?ScottPhillips([\+\-]{2}).*?" setting(command)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        username = (command eq "--") => user | "ScottPhillips";

        data = currentHash.pick("$.#{username}");

        currentHash = app:users => app:users | {};

        karma = currentHash.pick("$.#{username}.karma");

        karmaCount = (karma.as("str") neq "[]") => karma | 0;

        newKarma = (command eq "++") => karmaCount.as("num")+1 |
          (command eq "--") => karmaCount.as("num")-1 | karmaCount.as("num");

        info = {
          "karma":newKarma,
          "user":user,
          "text":text
        };

        new = currentHash.put({"#{username}":info});
        message = (command eq "--") => "Trying to demote me, eh? Well, #{user}'s karma is now #{newKarma}!" |
          (command eq "++") => "Thanks for the upvote! My karma is now #{newKarma}" |
          "";
      }
      if(message neq "") then {
        send_directive("say") with text = message and to = channel;
      }
      fired {
        set app:users new;
        mark app:karmaed with user;
        last;
      }
  }

  rule get_karma {
    select when irc recieved text ".*?~karma\s+(\w+).*?" setting (username,command)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        data = currentHash.pick("$.#{username}");

        karma = currentHash.pick("$.#{username}.karma");

        karmaCount = (karma.as("str") neq "[]") => karma | 0;

        textToSay = "#{username}'s karma is #{karmaCount}";
      }

    send_directive("say") with text = "#{textToSay}" and to = channel and karma = karmaCount;
    fired {
      last;
    }
  }

  rule translate_user {
    select when irc recieved text ".*?~translate\s+(\w+)\s+(\w+)" setting (text,language)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        currentHash = app:users;

        userText = currentHash.pick("$.#{text}.text");

        textToTranslate = (userText.as("str") neq "[]") => userText | "";

        translateTo = language eq "" => "en" | language;

        translated = datasource:translate({"q":textToTranslate,"target":translateTo}).pick("$.data.translations[0].translatedText");

        textToSay = "#{translated}";
      }

    if( userText.as("str") neq "[]") then {
      send_directive("say") with text = "#{textToSay}" and to = channel;
    }
    fired {
      last;
    }
 }

  rule translate_text {
    select when irc recieved text ".*?~translate\s+(.*)\s+(\w+).*?" setting (text,language)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        translateTo = language eq "" => "en" | language;

        translated = datasource:translate({"q":text,"target":translateTo}).pick("$.data.translations[0].translatedText");

        textToSay = "#{translated}";
      }

    send_directive("say") with text = "#{textToSay}" and to = channel;
    fired {
      last;
    }
 }


  rule say {
    select when irc recieved text ".*?~say\s+(.*)\s+(.*).*?" setting (text,channel)
      pre {
        eventParams = event:params();
        user = page:env("user");


        textToSay = "#{text}";
      }

    send_directive("say") with text = "#{textToSay}" and to = channel;
    fired {
      last;
    }
 }


  // normal commands


  rule irc_random is active {
    select when irc recieved text ".*?~random.*?" setting ()
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");
        page = datasource:random({});
        bodyContent = page.query("#bodyContent",true);
        randomArray = bodyContent[0].extract(re/\s+(\w+)\s+/g);
        random = randomArray[math:random(randomArray.length())];
        textToSay = "#{random}";
      }
      send_directive("say") with text = "#{textToSay}" and to = channel;
      fired {
        last;
      }
  }


  rule irc_excuse is active {
    select when irc recieved text ".*?~excuse.*?" setting ()
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");
        page = datasource:BOFH({"blarg":(math:random(100000))});
        bodyContent = page.query("font[size=+2]",true);
        excuse = bodyContent[1];
        textToSay = "#{excuse}";
      }
      send_directive("say") with text = "#{textToSay}" and to = channel;
      fired {
        last;
      }
  }


  rule irc_welcome is active {
    select when irc recieved text ".*?~welcome\s+(\w+).*?" setting (username)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        textToSay = <<Welcome to #{channel}, #{username}!>>;
      }
      send_directive("say") with text = "#{textToSay}" and to = channel;
      fired {
        last;
      }
  }


  rule irc_dice_roll is active {
    select when irc recieved text ".*?~rolldie.*?" setting ()
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        user = page:env("user");

        textToSay = <<4 // see http://imgs.xkcd.com/comics/random_number.png>>;
      }
      send_directive("say") with text = "#{textToSay}" and to = channel;
      fired {
        last;
      }
  }


  rule irc_insult is active {
    select when irc recieved text ".*?~insult\s+(\w+).*?" setting (username)
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        page = datasource:shakespeare({});
        insult = page.query("font[size=+2]", true);
        textToSay = "#{username}: #{insult[0]}";
      }
      send_directive("say") with text = "#{textToSay}" and to = channel;
      fired {
        last;
      }
  }


  rule irc_op_jessie {
    select when irc joined
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        username = page:env("user");
      }
      if(username eq "JessieAMorris" || username eq "PreacherBob") then {
        send_directive("mode") with channel = channel and user = username and mode = "+o";
        send_directive("say") with text = "Welcome JAM!" and to = channel;
      }
  }
  
  rule irc_op_qwade {
    select when irc joined
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        username = page:env("user");
      }
      if(username eq "qwade") then {
        send_directive("mode") with channel = channel and user = username and mode = "+o";
        send_directive("say") with text = "Welcome QWade!" and to = channel;
      }
  }


  rule irc_kick_ako {
    select when irc joined
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        username = page:env("user");
        time = (time:now({"tz":"America/Denver"})).replace(re/.*?(\d+)\w$/,"$1");
      }
      if((username eq "AlexOlson" || username eq "PreacherBob") && not (time % 3)) then {
        send_directive("say") with text = "I am a BOFH!" and to = channel and time = time;
        send_directive("kick") with channel = channel and user = username;
      }
  }

  // HTTP info
  //rule irc_http {
    //select when irc recieved text ".*(https?://.*?\s+).*" setting(url)


  rule save_messages {
    select when irc recieved
      pre {
        eventParams = event:params();
        channel = getChannel(eventParams);
        text = page:env("text");
        user = page:env("user");

        currentHash = app:users => app:users | {};

        karma = currentHash.pick("$.#{user}.karma");

        karmaCount = (karma.length() == 0) => 0 | karma;

        info = {
          "karma":karmaCount,
          "user":user,
          "text":text
        };

        new = currentHash.put({"#{user}":info});

      }
      always {
        set app:users new;
      }
  }

  rule clear_hash {
    select when irc remove
      always {
        clear app:users;
  clear app:karmaed;
      }      
  }

}
