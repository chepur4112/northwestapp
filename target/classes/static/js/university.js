$(document).ready(function() {
    $('#example').DataTable({
        "processing" : true,
        "ajax" : {
            "url" : "http://localhost:8090/universitylist/retrieve",
            dataSrc : ''
        },
        "columns" : [ {
            "data" : "name"
        }, {
            "data" : "country"
        }, {
        	"data" : "web_pages",
        	"render": function(data, type, row, meta){
        		if(type === 'display'){
                    data = '<a href="' + data + '" target="_blank">' + data + '</a>';
                }	
        		return data;
        	}
        }]
    });
});
