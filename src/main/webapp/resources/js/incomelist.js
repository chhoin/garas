$(document).ready(function() {
	var url, fromDate, toDate, incomeCode, currentPage, numPerPage;
	
	// get date from pc
	var today = new Date();
    var formattedtoday = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();
    
    // get combo of លេខវិក័យបត្រ
	renderListgetComboIncomeType();
	
	// Show default data from database
	fromDate = "2018-04-01";
	toDate = "2019-04-30";
	incomeCode = "";
	currentPage = 1; 
	numPerPage = 10;
	url = baseUrl + "api/incomelistsearch/" + fromDate + "," + toDate + "," + incomeCode + "," + currentPage + "," + numPerPage;
	renderListSearchIncome();
	
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
		incomeCode = $("#cboIncomeType").val();
		currentPage = 1; 
		numPerPage = 10;
		url = baseUrl + "api/incomelistsearch/" + fromDate + "," + toDate + "," + incomeCode + "," + currentPage + "," + numPerPage;
		renderListSearchIncome();
	});
	
	function renderListSearchIncome(){
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.autoNum)
					).append(
						$("<td>").text(user.incomeCode)
					).append(
						$("<td>").text(user.incomeDate)
					).append(
						$("<td>").text(user.incomeType)
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
	
	// get combo of លេខវិក័យបត្រ
	function renderListgetComboIncomeType() {
		url = baseUrl + "api/incomelistcomboincometype";
		$.get(url, function(customers){
			$.each(customers, function(index, customer){
				var option = $('<option />');
				option.attr('value', customer.incomeCode)
					  .text(customer.incomeType);
			    $('#cboIncomeType').append(option);
			});
		});
	}
	
});