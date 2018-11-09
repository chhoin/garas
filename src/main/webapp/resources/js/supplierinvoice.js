$(document).ready(function() {
	// alert("hello supplier invoice");
	$("#txtTotal").val(0);
	$("#txtPay").val(0);
	
	// get combo box invoice
	getComboBoxInvoiceNo();
	
	// get combo box of item
	$( "#txtInvoice" ).change(function() {
		var cboInvVar = $("#txtInvoice").val();
		if (cboInvVar == ""){
			$('#txtSupplier').val("");
			$('#txtPhone').val("");
			$('#txtCcy').val("");
			$('#txtTotal').val("0");
			$('#txtAmount').val("0");
			$('#txtPay').val("0");
			$('#txtDateReturn').val("");
			$('#txtDate').val("");
			$('#txtCategory').val("");
			$('#txtUnit').val("");
			$('#txtQty').val("");
		}
		else{
			getComboBoxName();
		}
    });
	
   // calculate amount 
   $('#txtTotal').keyup(function () {
	   calculateTotalPrice();
   });
   $('#txtPay').keyup(function () {      
	   calculateTotalPrice();
   });
		
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			// alert("Correct");
			var url = baseUrl + "api/supplierinvoices";
	    	var dobDate = moment($("#txtDate").val(), "DD-MM-YYYY");
	    	var dobDateRet = moment($("#txtDateReturn").val(), "DD-MM-YYYY");
	    	
	    	var data = {
	        		"invoice_NO": $("#txtInvoice").val(),
	        		"invoice_DATE": dobDate,
	        		"payable_DATE": dobDateRet,
	        		"total_COST_LCY": $("#txtTotal").val(),
	        		"payable_LCY": $("#txtPay").val(),
	        		"user_CODE": "Admin",
	        		"description": $("#txtDesc").val()
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
	    	
	    	$("#txtInvoice").val("");
	    	$("#txtSupplier").val("");
    		$("#txtPhone").val("");
    		$("#txtCcy").val("");
    		$("#txtDate").val("");
    		$("#txtDateReturn").val("");
    		$("#txtTotal").val("");
    		$("#txtPay").val("");
    		$("#txtAmount").val("");
    		$("#txtDesc").val("");
    		$('#txtCategory').val("");
			$('#txtUnit').val("");
			$('#txtQty').val("");
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
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtInvoice : {
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
	/* End of Validation Form ------------------------------------------------------------------------------------------*/
	
	/* function calulate price -----------------------------------------------------------------------------------------*/
	function calculateTotalPrice() {
	    var vAmount = 0;
	    var vPay = $('#txtPay').val();
	    var vTotal = $('#txtTotal').val();
	    vAmount =  vTotal - vPay;
	    $("#txtAmount").val(vAmount);
	 }
	 /* end of function calulate price ---------------------------------------------------------------------------------*/
	
	/* get data to combo box currency -----------------------------------------------------------------------------------*/
	function getComboBoxInvoiceNo() {
		var url = baseUrl + "api/comboinvoiceno";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NO);
			    $('#txtInvoice').append(option);
			});
		});
	}
	/* end of get data to combo box currency ---------------------------------------------------------------------------*/
	
	/* get data to combo box name and phone ----------------------------------------------------------------------------*/
	function getComboBoxName() {
		var amount;
		var invoice_NO = $("#txtInvoice").val();
		//alert(invoice_NO);
		var url = baseUrl + "api/combosupname/" + invoice_NO;
		//alert(url);
		
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtSupplier').val(user.sup_NAME);
				$('#txtPhone').val(user.sup_TEL);
				$('#txtCcy').val(user.currency);
				
				$('#txtCategory').val(user.categories_NAME);
				$('#txtUnit').val(user.unit_PRICE);
				$('#txtQty').val(user.qty);
				
				amount = (user.qty) * (user.unit_PRICE);
				//alert(amount);
				$('#txtTotal').val(amount);
				$('#txtAmount').val(amount);
			});
			//alert(invoiceCode);
		});
	}
	/* end of get data to combo box name and phone ---------------------------------------------------------------------*/
});