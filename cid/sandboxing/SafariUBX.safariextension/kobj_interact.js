alert("loading")
if (document.getElementById('bx_result_data') != null) {
    try {
    var eventData = document.getElementById('bx_result_data').innerText;
    var result_data = $.parseJSON(eventData);

    // If there is an action field send it all on to the back ground page.
    if (result_data.action) {
        alert("had action " + result_data.action);

        safari.self.tab.dispatchMessage(result_data.action, result_data);
    }
    else {
        alert("np action")
    }

    }catch (e)
    {
        alert(e.message)
    }
}
else
{
    alert("mssing el")
}