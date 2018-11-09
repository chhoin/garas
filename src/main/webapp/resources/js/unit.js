/* Document Ready -------------------------------------------------------------------------------------*/
$(document).ready(function() {
	// get all data from database
	renderUserList();
	
	// get data from table in jsp
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			/*$("#txtname").val($(this).children("td:nth-child(2)").text());*/
			
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* Save data into database -------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var $this = $(this);
	    	var url = baseUrl + "api/units";
	    	var params = {
	    			name : 	$("#txtUnit").val()
	    	};
	 
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("Unit Exit, Please Check");
	    	        }else{
	    	        	var data = {
	    	        			"unit_NAME": $("#txtUnit").val(),
	    	        			"desc": $("#txtNote").val(),
	    	        			"input_NAME": "Admin"
	    	        	};
	    	        	
	    	        	$.ajax({
	                	    type: "POST",
	                	    url: url,
	                	    data: JSON.stringify(data),
	                	    contentType: "application/json; charset=utf-8",
	                	    dataType: "json",
	                	    success: function(response){
	                	    },
	                	    failure: function(errMsg) {
	                	    }
	                	});
	    	        	
	    	        	// clear form
	    	        	$("#txtUnit").val("");
	    	        	$("#txtNote").val("");
	    	        	// show data
	    	        	renderUserList();
	    	        }
	    	    },
	    	    failure: function(errMsg) {
	    	        alert("Sorry plz try again");
	    	    }
	    	});
		}
		else{
			//alert("Incorrect");
		}
	});
	/* End of Save data into database ------------------------------------------------------------------*/
	
	/* Validation Form  --------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				txtUnit : {
					required : true
				}
			}
		});			
		
		if ( validator.form() ){
			return true;
		}
		else{
			return false;
		}
	}
	/* End of Validation Form ---------------------------------------------------------------------------*/
	
	/*delete data ---------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var unit_CODE = $("label[for='myalue']").text();
		var url = baseUrl + "api/unitsdelete/" + unit_CODE;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){
			    	renderUserList();
			    }
			});
	 });
	/*End of delete data --------------------------------------------------------------------------------*/
	
	/* get data all from data base ----------------------------------------------------------------------*/
	function renderUserList() {
		var url = baseUrl + "api/units";
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
					$("<td>").text(user.auto_NUM)
				).append(																	
					$("<td>").text(user.unit_CODE)
				).append(
					$("<td>").text(user.unit_NAME)
				).append(
					$("<td>").text(user.desc)
				).append(
					$("<td>").text(user.input_NAME)
				).append(
					$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
				).append(
				    $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
		                '<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
		                '<span class="glyphicon glyphicon-trash">' +
		                '</span>' +
		                '</button>' +
		                '</p>')
				    );
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	/* end of get data all from data base ----------------------------------------------------------------------*/
	
});
/* End of Document Ready ---------------------------------------------------------------------------------------*/