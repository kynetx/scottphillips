var http = require('http');
var events = require('events');
var net = require('net');

var url = require('url');

var randomString = function(length) {
	var chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
	var string_length = length || 10;
	var randomstring = '';
	for (var i=0; i<string_length; i++) {
		var rnum = Math.floor(Math.random() * chars.length);
		randomstring += chars.substring(rnum,rnum+1);
	}
  return randomstring;
}

var clientTable = {};

console.log('Server running at http://127.0.0.1:8124/');

var server = net.createServer(function(stream){
  stream.setEncoding('utf8');
  stream.on('connect',function(){
    var token = randomString(20);
    clientTable[token] = stream;
    stream.token = token;
    stream.write(JSON.stringify({"token":token})+'\r\n');
  });

  stream.on('data', function(data){
    var toReturn = {"error":"none"};

    try {
      data = JSON.parse(data);
      if(!clientTable[data.token]){
        clientTable[stream.token] = null;
        clientTable[data.token] = stream;
        stream.token = data.token;
      } else {
        toReturn.error = "token already in use"
      }
    } catch(error) {
      toReturn.error = "json was not valid";
    }

    toReturn.token = stream.token;

    stream.write(JSON.stringify(toReturn));
    stream.write('\r\n');

  });

  stream.on('timeout', function(){
    stream.write('\r\n');
    delete clientTable[stream.token]
  });

  stream.on('end', function(){
    stream.write('Awww... bye!');
    stream.end();
    delete clientTable[stream.token]
  });
});

http.createServer(function( request, response){
  var urlParts = url.parse(request.url,true);
  response.writeHead(200, {'Content-Type':'text/plain'})
  var jsonResponse = {};
  if(!urlParts.query || !urlParts.query.token){
    jsonResponse.error = "no token";
  } else if(!clientTable[urlParts.query.token]){
    jsonResponse.error = "token not found";
  } else if(urlParts.query && urlParts.query.token && clientTable[urlParts.query.token]){

    var token = urlParts.query.token;

    var stream = clientTable[token];
    stream.write(JSON.stringify({"query":urlParts.query}) + '\r\n');
    jsonResponse.error = false;

  }


  response.end(JSON.stringify(jsonResponse));
  
}).listen(8124);

server.listen(8000);

server.on('stream', function(stream){
  console.log('someone connected');
});
