	
$(document).ready(function() {
	alert("hello");
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		alert("testing validation");
		alert("Correct");
		
		var isValid = validateForm();
		if ( isValid ){
			alert("Correct");
		}
		else{
			alert("Incorrect");
		}
	});
	/* End of Save data into database ----------------------------------------------------------------------------------------------------------*/
	
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				txtcode : {
					required : true,
					minlength: 8
				},
				txtname : {
					required : true,
					minlength: 8
				},
				txtsex : {
					required : true,
					minlength: 8
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
	
	
	
	
	
	
	/* get data all from data base ----------------------------------------------------------------------*/
});