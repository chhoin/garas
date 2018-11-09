$(document).ready(function() {
	//alert("Hello World");
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			// alert("Correct");
			//event.preventDefault();
			
			var $this = $(this);
	    	var url = baseUrl + "api/currencys";
	    	
	    	var params = {
	    			name : 	$("#txtname").val()
	    	};
	 
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("Currency Exit, Please Check");
	    	        }else{
	    	        	var data = {
	    	        			"cur_NAME": $("#txtname").val(),
	    	            		"cur_SALE": $("#txtsale").val(),
	    	            		"cur_BUY": $("#txtbuy").val(),
	    	            		"cur_DESC": $("#txtmiddle").val()
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
	    	        	
	    	        	$("#txtname").val("");
	           		 	$("#txtsale").val("");
	           		 	$("#txtbuy").val("");
	           		 	$("#txtmiddle").val("");
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
	/* End of Save data into database ----------------------------------------------------------------------------------------------------------*/
	
	/* Validation Form  --------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtname : {
					required : true,
					minlength: 2
				},
				txtsale : {
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
