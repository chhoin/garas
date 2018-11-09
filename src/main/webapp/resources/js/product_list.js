/* Document Ready -------------------------------------------------------------------------------------*/
$(document).ready(function() {
	// get combo box
	getDataComboBox();
	
	// get data all from data base
	renderUserList();
	
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			/*$("#txtname").val($(this).children("td:nth-child(2)").text());
			$("#txtsale").val($(this).children("td:nth-child(3)").text());
			$("#txtbuy").val($(this).children("td:nth-child(4)").text());*/
			
			$("label[for='myalue']").text($(this).children("td:nth-child(2)").text());
		});
	})
	
	/* search operation  ----------------------------------------------------------------------------------*/
	$("#btnSearch").on("click", function(event){
		var st_NAME = $("#cboSName").val();
		var url = baseUrl + "api/productlistsbycode/" + st_NAME;
		//alert(url);
		
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.auto_ID)
					).append(																							
						$("<td>").text(user.st_ID)
					).append(
						$("<td>").text(user.categories_NAME)
					).append(
						$("<td>").text(user.cat_ITEM_NAME)
					).append(
						$("<td>").text(user.unit_NAME)
					).append(
						$("<td>").text(user.st_TYPE_CODE)
					).append(
						$("<td>").text(user.st_UNIT_PRICE)
					).append(
						$("<td>").text(user.st_TOTAL_BALANCE)
					).append(
						$("<td>").text(user.currency)
					).append(
						$("<td>").text(user.wqty)
					).append(
						$("<td>").text(moment(user.st_MODIFY_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.st_INPUTER)
					).append(
						$("<td>").text(moment(user.st_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.des)
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
	
	/*delete data ------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
		var $this = $(this);
		var st_ID = $("label[for='myalue']").text();
		var url = baseUrl + "api/productlistsdelete/" + st_ID;
		
 	   $.ajax({
			    type: "DELETE",
			    url: url,
			    contentType: "application/json",
			    dataType: "json", 
			    success: function(data){
			    	// get combo box
			    	getDataComboBox();
			    	
			    	// get data all from data base
			    	renderUserList();
			    }
			});
	 });
	/*End of delete data ---------------------------------------------------------------------------------------*/
	
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
	/* End of Clear --------------------------------------------------------------------------------*/
	
	/*Edit data ------------------------------------------------------------------------------------*/
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
	
	/*Edit delete ------------------------------------------------------------------------------------------*/
	$("#btnDelete").on("click", function() {
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
	/*End of delete -----------------------------------------------------------------------------------*/
	
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
		var url = baseUrl + "api/productlists";
		$tblUsers = $("#tblUsers");
		var trUsers = [];
		$.get(url, function(users){
			$.each(users, function(index, user){
				var $trUser = $("<tr>").append(																							
						$("<td>").text(user.auto_ID)
					).append(																							
						$("<td>").text(user.st_ID)
					).append(
						$("<td>").text(user.categories_NAME)
					).append(
						$("<td>").text(user.cat_ITEM_NAME)
					).append(
						$("<td>").text(user.unit_NAME)
					).append(
						$("<td>").text(user.st_TYPE_CODE)
					).append(
						$("<td>").text(user.st_UNIT_PRICE)
					).append(
						$("<td>").text(user.st_TOTAL_BALANCE)
					).append(
						$("<td>").text(user.currency)
					).append(
						$("<td>").text(user.wqty)
					).append(
						$("<td>").text(moment(user.st_MODIFY_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.st_INPUTER)
					).append(
						$("<td>").text(moment(user.st_DATE).format("DD-MM-YYYY"))
					).append(
						$("<td>").text(user.des)
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
	
	/* get data to combo box -----------------------------------------------------------------------------------*/
	function getDataComboBox() {
		var url = baseUrl + "api/productlistscombos";
		$.get(url, function(users){
			$.each(users, function(index, user){
				var option = $('<option />');
			    option.attr('value', this.value).text(user.categories_NAME);
			    $('#cboSName').append(option);
			});
		});
	}
	/* end of get data to combo box ---------------------------------------------------------------------------*/
	
});
/* End of Document Ready ---------------------------------------------------------------------------*/