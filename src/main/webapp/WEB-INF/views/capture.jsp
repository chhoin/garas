<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>HENGPHEA Garas Station</title>

		<!-- Format date insert into database -->
		<script type="text/javascript" src='<c:url value="/resources/validation/moment.min.js"/>'></script>
		
		<!-- Format price -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/src/formatprice/jquery.priceformat.min.js"/>'></script>
		
		<!-- select2 CSS -->
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/css/select2.min.css"/>' type="text/css">
		
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/src/scss/separator.scss"/>' type="text/css">
		
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
			}"src/main/webapp/WEB-INF/views/customercapture.jsp"
			
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
			.star {
				color: red;
			}
			.inValidData{
				color: red;
			}
    	</style>
    	
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
							<h5 class="txt-light">ទំនិញនាំចូល</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">គ្រប់គ្រងប្រេង</a></li>
								<li><a href="#"><span>ទំនិញនាំចូល</span></a></li>
							</ol>
						</div>
						<!-- /Breadcrumb -->
					</div>
					<!-- /Title -->
					
					<!-- Row -->
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-default card-view">
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<div class="form-wrap">
													<form id="myform" action="#">
																<div class="pull-left">
																	<div class="col-md-4">
																	     <div class="form-group" style="margin-top: 12px;">
																	     	<label class="control-label mb-10">វិក័យបត្រ ​<span class ="star"> ***</span></label>
																		 </div>
																	</div>
																	<div class="col-md-8">
																		<div class="has-success" style="width: 250px;">
																			<input type="text" class="form-control" id ="txtInvoice" name ="txtInvoice" placeholder="លេខវិក័យបត្រ">
																			<!-- <input type="text" class="form-control" id ="txtUnitPriceIn" disabled="disabled" style="display: none;"> -->
																			<span class ="inValidData"></span>
																		</div>
																	</div>
																</div>
																<div class="pull-right">
																	<button type="button" id="bSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="glyphicon glyphicon-shopping-cart"></i> <span>ទិញចូលស្តុក</span></button>
																	<!-- <button type="button" id = "bPrint" class="btn btn-primary btn-rounded btn-icon left-icon" data-title="Edit" data-toggle="modal" data-target="#edit"> <i class="ti-menu-alt"></i> <span>របាយការណ៍</span></button> -->
																
												                	<a href='<c:url value="/capturelist"/>'>
																		<button type="button" id = "bPrint" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-menu-alt"></i> <span>របាយការណ៍</span></button>
																	</a>
																	<!-- <button type="button" id="btnRefresh" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-menu-alt"></i> <span>ធ្វើ​ឱ្យ​ស្រស់</span></button> -->
																</div>
																<div class="clearfix"></div>
																<hr>
																
																<!-- Row -->
																<div class="row">
																	<div class="col-md-6">
																		<div class="panel panel-default card-view" style="background-color: #eee;">								
																			<h6 class="txt-dark capitalize-font" style="font-size: 15px; color: #566fc9;">ព័ត៌មានក្រុមហ៊ុន</h6>
																			<div class="clearfix"></div>
																			<!-- <hr class="line"> -->
																			<hr style="margin-top: 5px;margin-bottom: 1px;">
																								
																			<div class="panel-wrapper collapse in"​ style="margin-bottom: -25px;">
																				<div class="panel-body">
																					<div class="row">
																						<div class="col-sm-12 col-xs-12">
																							<div class="form-wrap">													
																										<div class="row">
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ឈ្មោះក្រុមហ៊ុន</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboCompanyName" name = "cboCompanyName" >
																															<option value="">ជ្រើសរើសឈ្មោះក្រុមហ៊ុន</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ឈ្មោះអ្នកផ្គត់ផ្គង់<span class ="star"> ***</span></label>
																													<div class="form-group has-success">
																														<input type="text" class="form-control" id="txtSupplierName" name = "txtSupplierName"​ readonly="readonly" placeholder="ឈ្មោះអ្នកផ្គត់ផ្គង់">
																														<!-- <span class="help-block"> This is inline help </span>  -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										</div>															
																										<div class="row">
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ផ្លាកលេខឡាន</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboCar" name = "cboCar" >
																															<option value="">ជ្រើសរើសផ្លាកលេខឡាន</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ឈ្មោះអ្នកបើកបរ</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboDriver" name = "cboDriver" >
																															<option value="">ជ្រើសរើសឈ្មោះអ្នកបើកបរ</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										</div>																												
																							</div>
																						</div>
																					</div>
																				</div>
																			</div>
																		</div>
																		
																	</div>
																	
																	<div class="col-md-6">
																		<div class="panel panel-default card-view" style="background-color: #eee;">
																			<h6 class="txt-dark capitalize-font" style="font-size: 15px; color: #566fc9;">បញ្ជីព័ត៌មានទឹកប្រាក់សរុប</h6>
																			<div class="clearfix"></div>
																			<!-- <hr class="line"> -->
																			<hr style="margin-top: 5px;margin-bottom: 1px;">
																			
																			<div class="panel-wrapper collapse in" style="margin-bottom: -25px;">
																				<div class="panel-body">
																					<div class="row">
																						<div class="col-sm-12 col-xs-12">
																							<div class="form-wrap">
																								
																									<div class="row">
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">សរុប (ដុល្លារ)  </label>
																													<div class="form-group has-success">
																														<input type="text" class="form-control" id="txtTotalAmountUsd" name = "txtTotalAmountUsd"​ readonly="readonly" placeholder="0">
																														<!-- <span class="help-block"> This is inline help </span>  -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ប្រាក់ទទួល ​(ដុល្លារ)<span class ="star"> ***</span></label>
																													<div class="form-group has-success">
																														<input type="text" class="form-control" id="txtReceiveUsd" name = "txtReceiveUsd"​ placeholder="0">
																														<!-- <span class="help-block"> This is inline help </span>  -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										</div>
																										
																										<div class="row">
																											<div class="col-md-6">
																												<div class="form-group">
																													<label class="control-label mb-10">នៅជំពាក់ (ដុល្លារ)  </label>
																													<div class="form-group has-success">
																														<input type="text" class="form-control" id="txtOweUsd" name = "txtOweUsd"​ readonly="readonly" placeholder="0">
																														<!-- <span class="help-block"> This is inline help </span>  -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											
																											<div class="col-sm-6">
																												<div class="form-group">
																													<label class="control-label mb-10">ថ្ងៃខែឆ្នាំ សន្យាសងប្រាក់<span class ="star"> ***</span></label>
																													<div class='input-group has-success' id='datetimepicker10'>
																														<input type='text' class="form-control" id = "txtpayOffDate" name = "txtpayOffDate" placeholder="DD-MM-YYYY" />
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
																								
																							</div>
																						</div>	
																					</div>
																				</div>
																			</div>
																		</div>
																	</div>
																	
																</div>
																<!-- /Row -->
																
																<div class="panel panel-default card-view" style="background-color: #eee;">								
																			<h6 class="txt-dark capitalize-font" style="font-size: 15px; color: #566fc9;">ព័ត៌មានមុខទំនិញ</h6>
																			<div class="clearfix"></div>
																			<!-- <hr class= "line"> -->
																			<hr style="margin-top: 5px;margin-bottom: 1px;">
																			
																			<div class="clearfix"></div>					
																			<div class="panel-wrapper collapse in" style="margin-bottom: -25px;"> 
																				<div class="panel-body">
																					<div class="row">
																						<div class="col-sm-12 col-xs-12">
																							<div class="form-wrap">													
																									<div class="row">
																											<div class="col-md-3">
																												<div class="form-group">
																													<label class="control-label mb-10">ឈ្មោះមុខទំនិញ</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboProductName" name = "cboProductName" >
																															<option value="">ជ្រើសរើសឈ្មោះមុខទំនិញ</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										
																											<div class="col-md-3">
																												<div class="form-group">
																													<label class="control-label mb-10">ប្រភេទមុខទំនិញ ​</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboProductType" name = "cboProductType" >
																															<option value="">ជ្រើសរើសប្រភេទមុខទំនិញ</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											
																											<div class="col-md-3">
																												<div class="form-group">
																													<label class="control-label mb-10">ឯកតា </label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboUnit" name = "cboUnit" >
																															<option value="">ជ្រើសរើសឯកតា</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																											<div class="col-md-3">
																												<div class="form-group">
																													<label class="control-label mb-10">នាំចូលស្តុក</label>
																													<div class="form-group has-success">
																														<select class="form-control select2" id ="cboStock" name = "cboStock" >
																															<option value="">ជ្រើសរើសស្តុក</option>
																															<option value="STOCK-01">ស្តុកកាត់ទុក</option>
																															<option value="STOCK-02">ស្តុកចែកចាយ</option>
																															<option value="STOCK-03">ស្តុកហេងភា</option>
																														</select>
																														<!-- <span class="help-block"> This is inline help </span> -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										</div>
																										
																										<div class="row">
																											<div class="col-sm-3">
																												<div class="form-group">
																													<label class="control-label mb-10">ថ្ងៃខែឆ្នាំនាំទំនិញចូល<span class ="star"> ***</span></label>
																													<div class='input-group has-success' id='datetimepicker9'>
																														<input type='text' class="form-control" id = "txtImportDate" name = "txtImportDate" placeholder="DD-MM-YYYY" />
																														<span class="input-group-addon">
																															<span class="glyphicon glyphicon-calendar">
																															</span>
																														</span>
																													</div>
																												</div>
																											</div>
																											<script type="text/javascript">
																												$(function () {
																													$('#datetimepicker9').datetimepicker({
																														format: 'DD-MM-YYYY'
																													});
																												});
																											</script>
																											<!--/span-->
																											
																											<div class="col-md-9">
																												<div class="form-group">
																													<label class="control-label mb-10">កំណត់ចំណាំ  </label>
																													<div class="form-group has-success">
																														<input type="text" class="form-control" id="txtNote" name = "txtNote"​ placeholder="កំណត់ចំណាំ">
																														<!-- <span class="help-block"> This is inline help </span>  -->
																													</div>
																												</div>
																											</div>
																											<!--/span-->
																										</div>													
																							</div>
																						</div>
																					</div>
																				</div>
																			</div>
																		</div>
															
																		<!-- <div class="seprator-block"></div> -->
																		<div class="row">
																			<div class="col-md-2">
																			     <label class="control-label mb-10">រូបិយប័ណ្ណ</label>
																			     <div class="has-success">
																					<select class="form-control select2" id ="cboCurCode" name = "cboCurCode" >
																						<option value="">ជ្រើសរើសរូបិយប័ណ្ណ</option>
																					</select>
																					<!-- <span class="help-block"> This is inline help </span> -->
																				 </div>
																			</div>
																			<div class="col-md-2">
																				<label class="control-label mb-10">ចំនួនឯកតា <span class ="star"> ***</span></label>
																				<div class="has-success">
																					<input type="text" class="form-control" id ="txtUnitQty" name ="txtUnitQty" placeholder="0"​>
																				</div>
																				<span class ="inValidData"></span>
																			</div>
																			<div class="col-md-2">
																				<label class="control-label mb-10">តំលៃក្នុងមួយឯកតា<span class ="star"> ***</span></label>
																				<div class="has-success">
																					<input type="text" class="form-control" id ="txtUnitPrice" name ="txtUnitPrice" placeholder="0">
																					<!-- <input type="text" class="form-control" id ="txtUnitPriceIn" disabled="disabled" style="display: none;"> -->
																					<span class ="inValidData"></span>
																				</div>
																			</div>
																			<div class="col-md-2">
																				<label class="control-label mb-10">តំលៃសរុបស<span class ="star"> ***</span></label>
																				<div class="has-success">
																					<input type="text" class="form-control" id ="txtTotalPrice" name ="txtTotalPrice" readonly="readonly" placeholder="0" style="width:200px; float: left;">
																				</div>
																			</div>
																			<div class="col-md-1" style="float: right; margin-right: 80px;">
																				<!-- <label class="control-label mb-10">តំលៃសរុប</label> -->
																				<button type="button" id="btnReset" class="btn btn-primary btn-rounded btn-icon left-icon" style="margin-top: 35px;"> <span>កំណត់ឡើងវិញ</span></button>
																			</div>
																			<div class="col-md-1" style="float: right; margin-right: 20px;">
																				<!-- <label class="control-label mb-10">តំលៃសរុប</label> -->
																				<button type="button" id="btnAdd" class="btn btn-primary btn-rounded btn-icon left-icon" style="margin-top: 35px;"> <span>យល់ព្រម</span></button>
																			</div>
																		</div>
															
																<hr>
																<!-- === add table ==== -->
																<div class="row">
																	<div class="col-md-12"> 
																		<table class="table table-hover">
																			<thead style="background-color: rgb(86, 111, 201);">
																				<tr>
																				 	<th style="color: white; font-size: 15px;">លរ</th>
																					<th style="color: white; font-size: 15px;">ប្រភេទមុខទំនិញ</th>
																					<th style="color: white; font-size: 15px;">ឯកតា</th>
																					<th style="color: white; font-size: 15px;">ចំនួនឯកតា</th>
																					<th style="color: white; font-size: 15px;">តំលៃក្នុងមួយឯកតា</th>
																					<th style="color: white; font-size: 15px;">តំលៃសរុប</th>
														                            <th style="color: white; font-size: 15px;">លុប</th>
														                            <th style="color: white; font-size: 15px;">Category Code</th>
														                            <th style="color: white; font-size: 15px;">Item Code</th>
														                            <th style="color: white; font-size: 15px;">Product Type</th>
																				</tr>
																			</thead>
																			<tbody id = "table" style="color: black;"></tbody>
																		</table>
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
			
			<!-- Update data -->
        	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		      <div class="modal-dialog" style="width: 1300px;">
			    <div class="modal-content">
			          <div class="modal-header" style="background-color: #3cb878;">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading" style="color: white;">ព្រីនរបាយការណ៍</h4>
				      </div>
				      
			          <div class="modal-body">
	          			<form id="myform" action="#">
							<div class="form-body">
								<!-- <h6 class="txt-dark capitalize-font" style="font-size: 14px;"><i class="ti-menu-alt mr-10"></i>បញ្ចូលព័ត៌មានអតិថិជន</h6>
								<hr> -->
								<div class="row">
									<div class="col-md-12">
										<div class="panel panel-default card-view">
											
											<div class="panel-wrapper collapse in">
												<div class="panel-body">
													<div class="row">
														<div class="form-body">
															<div class="row">
																<div class="col-md-6">
																	<div class="panel panel-default card-view" style="background-color: #eee;">								
																		<h6 class="txt-dark capitalize-font" style="font-size: 15px; color: #566fc9;">ព័ត៌មានក្រុមហ៊ុន</h6>
																		<div class="clearfix"></div>
																		<!-- <hr class="line"> -->
																		<hr style="margin-top: 5px;margin-bottom: 1px;">
																							
																		<div class="panel-wrapper collapse in"​ style="margin-bottom: -25px;">
																			<div class="panel-body">
																				<div class="row">
																					<div class="col-sm-12 col-xs-12">
																						<div class="form-wrap">		
																						
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Invoice No :</label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">FOLIO-0001  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->	
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Phone :</label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">012 387 894  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Address : </label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">Phnom Penh :  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->
																																																		
																						</div>
																					</div>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																
																<div class="col-md-6">
																	<div class="panel panel-default card-view" style="background-color: #eee;">
																		<h6 class="txt-dark capitalize-font" style="font-size: 15px; color: #566fc9;">ព័ត៌មានទទួលទំនិញ</h6>
																		<div class="clearfix"></div>
																		<!-- <hr class="line"> -->
																		<hr style="margin-top: 5px;margin-bottom: 1px;">
																		
																		<div class="panel-wrapper collapse in" style="margin-bottom: -25px;">
																			<div class="panel-body">
																				<div class="row">
																					<div class="col-sm-12 col-xs-12">
																						<div class="form-wrap">
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Date :</label>
																									</div>
																								</div>
																								<!--/span-->
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">03 Mar 2018  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->	
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Received Name :</label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">Mr. Pann Matak  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">Address : </label>
																									</div>
																								</div>
																								<!--/span-->
																								<div class="col-md-9">
																									<div class="form-group">
																										<label class="control-label mb-10">Phnom Penh :  </label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->
																						</div>
																					</div>	
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
															<!-- /Row -->
															<!-- <div class="seprator-block"></div> -->
															
															<!-- <h6 class="txt-dark capitalize-font"><i class="icon-notebook mr-10"></i>address</h6> -->
															<button type="button" id="btnSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Export Excel</span></button>
															<button type="button" id="btnSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Print Now</span></button>
															<!-- <hr class="line"> -->
															<hr style="margin-top: 5px;margin-bottom: 1px;">
															
															<div class="modal-body">
														       	<table data-toggle="table" class="table">
																	<thead style="background-color: rgb(86, 111, 201);">
																		<tr style="color: white;">
																			<th style="color: white; font-size: 15px;">លរ</th>
																			<th style="color: white; font-size: 15px;">ប្រភេទមុខទំនិញ</th>
																			<th style="color: white; font-size: 15px;">ឯកតា</th>
																			<th style="color: white; font-size: 15px;">ចំនួនឯកតា</th>
																			<th style="color: white; font-size: 15px;">តំលៃក្នុងមួយឯកតា</th>
																			<th style="color: white; font-size: 15px;">តំលៃសរុប</th>
																		</tr>
																	</thead>
																	<tbody id="tblCustomersPays" style="color: black;"></tbody>
																</table>
																
																<div class="pull-right">
																	<div class="row">
																		<div class="col-md-12" style="margin-top: 25px;">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" id="txtCarNum" name = "txtCarNum"​​​ placeholder="ឈ្មោះអ្នកបើកបរ">
																			</div>
																		</div>
																		<!--/span-->
																	</div>
																	<!-- /Row -->
																	
																	<div class="row">
																		<div class="col-md-12">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" id="txtCarNum" name = "txtCarNum"​​​ placeholder="ឈ្មោះអ្នកបើកបរ">
																			</div>
																		</div>
																		<!--/span-->
																	</div>
																	<!-- /Row -->
																	
																	<div class="row">
																		<div class="col-md-12">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" id="txtCarNum" name = "txtCarNum"​​​ placeholder="ឈ្មោះអ្នកបើកបរ">
																			</div>
																		</div>
																		<!--/span-->
																	</div>
																	<!-- /Row -->
																</div>
													        </div>
													        
													        <div class="pull-right">
																<!-- <label class="control-label col-md-9">Last Name:</label>
																<input type="text" class="form-control col-md-9" id="txtCarNum" name = "txtCarNum"​​​ placeholder="ឈ្មោះអ្នកបើកបរ"> -->
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<div class="col-md-12" style="margin-top: 20px;">
																				<label class="control-label col-md-12">Total Amount :</label>
																			</div>
																		</div>
																	</div>
																	<!--/span-->
																</div>
																<!-- /Row -->
																
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<div class="col-md-12" style="margin-top: 35px;">
																				<label class="control-label col-md-12">Amount Received :</label>
																			</div>
																		</div>
																	</div>
																	<!--/span-->
																</div>
																<!-- /Row -->
																
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<div class="col-md-12" style="margin-top: 35px;">
																				<label class="control-label col-md-12">Amount​ Owe :</label>
																			</div>
																		</div>
																	</div>
																	<!--/span-->
																</div>
																<!-- /Row -->
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</form>
				      </div>
			 	</div>
				<!-- /.modal-content -->
			  </div>
			      <!-- /.modal-dialog -->
	    	</div>
	    	<!-- End of update data -->
			
			<!-- Format price -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/src/formatprice/jquery.priceformat.min.js"/>'></script>
		
			<!-- Validate -->
			<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
		
			<script type="text/javascript" src='<c:url value="/resources/js/capture.js"/>'> </script>
		
			<!-- Select2 JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
		
			<!-- Form Advance Init JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script>
				
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	</body>
</html>