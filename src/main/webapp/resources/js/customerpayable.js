	
$(document).ready(function() {
	
	//alert("Hello customer payable show");
	
	// get data combo of invoice
	getDataComboBox();
	 
	// get combo box of item
	$( "#cboInvoice" ).change(function() {
		var cboInvVar = $("#cboInvoice").val();
		if (cboInvVar == ""){
			   $("#cboInvoice").val("");
		       $("#txtCustomer").val("");
		       $("#txtPhone").val("");
		       $("#txtDate").val("");
		       $("#cboCcy").val("");
		       $("#txtDateReturn").val("");
		       $("#txtTotalAmount").val("0");
		       $("#txtPay").val("0");
		       $("#txtBalance").val("0");
		       $("#txtDesc").val("");
		       $("#txtUnit").val("0");
		       $("#txtQty").val("0");
			   $("#txtQtyAmount").val("0");
		}
		else{
			getComboBoxName();
		}
    });
	
	// calculate amount 
    $('#txtTotalAmount').keyup(function () {
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
		//alert("hello customer payable");
		var isValid = validateForm();
		if ( isValid ){
			// alert("correct");
			var url = baseUrl + "api/customerpayables";
			var dob_invoice_DATE = moment($("#txtDate").val(), "DD-MM-YYYY");
			var dob_pay_OFF_DATE = moment($("#txtDateReturn").val(), "DD-MM-YYYY");
			
	    	var data = {
	    			    "invoice_NUM": $("#cboInvoice").val(),
		   				"currency": $("#cboCcy").val(),
		   				"pay_DATE": dob_invoice_DATE,
		   				"pay_NEW": dob_pay_OFF_DATE,
		   				"pay_AMOUNT": $("#txtPay").val(),
		   				"description": $("#txtDesc").val(),
		   				"inputter": "Admin"
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
		       $("#txtDate").val("");
		       $("#cboCcy").val("");
		       $("#txtDateReturn").val("");
		       $("#txtTotalAmount").val("");
		       $("#txtPay").val("");
		       $("#txtBalance").val("");
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
		var url = baseUrl + "api/combocustomerinvoicepay";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NUMBER);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
	
	/* get data to combo box name and phone -------------------------------------------------------------------*/
	function getComboBoxName() {
		var amount;
		var invoice_NUMBER = $("#cboInvoice").val();
		var url = baseUrl + "api/combocuspayname/" + invoice_NUMBER;
		//alert (url);
		
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtCustomer').val(user.cus_KH_NAME);
				$('#txtPhone').val(user.cus_PHONE);
				$('#cboCcy').val(user.currency);
				$('#txtTotalAmount').val(user.reciveable_FCY);
				$("#txtPay").val("0");
				$('#txtBalance').val(user.reciveable_FCY);
				
				$("#txtUnit").val(user.unit_price);
				$("#txtQty").val(user.qty);
				
				amount = (user.qty) * (user.unit_price);
				$("#txtQtyAmount").val(amount);
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
	
	/* function calulate price -----------------------------------------------------------------------------------------*/
	function calculateTotalPrice() {
	    var totalPrice = 0;
	    var total = $('#txtTotalAmount').val();
	    var pay = $('#txtPay').val();
	    totalPrice = total - pay;
	    $("#txtBalance").val(totalPrice);
	 }
	 /* end of function calulate price ---------------------------------------------------------------------------------*/
});
