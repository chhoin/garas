<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Clear Form -->
	<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.12.3.min.js"/>'></script>
	
	<!-- Validate -->
	<script type="text/javascript" src='<c:url value="/resources/js/jquery.validate.min.js"/>'></script>
	
	<!-- Datepicker -->
	<link rel="stylesheet" href='<c:url value="/resources/css/jquery-ui.css"/>'> 	
	<%-- <script type="text/javascript" src='<c:url value="/resources/js/jquery-1.9.1.js"/>'></script> --%>
	<script type="text/javascript" src='<c:url value="/resources/js/jquery-ui.min.js"/>'></script>
	<script type="text/javascript" src='<c:url value="/resources/js/moment.min.js"/>'></script>
	
	<!-- Message Error -->
	<style type="text/css">
		label.error {color: red;}
	</style>
</head>
<body>

	<form class="form-inline" role="form">
			<div style="width: 300px; float: left; height: 35px; margin-top: 10px; margin-left: 160px;">
				<h1>Create Users</h1>
			</div>
		
			<!-- User Name -->
			<div style="float: left; width: 150px; height: 35px; margin-top: 50px; margin-left: 15px; clear: both;">
				<label>User Name:</label>
			</div>
			<div style="width: 300px; float: left; height: 35px; margin-top: 50px;">
				<input type="text" class="form-control" id="txtName" name="txtName" style="width:300px; height: 30px;">
			</div>
		
			<!-- Gender -->
			<div style="float: left; width: 150px; height: 35px; margin-top: 15px; margin-left: 15px; clear: both;">
				<label>Gender:</label>
			</div>
			<div style="width: 300px; float: left; height: 35px; margin-top: 10px;">
				<select id ="cbxGender" style="height: 30px; width: 100px; height: 35px;">
					<option value=""></option>
					<option value="M">Male</option>
					<option value="F">Female</option>
				</select>
			</div>
			
			<!-- Birth of Date -->
			<div style="float: left; width: 150px; height: 35px; margin-top: 15px; margin-left: 15px; clear: both;">
				<label>BirthDate:</label>
			</div>
			<div style="width: 300px; float: left; height: 35px; margin-top: 10px;">
				<input type="text" class="date-picker" name="txtBods" id = "txtBods" style="height: 30px; width: 300px;" />
				<label style="color:red;" >(dd-mm-yyyy)</label>
			</div>
			
			<!-- Birth of Date -->
			<div style="float: left; width: 150px; height: 35px; margin-top: 15px; margin-left: 15px; clear: both;">
				<label>BirthDate:</label>
			</div>
			<div style="width: 300px; float: left; height: 35px; margin-top: 10px;">
				<input type="text" class="date-picker" name="txtBod" id = "txtBod" style="height: 30px; width: 300px;" />
				<label style="color:red;" >(dd-mm-yyyy)</label>
			</div>
			
			<!-- Button Save -->
			<div style="width: 300px; float: left; height: 35px; margin-top: 40px; margin-left: 165px; clear: both;">
				<button type="button" class="btn btn-default" style="width: 120px; height: 40px;" id="btnSave">Save</button>
			</div>
			
			<!-- Show data into tables -->
			<div style="width: 300px; float: left; height: 35px; margin-top: 40px; margin-left: 165px; clear: both;">		
			
			<table id="contactTableResponse" class="table tr">
		        <thead>
		            <tr>
		                <th>USER NAME</th>
		                <th>GENDER</th>
		                <th>BIRTH DATE</th>               
		            </tr>
		        </thead>	       
		        <tbody id="tblUsers">	          
		        </tbody>
		    </table>
			</div>						
	</form>
	
	<script>
		var baseUrl = '<c:url value="/"/>';
		
		/* Document Ready -------------------------------------------------------------------------------------*/
		$(document).ready(function() {	
			
			/* Submit Data -------------------------------------------------------------------------------------*/
			$("#btnSubmit").click(function() {				
				var isValid = validateForm();
				if ( isValid ){
					alert("Correct");
				}
				else{
					alert("Incorrect");
				}
			}); 
			/* End of Submit Data ------------------------------------------------------------------------------*/
			
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
			
			// render user list
			renderUserList();						
		});
		/* End of Document Ready ---------------------------------------------------------------------------*/
		
		
		
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
		
		/* User List ----------------------------------------------------------------------------------------*/
		function renderUserList() {
			var url = baseUrl + "api/users";
			$tblUsers = $("#tblUsers");
			var trUsers = [];
			$.get(url, function(users){
				$.each(users, function(index, user){
					var $trUser = $("<tr>").append(																							
						$("<td>").text(user.name)
					).append(
						$("<td>").text(user.gender)
					)
					.append(
						$("<td>").text(moment(user.birthDate).format("DD-MM-YYYY"))
					);
					trUsers.push($trUser);
				});
				$tblUsers.html(trUsers);
			});
		}
		/* End of User List ---------------------------------------------------------------------------------*/
	
		/* var json = {
			id: 1,
			name: "dara"
		};
	
		alert(JSON.stringify(json));
		console.log(json); */
		
		/* Date Time Pccker --------------------------------------------------------------------------------*/
		$(function() {
		    $('#txtBods').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        showButtonPanel: true,
		        dateFormat: 'dd-mm-yy'		      
		    });
		   $('#txtBod').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        showButtonPanel: true,
		        dateFormat: 'dd-mm-yy'		      
		    });
		});
		/* End of Date Time Pccker -------------------------------------------------------------------------*/
		
		/* Button Show Data  --------------------------------------------------------------------------------*/
		$("#btnShow").on("click", function(){
			var url = baseUrl;
			$.getJSON(url, function(response){
				console.log(JSON.stringify(response));
			});
		});		
		/* End of Button Show Data  -------------------------------------------------------------------------*/
		
		/* Button Save Data  --------------------------------------------------------------------------------*/
		$("#btnSave").on("click", function(){
			var url = baseUrl + "api/users/existName?name=" + $("#txtName").val();
			
			$.get(url, function(isExist){
				if(isExist) {
					alert("sorry, username already exist");
				}
				else {
					var url = baseUrl + "api/users";
					var dobObj = moment($("#txtBods").val(), "DD-MM-YYYY");
					var data = {
						"name": $("#txtName").val(),
						"gender": $("#cbxGender").val(),
						"birthDate": dobObj,
					};
					
					$.ajax({
					    type: "POST",
					    url: url,
					    data: JSON.stringify(data),
					    contentType: "application/json",
					    dataType: "json",
					    success: function(response){
					    	renderUserList();
					    },
					    failure: function(errMsg) {
					        alert("Sorry plz try again");
					    }
					});
				}
			});					
		});
		/* End of Button Save Data  ---------------------------------------------------------------------------*/
		
	</script>

</body>
</html>