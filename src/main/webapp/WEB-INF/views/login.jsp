<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lucas Oil Station</title>
	
	<!-- Bootstrap table CSS -->
	<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap-table/dist/bootstrap-table.css"/>' type="text/css">
	
	<!-- Date time picker -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker3.min.css">
	
	<!-- Custom CSS -->
	<link rel="stylesheet" href='<c:url value="/resources/designs/main/dist/css/style.css"/>' type="text/css">
	<!--**********************************************************************-->
    <link rel="stylesheet" href='<c:url value="/resources/designs/main/src/scss/bootstrap.min.css"/>' type="text/css">
    
    <script src='<c:url value="/resources/designs/main/src/scss/jquery-1.11.1.min.js"/>'> </script>
    
    <script src='<c:url value="/resources/designs/main/vendors/bower_components/select2/docs/vendor/js/bootstrap.min.js"/>'> </script>
    <!-- *********************************************************************-->
    
    <!--  -->
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
	<style>
		.error {
			color: #ff0000;
			font-size: 0.9em;
			font-weight: bold;
		}		
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
	</style>
    
    <!--  -->
    <script>
		function validateForm() {
		    var x = document.forms["myForm"]["username"].value;
		    var y = document.forms["myForm"]["password"].value;
		    if (x == null || x == "" || x == "SignOn Name") {
		        alert("Must be filled SignOn Name");
		        return false;
		    }else if(y == null || y == "" || y == "SignOn Name"){
		    	alert("Must be filled Password");
		        return false;
		    }		    
		}
	</script>
	
	<!-- color to label -->
	<style>
        #error{
            display: none;
            color: red;
        }
    </style>
</head>
<body>
<!--  -->
	<!-- <script src="jquery-1.8.3.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script> -->

	<div style="margin-top: 70px;"> </div>
	 <div class="container" style="margin-top:40px">
	  <div class="row">
	   <div class="col-sm-6 col-md-4 col-md-offset-4">
	    <div class="panel panel-default">
		    <div class="panel-heading" style="background-color: #285e8e;">
		    	<strong style="margin-left: 70px; color: white; font-family: BruceOldStyle BT; font-size: 26px; font-weight: bold;">Welcome SignOn</strong>
		    </div>
	     
	     <div class="panel-body" style="min-width: 300px; padding: 20px;">	     	
	       <fieldset>
		        <div class="row">
			         <div class="center-block">
			          <!-- <img class="profile-img" src="/resources/design/signon/img/savimex.png?size=50" alt="" style="margin-top: 10px; margin-left: 120px; max-height: 100px; max-width: 100px; object-fit: cover;"> -->
					  <img class="profile-img" src='<c:url value="/resources/designs/main/dist/img/lucas.jpg?size=100"/>' alt="" style="margin-top: 10px; margin-left: 130px; max-height: 130px; max-width: 100px; object-fit: cover;">
			         </div>
		        </div>
		        
	        	<div style="margin-top: 50px;"> </div>
	        
				<form action="<c:url value="/j_spring_security_check"/>" method='POST' id="myForm" class="bs-example form-horizontal">
			          <div class="form-group">
				           <div class="input-group">
				            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
				       
				            <input type="text" class="form-control" name="username" placeholder="ឈ្មោះអ្នកប្រើប្រាស់" />
							<!-- <form:errors path="userName" cssClass="error" /> -->
				           </div>
			          </div>
					  <!-- //Block password *************************************************************************************-->
		       		<div class="form-group">
			           <div class="input-group">
				            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
				            <input type="password" class="form-control" name="password" placeholder="លេខសម្ងាត់" />
							<!-- <form:errors path="password" cssClass="error" /> -->
			       		</div>
				  	</div>
				  	
				  	<div id="error">
				  		<div class="form-group">
				           <div class="input-group">
					            Invalid username and/or password!
				       		</div>
					  	</div>			           
				  	</div>
				  	
					<div class="form-group">
			       		<a href="#">
			       			<button type="submit" class="btn btn-lg btn-primary btn-block" style="color: white; background-color: #285e8e">Login</button>			      
			       		</a>
			       </div>
				</form>
	       	</fieldset>  
	        <!-- ========================= -->
	     </div>
	    </div>
	    
    	<div style="text-align: center; color: #999; font-family: BruceOldStyle BT; font-size: 13px;">
		  <p>Version 1.0.0.0</p>
		  <p>Released date: 2018-May-01</p>
		  <p>©Copyright 2018 by Smart Solution. All Rights Reserved.</p>
	 	</div>
	    
	   </div>
	  </div>
	 </div>
	  
	 <script>
        var field = 'error';
        var url = window.location.href;
        if(url.indexOf('?' + field + '=') != -1){
            document.getElementById("error").style.display="block";
        }
    </script>
    
     <script type="text/javascript"> </script>
     
     <!-- JavaScript -->
    <!-- <script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script> -->
	
    <!-- jQuery -->
    <script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/jquery/dist/jquery.min.js"/>'> </script>

    <!-- Bootstrap Core JavaScript -->
    <script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"/>'> </script>
    
	<!-- Bootstrap-table JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap-table/dist/bootstrap-table.min.js"/>'> </script>
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/bootstrap-table-data.js"/>'> </script>
	<!-- Slimscroll JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/jquery.slimscroll.js"/>'> </script>
	
	<!-- Fancy Dropdown JS -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/dropdown-bootstrap-extended.js"/>'> </script>
	<!-- Init JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/init.js"/>'> </script>

</body>
</html>