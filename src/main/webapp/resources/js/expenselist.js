$(document).ready(function() {
	var url, fromDate, toDate, expCode, currentPage, numPerPage;
	
	// get date from pc
	var today = new Date();
    var formattedtoday = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();
    
    // get combo of លេខវិក័យបត្រ
	renderListgetComboExpenseType();
	
	// Show default data from database
	fromDate = "2018-04-01";
	toDate = "2019-04-30";
	expCode = "";
	currentPage = 1; 
	numPerPage = 10;
	url = baseUrl + "api/expenselistsearch/" + fromDate + "," + toDate + "," + expCode + "," + currentPage + "," + numPerPage;
	renderListSearchExpense();
	
	// Get data to Message Box
	/*$(document).on("shown.bs.modal", function (event) {
		// alert($(this).children("td:nth-child(3)").text());
		$('table tbody tr').click(function(){
			$("#txtInvoice").val($(this).children("td:nth-child(2)").text());
			$("#txtTotalKhr").val($(this).children("td:nth-child(9)").text());
			$("#txtOweUsd").val($(this).children("td:nth-child(9)").text());
		});
	})*/
	
	/* search data from data base -----------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		/*var fdate = moment($("#txtFrom").val(), "DD-MM-YYYY");*/
		fromDate = $("#txtFrom").val();
		toDate = $("#txtTo").val();
		expCode = $("#cboIncomeType").val();
		currentPage = 1; 
		numPerPage = 10;
		url = baseUrl + "api/expenselistsearch/" + fromDate + "," + toDate + "," + expCode + "," + currentPage + "," + numPerPage;
		renderListSearchExpense();
	});
	
	function renderListSearchExpense(){
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.autoNum)
					).append(
						$("<td>").text(user.expCode)
					).append(
						$("<td>").text(user.expDate)
					).append(
						$("<td>").text(user.expType)
					).append(
						$("<td>").text(user.curName)
					).append(
						$("<td>").text(user.amount)
					).append(
						$("<td>").text(user.exchRate)
					).append(
						$("<td>").text(user.dest)
					).append(
						$("<td>").text(user.userName)
					).append(
						$("<td>").text(user.entryDate)
					);
				
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	
	// get combo of expense type
	function renderListgetComboExpenseType() {
		url = baseUrl + "api/expenselistcomboexpensetype";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.expCode)
					  .text(customer.expType);
			    $('#cboExpenseType').append(option);
			});
		});
	}
	
});