$(document).ready(function() {
	//alert("hello Supplier Payable");
	$("#txtPay").val("0");
	$("#txtBalance").val("0");
	
	/* get data to combo box invoice */
	getComboBoxSupplierInvoice();
	
	// get combo box of currency
	//getComboBoxCurrency();
	
	// get combo box of item
	$( "#cboInvoice" ).change(function() {
		var cboInvVar = $("#cboInvoice").val();
		if (cboInvVar == ""){
			$('#txtSupplier').val("");
			$('#txtPhone').val("");
			$('#cboCcy').val("");
			$('#txtTotalAmount').val("");
			$('#txtDate').val("");
			$('#txtDateReturn').val("");
			$('#txtDesc').val("");
			$('#txtBalance').val("0");
			$('#txtPay').val("0");
			$("#txtUnit").val("");
			$("#txtQty").val("");
			$("#txtQtyAmount").val("");
		}
		else{
			//alert("hello get amount");
			getComboBoxAmount();
		}
    });
	
	/*$("#txtTotal").val(0);
	$("#txtPay").val(0);*/
	
   // calculate amount 
   $('#txtTotalAmount').keyup(function () {
	   calculateTotalPrice();
   });
   $('#txtPay').keyup(function () {      
	   calculateTotalPrice();
   });
		
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			//alert("Correct");
			var url = baseUrl + "api/supplierpayables";
	    	var dobDate = moment($("#txtDate").val(), "DD-MM-YYYY");
	    	var dob_NEW = moment($("#txtDateReturn").val(), "DD-MM-YYYY");
	    	
	    	var data = {
	        		"invoice_NUM": $("#cboInvoice").val(),
	        		"currency": $("#cboCcy").val(),
	        		"pay_DATE": dobDate,
	        		"pay_NEW": dob_NEW,
	        		"pay_AMOUNT_FCY": $("#txtPay").val(),
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
	    			// $this.dialog("close");
	    	    },
	    	    failure: function(errMsg) {
	    	        alert("Sorry plz try again");
	    	    }
	    	});
	    	
	    	$("#cboInvoice").val("");
	    	$("#txtSupplier").val("");
	    	$("#txtPhone").val("");
	    	$("#txtDate").val("");
	    	$("#cboCcy").val("");
	    	$("#txtDateReturn").val("");
	    	$("#txtTotalAmount").val("");
	    	$("#txtPay").val("");
	    	$("#txtBalance").val("");
	    	$("#txtDesc").val("");
	    	$("#txtUnit").val("");
			$("#txtQty").val("");
			$("#txtQtyAmount").val("");
		}
		else{
			// alert("Incorrect");
		}
	});
	/* End of Save data into database ----------------------------------------------------------------------------------------------------------*/
	
	/* Validation Form  ------------------------------------------------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		
		var validator = $form.validate({
			rules : {					
				cboInvoice : {
					required : true
				},
				txtDate : {
					required : true
				},
				txtPay : {
					required : true
				},
				cboCcy : {
					required : true
				},
				txtBalance : {
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
	/* End of Validation Form ------------------------------------------------------------------------------------------*/
	
	/* get data to combo box currency -----------------------------------------------------------------------------------*/
	function getComboBoxSupplierInvoice() {
		var url = baseUrl + "api/comboinvoice";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NO);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get data to combo box currency ---------------------------------------------------------------------------*/
	
	/* get data to combo box item --------------------------------------------------------------------------------------*/
	function getComboBoxAmount() {
		var amount;
		var invoice_NO = $("#cboInvoice").val();
		var url = baseUrl + "api/comboamount/" + invoice_NO;
		
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtSupplier').val(user.sup_NAME);
				$('#txtPhone').val(user.sup_TEL);
				$('#cboCcy').val(user.currency);
				$('#txtTotalAmount').val(user.recivable_FCY);
				$("#txtPay").val("0");
				$("#txtBalance").val(user.recivable_FCY);
				
				$("#txtUnit").val(user.unit_price);
				$("#txtQty").val(user.qty);
				
				amount = (user.qty) * (user.unit_price);
				$("#txtQtyAmount").val(amount);
				
			});
		});
	}
	/* end of get data to combo box currency ----------------------------------------------------------------------------*/
	
	
	/* function calulate price -----------------------------------------------------------------------------------------*/
	function calculateTotalPrice() {
	    var vAmount = 0;
	    var vPay = $('#txtPay').val();
	    var vTotal = $('#txtTotalAmount').val();
	    vAmount =  vTotal - vPay;
	    $("#txtBalance").val(vAmount);
	 }
	 /* end of function calulate price ---------------------------------------------------------------------------------*/
	
	/* get data to combo box currency -----------------------------------------------------------------------------------*/
	function getComboBoxCurrency() {
		var url = baseUrl + "api/combocurrency";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.cur_NAME);
			    $('#cboCcy').append(option);
			});
		});
	}
	/* end of get data to combo box currency ---------------------------------------------------------------------------*/
	
	
});