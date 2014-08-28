$(function() {
	
	addSubmitHandler();
	addInputChangedListener();
	
});

function addSubmitHandler() {
	$("#push").bind("click", function(event) {
		var entry = $("textarea#entry_text_area").val();
		validateInput(entry, "POST");
		event.preventDefault();
	});
}

function addInputChangedListener() {
	$("#entry_text_area").bind("keyup change", function(e) {
		var entry = $(this).val();
		validateInput(entry, "GET");
	});
}

function validateInput(entry, method) {
	if (notEmpty(entry) && length(entry)) {
		$.ajax({
			type : method,
			url : "/editor/validate",
			data : {
				entry : entry
			},
			success : function(result) {
				var items = [];
				$.each(result, function(key, val) {
					if (typeof val === 'object' && notEmpty(val)) {
						for (var i = 0; i < val.length; i++) {
							items.push("<p class='error'>" + val[i] + "</p>");
						}
					}
				});
				
				if(notEmpty(items) && items.length > 0)
					$('#server_message').html(items);
				else
					$('#server_message').html("<p class='success'>Input is valid!</p>");
			},
			error : function(xhr, status, error) {
				$('#server_message').text("xhr: " + xhr + "\n" + "status: " + status + "\n" + "error: " + error);
			}
		});
	} else {
		clearServerMessageBox();
	}
}
function clearServerMessageBox() {
	$('#server_message').empty();
}

function notEmpty(obj) {
	return obj && obj !== "null" && obj !== "undefined";
}

function length(obj) {
	return obj.length > 0 || obj !== "";
}