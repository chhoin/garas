<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> 



<html>
<head>
	<title>Spring Securities</title>
	
	<!-- Clear Form -->
	<script type="text/javascript" src='<c:url value="/resources/validation/jquery-1.12.3.min.js"/>'></script>
	
	<!-- Validate -->
	<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
	
	<!-- Datepicker -->
	<%-- <link rel="stylesheet" href='<c:url value="/resources/TestDate/jquery-ui.css"/>'> 	 --%>
	<%-- <script type="text/javascript" src='<c:url value="/resources/js/jquery-1.9.1.js"/>'></script> --%>
	<%-- <script type="text/javascript" src='<c:url value="/resources/TestDate/jquery-ui.min.js"/>'></script> --%>
	
	<!-- Message Error -->
	<style type="text/css">
		label.error {color: red;}
	</style>
	
</head>
<body>
	<form id="myform" action="#">
		 <div style="margin-left: 100px; margin-top: 50px;">
		 
			  <label for="male">SignOn Name:</label>
			  <input type="text" name="txtSign" id="txtSign" style="height: 35px; margin-left: 100px; width: 300px;"><br><br>
			  
			  <label for="female">Password:</label>
			  <input type="text" name="txtPassword" id="txtPassword" style="height: 35px; margin-left: 130px; width: 300px;"><br><br>
			  
			  <label for="female">Permission:</label>
			  <!-- <input type="text" name="txtPer" id="txtPer" style="height: 35px; margin-left: 120px; width: 300px;"><br><br> -->
			  <input type="radio" name="gender" value="0" style="margin-left: 120px;"> Admin 
	  		  <input type="radio" name="gender" value="1" style="margin-left: 50px;"> Normal<br><br>
			  
			  <label for="male">Embossed Name:</label>
			  <input type="text" name="txtName" id="txtName" style="height: 35px; margin-left: 85px; width: 300px;"><br><br>
			  
			  <label for="female">Gender:</label>
			  <select name="cbxGender" id="cbxGender" style="height: 35px; margin-left: 145px; width: 100px;">
				  <option value=""> </option>
				  <option value="M">Male</option>
				  <option value="F">Female</option>
			  </select><br><br>
			  
			  
			  <label for="male">Birth of Date:</label>
			  <input type="text" class="date-picker" name="txtBod" id = "txtBod" style="height: 35px; margin-left: 110px; width: 300px;" />
			  <label style="color:red;" >(dd-mm-yyyy)</label> <br><br>
			  
			  
			  <label for="male">E-Mail:</label> 
			  <input type="text" name="txtmail" id="txtmail" style="height: 35px; margin-left: 150px; width: 300px;"><br><br>		
			  
			  
			  <input id = "btnSubmit" type="button" value="Validation" style="width: 150px; height: 50px; margin-left: 200px;"/>
			  <input id = "btnClear" type="button" value="Clear" style="width: 150px; height: 50px; margin-left: 11px;"/>
			  <input id = "btnShow" type="button" value="Show" style="width: 150px; height: 50px; margin-left: 10px;"/>
			  <input id = "btnSave" type="button" value="Save" style="width: 150px; height: 50px; margin-left: 11px;"/>
			 
		  </div>
	</form> 
	
	<script>
		var baseUrl = '<c:url value="/home"/>';
		$(document).ready(function() {	
			// button click
			$("#btnSubmit").click(function() {				
				var isValid = validateForm();
				if ( isValid ){
					alert("Correct");
				}
				else{
					alert("Incorrect");
				}
			}); 
			
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
			
		});
	
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
	
		/* var json = {
			id: 1,
			name: "dara"
		};
	
		alert(JSON.stringify(json));
		console.log(json); */
		
		/* datepicker *****************************************************************/
		$(function() {
		    $('.date-picker').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        showButtonPanel: true,
		        dateFormat: 'dd-mm-yy'		      
		    });
		});
		
		$("#btnShow").on("click", function(){
			var url = baseUrl;
			$.getJSON(url, function(response){
				console.log(JSON.stringify(response));
			});
		});
		
		
		$("#btnSave").on("click", function(){
			var url = baseUrl;
			var data = {
				"name": $("#txtSign").val(),
				"gender": $("#cbxGender").val()
				/* "birthDate": new Date() */
			};
			
			$.ajax({
			    type: "POST",
			    url: url,
			    data: JSON.stringify(data),
			    contentType: "application/home; charset=utf-8",
			    dataType: "home",
			    success: function(response){
					console.log(response);
					console.log("Save Successfully");
			    },
			    failure: function(errMsg) {
			        alert("Sorry plz try again");
			    }
			});
		});
		
	</script>
	
	<%-- <script type="text/javascript" src='<c:url value="/resources/js/help.js"/>'> </script> --%>

</body>
</html>
