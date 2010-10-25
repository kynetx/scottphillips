if(document.getElementById('bx_result_data') != null) {

        var eventData = document.getElementById('bx_result_data').innerHTML;
    alert(eventData)
        var result_data = $.parseJSON(eventData);
        // If there is an action field send it all on to the back ground page.
        if (result_data.action) {

            postMessage(result_data);

        }
        else {
        }
}