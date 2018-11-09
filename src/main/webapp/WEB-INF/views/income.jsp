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
							<h5 class="txt-light">ចំណូលផ្សេងៗ</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">Tools</a></li>
								<li><a href="#"><span>ចំណូលផ្សេងៗ</span></a></li>
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
										<h4 class="panel-title" style="font-size: 18px; color: blue;">បញ្ចូលព័ត៌មានចំណូលផ្សេងៗ</h4>
									</div>
									<div class="pull-right">
										<a href='<c:url value="/incomelist"/>'>
											<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
												<i class="ti-menu-alt "></i> 
												<span>បញ្ជីព័ត៌មានចំណូលផ្សេងៗ</span>
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
															<h6 class="txt-dark capitalize-font" style="font-size: 14px;"><i class="ti-menu-alt mr-10"></i>បញ្ចូលព័ត៌មានចំណូលផ្សេងៗ</h6>
															<hr>
															
															<div class="row">
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label mb-10">ប្រភេទចំណូល <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtIncomeType" name = "txtIncomeType" placeholder="ប្រភេទចំណូល ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-sm-6">
															        <div class="form-group">
															        	<label class="control-label mb-10">ថ្ងៃខែឆ្នាំចំណូល <span class ="star"> ***</span></label>
															            <div class='input-group has-success' id='datetimepicker10'>
															                <input type='text' id = "txtIncomeDate" name = "txtIncomeDate" class="form-control" placeholder="DD-MM-YYYY" />
															                <span class="input-group-addon">
															                    <span class="glyphicon glyphicon-calendar">
															                    </span>
															                </span>
															            </div>
															        </div>
															    </div>
															    <script type="text/javascript">
															        $(function () {
															            $('#datetimepicker10').datetimepicker({
															                format: 'DD-MM-YYYY'
															            });
															        });
															    </script>
																<!--/span-->
															</div>
															<!-- /Row -->
															
															<div class="row">
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label mb-10">រូបិយប័ណ្ណ <span class ="star"> ***</span></label>
															        	<div class="form-group has-success">
																			<select class="form-control select2" id="cboCurrecy" name = "cboCurrecy">
																				<option value="">ជ្រើសរើសរូបិយប័ណ្ណ</option>
																				<option value="CCY-01">USD</option>
																				<option value="CCY-02">KHR</option>
																			</select>
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label mb-10">ចំនួនទឹកប្រាក់ <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtAmount" name = "txtAmount" placeholder="ចំនួនទឹកប្រាក់">
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
																		<label class="control-label mb-10">កំណត់ចំណាំ  </label>
																		<div class="form-group has-success">
																			<textarea class="form-control" rows="3" id="txtNote" name = "txtNote"​ placeholder="កំណត់ចំណាំ"></textarea>
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
			
			<script type="text/javascript" src='<c:url value="/resources/js/income.js"/>'> </script>
				
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	
	</body>
</html>