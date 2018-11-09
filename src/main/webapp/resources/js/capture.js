$(document).ready(function() {
	// get date from pc
	var today = new Date();
    var getDatePC = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear(); 
	
	//renderListCusCapInvoiceNoCode();
	// For hide columns name of tables
	$('td:nth-child(8),th:nth-child(8)').hide();
	$('td:nth-child(9),th:nth-child(9)').hide();
	$('td:nth-child(10),th:nth-child(10)').hide();
	
	// Declare variables 
	var rowNum = 0, sum = 0, value = 0, getUnitVal, casePrice, eachPrice, curSaleVal, coaCodeVal, itemName, itemDest, categoryCode, itemCode, supcapInvoiceNo, coaCode, typeItemUnit, itemUnitCode;
	var txtCategory, cboSelectUnit,	txtUnitQty, txtUnitPrice, txtTotalPrice;
	
	// get combo ឈ្មោះក្រុមហ៊ុន
	renderComboSuppCompany();
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
	$("#cboCompanyName").change(function() {
		var val = $("#cboCompanyName").val();
		if(val == ""){
			$('#txtSupplierName').val("");
		}else{
			$('#txtSupplierName').val("");
			renderComboSuppName();
		}
    });
	
	// Get combo of car number 
	renderComboCarNumber();
	
	// Get combo of driver name by car code 
	$("#cboCar").change(function() {
		var val = $("#cboCar").val();
		if(val == ""){
			$('#cboDriver option').remove();
			$("#cboDriver").append(new Option("ជ្រើសរើសឈ្មោះអ្នកបើកបរ", "smsShow"));
		}else{
			$('#cboDriver option').remove();
			$("#cboDriver").append(new Option("ជ្រើសរើសឈ្មោះអ្នកបើកបរ", "smsShow"));
			renderComboDriverName();
		}
    });
	
	// got combo ឈ្មោះមុខទំនិញ
	renderComboCategory();
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
	$( "#cboProductName" ).change(function() {
		$('#cboProductType option').remove();
		$("#cboProductType").append(new Option("ជ្រើសរើសប្រភេទមុខទំនិញ", "smsShow"));
		renderComboCategoryInfo();
    });
	
	// get combo ឯកតា
	renderComboUnit();
	
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
	$('#txtReceiveUsd').keyup(function () {
		calculateTotalSale();
		// $('#txtReceiveUsd').priceFormat({prefix: '',});
	});
	
	// refresh page
	$("#btnRefresh").on("click", function(event){
		// alert("refresh page");
		// $("#table").empty();
	});
	
	// add data into table
	$("#btnAdd").on("click", function(event){
		// Hide columns name of table jsp
		$('td:nth-child(8),th:nth-child(8)').hide();
		$('td:nth-child(9),th:nth-child(9)').hide();
		$('td:nth-child(10),th:nth-child(10)').hide();
		
		if($('#txtInvoice').val() == "" || $('#txtTotalPrice').val() == 0){
			// alert("No Completed Data");
		}else{
			// sum amount total
			var amountNum = $('#txtTotalPrice').val().replace(',', ''); 
			sum += parseFloat(amountNum);
			
			// Amount as USD
			$('#txtTotalAmountUsd').val(parseFloat(sum).toFixed(2));
			$('#txtTotalAmountUsd').priceFormat({prefix: '',});
			$('#txtReceiveUsd').val("");
			/*$('#txtReceiveUsd').priceFormat({prefix: '',});*/
			$('#txtOweUsd').val(parseFloat(sum).toFixed(2));
			$('#txtOweUsd').priceFormat({prefix: '',});
			/*End of sum total amount*/
			
			//if (getVal != "" && getSaleVal != "") {
			if($('#txtTotalPrice').val() != 0){
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
				
				rowNum = $('table tr:last').index() + 1;
				//txtCategory = document.getElementById("cboCategoryType").value,cboCategoryType
				txtCategory = $("#cboProductType option:selected").text(),
				cboSelectUnit = $("#cboUnit option:selected").text(),
				txtUnitQty = document.getElementById("txtUnitQty").value,
				txtUnitPrice = document.getElementById("txtUnitPrice").value,
				txtTotalPrice = document.getElementById("txtTotalPrice").value;
				
				// alert(txtUnit);
				cell1.innerHTML = rowNum;
				cell2.innerHTML = txtCategory;
				cell3.innerHTML = cboSelectUnit;
				cell4.innerHTML = txtUnitQty;
				cell5.innerHTML = txtUnitPrice;
				cell6.innerHTML = txtTotalPrice;
				cell7.innerHTML = '<button type="button" class="btn-danger"> <span class="glyphicon glyphicon-trash"> </span> </button>';
				cell8.innerHTML = $("#cboProductName").val();
				cell9.innerHTML = $("#cboUnit").val();
				cell10.innerHTML = $("#cboProductType").val();
				
				/*cell7.innerHTML = '<p data-placement="top" data-toggle="tooltip" title="Delete">' +
	                '<button type="button" class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
	                '<span class="glyphicon glyphicon-trash">' +
	                '</span>' +
	                '</button>' +
	            '</p>'*/
				
				//clearFormOk();
				
		    } else {
		    	alert("Please Select Data");
				clearFormOk();
		    }
		}
		
		// Hide coumns of tables
		$('td:nth-child(8),th:nth-child(8)').hide();
		$('td:nth-child(9),th:nth-child(9)').hide();
		$('td:nth-child(10),th:nth-child(10)').hide();
	});
	// End of data into table
	
	// add data into table ----------------------------------------------------------------------------------------------------------------------------
	$("#bPrint").on("click", function(event){
		var invoiceNo = $("#txtInvoice").val();
		var curCode = $("#cboCurCode").val();
		var url = baseUrl + "api/capturesearchprint/" + invoiceNo + "," + curCode;
		
		$tblUsers = $("#tblCustomersPays");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(
						$("<td>").text(user.autoNum)
					).append(
						$("<td>").text(user.prodName)
					).append(
						$("<td>").text(user.unitName)
					).append(
						$("<td>").text(user.qty)
					).append(
						$("<td>").text(user.unitPrice)
					).append(
						$("<td>").text(user.totalAmt)
					);
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	});
	// End of data into table -----------------------------------------------------------------------------------------------------------------------
	
	function clearFormOk(){
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
		////$('#txtReceiveUsd').priceFormat({prefix: '',});
		
		$('#txtOweUsd').val(parseFloat(setValueAmountUsd).toFixed(2));
		$('#txtOweUsd').priceFormat({prefix: '',});
		// delete item on html table
		$(this).closest('tr').remove();
	});
		
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		// save data into table tblImport
		var isValid = validateForm();
		var getImportDate = moment($("#txtImportDate").val(), "DD-MM-YYYY");
		
		if ( isValid ){
			var unitCode;
			var url = baseUrl + "api/captures";
			
			$("#table tr").each(function () {
		        var data = {};		        
		        	data.cmd = "I",
			        data.invoiceNo = $("#txtInvoice").val(),
			        data.suppCode = $("#cboCompanyName").val(),
			        data.stockCode = $("#cboStock").val(),
			        data.cateCode = $(this).find("td:nth-child(8)").html(),
			        data.prodCode = $(this).find("td:nth-child(10)").html(),
			        data.unitCode = $(this).find("td:nth-child(9)").html(),
			        data.curCode = $("#cboCurCode").val(),
			        data.qty = $(this).find("td:nth-child(4)").html().replace(',', ''),
			        data.unitPrice = $(this).find("td:nth-child(5)").html().replace(',', ''),
			        data.totalAmt = $(this).find("td:nth-child(6)").html().replace(',', ''),
			        data.payOffDate = getImportDate,
			        data.imptDesp = $("#txtNote").val(),
			        data.carCode = $("#cboCar").val(),
			        data.userCode = "USER-001"

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
				    	        alert("failure");
				    	    } 
				    	});
			        }
	        });
		}
		else{
			// alert("No completed data");
		}
		
		// save data into table import Payment (tblPayment)
		if ( isValid ){
			var url = baseUrl + "api/saveimportpayment";
			var paymentDate = moment($("#txtpayOffDate").val(), "DD-MM-YYYY");
			var getReceiveUsd = $("#txtReceiveUsd").val().replace(',', '');
	    	var data = {
					   "invoiceNo": $("#txtInvoice").val(),
					   "payDate": paymentDate,
					   "amount": getReceiveUsd,
					   "curCode": $("#cboCurCode").val(),
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
		}
		else{
			// alert("No completed data");
		}		
		// Clear Form	
		clearForm();
	});
	
	/* Validation Form */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				txtInvoice : {
					required : true
				},
				txtSupplierName : {
					required : true
				},
				txtUnitPriceIn : {
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
				},
				txtUnitPrice : {
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
	/* End of Validation Form ---------------------------------------------------------------------------------------------------------------*/
	
	// get combo ឈ្មោះក្រុមហ៊ុន
	function renderComboSuppCompany() {
		var url = baseUrl + "api/capturecombosupplier";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.suppCode)
					  .text(customer.companyName);
			    $('#cboCompanyName').append(option);
			});
		});
	}
	
	// got combo ឈ្មោះមុខទំនិញ
	function renderComboCategory() {
		var url = baseUrl + "api/capcombocategories";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.cateCode)
					  .text(customer.cateName);
			    $('#cboProductName').append(option);
			});
		});
	}
	
	// Get combo car number 
	function renderComboCarNumber() {
		var url = baseUrl + "api/capcombocarnumber";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.carCode)
					  .text(customer.carNum);
			    $('#cboCar').append(option);
			});
		});
	}
	
	// Get combo of driver name by car code 
	function renderComboDriverName() {
		var carCode = $("#cboCar").val();
		var url = baseUrl + "api/capturecombodrivername/" + carCode;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.driverName)
					  .text(customer.driverName);
			    $('#cboDriver').append(option);
			});
		});
	}
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
	function renderComboSuppName() {
		var suppCode = $("#cboCompanyName").val();
		var url = baseUrl + "api/capturecombosuppinfo/" + suppCode;
		$.get(url, function(users){
			$.each(users, function(index, user){
				$('#txtSupplierName').val(user.suppKhName);
			});
		});
	}
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
	function renderComboCategoryInfo() {
		cateCode = $("#cboProductName").val();
		var url = baseUrl + "api/capcombocategoriesinfo/" + cateCode;
		// alert(url);
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.prodCode)
					  .text(customer.prodName);
			    $('#cboProductType').append(option);
			});
		});
	}
	
	// get combo ឯកតា
	function renderComboUnit() {
		var unitType = "wholesale";
		var url = baseUrl + "api/capturecomunit/" + unitType;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.unitCode)
					  .text(customer.unitName);
			    $('#cboUnit').append(option);
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
			    $('#cboCurCode').append(option);
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
	
	function clearForm(){
		$("#cboCompanyName").val($("#target option:first").val()).change();
		$("#cboCar").val($("#target option:first").val()).change();
		$("#cboDriver").val($("#target option:first").val()).change();
		$("#cboProductName").val($("#target option:first").val()).change();
		$("#cboProductType").val($("#target option:first").val()).change();
		$("#cboUnit").val($("#target option:first").val()).change();
		$("#cboStock").val($("#target option:first").val()).change();
		$("#cboCurCode").val($("#target option:first").val()).change();
		$('input').val('').removeAttr('checked').removeAttr('selected');
		$('textarea ').val('');	
		$("#table").empty();
	}
	
	// Clear select imported
	$("#btnReset").on("click", function(event){
		$("#cboProductName").val($("#target option:first").val()).change();
		$("#cboProductType").val($("#target option:first").val()).change();
		$("#cboUnit").val($("#target option:first").val()).change();
		$("#cboStock").val($("#target option:first").val()).change();
		$("#cboCurCode").val($("#target option:first").val()).change();
		$('#txtImportDate').val("");
		$('#txtNote').val("");
		$('#txtUnitPrice').val("");
		$('#txtUnitQty').val("");
		$('#txtTotalPrice').val("");
		$('#txtTotalAmountUsd').val("");
		$('#txtReceiveUsd').val("");
		$('#txtOweUsd').val("");
		$('#txtpayOffDate').val("");
		$("#table").empty();
	});
	
});
