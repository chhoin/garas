	
$(document).ready(function() {
	
	// get data combo
	 getDataComboBox();
	 
	// get combo box of item
	$( "#cboInvoice" ).change(function() {
		//alert("hello get amount");
		getComboBoxName();
    });
	
	// calculate amount 
    $('#txtTotal').keyup(function () {
    	calculateTotalPrice();
    });
    $('#txtPay').keyup(function () {      
    	calculateTotalPrice();
    });
	
	/*var d = new Date();
	var curr_date = d.getDate();
	var curr_month = d.getMonth() + 1;
	var curr_year = d.getFullYear();
	var input_date = curr_date + "-" + curr_month + "-" + curr_year;*/
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			// alert("correct");
			var url = baseUrl + "api/customerinvoices";
			var dob_invoice_DATE = moment($("#txtDate").val(), "DD-MM-YYYY");
			var dob_pay_OFF_DATE = moment($("#txtDateReturn").val(), "DD-MM-YYYY");
			
	    	var data = {
	    			    "invoice_NUMBER": $("#cboInvoice").val(),
						"invoice_DATE": dob_invoice_DATE,
						"pay_OFF_DATE": dob_pay_OFF_DATE,
						"total_AMOUNT": $("#txtTotal").val(),
						"payable_AMOUNT": $("#txtPay").val(),
						"input_NAME": "Admin",
						"desc": $("#txtDesc").val()
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
		       $("#cboInvoice").val("");
		       $("#txtCustomer").val("");
		       $("#txtPhone").val("");
		       $("#txtCcy").val("");
		       $("#txtDate").val("");
		       $("#txtDateReturn").val("");
		       $("#txtTotal").val("");
		       $("#txtPay").val("");
		       $("#txtAmount").val("");
		       $("#txtDesc").val("");
		}
		else{
			// alert("Incorrect");
		}
	});
	/* End of Save data into database -----------------------------------------------------------------------------------*/
	
	/* Validation Form  -------------------------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				cboInvoice : {
					required : true
				},
				txtCcy : {
					required : true
				},
				txtDate : {
					required : true
				},
				txtDateReturn : {
					required : true
				},
				txtTotal : {
					required : true
				},
				txtPay : {
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
	/* End of Validation Form ----------------------------------------------------------------------------------*/
	
	/* get data to combo box -----------------------------------------------------------------------------------*/
	function getDataComboBox() {
		var url = baseUrl + "api/combocusinvoice";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NUM);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
	
	/* get data to combo box name and phone -------------------------------------------------------------------*/
	function getComboBoxName() {
		var invoice_NUM = $("#cboInvoice").val();
		var url = baseUrl + "api/combocusname/" + invoice_NUM;
		
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtCustomer').val(user.cus_KH_NAME);
				$('#txtPhone').val(user.cus_PHONE);
				$('#txtCcy').val(user.ccy);
			});
		});
	}
	/* end of get data to combo box name and phone ---------------------------------------------------------------------*/
	
	/* function calulate price -----------------------------------------------------------------------------------------*/
	function calculateTotalPrice() {
	    var totalPrice = 0;
	    var total = $('#txtTotal').val();
	    var pay = $('#txtPay').val();
	    totalPrice = total - pay;
	    $("#txtAmount").val(totalPrice);
	 }
	 /* end of function calulate price ---------------------------------------------------------------------------------*/

	
	
});
