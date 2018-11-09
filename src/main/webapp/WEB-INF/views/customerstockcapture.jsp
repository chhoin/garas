<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lucas Oil Station</title>

		<!-- Format date insert into database -->
		<script type="text/javascript" src='<c:url value="/resources/validation/moment.min.js"/>'></script>
		
		<!-- Format price -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/src/formatprice/jquery.priceformat.min.js"/>'></script>
		
		<!-- select2 CSS -->
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/css/select2.min.css"/>' type="text/css">
		
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
    	
    	<!-- <script type="text/javascript">
	        $(document).ready(function() {
	           // $('#btnHide').click(function() {
	                // $('td:nth-child(8)').hide();
	                // if your table has header(th), use this
	                $('td:nth-child(8),th:nth-child(8)').hide();
	           // });
	        });
	    </script> -->
    

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
							<h5 class="txt-light">ប្រតិបត្តិការណ៍លក់ចេញ</h5>
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
								
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<div class="form-wrap">
													<form id="myform" action="#">
															
																<div class="pull-left">
																	<div class="col-md-4">
																	     <div class="form-group" style="margin-top: 12px;">
																	     	<label class="control-label mb-10">លេខវិក័យបត្រ: ​</label>
																		 </div>
																	</div>
																		
																	<div class="col-md-8">
																		<div class="has-success">
																			<input type="text" class="form-control" id ="txtInvoiceOut" name ="txtInvoiceOut" readonly="readonly" placeholder="">
																			<!-- <input type="text" class="form-control" id ="txtUnitPriceIn" disabled="disabled" style="display: none;"> -->
																			<span class ="inValidData"></span>
																		</div>
																	</div>
																</div>
																<div class="pull-right">
																	<button type="button" id="bSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="glyphicon glyphicon-shopping-cart"></i> <span>លក់ចេញ</span></button>
																
												                	<a href='<c:url value="/customerstockcapturelist"/>'>
																		<button class="btn btn-primary btn-rounded btn-icon left-icon" id="btnReport"> <i class="ti-menu-alt"></i> <span>របាយការណ៍</span></button>
																	</a>
																	
																	<button type="button" id="btnRefresh" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-menu-alt"></i> <span>ធ្វើ​ឱ្យ​ស្រស់</span></button>
																	
																</div>
																<div class="clearfix"></div>
															
															
															<div style="margin-top: 25px;">	</div>
															<hr>
															
															<div class="row">
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះអតិថិជន ​<span class ="star"> ***</span> </label>
																		<div class="form-group has-success">
																			<select class="form-control select2" id ="cboCustomer" name = "cboCustomer" >
																				<option value="">ជ្រើសរើសឈ្មោះអតិថិជន</option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span> -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខទួរស័ព្ទ ​ </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtPhone" name = "txtPhone"​ readonly="readonly" placeholder="លេខទួរស័ព្ទ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">សរុប (ដុល្លារ)  </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtAddress" name = "txtAddress"​ readonly="readonly" placeholder="សរុប (ដុល្លារ)">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">សរុប (រៀល)  </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtAddress" name = "txtAddress"​ readonly="readonly" placeholder="សរុប (រៀល)">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															
															<!-- <div style="margin-top: 15px;"></div> -->
															<div class="row">
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខវិក័យបត្រ <span class ="star"> ***</span> </label>
																		<div class="form-group has-success">
																			<select class="form-control select2" id ="cboInvoice" name ="cboInvoice">
																				<option value="">ជ្រើសរើសលេខវិក័យបត្រ ​</option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">លេខ Part Code <span class ="star"> ***</span> </label>
																		<div class="form-group has-success">
																			<select class="form-control select2" id ="cboPart" name ="cboPart">
																				<option value="">ជ្រើសរើសលេខ Part Code ​</option>
																			</select>
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ប្រាក់ទទួល ​(ដុល្លារ) </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtDest" name = "txtDest" readonly="readonly" placeholder="ប្រាក់ទទួល ​(ដុល្លារ)">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ប្រាក់ទទួល ​(រៀល) </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtDest" name = "txtDest" readonly="readonly" placeholder="ប្រាក់ទទួល ​(រៀល)">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
															</div>
															<!-- /Row -->
															
															<!-- <div style="margin-top: 15px;"></div> -->
															<div class="row">
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះមុខទំនិញ </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtCategory" name = "txtCategory" readonly="readonly" placeholder="ឈ្មោះមុខទំនិញ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ចំណុះឯកតា </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtTotalQty" name = "txtTotalQty" placeholder="ចំណុះឯកតា" readonly="readonly">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">នៅជំពាក់ (ដុល្លារ) </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtTotalQty" name = "txtTotalQty" placeholder="នៅជំពាក់ (ដុល្លារ)" readonly="readonly">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">នៅជំពាក់ (រៀល)  </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtTotalQty" name = "txtTotalQty" placeholder="នៅជំពាក់ (រៀល) " readonly="readonly">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
															</div>
															<!-- /Row -->
															
															<div class="row">
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ឈ្មោះមុខទំនិញ </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtCategory" name = "txtCategory" readonly="readonly" placeholder="ឈ្មោះមុខទំនិញ">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-md-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ចំណុះឯកតា </label>
																		<div class="form-group has-success">
																			<input type="text" class="form-control" id="txtTotalQty" name = "txtTotalQty" placeholder="ចំណុះឯកតា" readonly="readonly">
																			<!-- <span class="help-block"> This is inline help </span>  -->
																		</div>
																	</div>
																</div>
																<!--/span-->
																
																<div class="col-sm-3">
																	<div class="form-group">
																		<label class="control-label mb-10">ថ្ងៃខែឆ្នាំ សន្យាសងប្រាក់ <span class ="star"> ***</span></label>
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
															<!-- /Row -->
															
														<!-- <div class="seprator-block"></div> -->
														<div class="row" style="margin-top: 25px;">
															<div class="col-md-2">
																 <label class="control-label mb-10">រូបិយប័ណ្ណ <span><input type="hidden" id ="txtCcys" name ="txtCcys" value="CCY-01" style="width: 100px;"></span> </label>
															     <div class="has-success">
																	<input type="text" class="form-control" id ="txtCcy" name ="txtCcy" readonly="readonly" placeholder="រូបិយប័ណ្ណ">
																	<span class ="inValidData"></span>
																 </div>
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
																<label class="control-label mb-10">ចំនួនឯកតា <span class ="star"> ***</span></label>
																<div class="has-success">
																	<input type="text" class="form-control" id ="txtUnitQty" name ="txtUnitQty" placeholder="0"​>
																</div>
																<span class ="inValidData"></span>
															</div>
															
															<div class="col-md-2">
																<label class="control-label mb-10">តំលៃសរុប</label>
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
																<!-- <table class="table table-fixed">
												    				 <thead id="thead">
																		<tr>
																			<th>លរ</th>
																			<th>ប្រភេទទំនិញ</th>
																			<th>ឯកតា</th>
																			<th>ចំនួនឯកតា</th>
																			<th>តំលៃក្នុងមួយឯកតា</th>
																			<th class ="price">តំលៃសរុប</th>
												                            <th>លុប</th>										                          
																		</tr>
															       </thead>
															       <tbody id = "table" style="color: black;"></tbody>
																</table> -->
																
																<table class="table table-hover">
																	<thead style="background-color: rgb(86, 111, 201);">
																		<tr>
																		 	<th class="txt-light">លរ</th>
																			<th class="txt-light">ប្រភេទទំនិញ</th>
																			<th class="txt-light">ឯកតា</th>
																			<th class="txt-light">ចំនួនឯកតា</th>
																			<th class="txt-light">តំលៃក្នុងមួយឯកតា</th>
																			<th class ="price" style="color: white;">តំលៃសរុប</th>
												                            <th class="txt-light">លុប</th>
												                            <th class="txt-light">Category Code</th>
												                            <th class="txt-light">Item Code</th>	
																		</tr>
																	</thead>
																	<tbody id = "table" style="color: black;"></tbody>
																</table>
																		
																		
															</div>
													</div>
													
													<div style="margin-top: 30px;"></div>
													<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;">បញ្ជីព័ត៌មានទឹកប្រាក់សរុប</h6>
													<div class="clearfix"></div>
													<hr>
													
													<div class="row">
														<div class="col-md-4">
															<div class="form-group">
																<label class="control-label mb-10">សរុប (ដុល្លារ) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtTotalAmountUsd" name = "txtTotalAmountUsd" readonly="readonly" placeholder="0">
																	<!-- <span class="help-block"> This is inline help </span>  -->
																</div>
															</div>
														</div>
														<!--/span-->
													
														<div class="col-md-4">
															<div class="form-group">
																<label class="control-label mb-10">ប្រាក់ទទួល ​(ដុល្លារ) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtReceiveUsd" name = "txtReceiveUsd" value="0" placeholder="0">
																	<!-- <span class="help-block"> This is inline help </span>  -->
																</div>
															</div>
														</div>
														<!--/span-->
														
														<div class="col-md-4">
															<div class="form-group">
																<label class="control-label mb-10">នៅជំពាក់ (ដុល្លារ) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtOweUsd" name = "txtOweUsd" readonly="readonly" placeholder="0">
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
																<label class="control-label mb-10">សរុប (រៀល) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtTotalAmountKhr" name = "txtTotalAmountKhr" readonly="readonly" placeholder="0">
																	<!-- <span class="help-block"> This is inline help </span>  -->
																</div>
															</div>
														</div>
														<!--/span-->
													
														<div class="col-md-4">
															<div class="form-group">
																<label class="control-label mb-10">ប្រាក់ទទួល ​(រៀល) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtReceiveKhr" name = "txtReceiveKhr" readonly="readonly" placeholder="0">
																	<!-- <span class="help-block"> This is inline help </span>  -->
																</div>
															</div>
														</div>
														<!--/span-->
														
														<div class="col-md-4">
															<div class="form-group">
																<label class="control-label mb-10">នៅជំពាក់ (រៀល) </label>
																<div class="form-group has-success">
																	<input type="text" class="form-control" id="txtOweKhr" name = "txtOweKhr" readonly="readonly" placeholder="0">
																	<!-- <span class="help-block"> This is inline help </span>  -->
																</div>
															</div>
														</div>
														<!--/span-->
													</div>
													<!-- /Row -->
													
													<div class="row">
														<div class="col-sm-4">
															<div class="form-group">
																<label class="control-label mb-10">ថ្ងៃខែឆ្នាំ សន្យាសងប្រាក់ <span class ="star"> ***</span></label>
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
													<!-- /Row -->
													
													<div class="clearfix"></div>
													<hr>
														
													<div class="pull-right">
														<button type="button" id="bSave" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="glyphicon glyphicon-shopping-cart"></i> <span>លក់ចេញ</span></button>
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
							<a href="index.html" class="brand mr-30" style="color: white;"><img src="dist/img/logo-sm.png" alt="logo"/></a>
							<ul class="footer-link nav navbar-nav">
								<li class="logo-footer"><a href="#"​​ style="color: white;">មាតិការ</a></li>
								<li class="logo-footer"><a href="#" style="color: white;">របៀប្រើប្រាស់</a></li>
								<li class="logo-footer"><a href="#" style="color: white;">អំពីយើង</a></li>
							</ul>
						</div>
						<div class="col-sm-7 text-right">
							<p style="color: white;">2017 &copy; កម្មវិធីគ្រប់គ្រងអាជីវកម្ម បង្កើតឡើងដោយ Smart Solution</p>
						</div>
					</div>
				</footer>
				<!-- /Footer -->
			</div>
			<!-- /Main Content -->
			
		<!-- Format price -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/src/formatprice/jquery.priceformat.min.js"/>'></script>
		
		<!-- Validate -->
		<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
		
		<script type="text/javascript" src='<c:url value="/resources/js/customerstockcapture.js"/>'> </script>
		
		<!-- Select2 JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
		
		<!-- Form Advance Init JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script>
				
		<!-- Bootstrap Datetimepicker JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
		
	</body>
</html>