if (window.location.hostname.match("mykobj.net") && document.getElementById('bx_result_data') != null) {
    try {
        var eventData = document.getElementById('bx_result_data').innerText;
        var result_data = eval(eventData);

        // If there is an action field send it all on to the back ground page.
        if (result_data.action) {
            alert("had action " + result_data.action);

            safari.self.tab.dispatchMessage(result_data.action, result_data);
        }

    } catch (e) {
        alert(e.message)
    }
}
