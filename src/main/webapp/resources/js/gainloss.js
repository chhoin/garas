	
$(document).ready(function() {
	//alert("hello reports");
	
	$("#btnSearch").on("click", function(event){
		var p_DATE_FROM = $("#txtFDate").val();
		var p_DATE_TO = $("#txtTDate").val();
		var url = baseUrl + "api/getsearchgainlosseds/" + p_DATE_FROM + "," + p_DATE_TO;
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.product_NAME)
					).append(
						$("<td>").text(user.ccy)
					).append(
						$("<td>").text(user.amout_FCY)
					).append(
						$("<td>").text(user.amout_LCY)
					);
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	});
	/* get data all from data base ----------------------------------------------------------------------*/
});