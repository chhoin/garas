
/* Document Ready -------------------------------------------------------------------------------------*/
$(document).ready(function() {
	// get data combo box
	renderListComboBox();
	
	// get data all
	renderUserList();
	
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			$("#txtname").val($(this).children("td:nth-child(2)").text());
			$("#txtsale").val($(this).children("td:nth-child(3)").text());
			$("#txtbuy").val($(this).children("td:nth-child(4)").text());
			$("#txtmiddle").val($(this).children("td:nth-child(5)").text());
			
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation  ----------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		var sup_CONTACT_NAME = $("#cboName").val();
		var url = baseUrl + "api/supplierlistsbycode/" + sup_CONTACT_NAME;
		//alert(url);
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.auto_ID)
					).append(																							
						$("<td>").text(user.sup_ID)
					).append(
						$("<td>").text(user.sup_NAME)
					).append(
						$("<td>").text(user.sup_CONTACT_NAME)
					).append(
						$("<td>").text(user.sup_TEL)
					).append(
						$("<td>").text(user.sup_MAIL)
					).append(
						$("<td>").text(user.sup_ADD)
					).append(
						$("<td>").text(user.sup_DES)
					).append(
						$("<td>").text(moment(user.input_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.input_NAME)
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
    	var url = baseUrl + "api/currencylists/" + $("#txtname").val();
    	var data = {
    			"cur_NAME": $("#txtname").val(),
        		"cur_SALE": $("#txtsale").val(),
        		"cur_BUY": $("#txtbuy").val(),
        		"cur_MIDDLE": $("#txtmiddle").val()
    	};
    	$.ajax({
    	    type: "PUT",
    	    url: url,
    	    data: JSON.stringify(data),
    	    contentType: "application/json; charset=utf-8",
    	    dataType: "json",
    	    success: function(response){
    			/*console.log(response);
    			console.log("Save Successfully");
    			$("#currencylists").setGridParam({
		    	     page : 1
		    	 }).trigger("reloadGrid");
    			 $this.dialog("close");*/
    	    	$("#txtname").val(""),
        		$("#txtsale").val(""),
        		$("#txtbuy").val(""),
        		$("#txtmiddle").val("")
        		renderUserList
    	    },
    	    failure: function(errMsg) {
    	        alert("Sorry plz try again");
    	    }
    	});
	 });
	/*End of edit data -----------------------------------------------------------------------------------*/
	
	/*delete data ------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var exp_ID = $("label[for='myalue']").text();
		var url = baseUrl + "api/expencelistsdelete/" + exp_ID;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){
			    	// get data combo box
			    	renderListComboBox();
			    	
			    	// get data all
			    	renderUserList();
			    }
			});
	 });
	/*End of delete data ---------------------------------------------------------------------------------------*/
	
	/* Validation Form  --------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				txtSign : {
					required : true,
					minlength: 8
				},
				txtPassword : {
					required : true,
					minlength: 8
				},
				txtmail : {
					required : true,
					email: true
				}
			}
		});			
		
		if ( validator.form() ){
			return true;
		}
		else{
			return false;
		}
	}
	/* End of Validation Form ---------------------------------------------------------------------------*/

	/* get data all from data base ----------------------------------------------------------------------*/
	function renderUserList() {
		var url = baseUrl + "api/expencelists";
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
					$("<td>").text(user.auto_ID)
				).append(																							
					$("<td>").text(user.exp_ID)
				).append(
					$("<td>").text(user.exp_TYPE)
				).append(
					$("<td>").text(moment(user.exp_DATE).format("DD-MM-YYYY"))
				).append(
					$("<td>").text(user.currency)
				).append(
					$("<td>").text(user.amount)
				).append(
					$("<td>").text(user.des)
				).append(
					$("<td>").text(user.inputter)
				).append(
					$("<td>").text(moment(user.date_TIME).format("DD-MM-YYYY"))
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
		var url = baseUrl + "api/expencelistscombos";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.exp_TYPE);
			    $('#cboType').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
});
/* End of Document Ready ---------------------------------------------------------------------------*/