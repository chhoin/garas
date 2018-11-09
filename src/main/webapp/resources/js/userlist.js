/* Document Ready ---------------------------------------------------------------------------------------*/
$(document).ready(function() {
	var url;
	var userCode = "all";
	
	// Get data combo of userName
	renderGetComboUserName();
	
	// List of data from database
	url = baseUrl + "api/userlists/" + userCode;
	renderGetSearchUserByName();
	
	// Get data to Message Box
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			/*$("#txtEditCode").val($(this).children("td:nth-child(1)").text());*/
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation  ---------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		userCode = $("#cboUserCode").val();
		url = baseUrl + "api/userlists/" + userCode;
		
		renderGetSearchUserByName();
	 });
	/* end of search operation  --------------------------------------------------------------------------*/
	
	/* get data all from data base -----------------------------------------------------------------------*/
	function renderGetSearchUserByName() {
		// var url = baseUrl + "api/chartaccountlists";
		// $("<td>").text(moment(customer.cus_DOB).format("DD-MM-YYYY"))
		$tblCustomers = $("#tblCustomers");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoNum)
				).append(
					$("<td>").text(customer.userCode)
				).append(
					$("<td>").text(customer.userName)
				).append(
					$("<td>").text(customer.firstName)
				).append(
					$("<td>").text(customer.lastName)
				).append(
					$("<td>").text(customer.phone)
				).append(
					$("<td>").text(customer.address)
				)/*.append(
				      $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
				                '<button type="button" id="btnEEdit" class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >' +
				                '<span class="glyphicon glyphicon-pencil">' +
				                '</span>' +
				                '</button>' +
				                '</p>')
				)*/.append(
					  $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
				                '<button type="button" class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
				                '<span class="glyphicon glyphicon-trash">' +
				                '</span>' +
				                '</button>' +
				                '</p>')
			    );
				
				trCustomers.push($trcustomer);
			});
			$tblCustomers.html(trCustomers);
		});
	}
	/* end of get data all from data base ---------------------------------------------------------------------*/
	
	
	/* get data to combo box name province  -------------------------------------------------------------------*/
	function renderGetComboUserName() {
		var url = baseUrl + "api/userlistcomboname";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.userCode)
					  .text(customer.userName);
			    $('#cboUserCode').append(option);
			});
		});
	}
	/* end of get data to combo box province ------------------------------------------------------------------*/
	
	/*delete data ---------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var userCode = $("label[for='myalue']").text();
		var url = baseUrl + "api/userlistsdelete/" + userCode;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){			    				    
			    	// show data from database
			    	userCode = "";
			    	renderAccountList();
			    	// get data combo
			    	// $('#cboPart option').remove();
			    	// rendergetChartAccountListComboPart();
			    	
			    	//$(this).dialog("close");
			    	$(this).closest('.ui-dialog-content').dialog('close');
			    }
			});
	 });
	/*End of delete data --------------------------------------------------------------------------------------*/
	
	/*Edit data ------------------------------------------------------------------------------------------*/
	$("#btnEdit").on("click", function() {
		var $this = $(this);
    	var url = baseUrl + "api/chartaccountlists/" + $("#txtEditCode").val();
    	var data = {
				 "garagePrice": $("#txtEditGaras").val(),
		   		 "casePrice": $("#txtEditCase").val(),
				 "eachPrice": $("#txtEditEach").val()
    	};
    	$.ajax({
    	    type: "PUT",
    	    url: url,
    	    data: JSON.stringify(data),
    	    contentType: "application/json; charset=utf-8",
    	    dataType: "json",
    	    success: function(response){
    	    	$("#txtEditCode").val("");
    	    	$("#txtEditPart").val("");
				$("#txtEditDest").val("");
				$("#txtEditName").val("");
				$("#txtEditUsd").val("");
				$("#txtEditGaras").val("");
				$("#txtEditCase").val("");
				$("#txtEditEach").val("");
				
				renderAccountList();
    	    },
    	    failure: function(errMsg) {
    	        alert("Sorry plz try again");
    	    }
    	});
	 });
	/*End of edit data -------------------------------------------------------------------------------------*/
	
});
