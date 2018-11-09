$(document).ready(function() {
	var url, supcapInvoiceNo, fromDate, toDate, statusAmt, invoiceNo, suppCode, phone, currentPage, numPerPage;
	
	// get date from pc
	var today = new Date();
    var formattedtoday = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();
	
	// get combo of លេខវិក័យបត្រ
	getComboBoxInvoiceNo();
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	getComboBoxSupplierCode();
	
	// get combo of លេខទូរស័ព្ទ
	getComboBoxSupplierPhone();
	
	// get combo of លេខវិក័យបត្រ
	function getComboBoxInvoiceNo() {
		var url = baseUrl + "api/supplierinvoicelistinvoiceno";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.invoiceNo)
					  .text(customer.invoiceNo);
			    $('#cboInvoice').append(option);
			});
		});
	}
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	function getComboBoxSupplierCode() {
		var url = baseUrl + "api/supplierinvoicelistsuppliercode";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.suppCode)
					  .text(customer.suppKhName);
			    $('#cboSupplier').append(option);
			});
		});
	}
	
	// get combo of លេខទូរស័ព្ទ
	function getComboBoxSupplierPhone() {
		var url = baseUrl + "api/supplierinvoicelistphone";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.phone)
					  .text(customer.phone);
			    $('#cboPhone').append(option);
			});
		});
	}
	
	// Get data to Message Box
	$(document).on("shown.bs.modal", function (event) {
		// alert($(this).children("td:nth-child(3)").text());
		$('table tbody tr').click(function(){
			$("#txtInvoice").val($(this).children("td:nth-child(2)").text());
			$("#txtTotalKhr").val($(this).children("td:nth-child(9)").text());
			$("#txtOweUsd").val($(this).children("td:nth-child(9)").text());

			// $("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
			
			// Search history pay
			invoiceNo = $(this).children("td:nth-child(2)").text();
			url = baseUrl + "api/supplierinvoicelisthistorypay/" + invoiceNo;
			renderListSupplierPayment();
			
			// Search list of products 
			invoiceNo = $(this).children("td:nth-child(2)").text();
			url = baseUrl + "api/supplierinvoicelistproductlist/" + invoiceNo;
			renderListProducts();
		});
	})
	
	/* Search Products List */
	function renderListProducts() {
		$tblCusCaptures = $("#tblCusCaptures");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoNum)
				).append(
					$("<td>").text(customer.invoiceNo)
				).append(
					$("<td>").text(customer.stockKhName)
				).append(
					$("<td>").text(customer.cateName)
				).append(
					$("<td>").text(customer.prodName)
				).append(
					$("<td>").text(customer.unitName)
				).append(
					$("<td>").text(customer.exchRate)
				).append(
					$("<td>").text(customer.qty)
				).append(
					$("<td>").text(customer.unitPrice)
				).append(
					$("<td>").text(customer.totalAmt)
				).append(
					$("<td>").text(customer.imptDesp)
				).append(
					$("<td>").text(customer.userName)
				).append(
					$("<td>").text(customer.entryDate)
				);
				
				trCustomers.push($trcustomer);
			});
			$tblCusCaptures.html(trCustomers);
		});
	}
	/* End of Search Products List */
	
	/* Search Payment List */
	function renderListSupplierPayment() {
		$tblCustomersPays = $("#tblCustomersPays");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoNum)
				).append(
					$("<td>").text(customer.invoiceNo)
				).append(
					$("<td>").text(customer.payDate)
				).append(
					$("<td>").text(customer.curName)
				).append(
					$("<td>").text(customer.exchRate)
				).append(
					$("<td>").text(customer.amount)
				).append(
					$("<td>").text(customer.userName)
				).append(
					$("<td>").text(customer.entryDate)
				);
				
				trCustomers.push($trcustomer);
			});
			$tblCustomersPays.html(trCustomers);
		});
	}
	/* End of Search Payment List */
	
	/* search data from data base */
	$("#btnSearch").on("click", function(event){		
		/*var fdate = moment($("#txtFrom").val(), "DD-MM-YYYY");*/
		var isValidSearch = validateFormSearch();
		fromDate = $("#txtFrom").val();
		toDate = $("#txtTo").val();
		statusAmt = $("#cboStatus").val();
		invoiceNo = $("#cboInvoice").val();
		suppCode = "";		
		phone = "";
		currentPage = 1; 
		numPerPage = 500;
		if ( isValidSearch ){			
			url = baseUrl + "api/supplierinvoicelistsearch/" + fromDate + "," + toDate + "," + statusAmt + "," + invoiceNo + "," + suppCode + "," + phone + "," + currentPage + "," + numPerPage;
			searchSupplierInvoice();
		}
		else{
			// alert("Incorrect");
		}
	});
	
	function searchSupplierInvoice(){
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.autoNum)
					).append(
						$("<td>").text(user.invoiceNo)
					).append(
						$("<td>").text(user.oweStatus)
					).append(
						$("<td>").text(user.imptDate)
					).append(
						$("<td>").text(user.suppKhName)
					).append(
						$("<td>").text(user.phone)
					).append(
						$("<td>").text(user.totalAmt)
					).append(
						$("<td>").text(user.receiveAmt)
					).append(
						$("<td>").text(user.oweAmt)
					).append(
						$("<td>").text(user.userName)
					).append(
						$("<td>").text(user.entryDate)
					).append(
						      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
						                '<button type="button" id="btnEEdit" class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >' +
						                '<span class="glyphicon glyphicon-pencil">' +
						                '</span>' +
						                '</button>' +
						                '</p>')					                
						    ).append(
						      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
						                '<button type="button" class="btn btn-primary btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
						                '<span class="glyphicon glyphicon-pencil">' +
						                '</span>' +
						                '</button>' +
						                '</p>')
						    ).append(
								      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Add">' +
						                '<button type="button" class="btn btn-primary btn-xs" data-title="Add" data-toggle="modal" data-target="#add" >' + 
						                '<span class="glyphicon glyphicon-pencil">' +
						                '</span>' +
						                '</button>' +
						                '</p>')
					);
				
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	
	/* Save data into database customer payment */
	$("#btnSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){
			/*alert("correct");*/
			var url = baseUrl + "api/supplierinvoicelists";
			var getPayDate = moment($("#txtDatePay").val(), "DD-MM-YYYY");			
	    	var data = {
						"invoiceNo": $("#txtInvoice").val(),
						"payDate": getPayDate,
						"amount": $("#txtAmountReceived").val(),
						"curCode": $("#cboCcy").val(),
						"userCode": "USER-001",
						"payStatus": "SUPPLIER"
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
	    		$("#txtInvoice").val("");
			    $("#cboCcy").val("");
			    $("#txtDatePay").val("");
			    $("#txtTotalKhr").val("");
			    $("#txtAmountReceived").val("");
			    $("#txtOweUsd").val("");
		}
		else{
			// alert("Incorrect");
		}
	});
	
	/* Validation form search  */
	function validateFormSearch() {
		var $form = $("#myformsearch");
		$form.removeData('validator');
		// alert("myform");
		var validator = $form.validate({
			rules : {					
				txtFrom : {
					required : true
				},
				txtTo : {
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
	
	/* Validation Form  */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		// alert("myform");
		var validator = $form.validate({
			rules : {					
				txtInvoice : {
					required : true
				},
				txtDatePay : {
					required : true
				},
				txtAmountReceived : {
					required : true
				},
				cboCcy : {
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
	/* End of Validation Form ------------------------------------------------------------------------*/
	
	// Calculate payment of amount received
	$('#txtAmountReceived').keyup(function () {
		calculatePaymentPrice();
	});
	
	// function calculate price
	function calculatePaymentPrice() {
		var valTotalAmount = $('#txtTotalKhr').val().replace(/[USD$, ]/g, '');
		var valAmountReceived = $('#txtAmountReceived').val();
		var valOweUsd = 0;
		valOweUsd = valTotalAmount - valAmountReceived;
		var getOweUsd = 'USD ' + valOweUsd.toFixed(2).replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,");
		$('#txtOweUsd').val(getOweUsd);
	 }
	
});