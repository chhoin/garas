$(document).ready(function() {
	$('td:nth-child(10),th:nth-child(10)').hide();
	$('td:nth-child(11),th:nth-child(11)').hide();
	$('td:nth-child(12),th:nth-child(12)').hide();
	$('td:nth-child(13),th:nth-child(13)').hide();
	var url, invoiceNo, cateCode, prodCode, unitCode, curCode, cboInvoice, cboCategory, cboProduct, cboUnit, cboCcy, stockCode;
	var sum = 0, value = 0, getUnitVal;
	var casePrice, eachPrice, curSaleVal, coaCodeVal;
	var rowNum = 0, itemName, itemDest, categoryCode, itemCode;
	var supcapInvoiceNo, coaCode, typeItemUnit, itemUnitCode;
	
	// generated auto invoice sale 
	getGenerateAutoInvoiceReturn();
	
	// Get data combo of invoice
	getComboReturn();
	
	// Get data combo of category
	$("#cboInvoice").change(function() {
		var valGetInvoice = $("#cboInvoice").val();
		if(valGetInvoice == ""){
			$('#cboCategory option').remove();
			$("#cboCategory").append(new Option("ជ្រើសរើសប្រភេទទំនិញ", "smsShow"));
			$('#cboProduct option').remove();
			$("#cboProduct").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
		}else{
			$('#cboCategory option').remove();
			$("#cboCategory").append(new Option("ជ្រើសរើសប្រភេទទំនិញ", "smsShow"));
			$('#cboProduct option').remove();
			$("#cboProduct").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
			getComboCategory();
		}
    });
	
	// Get combo of product 
	// List<ReturntoHengpheaDto> getComboProduct(@Param("invoiceNo") String invoiceNo, @Param("cateCode") String cateCode);
	$("#cboCategory").change(function() {
		var valGetCategory = $("#cboCategory").val();
		if(valGetCategory == ""){
			$('#cboProduct option').remove();
			$("#cboProduct").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
		}else{
			$('#cboProduct option').remove();
			$("#cboProduct").append(new Option("ជ្រើសរើសឈ្មោះមុខទំនិញ", "smsShow"));
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
			getComboProduct();
		}
    });
	
	// Get data combo of unit
	// List<ReturntoHengpheaDto> getComboUnit(@Param("invoiceNo") String invoiceNo, @Param("cateCode") String cateCode, @Param("prodCode") String prodCode);
	$("#cboProduct").change(function() {
		var valGetProduct = $("#cboProduct").val();
		if(valGetProduct == ""){
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
		}else{
			$('#cboUnit option').remove();
			$("#cboUnit").append(new Option("ជ្រើសរើសឯកតា", "smsShow"));
			clearForm();
			$('textarea ').val('');
			getComboUnit();
		}
    });
	
	// Get data combo of information by invoice code
	$("#cboUnit").change(function() {
		var valGetUnit = $("#cboUnit").val();
		if(valGetUnit == ""){
			clearForm();
			$('textarea ').val('');
		}else{
			clearForm();
			$('textarea ').val('');
			getComboInfoByCode();
		}
    });
	
	// Get data combo of currency
	getComboCurrency();
	
	// save data into data base
	// Integer save(ReturntoHengpheaDto returntoHengpheaDto);
	
	// Calculate amount
	$('#txtUnitPrice').keyup(function () {
		calculateTotalPrice();
	});
	$('#txtUnitQty').keyup(function () {
		calculateTotalPrice();
	});
	
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
   
	/* Save data into database */
	$("#bSave").on("click", function(event){
		var isValid = validateForm();
		if ( isValid ){			
			//var getImportDateSale = moment($("#txtImportDate").val(), "DD-MM-YYYY");
			url = baseUrl + "api/returntohengpheasave";
			$("#table tr").each(function () {
		        var data = {};		        
		        	data.cmd = "I",
			        data.invoiceNo = $("#cboInvoice").val(),
			        data.cuscapInvoiceRefNo = $("#txtInvoice").val(),
			        data.cateCode = $(this).find("td:nth-child(10)").html(),
			        data.prodCode = $(this).find("td:nth-child(11)").html(),
			        data.unitCode = $(this).find("td:nth-child(12)").html(),
			        data.curCode = $("#cboCcy").val(),
			        data.qty = $(this).find("td:nth-child(6)").html(),
			        data.unitPrice = $(this).find("td:nth-child(7)").html(),
			        data.imptDesp = $("#txtNote").val(),
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
		        	$('input').val('').removeAttr('checked').removeAttr('selected');
		        	$('textarea ').val('');
		        	$('#table').empty();
	        });
		}
		else{
			// alert("No Completed Data");
		}
	});
	/* End of Save data into database */
	
	
	/* Validation Form  */
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		//alert($("#txtname").val());
		var validator = $form.validate({
			rules : {					
				txtInvoice : {
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
				txtStock : {
					required : true
				},
				txtTotalQty : {
					required : true
				},
				txtPhone : {
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
	function getComboReturn() {
		var url = baseUrl + "api/returntohengpheacomboinvoice";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoiceNo);
			    $('#cboInvoice').append(option);
			});
		});
	}
	
	//​ Get combo category by invoice code 
	function getComboCategory() {
		invoiceNo = $("#cboInvoice").val();
		var url = baseUrl + "api/returntohengpheacombocategory/" + invoiceNo;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.cateCode)
					  .text(customer.cateName);
			    $('#cboCategory').append(option);
			});
		});
	}
	
	//​ Get combo product by invoice code and category code 
	function getComboProduct() {
		invoiceNo = $("#cboInvoice").val();
		cateCode = $("#cboCategory").val();
		var url = baseUrl + "api/returntohengpheacomboproduct/" + invoiceNo + "," + cateCode;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.prodCode)
					  .text(customer.prodName);
			    $('#cboProduct').append(option);
			});
		});
	}
	
	// Get combo unit by invoice code, category code and product code
	function getComboUnit() {
		invoiceNo = $("#cboInvoice").val();
		cateCode = $("#cboCategory").val();
		prodCode = $("#cboProduct").val();
		var url = baseUrl + "api/returntohengpheacombounit/" + invoiceNo + "," + cateCode + "," + prodCode;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.unitCode)
					  .text(customer.unitName);
			    $('#cboUnit').append(option);
			});
		});
	}
	
	// Get data combo of information by invoice code
	function getComboInfoByCode() {
		invoiceNo = $("#cboInvoice").val();
		cateCode = $("#cboCategory").val();
		prodCode = $("#cboProduct").val();
		unitCode = $("#cboUnit").val();
		var url = baseUrl + "api/returntohengpheacomboinfo/" + invoiceNo + "," + cateCode + "," + prodCode + "," + unitCode;
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
			    $('#txtSupplierName').val(customer.suppKhName);
			    $('#txtPhone').val(customer.phone);
			    $('#txtAddress').val(customer.address);
			    $('#txtStock').val(customer.stockKhName);
			    $('#txtTotalQty').val(customer.stockRemain);
			    $('#txtUnitName').val(customer.unitName);
			    stockCode = customer.stockCode;
			});
		});
	}
	
	// Get data to combo currency
	function getComboCurrency() {
		var url = baseUrl + "api/returntohengpheacombocurrency";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.curCode)
					  .text(customer.curName);
			    $('#cboCcy').append(option);
			});
		});
	}
	
	// Get cuscapInvoiceNo
	function getGenerateAutoInvoiceReturn() {
		var getCuscapInvoiceNo;
		url = baseUrl + "api/returntohengpheaautonumber";
		$.get(url, function(users){
			$.each(users, function(index, user){
				getCuscapInvoiceNo = user.cuscapInvoiceRefNo;
				var data = [{"incrementingnumber":getCuscapInvoiceNo}];
				var segments = data[0].incrementingnumber.split('-');
				segments[1] = ("0000000" + (+segments[1] + 1)).slice(-7);
				$("#txtInvoice").val(segments.join('-'));
			});
		});
	}
	
	
	function clearForm(){
		$('#txtTotalQty').val("");
		$('#txtUnitPrice').val("");
		$('#txtUnitQty').val("");
		$('#txtTotalPrice').val("");
		$('#table').empty();
	}
	
	/* get data to combo box name and phone -----------------------------------------------------------------------------*/
	function getComboBoxName() {
		var invoice_NO = $("#cboInvoice").val();
		var url = baseUrl + "api/combosinfo/" + invoice_NO;
		// alert(url);
		$.get(url, function(users){
			var qty, unit_price, total_price;
			$.each(users, function(index, user){
				$('#txtType').val(user.categories_NAME);
				$('#txtItem').val(user.cat_ITEM_NAME);
				$('#txtSupplier').val(user.sup_NAME);
				$('#txtCcy').val(user.currency);
				$('#txtDate').val(moment(user.imported_DATE).format("DD-MM-YYYY"));
				$('#txtQTY').val(user.stock_REMAN);
				$('#txtUnitPrice').val(user.unit_PRICE);
				$('#txtUnit').val(user.unit_NAME);
				unit_price = user.unit_PRICE;
				qty = user.stock_REMAN;
				total_price = qty * unit_price;
				$('#txtTotalAmount').val(total_price);
				
			});
		});
	}
	
	// add data into table ----------------------------------------------------------------------------------------------------------------------------
	$("#btnAdd").on("click", function(event){
		$('td:nth-child(10),th:nth-child(10)').hide();
		$('td:nth-child(11),th:nth-child(11)').hide();
		$('td:nth-child(12),th:nth-child(12)').hide();
		$('td:nth-child(13),th:nth-child(13)').hide();
		
		if($('#txtTotalQty').val() <= 0 || $('#txtUnitPrice').val() <= 0 || $('#txtUnitQty').val() <= 0 || $('#txtTotalPrice').val() <= 0){
			alert("No Completed Data");
		}else{
			var getVal = $('#cboCategory').val();
			var getSaleVal = $('#cboProduct').val();
						
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
				cell13 = newRow.insertCell(12),
				
				rowNum = $('table tr:last').index() + 1;
				txtStock = document.getElementById("txtStock").value,
				cboCategory = $("#cboCategory option:selected").text(),
				cboProduct = $("#cboProduct option:selected").text(),
				cboUnit = $("#cboUnit option:selected").text(),
				txtUnitQty = document.getElementById("txtUnitQty").value,
				txtUnitPrice = document.getElementById("txtUnitPrice").value,
				txtTotalPrice = document.getElementById("txtTotalPrice").value;
				
				// alert(txtUnit);
				cell1.innerHTML = rowNum;
				cell2.innerHTML = txtStock;
				cell3.innerHTML = cboCategory;
				cell4.innerHTML = cboProduct;
				cell5.innerHTML = cboUnit;
				cell6.innerHTML = txtUnitQty;
				cell7.innerHTML = txtUnitPrice;
				cell8.innerHTML = txtTotalPrice;
				cell9.innerHTML = '<button type="button" class="btn-danger"> <span class="glyphicon glyphicon-trash"> </span> </button>';
				cell10.innerHTML = $("#cboCategory").val();
				cell11.innerHTML = $("#cboProduct").val();
				cell12.innerHTML = $("#cboUnit").val();
				cell13.innerHTML = stockCode;
				
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
		$('td:nth-child(10),th:nth-child(10)').hide();
		$('td:nth-child(11),th:nth-child(11)').hide();
		$('td:nth-child(12),th:nth-child(12)').hide();
		$('td:nth-child(13),th:nth-child(13)').hide();
	});
	// End of data into table 
	
	// Clear Form
	$("#btnReset").on("click", function(event){
		$('#txtTotalQty').val("");
		$('#txtUnitPrice').val("");
		$('#txtUnitQty').val("");
		$('#txtTotalPrice').val("");
		$('#table').empty();
	});
	
	// Deleted data table row
	$("#table").on("click",'.btn-danger', function(){
		// get amount from thml table
		value = $(this).closest('tr').children('td:eq(9)').text();
		// delete item on html table
		$(this).closest('tr').remove();
	});
	
});