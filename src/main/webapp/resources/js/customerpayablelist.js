$(document).ready(function() {
	//alert("Hello ");
	
	// get Combo box Invoice of customer_invoice
	getComboCustomerInvoice();
	
	// get Combo box Name and phone of customers
	getCustomerNamePhone();
	
	// show all data from database
	renderUserList();
	
	/* 
	* get data all from data base 
	* with no conditions
	*/
	function renderUserList() {
		var url = baseUrl + "api/customerpayablelists";
		// alert(url);
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(	
					$("<td>").text(user.autoNUM)
				).append(
					$("<td>").text(user.payId)
				).append(
					$("<td>").text(user.invoiceNumber)
				).append(
					$("<td>").text(user.customerName)
				).append(
					$("<td>").text(user.phone)
				).append(
					$("<td>").text(user.addres)
				).append(
					$("<td>").text(user.statusPay)
				).append(
					$("<td>").text(moment(user.invoiceDate).format("DD-MM-YYYY"))
				).append(
					$("<td>").text(user.totalCostFcy)
				).append(
					$("<td>").text(user.totalCostLcy)
				).append(
					$("<td>").text(user.currency)
				).append(
					$("<td>").text(user.exchangeRate)
				).append(
					$("<td>").text(user.payAmountFcy)
				).append(
					$("<td>").text(user.payAmountLcy)
				).append(
					$("<td>").text(moment(user.payDate).format("DD-MM-YYYY"))
				).append(
					$("<td>").text(user.dest)
				).append(
					$("<td>").text(user.inputer)
				).append(
					$("<td>").text(moment(user.inputDate).format("DD-MM-YYYY"))
				)/*.append(
					      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
					                '<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
					                '<span class="glyphicon glyphicon-trash">' +
					                '</span>' +
					                '</button>' +
					                '</p>')
					    )*/;
				
				/*
				.append(
						
					      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
					                '<button type="button" id="btnEEdit" class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >' +
					                '<span class="glyphicon glyphicon-pencil">' +
					                '</span>' +
					                '</button>' +
					                '</p>')
					    );
					     */
				
						
						    
				
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	/* end of get data all from data base ----------------------------------------------------------------------*/
	
	$("#btnSearch").on("click", function(event){
		var p_F_DATE = $("#txtFDate").val();
		var p_T_DATE = $("#txtTDate").val();
		var p_INVOICE_NO = $("#cboInvoice").val();
		var p_CUS_NAME = $("#cboCustomer").val();
		var p_CUS_PHONE = $("#cboPhone").val();
		
		var url = baseUrl + "api/getsearchcuspaylists/" + p_F_DATE + "," + p_T_DATE + "," + p_INVOICE_NO + "," + p_CUS_NAME + "," + p_CUS_PHONE;
		//alert(url);
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(	
						$("<td>").text(user.autoNUM)
					).append(
						$("<td>").text(user.payId)
					).append(
						$("<td>").text(user.invoiceNumber)
					).append(
						$("<td>").text(user.customerName)
					).append(
						$("<td>").text(user.phone)
					).append(
						$("<td>").text(user.addres)
					).append(
						$("<td>").text(user.statusPay)
					).append(
						$("<td>").text(moment(user.invoiceDate).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.totalCostFcy)
					).append(
						$("<td>").text(user.totalCostLcy)
					).append(
						$("<td>").text(user.currency)
					).append(
						$("<td>").text(user.exchangeRate)
					).append(
						$("<td>").text(user.payAmountFcy)
					).append(
						$("<td>").text(user.payAmountLcy)
					).append(
						$("<td>").text(moment(user.payDate).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.dest)
					).append(
						$("<td>").text(user.inputer)
					).append(
						$("<td>").text(moment(user.inputDate).format("DD-MM-YYYY"))
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
	});
	/* get data all from data base ---------------------------------------------------------------------------------------------*/
	
	
	/* get combo of invoice customer_invoice -----------------------------------------------------------------------------------*/
	function getComboCustomerInvoice() {
		var url = baseUrl + "api/getcombocustomerinvoices";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NUM);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get combo of invoice customer_invoice ----------------------------------------------------------------------------*/
	
	/* get data to combo box ---------------------------------------------------------------------------------------------------*/
	function getCustomerNamePhone() {
		var url = baseUrl + "api/getcustomernamephone";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var name = $('<option />');
				var phone = $('<option />');
			    name.attr('value', this.value).text(user.cus_KH_NAME);
			    phone.attr('value', this.value).text(user.cus_PHONE);
			    $('#cboCustomer').append(name);
			    $('#cboPhone').append(phone);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
});