var local_data = {};


var db_conn = new air.SQLConnection();

// The database file is in the application storage directory
var app_folder = air.File.applicationStorageDirectory;
var db_file = app_folder.resolvePath("kynetx.db");

db_conn.open(db_file);

create_tables();


function create_tables()
{

    var createStmt = new air.SQLStatement();
    createStmt.sqlConnection = db_conn;

    var sql =
            "CREATE TABLE IF NOT EXISTS user (" +
            "    is_seller BOOLEAN, " +
            "    name TEXT, " +
            "    user_name TEXT, " +
            "    email TEXT, " +
            "    user_id TEXT " +
            ")";

    createStmt.text = sql;
    createStmt.execute();

}

var compiled_templates = {};

function load_templates()
{
    try {
        var template = read_file(am_file_path("ApplicationList.html"));
        compiled_templates[am_file_path("ApplicationList.html")] = new EJS({text: template});
    } catch(e)
    {
        alert(e.message);
    }
}


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
    return $("#result_area", result).html();

}

function get_app_detail(name)
{
    // http://marketplace.kynetx.com/app/twitter-google-mashup
}

function remove_enc_local_data(key)
{
    air.EncryptedLocalStore.removeItem(key);

}


function read_file(file_name)
{
    var file = air.File.applicationDirectory.resolvePath(file_name);
    var data = new air.ByteArray();
    var stream = new air.FileStream();
    stream.open(file, air.FileMode.READ);
    var data = stream.readMultiByte(file.size, air.File.systemCharset);
    stream.close();
    return data;
}


function set_enc_local_data(key, data)
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

function load_remote_page(url, callback)
{

    var loader = new air.URLLoader();
    configureListeners(loader);

    loader.addEventListener(air.Event.COMPLETE, function(event) {
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

var server_socket;


function init_server()
{
    server_socket = new air.ServerSocket();
    server_socket.bind(8888);
    server_socket.addEventListener("connect", connection_handler);
    server_socket.listen();

    air.trace("bound socket");
}

function connection_handler(event)
{
    air.trace("Connected")
    var socket = event.socket;
    socket.addEventListener("socketData", data_handler);

}

function data_handler(event)
{
    var socket = event.target;
    var indata = socket.readUTFBytes(socket.bytesAvailable);
    // 	air.trace("Data Sent " + socket.readUTFBytes(socket.bytesAvailable));
    //    air.trace("Url In Was" + indata.split(" ")[1])
    var url = indata.split(" ")[1];

    var content = "";
    if (url == "/end_point_init")
    {
        content = process_endpoint_init(url);
    }

    var data = "HTTP/1.1 200 OK\n\r";
    var content = "hello world";
    data = data + "Cache-Control : max-age=0\n\r"
    data = data + "Content-Length : " + content.length + "\n\r";
    data = data + "Content-Type : text/html\n\r";
    data = data + "\n\r" + content
    socket.writeUTF(data);
}


function process_endpoint_init(url)
{
    full_runtime = sync_request("http://static.kobj.net/kobj-static-20100611003313.js", "GET");
    var result = sync_request("http://init.kobj.net/js/dispatch/" + appid + "?cachebust=" + (new Date().getTime()), "GET");
    domains = eval("(" + result + ")");
    domains = domains[appid];

    return { apps:[
        {"a93x7": {domains: ["google\\.com","apple\\.com"]}},
        {"a93x22": {domains: ["cbssports\\.com","sportsillustrated.cnn\\.com"]}},
        {"a633x3": {domains : ["google\\.com","bing\\.com"]}}
    ],
        runtime: full_runtime }
}

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


air.trace("starting server")
init_server();


