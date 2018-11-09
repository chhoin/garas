$(document).ready(function() {
	// Get data combo box of category
	rendergetComCategoryCode();
	
	// Get data combo box of Unit Code
	rendergetComboUnitCode();
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var $this = $(this);
	    	var url = baseUrl + "api/productinfosave";
	    	var params = {
	    			prodName : 	$("#txtProductName").val()
	    	};
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("Data Exists, Please Check");
	    	        }else{
	    	        	var data = {
    		    			   "cateCode": $("#cboProductType").val(),
    		    			   "unitCode": $("#cboUnit").val(),
    		    			   "prodName": $("#txtProductName").val(),
    		    			   "pricePerUnit": $("#txtWholesale").val(),
    		    			   "pricePerItem": $("#txtRetail").val(),
    		    			   "totalCanPerPackage": $("#txtQty").val(),
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
	                	    	alert("success");
	                	    },
	                	    failure: function(errMsg) {
	                	    	alert("failure");
	                	    }
	                	});
	    	        	
	    	        	// clear form
	    	        	$('input').val('').removeAttr('checked').removeAttr('selected');
	    	        	$('textarea').val('');
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
	
	/* Validation Form  ------------------------------------------------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				cboProductType : {
					required : true
				},
				cboUnit : {
					required : true
				},
				txtPartNo : {
					required : true
				},
				txtProductName : {
					required : true
				},
				txtWholesale : {
					required : true
				},
				txtRetail : {
					required : true
				},
				txtQty : {
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
	
	// Get data combo box of category
	function rendergetComCategoryCode() {
		var url = baseUrl + "api/productinfocombocategory";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.cateCode)
					  .text(customer.cateName);
			    $('#cboProductType').append(option);
			});
		});
	}
	
	// Get data combo box of Unit Code
	function rendergetComboUnitCode() {
		var url = baseUrl + "api/productinfocombounit";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.unitCode)
					  .text(customer.unitName);
			    $('#cboUnit').append(option);
			});
		});
	}
	
});
