$(document).ready(function() {
	
	/* Save data into database -------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var $this = $(this);
	    	var url = baseUrl + "api/users";
	    	var params = {
	    			userName : 	$("#txtUserName").val()
	    	};
	 
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("User Exists, Please Check");
	    	        }else{
	    	        	var data = {
    		    			   "userName": $("#txtUserName").val(),
    		    			   "passWord": $("#txtPassword").val(),
    		    			   "firstName": $("#txtFirstName").val(),
    		    			   "lastName": $("#txtLastName").val(),
    		    			   "phone": $("#txtPhone").val(),
    		    			   "address": $("#txtAddress").val()
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
	    	        	
	    	        	// Clear form
	    	        	$("#txtUserName").val("");
	    			    $("#txtPassword").val("");
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
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtUserName : {
					required : true
				},
				txtPassword : {
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
	/* End of Validation Form --------------------------------------------------------------------------*/
	
});
