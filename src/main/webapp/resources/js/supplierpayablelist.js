$(document).ready(function() {
	//alert("Hello ");
	
	// get Combo box of Invoice
	getComboInvSupPayList();
	
	// get Combo box Name of Supplier
	getComboNameSupPayList();
	
	/*
	 * show all data from database
	 */
	renderUserList();
	
	/* 
	* get data all from data base 
	* with no conditions
	*/
	function renderUserList() {
		var url = baseUrl + "api/supplierpayablelists";
		//alert(url);
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(	
					$("<td>").text(user.auto_NUM)
				)/*.append(
					$("<td>").text(user.pay_ID)
				)*/.append(
					$("<td>").text(user.invoice_NUM)
				).append(
					$("<td>").text(user.sup_NAME)
				).append(
					$("<td>").text(user.sup_TEL)
				).append(
					$("<td>").text(user.sup_ADD)
				).append(
					$("<td>").text(user.status_PAY)
				).append(
					$("<td>").text(moment(user.invoice_DATE).format("DD-MM-YYYY"))
				).append(
					$("<td>").text(user.total_COST_FCY)
				).append(
					$("<td>").text(user.total_COST_LCY)
				).append(
					$("<td>").text(user.currency)
				).append(
					$("<td>").text(user.exchange_RATE)
				).append(
					$("<td>").text(user.pay_AMOUNT_FCY)
				).append(
					$("<td>").text(user.pay_AMOUNT_LCY)
				).append(
					$("<td>").text(moment(user.pay_DATE).format("DD-MM-YYYY"))
				).append(
					$("<td>").text(user.description)
				).append(
					$("<td>").text(user.inputter)
				).append(
					$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
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
		//alert("Hello Search");
		var p_From_Date = $("#txtFDate").val();
		var p_Date_To = $("#txtTDate").val();
		var p_invoice_NO = $("#cboInvoice").val();
		var p_Sup_Name = $("#cboSupplier").val();
		
		var url = baseUrl + "api/searchsuppaylists/" + p_From_Date + "," + p_Date_To + "," + p_invoice_NO + "," + p_Sup_Name ;
		//alert(url);
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(	
						$("<td>").text(user.auto_NUM)
					)/*.append(
						$("<td>").text(user.pay_ID)
					)*/.append(
						$("<td>").text(user.invoice_NUM)
					).append(
						$("<td>").text(user.sup_NAME)
					).append(
						$("<td>").text(user.sup_TEL)
					).append(
						$("<td>").text(user.sup_ADD)
					).append(
						$("<td>").text(user.status_PAY)
					).append(
						$("<td>").text(moment(user.invoice_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.total_COST_FCY)
					).append(
						$("<td>").text(user.total_COST_LCY)
					).append(
						$("<td>").text(user.currency)
					).append(
						$("<td>").text(user.exchange_RATE)
					).append(
						$("<td>").text(user.pay_AMOUNT_FCY)
					).append(
						$("<td>").text(user.pay_AMOUNT_LCY)
					).append(
						$("<td>").text(moment(user.pay_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.description)
					).append(
						$("<td>").text(user.inputter)
					).append(
						$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
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
	/* get data all from data base ------------------------------------------------------------------------------*/
	
	
	/* get data to combo box -----------------------------------------------------------------------------------*/
	function getComboInvSupPayList() {
		var url = baseUrl + "api/getcomboinvsuppaylists";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.invoice_NO);
			    $('#cboInvoice').append(option);
			});
		});
	}
	/* end of get data to combo box ----------------------------------------------------------------------------*/
	
	/* get data to combo box -----------------------------------------------------------------------------------*/
	function getComboNameSupPayList() {
		var url = baseUrl + "api/getcombonamesuppaylists";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.sup_NAME);
			    $('#cboSupplier').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
});