<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> 

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>System Management Project</title>
		<script src="Scripts/jquery-1.3.2.js" type="text/javascript"></script>
		<!-- Format date insert into database -->
		<script type="text/javascript" src='<c:url value="/resources/validation/moment.min.js"/>'></script>
		
		<style type="text/css">
	        .pagination>li {
			display: inline;
			padding:0px !important;
			margin:0px !important;
			border:none !important;
			}
			.modal-backdrop {
			  z-index: -1 !important;
			}
			/*
			Fix to show in full screen demo
			*/
			iframe
			{
			    height:700px !important;
			}
			
			.btn {
			display: inline-block;
			padding: 6px 12px !important;
			margin-bottom: 0;
			font-size: 14px;
			font-weight: 400;
			line-height: 1.42857143;
			text-align: center;
			white-space: nowrap;
			vertical-align: middle;
			-ms-touch-action: manipulation;
			touch-action: manipulation;
			cursor: pointer;
			-webkit-user-select: none;
			-moz-user-select: none;
			-ms-user-select: none;
			user-select: none;
			background-image: none;
			border: 1px solid transparent;
			border-radius: 4px;
			}
			
			.btn-primary {
			color: #fff !important;
			background: #428bca !important;
			border-color: #357ebd !important;
			box-shadow:none !important;
			}
			.btn-danger {
			color: #fff !important;
			background: #d9534f !important;
			border-color: #d9534f !important;
			box-shadow:none !important;
			}
    	</style>
    	
    	<script type="text/javascript">
			var baseUrl = "<c:url value='/'/>";
		</script>
		
	</head>
	<body>
		<jsp:include page="template/home.jsp"/>
		
		<!-- Main Content -->
			<div class="page-wrapper">
				<div class="container-fluid">
					
					<!-- Title -->
					<div class="row heading-bg bg-blue">
						<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
							<h5 class="txt-light">Testing Save</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">គ្រប់គ្រងប្រេង</a></li>
								<li><a href="#"><span>ព័ត៌មានអតិថិជន</span></a></li>
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
										<h6 class="panel-title txt-dark">Order Products</h6>
									</div>
									<div class="clearfix"></div>
								</div>
								
								<div class="panel-heading">
									<div class="pull-right">
										<button type="button" id="bSave" class="btn btn-primary btn-rounded btn-icon left-icon" style="width: 100px; height: 35px;"> <i class="ti-save"></i> <span> Save </span></button>
									</div>
									<div class="clearfix"></div>
								</div>
								
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<div class="form-wrap">
													<form action="#">
														
														
														<!-- <div class="seprator-block"></div> -->
														<h6 class="txt-dark capitalize-font"><i class=""></i></h6>
														<hr>
														<div class="row">
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-4">First Name <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" name = "fname" id="fname" class="form-control" placeholder="First Name">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-4">Last Name <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" name = "lname" id="lname" class="form-control" placeholder="Last Name">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-4">Age <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" name = "age" id="age" class="form-control" placeholder="Age">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-4"></span></label>
																		<div class="form-group has-success">
																			<button type="button" id="btnAdd" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Add</span></button>
																			<button type="button" id="bEdit" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Edit</span></button>
																			<button type="button" id="bdelete" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Remove</span></button>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
														</div>
														<!--  /Row -->
														
														
														<!-- <div class="seprator-block"></div> -->
														<h6 class="txt-dark capitalize-font"><i class=""></i></h6>
														<hr>
														
														<div class="row">
															<div class="col-md-12">
																<div class="form-group">
																	<table id = "table" class="table table-fixed">
																		<tr>
																			<th>First Name</th>
																			<th>Last Name</th>
																			<th>Age</th>
																			<th>Delete</th>
																		</tr>
																	</table>
																</div>
															</div>
															<!--/span-->
														</div>
														<!-- /Row -->
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
				<footer class="footer container-fluid pl-30 pr-30">
					<div class="row">
						<div class="col-sm-5">
							<a href="index.html" class="brand mr-30"><img src="dist/img/logo-sm.png" alt="logo"/></a>
							<ul class="footer-link nav navbar-nav">
								<li class="logo-footer"><a href="#">មាតិការ</a></li>
								<li class="logo-footer"><a href="#">របៀប្រើប្រាស់</a></li>
								<li class="logo-footer"><a href="#">អំពីយើង</a></li>
							</ul>
						</div>
						<div class="col-sm-7 text-right">
							<p>2017 &copy; កម្មវិធីគ្រប់គ្រងអាជីវកម្ម បង្កើតឡើងដោយ Smart Solution</p>
						</div>
					</div>
				</footer>
				<!-- /Footer -->
			
			</div>
			<!-- /Main Content -->
			
			<!-- Delete record -->
		    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		     	<div class="modal-dialog">
				    <div class="modal-content">
			          <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading">លុបព័ត៌មានរូបិយប័ណ្ណ</h4>
				      </div>
				      
			          <div class="modal-body has-success">
				       	<div class="alert alert-danger">
				       		<span class="glyphicon glyphicon-warning-sign"></span> តើអ្នកពិតជាចង់លុបព័ត៌មានរូបិយប័ណ្ណ <samp><label for="myalue"></label></samp> មែនឫ ?
				       	</div>
				      </div>
				      
	        		  <div class="modal-footer ">
				        <button type="button" id="bRemove" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> បាទ</button>
				        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> ទេ</button>
				      </div>
			        </div>
				    <!-- /.modal-content --> 
			  	</div>
			      <!-- /.modal-dialog --> 
		    </div>
		    <!-- End of delete record -->
		    
			<script type="text/javascript" src='<c:url value="/resources/js/smart.js"/>'> </script>
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	
	</body>
</html>