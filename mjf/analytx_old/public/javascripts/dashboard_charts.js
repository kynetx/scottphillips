function generateChart(chart_name, client_id, range) {	
	var opts = {}
	switch (chart_name) {
		case "rse_chart": opts = rse_chart(client_id, range);
		break;
		
		// future charts go here
		
		default: throw("Error: Undefined chart.");
	}
		
	$.getJSON(opts.u, objToParams(opts.p), function(data){
		$.plot($('#' + chart_name), data, opts.o);
		bindTooltip('#' + chart_name);
	});
}


function rse_chart(client_id, range) {
	var params = {
		client_id: client_id,
		num_range: range,
		kpi: "rse,rf",
		pivot: true,
		temporal: "day",
		as_timestamp: true
	}
	
	var chart_opts = {
		xaxis: {
			mode: "time",
			timeformat: "%m/%d",
			minTickSize: [1, "day"]
		},
		points: {show: true},
		lines: {show: true},
		legend: {
			show: true,
			container: $("#rse_chart_legend"),
			noColumns: 1
		},
		grid: {
			hoverable: true,
			clickable: true
		}

	}
	
	var url = 'data/kns_totals'

	return {p: params, o: chart_opts, u: url}

}