	
$(document).ready(function() {
	// alert("Hello Products");
	
	/*var d = new Date();
	var curr_date = d.getDate();
	var curr_month = d.getMonth() + 1;
	var curr_year = d.getFullYear();
	var curr_hour = d.getHours();
	var curr_minute = d.getMinutes();
	var curr_second = d.getSeconds();
	var input_date = curr_date + "-" + curr_month + "-" + curr_year + "-" + curr_hour + "-" + curr_minute + "-" + curr_second;
    var get_date_time = moment(input_date, 'DD/MM/YYYY h:mm a');*/
    
    /*get data to combo box*/
    renderListComboBox();
    
    /*get data to combo box categories*/
    getComboBoxItem();
    
    /*get data to combo box of unit*/
    renderListComboBoxUnit();
    
    /*get data to combo box of currency*/
    getComboBoxCurrency();
    
    $( "#cboCategories" ).change(function() {
    	$('#cboItem option').remove();
    	getComboBoxItem();
    });
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			var $this = $(this);
	    	var url = baseUrl + "api/products";
	    	//var dobObj = moment($("#txtDate").val(), "DD-MM-YYYY");
	    	// alert($("#cboItem").val());
	    	var params = {
	    			st_NAME : 	$("#cboItem").val()
	    	};
	    	
	    	$.ajax({
	    	    type: "GET",
	    	    url: url + "/existId",
	    	    data: params,
	    	    contentType: "application/json; charset=utf-8",
	    	    dataType: "json",
	    	    success: function(response){
	    	    	if (response === true){
	    	           alert("Product Type Exit, Please Check");
	    	        }else{
	    	        	var data = {
							    "st_TYPE": $("#cboCategories").val(),   
							    "st_NAME": $("#cboItem").val(),       
							    "st_TYPE_CODE": $("#cboStock").val(),          
							    "st_UNIT": $("#cboUnit").val(),     
							    "currency": $("#cboRate").val(),     
							    "wqty": $("#txtStatus").val(),       
							    "st_INPUTER": "Admin",   
							    "des": $("#txtDesc").val(),
							    "import_TYPE": $("#cboStock").val()
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
	    	        	
	    	        	$("#cboStock").val("");
	    	        	$("#cboCategories").val("");
					    $("#cboItem").val("");     
					    $("#txtEName").val("");         
					    $("#cboUnit").val("");    
					    $("#cboRate").val("");    
					    $("#txtStatus").val("");     
					    $("#txtDesc").val("");
					    $("#import_TYPE").val("");
					    $("#txtDate").val("");
					    
	    	        }
	    	    },
	    	    failure: function(errMsg) {
	    	        alert("Sorry plz try again");
	    	    }
	    	});
		}
		else{
			// alert("Incorrect");
		}
		
	});
	/* End of Save data into database ---------------------------------------------------------------------------------*/
	
	/* Validation Form  --------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				cboCategories : {
					required : true
				},
				cboItem : {
					required : true
				},
				cboUnit : {
					required : true
				},
				cboStock : {
					required : true
				},
				cboRate : {
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
	
	
	/* get data to combo box ----------------------------------------------------------------------------------------------*/
	function renderListComboBox() {
		var url = baseUrl + "api/procombocategorys";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.categories_NAME);
			    $('#cboCategories').append(option);
			});
		});
	}
	/* end of get data to combo box --------------------------------------------------------------------------------------*/

	/* get data to combo box ---------------------------------------------------------------------------------------------*/
	function renderListComboBoxUnit() {
		var url = baseUrl + "api/procombounits";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.unit_NAME);
			    $('#cboUnit').append(option);
			});
		});
	}
	/* end of get data to combo box -------------------------------------------------------------------------------------*/

	/* get data to combo box currency -----------------------------------------------------------------------------------*/
	function getComboBoxCurrency() {
		var url = baseUrl + "api/procombocurrencys";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.cur_NAME);
			    $('#cboRate').append(option);
			});
		});
	}
	/* end of get data to combo box currency ---------------------------------------------------------------------------*/

	/* get data to combo box -------------------------------------------------------------------------------------------*/
	function getComboBoxItem() {
		var categories_NAME = $("#cboCategories").val();
		var url = baseUrl + "api/procomboitems/" + categories_NAME;
		
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.cat_ITEM_NAME);
			    $('#cboItem').append(option);
			});
		});
	}
	/* end of get data to combo box ----------------------------------------------------------------------------------*/
	
});