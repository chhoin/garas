	
$(document).ready(function() {
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			// alert("correct");
			var url = baseUrl + "api/suppliers";
			
	    	var data = {
	    			   "companyName": $("#txtCompany").val(),
	    			   "suppKhName": $("#txtKhName").val(),
	    			   "suppEngName": $("#txtEngName").val(),
	    			   "phone": $("#txtPhone").val(),
	    			   "mail": $("#txtMail").val(),
	    			   "address": $("#txtAddress").val(),
	    			   "dest": $("#txtNote").val(),
	    			   "userCode": "USER-001"
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
	    	        alert("Sorry plz try again");
	    	    }
	    	});
	    		$("#txtCompany").val("");
			    $("#txtKhName").val("");
			    $("#txtEngName").val("");
			    $("#txtPhone").val("");
			    $("#txtMail").val("");
			    $("#txtAddress").val("");
			    $("#txtNote").val("");
		}
		else{
			// alert("Incorrect");
		}
	});
	/* End of Save data into database ----------------------------------------------------------------------------------------------------------*/
	
	/* Validation Form  --------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtCompany : {
					required : true
				},
				txtKhName : {
					required : true
				},
				txtPhone : {
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
	
});
