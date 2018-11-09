$(document).ready(function() {
	// get date from pc
	var today = new Date();
    var getDatePC = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear(); 
	
	// generated auto number for sale invoice
	renderListCusCapInvoiceNoCode();
	
	var url, custCode, custKhName, phone, villageCode, communeCode, districtCode, provinceCode, invoiceNo, prodCode;
	
	// Get cuscapInvoiceNo
	renderListCusCapInvoiceNoCode();
	
	//renderListCusCapInvoiceNoCode();
	/*$('td:nth-child(10),th:nth-child(10)').hide();
	$('td:nth-child(11),th:nth-child(11)').hide();
	$('td:nth-child(12),th:nth-child(12)').hide();*/
	
	var sum = 0, value = 0, getUnitVal;
	var casePrice, eachPrice, curSaleVal, coaCodeVal;
	var rowNum = 0, itemName, itemDest, categoryCode, itemCode;
	var supcapInvoiceNo, coaCode, typeItemUnit, itemUnitCode;
	
	// get combo ឈ្មោះអតិថិជន​ *** 
	renderComboCustomer();
	
	// get combo info ឈ្មោះអតិថិជន​ ***
	$("#cboCustomer").change(function() {
		var val = $("#cboCustomer").val();
		if(val == ""){
			$('#txtPhone').val("");
			$('#txtAddress').val("");
		}else{
			$('#txtPhone').val("");
			$('#txtAddress').val("");
			renderComboCustomerInfo();
		}
    });
	
	// get combo លេខវិក័យបត្រ ​ ***
	renderComboInvoiceImp();
	
	// get combo info លេខវិក័យបត្រ ​ ***
	$( "#cboInvoiceImp" ).change(function() {
		var getInvoiceImp = $("#cboInvoiceImp").val();
		if(getInvoiceImp == ""){
			$('#txtStock').val("");
			$('#cboProductCode option').remove();
			$("#cboProductCode").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
			$('#cboCategoryCode option').remove();
			$("#cboCategoryCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
		}else{
			$('#txtStock').val("");
			getComboInvoiceInfo();
			$('#cboProductCode option').remove();
			$("#cboProductCode").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));			
			$('#cboCategoryCode option').remove();
			$("#cboCategoryCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
			getComboCategoryByInvoiceImp();
		}
    });
	
	// get combo info លេខវិក័យបត្រ ​ ***
	$( "#cboCategoryCode" ).change(function() {
		var getCategoryCode = $("#cboCategoryCode").val();
		if(getCategoryCode == ""){
			$('#cboProductCode option').remove();
			$("#cboProductCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
		}else{
			$('#cboProductCode option').remove();
			$("#cboProductCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
			getComboProdTypeByInvoiceImp();
		}
    });
	
	// get combo ឯកតា ​ ***
	getComboUnit();
	
	// get combo ផ្លាកលេខឡាន ​ ***
	getCar();
	
	// get combo info ផ្លាកលេខឡាន ​ ***
	$("#cboCarNum").change(function() {
		var valCar = $("#cboCarNum").val();
		//alert(valCar);
		if(valCar == ""){
			$('#txtDriver').val("");
		}else{
			$('#txtDriver').val("");
			getCarInfo();
		}
    });
	
	// get combo រូបិយប័ណ្ណ
	renderComboCcy();
	
	// Calculate amount
	$('#txtUnitPrice').keyup(function () {
		calculateTotalPrice();
	});
	
	$('#txtUnitQty').keyup(function () {
		calculateTotalPrice();
	});
	// End of calculate amount
	
	// Calculate total amount sale
	$('#txtReceiveAmt').keyup(function () {
		calculateTotalSale();
		// $('#txtReceiveUsd').priceFormat({prefix: '',});
	});
	
	// add data into table ----------------------------------------------------------------------------------------------------------------------------
	$("#btnAdd").on("click", function(event){
		/*$('td:nth-child(10),th:nth-child(10)').hide();
		$('td:nth-child(11),th:nth-child(11)').hide();
		$('td:nth-child(12),th:nth-child(12)').hide();*/
		
		if($('#txtTotalPrice').val() < 0){
			alert("No Completed Data");
		}else{
			/*Sum Total Amount*/
			// sum amount total
			var amountNum = $('#txtTotalPrice').val().replace(',', ''); 
			sum += parseFloat(amountNum);
			
			// Amount as USD
			$('#txtTotalAmountUsd').val(parseFloat(sum).toFixed(2));
			$('#txtTotalAmountUsd').priceFormat({prefix: '',});
			
			$('#txtReceiveUsd').val("");
			//$('#txtReceiveUsd').priceFormat({prefix: '',});
			
			$('#txtOweUsd').val(parseFloat(sum).toFixed(2));
			$('#txtOweUsd').priceFormat({prefix: '',});
			
			// Amount as KHR
			var getTotakKhr = sum * curSaleVal;
			// alert(getTotakKhr);
			$('#txtTotalAmountKhr').val(parseFloat(getTotakKhr).toFixed(2));
			$('#txtTotalAmountKhr').priceFormat({prefix: '',});
			
			$('#txtReceiveKhr').val(0);
			$('#txtReceiveKhr').priceFormat({prefix: '',});
			
			$('#txtOweKhr').val(parseFloat(getTotakKhr).toFixed(2));
			$('#txtOweKhr').priceFormat({prefix: '',});
			/*End of sum total amount*/
			
			var getVal = $('#txtCategory').val();
			var getSaleVal = $('#cboSelectUnit').val();
						
			if (getVal != "" && getSaleVal != "") {
				var table = document.getElementById("table"), 
				newRow = table.insertRow(table.length),
				cell1 = newRow.insertCell(0),
				cell2 = newRow.insertCell(1),
				cell3 = newRow.insertCell(2),
				cell4 = newRow.insertCell(3),
				cell5 = newRow.insertCell(4),
				cell6 = newRow.insertCell(5),
				cell7 = newRow.insertCell(6),
				cell8 = newRow.insertCell(7),
				cell9 = newRow.insertCell(8),
				cell10 = newRow.insertCell(9),
				cell11 = newRow.insertCell(10),
				cell12 = newRow.insertCell(11),
				
				rowNum = $('table tr:last').index() + 1;
				txtStock = document.getElementById("txtStock").value,
				cboCategoryCode = $("#cboCategoryCode option:selected").text(),
				cboProductCode = $("#cboProductCode option:selected").text(),
				cboUnitCode = $("#cboUnitCode option:selected").text(),
				txtUnitQty = document.getElementById("txtUnitQty").value,
				txtUnitPrice = document.getElementById("txtUnitPrice").value,
				txtTotalPrice = document.getElementById("txtTotalPrice").value;
				
				// alert(txtUnit);
				cell1.innerHTML = rowNum;
				cell2.innerHTML = txtStock;
				cell3.innerHTML = cboCategoryCode;
				cell4.innerHTML = cboProductCode;
				cell5.innerHTML = cboUnitCode;
				cell6.innerHTML = txtUnitQty;
				cell7.innerHTML = txtUnitPrice;
				cell8.innerHTML = txtTotalPrice;
				cell9.innerHTML = '<button type="button" class="btn-danger"> <span class="glyphicon glyphicon-trash"> </span> </button>';
				cell10.innerHTML = $("#cboCategoryCode").val();
				cell11.innerHTML = $("#cboProductCode").val();
				cell12.innerHTML = $("#cboUnitCode").val();
				
				/*cell7.innerHTML = '<p data-placement="top" data-toggle="tooltip" title="Delete">' +
		                '<button type="button" class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
		                '<span class="glyphicon glyphicon-trash">' +
		                '</span>' +
		                '</button>' +
		                '</p>'*/
				
		    } else {
		    	alert("Please Select Data");
				// clearFormOk();
		    }
		}
		
		/*$('td:nth-child(10),th:nth-child(10)').hide();
		$('td:nth-child(11),th:nth-child(11)').hide();
		$('td:nth-child(12),th:nth-child(12)').hide();*/
	});
	// End of data into table -----------------------------------------------------------------------------------------------------------------------
	
	
	function clearFormOk(){
		//$("#cboInvoiceImp").append(new Option("ជ្រើសរើសលេខវិក័យបត្រ", "smsShow"));
		//$('#cboInvoiceImp option').remove();
		//$("#cboInvoiceImp").append(new Option("ជ្រើសរើសលេខវិក័យបត្រ", "smsShow"));
		//$("#cboInvoiceImp option:selected").text("ជ្រើសរើសលេខវិក័យបត្រ", "smsShow");
		$('#cboInvoiceImp').append("ជ្រើសរើសលេខវិក័យបត្រ");
		$('#txtStock').val("");
		$("#cboCategoryName").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
		$("#cboCategoryName").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
		$("#cboUnitCode").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
		$('#txtEcportDate').val("");
		$("#cboCcy").append(new Option("ជ្រើសរើសរូបិយប័ណ្ណ", "smsShow"));
		$('#txtUnitPrice').val("");
		$('#txtUnitQty').val("");
		$('#txtTotalPrice').val("");
	}
	
	// Deleted data table row
	$("#table").on("click",'.btn-danger', function(){
		// get amount from thml table
		value = $(this).closest('tr').children('td:eq(5)').text();
		
		// sum amount total
		var getValue = value.replace(',', ''); 
		
		// Amount as USD
		var getValueAmountUsd = $('#txtTotalAmountUsd').val().replace(',', ''); 
		var setValueAmountUsd = getValueAmountUsd - getValue;
		$('#txtTotalAmountUsd').val(parseFloat(setValueAmountUsd).toFixed(2));
		$('#txtTotalAmountUsd').priceFormat({prefix: '',});
		
		$('#txtReceiveUsd').val("");
		//$('#txtReceiveUsd').priceFormat({prefix: '',});
		
		$('#txtOweUsd').val(parseFloat(setValueAmountUsd).toFixed(2));
		$('#txtOweUsd').priceFormat({prefix: '',});
		
		// Amount as KHR
		var getTotakKhr = setValueAmountUsd * curSaleVal;
		// alert(getTotakKhr);
		$('#txtTotalAmountKhr').val(parseFloat(getTotakKhr).toFixed(2));
		$('#txtTotalAmountKhr').priceFormat({prefix: '',});
		
		$('#txtReceiveKhr').val(0);
		//$('#txtReceiveKhr').priceFormat({prefix: '',});
		
		$('#txtOweKhr').val(parseFloat(getTotakKhr).toFixed(2));
		$('#txtOweKhr').priceFormat({prefix: '',});
		
		// delete item on html table
		$(this).closest('tr').remove();
	});
		
	/* Save data into database */
	$("#bSave").on("click", function(event){
		// save data into table CustomerStockCapture
		var isValid = validateForm();
		if ( isValid ){
			var unitCode;
			url = baseUrl + "api/customercapturesave";
			var getExptDate = moment($("#txtSaleDate").val(), "DD-MM-YYYY");
			var getPayOffDate = moment($("#txtpayOffDate").val(), "DD-MM-YYYY");
			// var invoiceReceiveUsd = $("#txtReceiveUsd").val().replace(',', '');
			
			$("#table tr").each(function () {
		        var data = {};
		        	data.cmd = "EXP",
			        data.exptCode = $("#txtInvoiceOut").val(),
			        data.invoiceNo = $("#cboInvoiceImp").val(),
			        data.custCode = $("#cboCustomer").val(),
			        data.exptDate = getExptDate,
			        data.stockCode = "",
			        data.cateCode = $(this).find("td:nth-child(10)").html(),
			        data.prodCode = $(this).find("td:nth-child(11)").html(),
			        data.unitCode = $(this).find("td:nth-child(12)").html(),
			        data.curCode = $("#cboCcy").val(),
			        data.qty = $(this).find("td:nth-child(6)").html().replace(',', ''),
			        data.unitPrice = $(this).find("td:nth-child(7)").html().replace(',', ''),
			        data.carCode = $("#cboCarNum").val(),
			        data.driverName = $("#txtDriver").val(),
			        data.placePoint = $("#txtPoint").val(),
			        data.exptDesp = $("#txtNote").val(),
			        data.userCode = "USER-001",
			        data.payOffDate = getPayOffDate,
			        data.amount = $("#txtReceiveUsd").val()

			        if (typeof data.qty != "undefined") {
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
				    	        alert("Sorry plz try again");
				    	    }
				    	});
			        }
	        });
		}
		else{
			// alert("No Completed Data");
		}
		
		// save data into table tblPayment 
		if ( isValid ){
			if ($("#txtReceiveUsd").val() != -1) {
				url = baseUrl + "api/customercapturesave";
				var getExptDate = moment($("#txtSaleDate").val(), "DD-MM-YYYY");
				var getPayOffDate = moment($("#txtpayOffDate").val(), "DD-MM-YYYY");
		    	var data = {
			    			"cmd": "EXPPAY",
					        "exptCode": $("#txtInvoiceOut").val(),
					        "invoiceNo": "",
					        "custCode": "",
					        "exptDate": getExptDate,
					        "stockCode": "",
					        "cateCode": "",
					        "prodCode": "",
					        "unitCode": "",
					        "curCode": $("#cboCcy").val(),
					        "qty": 0,
					        "unitPrice": 0,
					        "carCode": "",
					        "driverName": "",
					        "placePoint": "",
					        "exptDesp": "",
					        "userCode": "USER-001",
					        "payOffDate": getPayOffDate,
					        "amount": $("#txtReceiveUsd").val()
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
			} else {
				// not do
			}
			// Clear Form
			$('input').val('').removeAttr('checked').removeAttr('selected');
			$('textarea ').val('');
			$("#table").empty();
			
			// generated auto number for sale invoice
			renderListCusCapInvoiceNoCode();
			
			// get combo ឈ្មោះអតិថិជន​ *** 
			$('#cboCustomer option').remove();
			$("#cboCustomer").append(new Option("ជ្រើសរើសឈ្មោះអតិថិជន", "smsShow"));	
			renderComboCustomer();
			
			$('#cboProductCode option').remove();
			$("#cboProductCode").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));	
			
			$('#cboCategoryCode option').remove();
			$("#cboCategoryCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
			
			// get combo ឯកតា ​ ***
			$('#cboUnitCode option').remove();
			$("#cboUnitCode").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			getComboUnit();
			
			// get combo ផ្លាកលេខឡាន ​ ***
			$('#cboCarNum option').remove();
			$("#cboCarNum").append(new Option("ជ្រើសរើសផ្លាកលេខឡាន", "smsShow"));
			getCar();
			
		}
		else{
			// alert("No Completed Data");
		}
	});
	/* End of Save data into database */
	
	
	/* Validation Form */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				txtInvoiceOut : {
					required : true
				},
				txtPhone : {
					required : true
				},
				txtStock : {
					required : true
				},
				txtSaleDate : {
					required : true
				},
				txtUnitPrice : {
					required : true
				},
				txtUnitQty : {
					required : true
				},
				txtTotalPrice : {
					required : true
				},
				txtReceiveUsd : {
					required : true
				},
				txtpayOffDate : {
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
	/* End of Validation Form */
	
	// get combo ឈ្មោះក្រុមហ៊ុន
	function renderComboCustomer() {
		var url = baseUrl + "api/customercapturecustomer";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.custCode)
					  .text(customer.custKhName);
			    $('#cboCustomer').append(option);
			});
		});
	}
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
	function renderComboCustomerInfo() {
		var getCustAddress;
		var custCode = $("#cboCustomer").val();
		var url = baseUrl + "api/customercapturecustomerinfo/" + custCode;
		$.get(url, function(users){
			$.each(users, function(index, user){				
				villageCode = user.villageCode;
				communeCode = user.communeCode;
				districtCode = user.districtCode;
				provinceCode = user.provinceCode;
				getCustAddress = villageCode + "," + communeCode + "," + districtCode + "," + provinceCode;
				$('#txtPhone').val(user.phone);
				$('#txtAddress').val(getCustAddress);
			});
		});
	}
	
	// get combo លេខវិក័យបត្រ ​ ***
	function renderComboInvoiceImp() {
		var url = baseUrl + "api/customercaptureinvoiceimp";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.invoiceNo)
					  .text(customer.invoiceNo);
			    $('#cboInvoiceImp').append(option);
			});
		});
	}
	
	// get combo info លេខវិក័យបត្រ ​ ***
	function getComboInvoiceInfo() {
		var invoiceNo = $("#cboInvoiceImp").val();
		var url = baseUrl + "api/customercaptureinvoiceimpinfo/" + invoiceNo;
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtStock').val(user.stockKhName);
			});
		});
	}
	
	// get combo ឈ្មោះមុខទំនិញ ​ by tblImport (invoiceNo) ***
	function getComboCategoryByInvoiceImp() {
		invoiceNo = $("#cboInvoiceImp").val();
		var url = baseUrl + "api/customercapturecategory/" + invoiceNo;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.cateCode)
					  .text(customer.cateName);
			    $('#cboCategoryCode').append(option);
			});
		});
	}
	
	// get combo Info ប្រភេទមុខទំនិញ   by tblImport (invoiceNo) ***
	function getComboProdTypeByInvoiceImp() {
		invoiceNo = $("#cboInvoiceImp").val();
		cateCode = $("#cboCategoryCode").val();
		var url = baseUrl + "api/customercaptureproduct/" + invoiceNo + "," + cateCode;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.prodCode)
					  .text(customer.prodName);
			    $('#cboProductCode').append(option);
			});
		});
	}
	
	// get combo ឯកតា ​ ***
	function getComboUnit() {
		var url = baseUrl + "api/customercaptureunit";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.unitCode)
					  .text(customer.unitName);
			    $('#cboUnitCode').append(option);
			});
		});
	}
	
	// get combo ផ្លាកលេខឡាន ​ ***
	function getCar() {
		var url = baseUrl + "api/customercapturecar";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.carCode)
					  .text(customer.carNum);
			    $('#cboCarNum').append(option);
			});
		});
	}
	
	// get combo info ផ្លាកលេខឡាន ​ ***
	function getCarInfo() {
		carCode = $("#cboCarNum").val();
		var url = baseUrl + "api/customercapturecarinfo/" + carCode;
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtDriver').val(user.driverName);
			});
		});
	}
	
	// get combo រូបិយប័ណ្ណ
	function renderComboCcy() {
		var url = baseUrl + "api/capturecomboccy";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.curCode)
					  .text(customer.curName);
			    $('#cboCcy').append(option);
			});
		});
	}
	
	// function calulate price
	function calculateTotalPrice() {
	    var totalPrice = 0;
	    var unitPrice = $('#txtUnitPrice').val().replace(',', '');
	    var qty = $('#txtUnitQty').val().replace(',', '');
	    // $('.LevelPrice').text($('.LevelPrice').text().replace(',', ''));
	    totalPrice = parseFloat(qty).toFixed(2) * parseFloat(unitPrice).toFixed(2);
	    $("#txtTotalPrice").val(parseFloat(totalPrice).toFixed(2));
	    $('#txtTotalPrice').priceFormat({prefix: '',});
	 }
	
	// function calulate price
	function calculateTotalSale() {
		// amount usd
		var totalAmountUsd = $('#txtTotalAmt').val().replace(',', '');
	    var totalReceiveUsd = $('#txtReceiveAmt').val().replace(',', '');
	    var totalOweUsd = 0;
	    totalOweUsd = totalAmountUsd - totalReceiveUsd;
	    $('#txtOweAmt').val(parseFloat(totalOweUsd).toFixed(2));
	    $('#txtOweAmt').priceFormat({prefix: '',});
	 }
	
	// Get cuscapInvoiceNo
	function renderListCusCapInvoiceNoCode() {
		var getCuscapInvoiceNo;
		var url = baseUrl + "api/customercaptureinvoicenocode";
		$.get(url, function(users){
			$.each(users, function(index, user){
				getCuscapInvoiceNo = user.cuscapInvoiceNo;
				var data = [{"incrementingnumber":getCuscapInvoiceNo}];
				var segments = data[0].incrementingnumber.split('-');
				segments[1] = ("0000000" + (+segments[1] + 1)).slice(-7);
				$("#txtInvoiceOut").val(segments.join('-'));
			});
		});
	}
	
	// btnReset
	$("#btnReset").on("click", function(event){
		$("#txtTotalAmountUsd").val("");
		$("#txtReceiveUsd").val("");
		$("#txtOweUsd").val("");
		$("#txtpayOffDate").val("");
		$('#table').empty();
	});
	
	// Function clear form after save
	function clrAfterSave(){
		$('input').val('').removeAttr('checked').removeAttr('selected');
		$('textarea ').val('');
		
		$('#cboCustomer option').remove();
		$("#cboCustomer").append(new Option("ជ្រើសរើសឈ្មោះអតិថិជន", "smsShow"));
		renderComboCustomer();
		
		$('#cboInvoiceImp option').remove();
		$("#cboInvoiceImp").append(new Option("ជ្រើសរើសលេខវិក័យបត្រ", "smsShow"));
		renderComboInvoiceImp();
		
		$('#cboProductCode option').remove();
		$("#cboProductCode").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
		getComboProdTypeByInvoiceImp();
		
		$('#cboCategoryCode option').remove();
		$("#cboCategoryCode").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
		getComboCategoryByInvoiceImp();
		
		$('#cboCcy option').remove();
		$("#cboCcy").append(new Option("ជ្រើសរើសរូបិយប័ណ្ណ", "smsShow"));
		renderComboCcy();
		
		$('#cboUnitCode option').remove();
		$("#cboUnitCode").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
		getComboUnit();
		
		$('#cboCarNum option').remove();
		$("#cboCarNum").append(new Option("ជ្រើសរើសផ្លាកលេខឡាន", "smsShow"));
		getCar();
		
		$('#table').empty();
		
		// generated auto number for sale invoice
		renderListCusCapInvoiceNoCode();
	}
	
	// Get cuscapInvoiceNo
	function renderListCusCapInvoiceNoCode() {
		var getCuscapInvoiceNo;
		var url = baseUrl + "api/customercaptureinvoicenocode";
		$.get(url, function(users){
			$.each(users, function(index, user){
				getCuscapInvoiceNo = user.cuscapInvoiceNo;
				var data = [{"incrementingnumber":getCuscapInvoiceNo}];
				var segments = data[0].incrementingnumber.split('-');
				segments[1] = ("0000000" + (+segments[1] + 1)).slice(-7);
				$("#txtInvoiceOut").val(segments.join('-'));
			});
		});
	}
	
	// Calculate total amount sale
	$('#txtReceiveUsd').keyup(function () {
		calculateTotalSale();
		// $('#txtReceiveUsd').priceFormat({prefix: '',});
	});
	
	// function calulate price
	function calculateTotalSale() {
		// amount usd
		var totalAmountUsd = $('#txtTotalAmountUsd').val().replace(',', '');
	    var totalReceiveUsd = $('#txtReceiveUsd').val().replace(',', '');
	    var totalOweUsd = 0;
	    totalOweUsd = totalAmountUsd - totalReceiveUsd;
	    $('#txtOweUsd').val(parseFloat(totalOweUsd).toFixed(2));
	    $('#txtOweUsd').priceFormat({prefix: '',});
	    
	    // amount khr
	    var totalReceiveKhr = totalReceiveUsd * curSaleVal;
	    $('#txtReceiveKhr').val(parseFloat(totalReceiveKhr).toFixed(2));
	    $('#txtReceiveKhr').priceFormat({prefix: '',});
	    
	    var totalOweKhr = totalOweUsd * curSaleVal;
	    $('#txtOweKhr').val(parseFloat(totalOweKhr).toFixed(2));
	    $('#txtOweKhr').priceFormat({prefix: '',});
	 }
	
});
