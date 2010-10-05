if(document.getElementById('bx_result_data') != null) {
    document.getElementById('bx_result_data').addEventListener('kynetx_custom_event', function() {
        var eventData = document.getElementById('bx_result_data').innerText;
        var result_data = $.parseJSON(eventData);

        // If there is an action field send it all on to the back ground page.
        if (result_data.action) {
            alert("had action " + result_data.action);

            chrome.extension.sendRequest(result_data, function(response) {

            });
        }
        else {
            alert("np action")
        }
    });

}
//// does page have a result data area?
//try {
//    alert("running interact" + $('#bx_result_data').length)
//} catch(e) {
//    alert(e.message);
//}
//
//if ($('#bx_result_data').length > 0) {
//    alert("found element")
//    // Bind our custom event then
//    $('#bx_result_data').bind('kynetx_custom_event', function() {
//        // the data is a json string
//        var eventData = $('#bx_result_data').text;
//
//        var result_data = $.parseJSON(eventData);
//
//        // If there is an action field send it all on to the back ground page.
//        if (result_data.action) {
//            alert("had action " + result_data.action);
//
//            chrome.extension.sendRequest(result_data, function(response) {
//
//            });
//        }
//        else {
//            alert("np action")
//        }
//    });
//}
//else {
//    alert("bx_result_data not foind")
//}
//
