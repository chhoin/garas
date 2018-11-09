$(document).ready(function() {
	// get date from pc
	var today = new Date();
    var getDatePC = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear(); 
    
	var url, fromDate, toDate, exptCode, custCode, phone, cateCode, currentPage, numPerPage;
	
	// get combo លេខវិក័យបត្រ
	getComboInvoiceExp();
	
	// get combo ឈ្មោះអតិថិជន
	getComboCustomerName();
	
	// get combo លេខទូរស័ព្ទ
	getComboCustomerPhone();
	
	// Load data from database 
	/*fromDate = "2018-01-01";
	toDate = "2019-04-30";
	slptCode = "";
	custCode = "";
	phone = "";
	cateCode = "";
	currentPage = 1;
	numPerPage = 5;
	url = baseUrl + "api/customerstockcapturelistsearch/" + fromDate + "," + toDate + "," + slptCode + "," + custCode + "," + phone + "," + cateCode + "," + currentPage + "," + numPerPage;
	renderListCustomerCapture();*/
	
	// get combo លេខវិក័យបត្រ
	function getComboInvoiceExp() {
		var url = baseUrl + "api/customercapturelistinvoiceexp";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.exptCode)
					  .text(customer.exptCode);
			    $('#cboInvoiceExp').append(option);
			});
		});
	}
	
	// get combo ឈ្មោះអតិថិជន
	function getComboCustomerName() {
		var url = baseUrl + "api/customercapturelistcustomername";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.custCode)
					  .text(customer.custKhName);
			    $('#cboCustomer').append(option);
			});
		});
	}
	
	// get combo of លេខទូរស័ព្ទ
	function getComboCustomerPhone() {
		var url = baseUrl + "api/customercapturelistcustomerphone";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.phone)
					  .text(customer.phone);
			    $('#cboPhone').append(option);
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
	
	/* search data from data base */
	$("#btnSearch").on("click", function(event){	
		var isValid = validateForm();
		/*var fdate = moment($("#txtFrom").val(), "DD-MM-YYYY");*/
		fromDate = $("#txtFrom").val();
		toDate = $("#txtTo").val();
		exptCode = $("#cboInvoiceExp").val();
		custCode = $("#cboCustomer").val();
		phone = $("#cboPhone").val();
		cateCode = "";
		currentPage = 1; 
		numPerPage = 500;
		
		if ( isValid ){		
			url = baseUrl + "api/customercapturelistsearch/" + fromDate + "," + toDate + "," + exptCode + "," + custCode + "," + phone + "," + cateCode + "," + currentPage + "," + numPerPage;
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
						$("<td>").text(user.exptCode)
					).append(
						$("<td>").text(user.exptDate)
					).append(
						$("<td>").text(user.custKhName)
					).append(
						$("<td>").text(user.phone)
					).append(
						$("<td>").text(user.villageCode)
					).append(
						$("<td>").text(user.communeCode)
					).append(
						$("<td>").text(user.districtCode)
					).append(
						$("<td>").text(user.provinceCode)
					).append(
						$("<td>").text(user.stockKhName)
					).append(
						$("<td>").text(user.cateName)
					).append(
						$("<td>").text(user.prodName)
					).append(
						$("<td>").text(user.unitName)
					).append(
						$("<td>").text(user.exchRate)
					).append(
						$("<td>").text(user.qty)
					).append(
						$("<td>").text(user.unitPrice)
					).append(
						$("<td>").text(user.totalAmt)
					).append(
						$("<td>").text(user.payOffDate)
					).append(
						$("<td>").text(user.carNum)
					).append(
						$("<td>").text(user.driverName)
					).append(
						$("<td>").text(user.placePoint)
					).append(
						$("<td>").text(user.exptDesp)
					).append(
						$("<td>").text(user.userName)
					).append(
						$("<td>").text(user.entryDate)
					)/*.append(
						$("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
				                '<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
				                '<span class="glyphicon glyphicon-trash">' +
				                '</span>' +
				                '</button>' +
				                '</p>')
				    )*/;
				
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
	
});