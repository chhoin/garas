<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>HengPhea Garas Station</title>

		<!-- Format date insert into database -->
		<script type="text/javascript" src='<c:url value="/resources/validation/moment.min.js"/>'></script>

    	<script type="text/javascript">
			var baseUrl = "<c:url value='/'/>";
		</script>
		
		<!-- Message Error -->
		<style type="text/css">
			label.error {color: red;}
		</style>
		
		<!-- Message Error -->
		<style type="text/css">
			label.control-label {color: #566FC9;}
		</style>
		<style type="text/css">
			span.star {color: red;}
		</style>
	</head>
	
	<body>
		<jsp:include page="template/home.jsp"/>
		
		<!-- Main Content -->
			<div class="page-wrapper">
				<div class="container-fluid">
					
					<!-- Title -->
					<div class="row heading-bg bg-blue">
						<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
							<h5 class="txt-light">បង្កើតអ្នកប្រើប្រាស់</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">User Authentication</a></li>
								<li><a href="#"><span>បង្កើតអ្នកប្រើប្រាស់</span></a></li>
							</ol>
						</div>
						<!-- /Breadcrumb -->
					</div>
					<!-- /Title -->
					
					<!-- Row -->
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-default card-view">
								<div class="panel-heading">
									<div class="pull-left">
										<h4 class="panel-title" style="font-size: 18px; color: blue;">បញ្ចូលព័ត៌មានបង្កើតអ្នកប្រើប្រាស់</h4>
									</div>
									<div class="pull-right">
										<a href='<c:url value="/userlist"/>'>
											<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
												<i class="ti-menu-alt "></i> 
												<span>បញ្ជីព័ត៌មានអ្នកប្រើប្រាស់</span>
											</button>
										</a>
									</div>
									<div class="clearfix"></div>
								</div>
								
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<div class="form-wrap">
													<form id="myform" action="#">
														<div class="form-body">
															<h6 class="txt-dark capitalize-font" style="font-size: 14px;"><i class="ti-menu-alt mr-10"></i>បញ្ចូលព័ត៌មានអ្នកប្រើប្រាស់</h6>
															<hr>
															
															<div class="row">
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះអ្នកប្រើប្រាស់<span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtUserName" name = "txtUserName" placeholder="ឈ្មោះអ្នកប្រើប្រាស់">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខសម្ងាត់<span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtPassword" name = "txtPassword" placeholder="លេខសម្ងាត់">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															<!-- /Row -->
															
															<div class="row">
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">នាមត្រកូល</label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtFirstName" name = "txtFirstName" placeholder="នាមត្រកូល">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">នាមខ្លួន</label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtLastName" name = "txtLastName" placeholder="នាមខ្លួន">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខទូរស័ព្ទ</label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtPhone" name = "txtPhone" placeholder="លេខទូរស័ព្ទ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															<!-- /Row -->
															
															<div class="row">
																<div class="col-md-12">
																	<div class="form-group">
																		<label class="control-label mb-10">អាស័យដ្ឋាន</label>
																		<div class="form-group has-success">
																			<textarea class="form-control" rows="3" id="txtAddress" name = "txtAddress"​ placeholder="អាស័យដ្ឋាន"></textarea>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															<!-- /Row -->
															
														</div>
														<!-- <div class="seprator-block"></div> -->
														<h6 class="txt-dark capitalize-font"><i class=""></i></h6>
															<hr>
															<div class="row">
																<div class="col-md-12 ">
																	<div class="form-actions mt-10">
																		<button type="button" id="bSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>រក្សាទុក</span></button>
																		<!-- <button type="submit" id="bSave" class="btn btn-success  mr-10"> រក្សារទុក   </button> -->
																		<!-- <button class="btn btn-primary btn-rounded btn-icon left-icon" id="bExit"> <i class="icon-close"></i> <span>ចាកចេញ</span></button> -->
																	</div>
																</div>
															</div>
													</form>
												</div>
											</div>
										</div>
									</div>
								</div>
								
							</div>		
						</div>
					</div>
					<!-- /Row -->
				</div>
				
				<!-- Footer -->
				<footer class="footer container-fluid pl-30 pr-30" style="background-color: #428BCA;">
					<div class="row">
						<div class="col-sm-5">
							<!-- <a href="index.html" class="brand mr-30" style="color: white;"><img src="dist/img/logo-sm.png" alt="logo"/></a> -->
							<ul class="footer-link nav navbar-nav">
								<li class="logo-footer"><a href="#"​​ style="color: white;">មាតិការ</a></li>
								<li class="logo-footer"><a href="#" style="color: white;">របៀប្រើប្រាស់</a></li>
								<li class="logo-footer"><a href="#" style="color: white;">អំពីយើង</a></li>
							</ul>
						</div>
						<div class="col-sm-7 text-right">
							<p style="color: white;">2018 &copy; កម្មវិធីគ្រប់គ្រងអាជីវកម្ម បង្កើតឡើងដោយ Smart Solution</p>
						</div>
					</div>
				</footer>
				<!-- /Footer -->
			</div>
			<!-- /Main Content -->
			
			<!-- Clear Form -->
			<%-- <script type="text/javascript" src='<c:url value="/resources/validation/jquery-1.12.3.min.js"/>'></script> --%>
		
			<!-- Validate -->
			<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
			
			<script type="text/javascript" src='<c:url value="/resources/js/user.js"/>'> </script>
				
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	
	</body>
</html>