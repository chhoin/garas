<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Management System Project</title>
    	
    	<script src="Scripts/jquery-1.3.2.js" type="text/javascript"></script>
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
							<h5 class="txt-light">ចែកចាយប្រេង</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">គ្រប់គ្រងប្រេង</a></li>
								<li><a href="index.html">ផ្គត់ផ្គង់ប្រេង</a></li>
								<li><a href="#"><span>ចែកចាយប្រេង</span></a></li>
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
										<h4 class="panel-title txt-dark" style="font-size: 16px;">ចែកចាយប្រេង</h4>
									</div>
									<div class="pull-right">
										<a href='<c:url value="/customerinvoice"/>'>
											<button class="btn btn-primary btn-rounded btn-icon left-icon" style="margin-top: 15px;"> 
												<i class="glyphicon glyphicon-plus "></i> 
												<span>បញ្ចូលអ្នកជំពាក់លុយ</span>
											</button>
										</a>
										<a href='<c:url value="/#"/>'>
											<button class="btn btn-primary btn-rounded btn-icon left-icon" style="margin-top: 15px;"> 
												<i class="ti-menu-alt "></i> 
												<span>បញ្ចីចែកចាយប្រេង</span>
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
															<h6 class="txt-dark capitalize-font" style="font-size: 14px;"><i class="ti-menu-alt mr-10"></i>បញ្ចូលព័ត៌មានចែកចាយប្រេង</h6>
															<hr>
															
															<div class="row">
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">កាត់ចេញពី <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id ="cboProduct" name = "cboProduct">
																				<option value=""></option>
																				<option value="">កាត់ចេញពីកញ្ចប់</option>
																				<option value="">កាតចេញពីក្រុមហ៊ុន</option>
																			</select>
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
																		<label class="control-label mb-10">លេខវិក័យប័ត្រ <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" id="txtInvoiceNo" name = "txtInvoiceNo" class="form-control" placeholder="លេខវិក័យបត្រ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះអតិថិជន <span class ="star"> ***</span></label>
																		<div class="control-label has-success">
																			<select class="form-control" id ="cboSupplier" name = "cboSupplier">
																				<option value=""></option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខទូរស័ព្ទ <span class ="star"> ***</span></label>
																		<div class="control-label has-success">
																			<select class="form-control" id ="cboPhone" name = "cboPhone">
																				<option value=""></option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															<!-- /Row -->
															
															<div class="row">
																
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">ប្រភេទទំនិញ <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id ="cboCategories" name = "cboCategories">
																				<option value=""></option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះមុខទំនិញ <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id ="cboProduct" name = "cboProduct">
																				<option value=""></option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">ឯកតា <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id="cboUnit" name = "cboUnit">
																				<option value=""></option>
																			</select>
																			<!-- <input type="text" id="txtUnit" class="form-control" placeholder="ឯកតា"> -->
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
																		<label class="control-label mb-10">ប្រភេទរូបិយប័ណ្ណ <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id="cboCrrency" name = "cboCrrency">
																				<option value=""></option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-sm-4">
															        <div class="form-group">
															        	<label class="control-label mb-10">ថ្ងៃខែឆ្នាំចែកចាយ <span class ="star"> ***</span></label>
															            <div class='input-group has-success' id='datetimepicker10'>
															                <input type='text' id="txtDate" name = "txtDate" class="form-control" placeholder="DD-MM-YYYY" />
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
																
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">បរិមាណប្រេង <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" id="txtQTY" name = "txtQTY" class="form-control" placeholder="បរិមាណ">
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
																		<label class="control-label mb-10">តំលៃក្នុងមួយឯកតា <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" id="txtUnitPrice" name = "txtUnitPrice" class="form-control" placeholder="តំលៃក្នុងមួយឯកតា">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">តំលៃប្រេងសរុប <span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<input type="text" id=txtTotalPrice class="form-control" placeholder="តំលៃសរុប" readonly="readonly">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-4">
																	<div class="form-group">
																		<label class="control-label mb-10">ស្ថានភាព<span class ="star"> ***</span></label>
																		<div class="form-group has-success">
																			<select class="form-control" id ="cboAction" name = "cboAction">
																				<option value=""></option>
																				<option value="">ជំពាក់</option>
																				<option value="">អោយលុយភ្លាម</option>
																			</select>
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
																		<label class="control-label mb-10">កំណត់ចំណាំ</label>
																		<div class="form-group has-success">
																			<textarea class="form-control" rows="3" id="txtNote" placeholder="កំណត់ចំណាំ"></textarea>
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
																		<!-- <button class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="icon-close"></i> <span>ចាកចេញ</span></button> -->
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
			
			<!-- Clear Form -->
			<%-- <script type="text/javascript" src='<c:url value="/resources/validation/jquery-1.12.3.min.js"/>'></script> --%>
		
			<!-- Validate -->
			<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
			
			<script type="text/javascript" src='<c:url value="/resources/js/capture.js"/>'> </script>
				
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	
		
	</body>
</html>