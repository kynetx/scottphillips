

var app_list = [];

function am_file_path(file_name)
{
    return "account_management" + air.File.separator + file_name
}

function am_display_login_page()
{
    var data = read_file(am_file_path("Login.html"));
    $("#content").html(data);
    register_login_click();
}

function get_app_list()
{
    app_list = {apps : json_request("http://localhost:3000/api/0.1/user_applications_list?username=" + get_enc_local_data("login"))};
}


function authorize_user(user_name,password)
{
    //    http://localhost:3001/api/0.1/auth?username=cid.dennis&password=cid
    // {"username":"cid.dennis","KynetxID":"93","valid":true,"message":"valid login","KynetxAdmin":"1","email":"cid.dennis@gmail.com"}
    return json_request("http://localhost:3001/api/0.1/auth?username=" + user_name + "&password=" + password)
}

function register_show_my_apps()
{
    $("#app_list").click(function(){
        $("#content").html("");
        var template = compiled_templates[am_file_path("ApplicationList.html")];
        html = template.render(app_list);
        alert("html was" + html)
        $("#content").html(html);

    });
}
function register_login_click()
{
    $("#login_form").submit(function() {
        $("#bad_login").hide();
        var result = authorize_user($("#login").val(), $("#password").val())
        if (result.valid)
        {
            set_enc_local_data("login", $("#login").val());
            set_enc_local_data("password", $("#password").val());
            set_enc_local_data("KynetxID", result["KynetxID"]);
            set_enc_local_data("email", result["email"]);

            $("#user_name").html("Welcome: " + $("#login").val() + " - " + result.email);
            $("#logged_in").show();
            get_app_list();
            register_show_my_apps();

        }
        else
        {
            $("#bad_login").show();
        }
        return false;
    });
}
