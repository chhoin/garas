$(document).ready(function() {
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var url = baseUrl + "api/expenses";
			
			var incomeDate = moment($("#txtIncomeDate").val(), "DD-MM-YYYY");
			
	    	var data = {
	    			   "expDate": incomeDate,
	    			   "expType": $("#txtIncomeType").val(),
	    			   "dest": $("#txtNote").val(),
	    			   "curCode": $("#cboCurrecy").val(),
	    			   "amount": $("#txtAmount").val(),
	    			   "userCode": "USER-001"
	    	};
	    	
	    	$.ajax({
	    	    type: "POST",
	    	    url: url,
	    	    data: JSON.stringify(data),
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	alert("success");
	    	    },
	    	    
	    	    failure: function(errMsg) {
	    	        alert("fail, Sorry plz try again");
	    	    }
	    	});
	    		$("#txtIncomeDate").val("");
			    $("#txtIncomeType").val("");
			    $("#txtNote").val("");
			    $("#cboCurrecy").val("");
			    $("#txtAmount").val("");
		}
		else{
			// alert("Incorrect");
		}
	});
	
	/* Validation Form  ------------------------------------------------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtIncomeDate : {
					required : true
				},
				txtIncomeType : {
					required : true
				},
				cboCurrecy : {
					required : true
				},
				txtAmount : {
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
	
});