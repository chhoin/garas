	
$(document).ready(function() {
	// get combo of categories
	getComboCategories();
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var $this = $(this);
	    	var url = baseUrl + "api/items";
	    	var params = {
	    			name : 	$("#txtName").val()
	    	};
	 
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("Item Exit, Please Check");
	    	        }else{
	    	        	var data = {
	    	        			"categories_CODE": $("#cboType").val(),
	    	        			"cat_ITEM_CODE": $("#txtName").val(),
	    	        			"descricption": $("#txtDesc").val(),
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
	    	        	$("#cboType").val("");
	    	        	$("#txtName").val("");
	    	        	$("#txtDesc").val("");
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
				cboType : {
					required : true
				},
				txtName : {
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
	
	/* get data to combo box currency -----------------------------------------------------------------------------------*/
	function getComboCategories() {
		var url = baseUrl + "api/itemcombos";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.categories_NAME);
			    $('#cboType').append(option);
			});
		});
	}
	/* end of get data to combo box currency ---------------------------------------------------------------------------*/

});
