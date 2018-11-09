/* Document Ready ---------------------------------------------------------------------------------------*/
$(document).ready(function() {
	var url, suppCode, phone, currentPage, numPerPage;
	
	// Get data to combo name
	renderListComboBoxName();
	
	// Get data to combo phone
	renderListComboBoxPhone();
	
	// List of data from database
	var suppCode = "";
	var phone = "";
	currentPage = 1;
	numPerPage = 10;
	url = baseUrl + "api/supplierlists/" + suppCode + "," + phone + "," + currentPage + "," + numPerPage;
	renderList();
	
	// Get data to Message Box
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtUpdateCode").val($(this).children("td:nth-child(2)").text());
			$("#txtUpdateName").val($(this).children("td:nth-child(4)").text());
			$("#txtUpdatePhone").val($(this).children("td:nth-child(5)").text());

			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation  ---------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		suppCode = $("#cboName").val();
		phone = $("#cboPhone").val();
		currentPage = 1;
		numPerPage = 10;
		url = baseUrl + "api/supplierlists/" + suppCode + "," + phone + "," + currentPage + "," + numPerPage;
		renderList();
	 });
	/* end of search operation  --------------------------------------------------------------------------*/
	
	/* get data all from data base -----------------------------------------------------------------------*/
	function renderList() {
		$tblCustomers = $("#tblCustomers");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoId)
				).append(
					$("<td>").text(customer.suppCode)
				).append(
					$("<td>").text(customer.companyName)
				).append(
					$("<td>").text(customer.suppKhName)
				).append(
					$("<td>").text(customer.phone)
				).append(
					$("<td>").text(customer.mail)
				).append(
					$("<td>").text(customer.address)
				).append(
					$("<td>").text(customer.dest)
				).append(
					$("<td>").text(customer.userName)
				).append(
					$("<td>").text(customer.entryDate)
				).append(
			        $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
			                '<button type="button" id="btnEEdit" class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >' +
			                '<span class="glyphicon glyphicon-pencil">' +
			                '</span>' +
			                '</button>' +
			                '</p>')
			    ).append(
			       $("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
			                '<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
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
	/* end of get data all from data base -----------------------------------------------------------------------*/
	
	/*delete data -----------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function(event) {
		// alert($("label[for='myalue']").text());
		var $this = $(this);
		var suppCode = $("label[for='myalue']").text();
		var url = baseUrl + "api/supplierlistsdelete/" + suppCode;

		$.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json",
			    success: function(data){
			    	var custCode = "";
			    	var phone = "";
			    	url = baseUrl + "api/supplierlist/" + suppCode + "," + phone;
			    	renderChartAccountList();
			    	// close alert form
					$("#myModal").modal('hide');
		            $('.alert-info').alert('close');
			    }
			});
	 });
	/*End of delete data ---------------------------------------------------------------------------------------*/
	
	/* get data to combo box name  -----------------------------------------------------------------------------*/
	function renderListComboBoxName() {
		var url = baseUrl + "api/supplierlistscomboname";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.suppCode)
					  .text(customer.companyName);
			    $('#cboName').append(option);
			});
		});
	}
	/* end of get data to combo box name ----------------------------------------------------------------------*/
	
	/* get data to combo box phone  ---------------------------------------------------------------------------*/
	function renderListComboBoxPhone() {
		var url = baseUrl + "api/supplierlistscombophone";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', this.value).text(customer.phone);
			    $('#cboPhone').append(option);
			});
		});
	}
	/* end of get data to combo box phone ---------------------------------------------------------------------*/
	
});
/* End of Document Ready --------------------------------------------------------------------------------------*/