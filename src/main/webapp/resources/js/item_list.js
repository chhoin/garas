
/* Document Ready -------------------------------------------------------------------------------------*/
$(document).ready(function() {
	// get data to combo box
	renderListComboBox();
	
	// get data all from database
	renderUserList();
	
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtCode").val($(this).children("td:nth-child(2)").text());
			$("#txtType").val($(this).children("td:nth-child(3)").text());
			$("#txtName").val($(this).children("td:nth-child(4)").text());
			$("#txtNote").val($(this).children("td:nth-child(5)").text());
			
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation  ----------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		var cat_ITEM_NAME = $("#cboName").val();
		var url = baseUrl + "api/itemlistsbycode/" + cat_ITEM_NAME ;
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																						
						$("<td>").text(user.auto_NUM)
					).append(																						
						$("<td>").text(user.cat_ITEM_CODE)
					).append(
						$("<td>").text(user.categories_NAME)
					).append(
						$("<td>").text(user.cat_ITEM_NAME)
					).append(
						$("<td>").text(user.descricption)
					).append(
						$("<td>").text(user.input_NAME)
					).append(
						$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
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
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	});
	/* end of search operation  ------------------------------------------------------------------------*/
	
	/*Edit data ------------------------------------------------------------------------------------------*/
	$("#btnEdit").on("click", function() {
		var $this = $(this);
    	var url = baseUrl + "api/itemlists/" + $("#txtCode").val();
    	var data = {
				"cat_ITEM_NAME": $("#txtName").val(),
				"descricption": $("#txtNote").val()
    	};
    	$.ajax({
    	    type: "PUT",
    	    url: url,
    	    data: JSON.stringify(data),
    	    contentType: "application/json; charset=utf-8",
    	    dataType: "json",
    	    success: function(response){
    	    	$("#txtCode").val("");
    	    	$("#txtType").val("");
    	    	$("#txtName").val("");
    	    	$("#txtNote").val("");
    	    	
    	    	// get data to combo box
    	    	renderListComboBox();
    	    	
    	    	// get data all from database
    	    	renderUserList();
    	    },
    	    failure: function(errMsg) {
    	        alert("Sorry plz try again");
    	    }
    	});
	 });
	/*End of edit data -------------------------------------------------------------------------------------*/
	
	/*delete data ------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var cat_ITEM_CODE = $("label[for='myalue']").text();
		var url = baseUrl + "api/itemlistsdelete/" + cat_ITEM_CODE;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){
			    	// get data to combo box
	    	    	renderListComboBox();
	    	    	
	    	    	// get data all from database
	    	    	renderUserList();
			    }
			});
	 });
	/*End of delete data ---------------------------------------------------------------------------------------*/

	/* get data all from data base ----------------------------------------------------------------------*/
	function renderUserList() {
		var url = baseUrl + "api/itemlists";
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																						
					$("<td>").text(user.auto_NUM)
				).append(																						
					$("<td>").text(user.cat_ITEM_CODE)
				).append(
					$("<td>").text(user.categories_NAME)
				).append(
					$("<td>").text(user.cat_ITEM_NAME)
				).append(
					$("<td>").text(user.descricption)
				).append(
					$("<td>").text(user.input_NAME)
				).append(
					$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
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
				trUsers.push($trUser);
			});
			$tblUsers.html(trUsers);
		});
	}
	/* end of get data all from data base ----------------------------------------------------------------------*/
	
	/* get data to combo box -----------------------------------------------------------------------------------*/
	function renderListComboBox() {
		var url = baseUrl + "api/itemlistcombos";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.cat_ITEM_NAME);
			    $('#cboName').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
});
/* End of Document Ready ---------------------------------------------------------------------------*/