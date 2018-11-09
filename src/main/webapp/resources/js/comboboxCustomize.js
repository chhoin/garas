/**
 * @author tha.bunsath 
 */

$(document).ready(function() {
	comboBoxCustomer();
	comboBoxProductType();
	comboBoxProductName();
	comboBoxNumInputProduct();
	comboBoxCurency();
	comboBoxStock();
	
	/*=============== value change ================= */
/*	function comboBoxNumInputProduct() {
		var url = baseUrl + "api/comboBoxNumInputProducts";
		$.get(url, function(captuers){
			$.each(captuers, function(index, captuer){
				var option = $('<option />');
			    alert(captuer.entries_NUM);
			    option.attr('value', this.value).text(captuer.impt_TYPE);
			    $('#cboNumberInputItem').append(option);
			});
		});
	}*/
	function comboBoxNumInputProduct() {
		var url = baseUrl + "api/comboBoxNumInputProducts";
		$.get(url, function(captuers){
			$.each(captuers, function(index, captuer){
				  $('#cboNumberInputItem').append($("<option></option>")
		                    .attr("value",captuer.import_NUM)
		                    .text(captuer.impt_TYPE));
			});
		});
	}

	/*
	 * read data comBoxProductType
	 */
	function comboBoxProductType() {
		var url = baseUrl + "api/categoryscombos";
		$.get(url, function(categories){
			$.each(categories, function(index, category){
				/*var option = $('<option />');
				  option.attr('value', this.value).text(category.categories_NAME);
			    $('#cboProductType').append(option);*/
				  $('#cboProductType').append($("<option></option>")
		                    .attr("value",category.categories_CODE)
		                    .text(category.categories_NAME));
			});
		});
	}
	function comboBoxProductName() {

		var url = baseUrl + "api/comboboxItems";
		$.get(url, function(itemDtos){
			$.each(itemDtos, function(index, itemDto){
				/*alert(itemDto.cat_ITEM_CODE);*/
				  $('#cboProductName').append($("<option></option>")
		                    .attr("value",itemDto.cat_ITEM_CODE)
		                    .text(itemDto.cat_ITEM_NAME));
			});
		});
	}
	/**
	 * 
	 * @returns
	 */
	function comboBoxCurency() {
	var url = baseUrl + "api/customerCaptureCurrency";
	$.get(url, function(users){
		$.each(users, function(index, user){
			  $('#cboCurrency1').append($("<option></option>")
		                    .attr("value",user.cur_BUY)
		                    .text(user.cur_NAME)); 
			  $('#cboCurrencyRecieved').append($("<option></option>")
	                    .attr("value",user.cur_BUY)
	                    .text(user.cur_NAME)); 
		});
	});
} 
/**
 * Add cboCustomer
 */
	function comboBoxCustomer() {
		var url = baseUrl + "api/customers";
		$.get(url, function(customerDtos){
			$.each(customerDtos, function(index, customerDto){
				  $('#cboCustomer').append($("<option></option>")
			                    .attr("value",customerDto.cus_ID)
			                    .text(customerDto.cus_KH_NAME));  
			});
		});
	}
/**
 * Add cboStockNumber
 */
/*	function comboBoxStock() {
		var url = baseUrl + "api/suppliers";
		$.get(url, function(supplierDtos){
			$.each(supplierDtos, function(index, supplierDto){
				  $('#cboStockNumber').append($("<option></option>")
			                    .attr("value",supplierDto.sup_ID)
			                    .text(supplierDto.sup_NAME));  
			});
		});
	}*/
/*	function comboBoxStock() {
		var url = baseUrl + "api/comboBoxStockCurrent";
		$.get(url, function(supplierDtos){
			$.each(supplierDtos, function(index, supplierDto){
				  $('#cboStockNumber').append($("<option></option>")
			                    .attr("value",supplierDto.st_ID)
			                    .text(supplierDto.import_TYPE));  
			});
		});
	}*/
/*============== Value Change ============================= */
});
