/* Document Ready --------------------------------------------------------------------------------------*/
$(document).ready(function() {
	// get data combo box
	renderListComboBox();
	
	// get data from database
	renderUserList();
	
	// pop up form get value
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtname").val($(this).children("td:nth-child(2)").text());
			$("#txtsale").val($(this).children("td:nth-child(3)").text());
			$("#txtbuy").val($(this).children("td:nth-child(4)").text());
			$("#txtmiddle").val($(this).children("td:nth-child(5)").text());
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* Button Clear ------------------------------------------------------------------------------------*/
	$("#btnClear").click(function() {				
		$('<div></div>').appendTo('body')
		  .html('<div><h6>Are you want to Clear ?</h6></div>')
		  .dialog({
		      modal: true, title: 'message', zIndex: 10000, autoOpen: true,
		      width: 'auto', resizable: false,
		      buttons: {
		          Yes: function () {				  
		              $('#myform')[0].reset();				             
		              $(this).dialog("close");
		              $( "#txtSign" ).focus();
		          },
		          No: function () {				              
		              $(this).dialog("close");
		          }
		      },
		      close: function (event, ui) {
		          $(this).remove();
		      }
		});			
	}); 
	/* End of Clear --------------------------------------------------------------------------------------*/
	
	/*Edit data ------------------------------------------------------------------------------------------*/
	$("#btnEdit").on("click", function() {
		var $this = $(this);
    	var url = baseUrl + "api/currencylists/" + $("#txtname").val();
    	var data = {
    			"cur_NAME": $("#txtname").val(),
        		"cur_SALE": $("#txtsale").val(),
        		"cur_BUY": $("#txtbuy").val(),
        		"cur_DESC": $("#txtmiddle").val()
    	};
    	$.ajax({
    	    type: "PUT",
    	    url: url,
    	    data: JSON.stringify(data),
    	    contentType: "application/json; charset=utf-8",
    	    dataType: "json",
    	    success: function(response){
    	    	$("#txtname").val(""),
        		$("#txtsale").val(""),
        		$("#txtbuy").val(""),
        		$("#txtmiddle").val("")
        		renderUserList();
    	    },
    	    failure: function(errMsg) {
    	        alert("Sorry plz try again");
    	    }
    	});
	 });
	/*End of edit data -------------------------------------------------------------------------------------*/
	
	/*Edit delete ------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var cur_NAME = $("label[for='myalue']").text();
		var url = baseUrl + "api/currencylistsdelete/" + cur_NAME;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){
			    	renderUserList();
			    	renderListComboBox();
			    }
			});
	 });
	/*End of delete ---------------------------------------------------------------------------------------*/
	
	/* get data all from data base ------------------------------------------------------------------------*/
	function renderUserList() {
		var url = baseUrl + "api/currencylists";
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
					$("<td>").text(user.cur_ID)
				).append(
					$("<td>").text(user.cur_NAME)
				).append(
					$("<td>").text(user.cur_SALE)
				).append(
					$("<td>").text(user.cur_BUY)
				).append(
					$("<td>").text(user.cur_DESC)
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
		var url = baseUrl + "api/currencylistscombos";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.cur_NAME);
			    $('#cboCurrencyName').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
	
	/* search data by name  -----------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		//alert("hello");
		var cur_NAME = $("#cboCurrencyName").val();
		var url = baseUrl + "api/currencylistsbycode/" + cur_NAME;

		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.cur_ID)
					).append(
						$("<td>").text(user.cur_NAME)
					).append(
						$("<td>").text(user.cur_SALE)
					).append(
						$("<td>").text(user.cur_BUY)
					).append(
						$("<td>").text(user.cur_DESC)
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
	/* end of search data by name  -------------------------------------------------------------------------------*/
	
});
/* End of Document Ready -----------------------------------------------------------------------------------------*/