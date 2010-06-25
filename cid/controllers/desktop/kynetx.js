var local_data = {};

function get_enc_local_data(key)
{
	try {
            var storedValue = air.EncryptedLocalStore.getItem(key);
            return storedValue.readUTFBytes(storedValue.length);
		}
		catch(e)
		{
			return null;
		}
}

function get_all_apps()
{
	var result = html_request("http://marketplace.kynetx.com/store/search?page=1&search_category=All+Categories&term=&x=48&y=12")
	return $("#result_area",result).html();

}

function get_app_detail(name)
{
	// http://marketplace.kynetx.com/app/twitter-google-mashup
}

function set_enc_local_data(key,data)
{
            var bytes = new air.ByteArray();
            bytes.writeUTFBytes(data);
            air.EncryptedLocalStore.setItem(key, bytes);
}

function switch_pages(url)
{
	var url = url;
    var request = new air.URLRequest(url);
          
    request.method = air.URLRequestMethod.GET;
          
    air.navigateToURL(request);
}

function html_request(url)
{
	var response = null;
	$.ajax({
	  async: false,
	  url: url,
	  dataType: 'html', // note we're using json rather than jsonp
	  success: function (data) {
		response = data;
	  }
	});
	return response;
	
}

function json_request(url)
{
	var response = null;
	$.ajax({
	  async: false,
	  url: url,
	  dataType: 'json', // note we're using json rather than jsonp
	  success: function (data) {
	    // work out the original name space the jsonp function was on
		response = data;
	  }
	});
	return response;
}
function load_remote_page(url,callback)
{
	 
	 var loader = new air.URLLoader();
	 configureListeners(loader);
		
	 loader.addEventListener(air.Event.COMPLETE, function(event){
		var loader = air.URLLoader(event.target);
		callback(loader.data);
	 });
     var request = new air.URLRequest("http://localhost:3000/home");
     air.trace("About to make request");
     try {
          loader.load(request);
      } catch (error) {
          air.trace("Unable to load requested document." + error.messsage);
      }
	
}

// var server_socket;

// 
// function init_server()
// {
// 	server_socket = new air.ServerSocket();
// 	server_socket.addEventListener("connect",connection_handler);
// 	server_socket.bind(8888);
// 	server_socket.listen();
// 	
// 	air.trace("bound socket");
// }
// 
// function connection_handler(event)
// {
// 	air.trace("Connected")
// 	var socket = event.socket;
// 	socket.addEventListener("socketData", data_handler);	
// 	
// }
// 
// function data_handler(event)
// {
// 	var socket = event.socket;
// 	air.trace("Data Sent")
// 	
// }
// 
// air.trace("sstarting server")
// init_server();


	
		 function configureListeners(dispatcher) {
		            // dispatcher.addEventListener(air.Event.COMPLETE, completeHandler);
		            dispatcher.addEventListener(air.Event.OPEN, openHandler);
		            dispatcher.addEventListener(air.ProgressEvent.PROGRESS, progressHandler);
		            dispatcher.addEventListener(air.SecurityErrorEvent.SECURITY_ERROR, securityErrorHandler);
		            dispatcher.addEventListener(air.HTTPStatusEvent.HTTP_STATUS, httpStatusHandler);
		            dispatcher.addEventListener(air.IOErrorEvent.IO_ERROR, ioErrorHandler);
		        }


		        function openHandler(event) {
		            air.trace("openHandler: " + event);
		        }

		        function progressHandler(event) {
		            air.trace("progressHandler loaded:" + event.bytesLoaded + " total: " + event.bytesTotal);
		        }

		        function securityErrorHandler(event) {
		            air.trace("securityErrorHandler: " + event);
		        }

		        function httpStatusHandler(event) {
		            air.trace("httpStatusHandler: " + event);
					event.responseHeaders
		        }

		        function ioErrorHandler(event) {
		            air.trace("ioErrorHandler: " + event);
		        }
	
