$(document).ready(function() {
	// add data into table 
	$("#btnAdd").on("click", function(event){
		var table = document.getElementById("table"), 
			newRow = table.insertRow(table.length),
			cell1 = newRow.insertCell(0),
			cell2 = newRow.insertCell(1),
			cell3 = newRow.insertCell(2),
			cell4 = newRow.insertCell(3),
			fname = document.getElementById("fname").value,
			lname = document.getElementById("lname").value,
			age = document.getElementById("age").value;
		cell1.innerHTML = fname;
		cell2.innerHTML = lname;
		cell3.innerHTML = age;
		cell4.innerHTML = '<button type="button" class="btn-danger"> <span class="glyphicon glyphicon-trash"> </span> </button>';
	});
	
	
	$(document).on("shown.bs.modal", function (event) {
		$('table tbody tr').click(function(){
			/*$("#txtCode").val($(this).children("td:nth-child(2)").text());
			$("#txtKName").val($(this).children("td:nth-child(3)").text());
			$("#txtEName").val($(this).children("td:nth-child(4)").text());
			$("#txtSex").val($(this).children("td:nth-child(5)").text());
			$("#txtNo").val($(this).children("td:nth-child(7)").text());
			$("#txtNoName").val($(this).children("td:nth-child(8)").text());
			$("#txtPhone").val($(this).children("td:nth-child(9)").text());
			$("#txtAddress").val($(this).children("td:nth-child(12)").text());*/
			
			$("label[for='myalue']").text($(this).children("td:nth-child(1)").text());
		});
	})
	
	
	
	// display selected row data into input text
	function selectedRowToInput(){
		var rowIndex, table = document.getElementById("table");
		for(var i = 0; i < table.rows.length; i++){
			table.row[i].onclick = function(){
				get
			}
		}
	}
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bSave").on("click", function(event){
		var url = baseUrl + "api/smarts";
		
        $("#table tr").each(function () {
	        var data = {};
	        data.code = $(this).find("td:nth-child(1)").html();
	        data.name = $(this).find("td:nth-child(2)").html();
	        data.sex = $(this).find("td:nth-child(3)").html();
	        
	        if (typeof data.code != "undefined") {
	        	$.ajax({
		    	    type: "POST",
		    	    url: url,
		    	    data: JSON.stringify(data),
		    	    contentType: "application/json; charset=utf-8",
		    	    dataType: "json",
		    	    success: function(response){
		    	    	
		    	    },
		    	    failure: function(errMsg) {
		    	        alert("Sorry plz try again");
		    	    } 
		    	});
	        }
        });
		
	});
	/* End of Save data into database -----------------------------------------------------------------------------------------------------------*/
	
	/* Save data into database ------------------------------------------------------------------------------------------------------------------*/
	$("#bdelete").on("click", function(event){
		alert("Delete Data");
	});
	/* End of Save data into database -----------------------------------------------------------------------------------------------------------*/
	
	
	/* Validation Form  -------------------------------------------------------------------------------------------------------------------------*/
	function validateForm() {
		var $form = $("#myform");
		$form.removeData('validator');
		var validator = $form.validate({
			rules : {					
				fname : {
					required : true
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
	/* End of Validation Form -----------------------------------------------------------------------------------------------------------------*/
	
	// add data into table 
	$("#bEdit").on("click", function(event){
		// alert("Hello Edit");
		$("[id*=table] tr").each(function () {
            alert($(this).find("td:nth-child(1)").html());
        });
	});
	
	
	// removed data
	$("#bRemove").on("click", function(event){
		alert($(this).find("td:nth-child(1)").html());
	});
	
	// removed test
	$("#btnRemove").on("click", function(event){
		alert("Hello Remove test");
	});
	
	$("#table").on("click",'.btn-danger', function(){
		alert("Hello Remove test");
		$(this).closest('tr').remove();
	});

});
