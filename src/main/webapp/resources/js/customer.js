$(document).ready(function() {
	/* Save data into database */
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var url = baseUrl + "api/customers";
	    	var data = {
	    			   "custKhName": $("#txtKhName").val(),
	    			   "gender": $("#cboGender").val(),
	    			   "phone": $("#txtPhone").val(),
	    			   "dest": $("#txtAddress").val(),
	    			   "villageCode": $("#txtVillage").val(),
	    			   "communeCode": $("#txtCommune").val(),
	    			   "districtCode": $("#txtDistrict").val(),
	    			   "provinceCode": $("#txtProvince").val(),
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
	    	$('input').val('').removeAttr('checked').removeAttr('selected');
	    	$('textarea').val('');
		}
		else{
			// alert("Incorrect");
		}
	});
	
	/* Validation Form */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
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
	
});