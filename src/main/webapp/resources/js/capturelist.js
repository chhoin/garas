$(document).ready(function() {
	
	var url, fromDate, toDate, invoiceNo, suppCode, phone, cateCode, status, currentPage, numPerPage;
	
	// get combo of លេខវិក័យបត្រ
	getComboBoxInvoiceNo();
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	getComboBoxSupplierCode();
	
	// get combo of លេខទូរស័ព្ទ
	getComboBoxSupplierPhone();
	
	// get combo of ឈ្មោះមុខទំនិញ
	getComboBoxCategoryCode();
	
	// Get data to Message Box
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			/*$("#txtAcntCode").val($(this).children("td:nth-child(2)").text());*/
			
			var txtInvoiceSupName = $(this).children("td:nth-child(5)").text();
			$("label[for='txtInvoiceSupName']").text(txtInvoiceSupName);
			
			var txtInvoicePhone = $(this).children("td:nth-child(6)").text();
			$("label[for='txtInvoicePhone']").text(txtInvoicePhone);
			
			var txtInvoiceInvoiceNo = $(this).children("td:nth-child(2)").text();
			$("label[for='txtInvoiceInvoiceNo']").text(txtInvoiceInvoiceNo);
			
			var txtInvoiceDate = $(this).children("td:nth-child(3)").text();
			$("label[for='txtInvoiceDate']").text(txtInvoiceDate);
			
			var txtStock = $(this).children("td:nth-child(7)").text();
			$("label[for='txtStock']").text(txtStock);
			
			var invoiceInvoiceNo = $(this).children("td:nth-child(2)").text();
			invoiceNo = invoiceInvoiceNo;
			
			url = baseUrl + "api/capturelistprintimport/" + invoiceNo;
			// Show Print invoice
			renderListPrintReports();
			
		});
	})
	
	/* get print invoice -----------------------------------------------------------------------*/
	function renderListPrintReports() {
		$tblCustomers = $("#tblCustomersInvoice");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoNum)
				).append(
					$("<td>").text(customer.cateName)
				).append(
					$("<td>").text(customer.prodName)
				).append(
					$("<td>").text(customer.unitName)
				).append(
					$("<td>").text(customer.qty)
				).append(
					$("<td>").text(customer.unitPrice)
				).append(
					$("<td>").text(customer.totalAmt)
				);
				trCustomers.push($trcustomer);
			});
			$tblCustomers.html(trCustomers);
		});
	}
	
	// get combo of លេខវិក័យបត្រ
	function getComboBoxInvoiceNo() {
		var url = baseUrl + "api/capturelistinvoiceno";
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
		var url = baseUrl + "api/capturelistsuppliercode";
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
		var url = baseUrl + "api/capturelistphone";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.phone)
					  .text(customer.phone);
			    $('#cboPhone').append(option);
			});
		});
	}
	
	// get combo of ឈ្មោះមុខទំនិញ
	function getComboBoxCategoryCode() {
		var url = baseUrl + "api/capturelistcategory";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.cateCode)
					  .text(customer.cateName);
			    $('#cboCategory').append(option);
			});
		});
	}
	
	/*$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtname").val($(this).children("td:nth-child(2)").text());
			$("#txtsale").val($(this).children("td:nth-child(3)").text());
			$("#txtbuy").val($(this).children("td:nth-child(4)").text());
			$("#txtmiddle").val($(this).children("td:nth-child(5)").text());
		});
	})*/
	
	// Show default data from database
	fromDate = "2018-06-01";
	toDate = "2019-12-31";
	invoiceNo = $("#cboInvoice").val();
	suppCode = "";
	phone = "";		
	cateCode = "";
	status = "";
	currentPage = 1; 
	numPerPage = 5;
	url = baseUrl + "api/supcaptursearch/" + fromDate + "," + toDate + "," + invoiceNo + "," + suppCode + "," + phone + "," + cateCode + "," + status + "," + currentPage + "," + numPerPage;
	renderListSearchSupplierCapture();
	
	/* search data from data base */
	$("#btnSearch").on("click", function(event){
		var isValid = validateForm();
		/*var fdate = moment($("#txtFrom").val(), "DD-MM-YYYY");*/
		fromDate = $("#txtFrom").val();
		toDate = $("#txtTo").val();
		invoiceNo = $("#cboInvoice").val();
		suppCode = "";
		phone = "";		
		cateCode = "";
		status = $("#cboType").val();
		currentPage = 1; 
		numPerPage = 500;
		if ( isValid ){		
			url = baseUrl + "api/supcaptursearch/" + fromDate + "," + toDate + "," + invoiceNo + "," + suppCode + "," + phone + "," + cateCode + "," + status + "," + currentPage + "," + numPerPage;
			renderListSearchSupplierCapture();
		}
		else{
			// alert("No completed data");
		}
	});
	
	function renderListSearchSupplierCapture(){
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.autoNum)
					).append(
						$("<td>").text(user.invoiceNo)
					).append(
						$("<td>").text(user.imptDate)
					).append(
						$("<td>").text(user.status)
					).append(
						$("<td>").text(user.suppKhName)
					).append(
						$("<td>").text(user.phone)
					).append(
						$("<td>").text(user.stockKhName)
					).append(
						$("<td>").text(user.cateName)
					).append(
						$("<td>").text(user.prodName)
					).append(
						$("<td>").text(user.unitName)
					).append(
						$("<td>").text(user.stockUse)
					).append(
						$("<td>").text(user.stockRemain)
					).append(
						$("<td>").text(user.qty)
					).append(
						$("<td>").text(user.unitPrice)
					).append(
						$("<td>").text(user.totalAmt)
					).append(
						$("<td>").text(user.carNum)
					).append(
						$("<td>").text(user.driverName)
					).append(
						$("<td>").text(user.imptDesp)
					).append(
						$("<td>").text(user.userName)
					).append(
						$("<td>").text(user.entryDate)
					).append(
						$("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
				                '<button type="button" class="btn btn-primary btn-xs" data-title="Delete" data-toggle="modal" data-target="#edit" >' + 
				                '<span class="glyphicon icon-printer">' +
				                '</span>' +
				                '</button>' +
				                '</p>')
					);
				
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	
	/* Validation Form */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
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
	
	// Export data into excel file 
	$("#btnExportExcel").on("click", function(event){
		/*var url = baseUrl + "api/capturelistexcel/" + invoiceNo;
		alert(url);
		$.get(url, function(data){
			
		});*/
	});
	
	// Print directly 
	$("#btnPrintNow").on("click", function(event){
		alert("Will coming soon!");
	});
	
});