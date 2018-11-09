/* Document Ready ---------------------------------------------------------------------------------------*/
$(document).ready(function() {
	var url, prodCode, currentPage, numPerPage;
	
	// Get data to combo name
	getComboProductInfoName();
	
	// List of data from database
	var prodCode = "";
	currentPage = 1;
	numPerPage = 10;
	url = baseUrl + "api/productinfolists/" + prodCode + "," + currentPage + "," + numPerPage;
	renderList();
	
	// Get data to Message Box
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtUpdateCode").val($(this).children("td:nth-child(2)").text());
			$("#txtUpdateName").val($(this).children("td:nth-child(4)").text());
			$("#txtUpdatePrice").val($(this).children("td:nth-child(6)").text());
			$("#txtUpdateUnitPrice").val($(this).children("td:nth-child(7)").text());

			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation */
	$("#btnSearch").on("click", function(event){
		prodCode = $("#cboProductCode").val();
		currentPage = 1;
		numPerPage = 10;
		url = baseUrl + "api/productinfolists/" + prodCode + "," + currentPage + "," + numPerPage;
		renderList();
	 });
	
	/* get data all from data base */
	function renderList() {
		$tblCustomers = $("#tblCustomers");
		var trCustomers = [];
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var $trcustomer = $("<tr>")
				 .append(
					$("<td>").text(customer.autoNum)
				).append(
					$("<td>").text(customer.prodCode)
				).append(
					$("<td>").text(customer.cateName)
				).append(
					$("<td>").text(customer.prodName)
				).append(
					$("<td>").text(customer.curName)
				).append(
					$("<td>").text(customer.pricePerUnit)
				).append(
					$("<td>").text(customer.pricePerItem)
				).append(
					$("<td>").text(customer.totalCanPerPackage)
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
			    );
				trCustomers.push($trcustomer);
			});
			$tblCustomers.html(trCustomers);
		});
	}
	
	/* get data to combo box name  */
	function getComboProductInfoName() {
		var url = baseUrl + "api/productinfocomboname";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.prodCode)
					  .text(customer.prodName);
			    $('#cboProductCode').append(option);
			});
		});
	}
	
});
