$(document).ready(function() {
	//alert("Hello ");
	
	// get Combo box Invoice of customer_invoice
	getComBoReturnProFitLoss();
	
	// Search data from database 
	$("#btnSearch").on("click", function(event){
		var p_DATE_FROM = $("#txtFDate").val();
		var p_DATE_TO = $("#txtTDate").val();
		var p_INVOICE_NO = $("#cboInvoice").val();
		
		var url = baseUrl + "api/getsearchreturnprofitlos/" + p_DATE_FROM + "," + p_DATE_TO + "," + p_INVOICE_NO;
		//alert(url);
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(	
						$("<td>").text(user.invoice_NO)
					).append(
						$("<td>").text(moment(user.imported_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.sup_NAME)
					).append(
						$("<td>").text(user.categories_NAME)
					).append(
						$("<td>").text(user.cat_ITEM_NAME)
					).append(
						$("<td>").text(user.unit_NAME)
					).append(
						$("<td>").text(user.import_TYPE)
					).append(
						$("<td>").text(user.ccy)
					).append(
						$("<td>").text(user.total_SOURCE)
					).append(
						$("<td>").text(user.invoice_NUMBER)
					).append(
						$("<td>").text(moment(user.invoice_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.cus_NAME)
					).append(
						$("<td>").text(user.sex)
					).append(
						$("<td>").text(user.phone)
					).append(
						$("<td>").text(user.address)
					).append(
						$("<td>").text(user.qty)
					).append(
						$("<td>").text(user.import_PRICE)
					).append(
						$("<td>").text(user.total_AMOUNT_IMPORT)
					).append(
						$("<td>").text(user.export_PRICE)
					).append(
						$("<td>").text(user.total_AMOUNT_EXPORT)
					).append(
						$("<td>").text(user.gain_LOSS_AMOUNT)
					);
					
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	});
	/* get data all from data base ---------------------------------------------------------------------------------------------*/
	
	
	/* get combo of invoice customer_invoice -----------------------------------------------------------------------------------*/
	function getComBoReturnProFitLoss() {
		var url = baseUrl + "api/getcomboreturnprofitloss";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NO);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get combo of invoice customer_invoice ----------------------------------------------------------------------------*/
	
	
});