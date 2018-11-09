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
		
		<!-- select2 CSS -->
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/css/select2.min.css"/>' type="text/css">
		
		
		<script src="Scripts/jquery-1.3.2.js" type="text/javascript"></script>
		<!-- Format date insert into database -->
		<script type="text/javascript" src='<c:url value="/resources/validation/moment.min.js"/>'></script>
		
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
							<h5 class="txt-light">បញ្ជីទំនិញលក់ចេញ</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">របាយការណ៍</a></li>
								<li><a href="#"><span>បញ្ជីទំនិញលក់ចេញ</span></a></li>
							</ol>
						</div>
						<!-- /Breadcrumb -->
					</div>
					<!-- /Title -->
					
					<!-- Row -->
					<div class="row">
						<div class="col-sm-12">
							<div class="panel panel-default card-view">
								<div class="panel-wrapper collapse in" style="margin-bottom: -35px;">
									<div class="panel-body">
										<div class="form-wrap">
											<div class="panel-heading">
											
											<!-- Row -->
											<div class="row">
												<div class="col-md-12">
													<div class="panel panel-default card-view" style="background-color: #eee;">								
														<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;">ស្វែងរកព័ត៌មាន</h6>
														<div class="clearfix"></div>
														<!-- <hr class="line"> -->
														<hr style="margin-top: 5px; margin-bottom: 1px;">
																			
														<div class="panel-wrapper collapse in"​ style="margin-bottom: -25px;">
															<div class="panel-body">
																<div class="row">
																	<div class="col-sm-12 col-xs-12">
																		<div class="form-wrap">
																			<form id="myform" action="#">													
																					<div class="row">
																						<div class="col-sm-3">
																					        <div class="form-group">
																					        	<label class="control-label mb-10">ចាប់ពីថ្ងៃខែឆ្នាំ<span class ="star"> ***</span></label>
																					            <div class='input-group has-success' id='datetimepicker10'>
																					                <input type='text' id = "txtFrom" name = "txtFrom" class="form-control" placeholder="YYYY-MM-DD" />
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
																					                format: 'YYYY-MM-DD'
																					            });
																					        });
																					    </script>
																						<!--/span-->
													
																						<div class="col-sm-3">
																					        <div class="form-group">
																					        	<label class="control-label mb-10">ដល់ថ្ងៃខែឆ្នាំ<span class ="star"> ***</span></label>
																					            <div class='input-group has-success' id='datetimepicker9'>
																					                <input type='text' id = "txtTo" name = "txtTo" class="form-control" placeholder="YYYY-MM-DD" />
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
																					                format: 'YYYY-MM-DD'
																					            });
																					        });
																					    </script>
																						<!--/span-->
																						<div class="col-md-3">
																							<div class="form-group">
																								<label class="control-label mb-10">លេខវិក័យបត្រ</label>
																					        	<div class="form-group has-success">
																									<select class="form-control select2" id="cboInvoiceExp" name = "cboInvoiceExp">
																										<option value="">ជ្រើសរើសលេខវិក័យបត្រ</option>
																									</select>
																								</div>
																							</div>
																						</div>
																						<!--/span-->
																						<div class="col-md-3">
																							<div class="form-group">
																								<label class="control-label mb-10">ឈ្មោះអតិថិជន</label>
																					        	<div class="form-group has-success">
																									<select class="form-control select2" id="cboCustomer" name = "cboCustomer">
																										<option value="">ជ្រើសរើសឈ្មោះអតិថិជន</option>
																									</select>
																								</div>
																							</div>
																						</div>
																						<!--/span-->
																					</div>
																					<!--/row-->	
																								
																					<!-- Row -->
																					<div class="row">
																						<div class="col-md-3">
																							<div class="form-group">
																								<label class="control-label mb-10">លេខទូរស័ព្ទ</label>
																					        	<div class="form-group has-success">
																									<select class="form-control select2" id="cboPhone" name = "cboPhone">
																										<option value="">ជ្រើសរើសលេខទូរស័ព្ទ</option>
																									</select>
																								</div>
																							</div>
																						</div>
																						<!--/span-->
																						<div class="col-md-6">
																							<div class="form-group">
																								<div class="form-group has-success" style="margin-top: 20px;">
																									<button type="button" id="btnSearch" class="btn btn-primary btn-rounded btn-icon left-icon" style="margin-top: 15px;"> 
																				        				<i class="glyphicon glyphicon-search"></i><span>ស្វែងរក</span>
																				        			</button>
																								</div>
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
												
												<!-- <div class="col-md-5">
													<div class="panel panel-default card-view" style="background-color: #eee;">
														<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;">បញ្ជីព័ត៌មានទឹកប្រាក់សរុប</h6>
														<div class="clearfix"></div>
														<hr class="line">
														<hr style="margin-top: 5px; margin-bottom: 1px;">
														
														<div class="panel-wrapper collapse in" style="margin-bottom: -25px;">
															<div class="panel-body">
																<div class="row">
																	<div class="col-sm-12 col-xs-12">
																		<div class="form-wrap">
																			<form>
																				<div class="row">
																						<div class="col-md-6">
																							<div class="form-group">
																								<label class="control-label mb-10">សរុប (ដុល្លារ)</label>
																								<div class="form-group has-success">
																									<input type="text" class="form-control" id="txtAddress" name = "txtAddress"​ readonly="readonly" placeholder="0">
																									<span class="help-block"> This is inline help </span> 
																								</div>
																							</div>
																						</div>
																						/span
																					
																						<div class="col-md-6">
																							<div class="form-group">
																								<label class="control-label mb-10">សរុប (រៀល)</label>
																								<div class="form-group has-success">
																									<input type="text" class="form-control" id="txtPhone" name = "txtPhone"​ readonly="readonly" placeholder="0">
																									<span class="help-block"> This is inline help </span> 
																								</div>
																							</div>
																						</div>
																						/span
																					</div>
																			</form>
																		</div>
																	</div>	
																</div>
															</div>
														</div>
													</div>
												</div> -->
											</div>
											<!-- /Row -->	
																						
											<!-- Row -->
											<div class="row">
												<div class="col-md-12">
													<div class="panel panel-default card-view" style="background-color: #eee;">								
														<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;">បញ្ជីព័ត៌មានទំនិញលក់ចេញ</h6>
														<div class="clearfix"></div>
														<!-- <hr class="line"> -->
														<hr style="margin-top: 5px; margin-bottom: 1px;">
																			
														<div class="panel-wrapper collapse in"​ style="margin-bottom: -25px;">
															<div class="panel-body">
																<div class="row">
																		<div class="col-md-12">
																			<div class="form-group">
																				<!-- data-height="400" -->
																				<table data-toggle="table" class="table table-hover">
																					<thead style="background-color: rgb(86, 111, 201);">
																						<tr>
																						  	<th class="txt-light">លរ</th>   
																							<th class="txt-light">លេខវិក័យបត្រ</th>	
																							<th class="txt-light">ថ្ងៃខែឆ្នាំលក់ទំនិញ</th>
																							<th class="txt-light">ឈ្មោះអតិថិជន</th>
																						  	<th class="txt-light">លេខទូរស័ព្ទ</th>	
																						  	<th class="txt-light">ភូមិ</th>	 
																						  	<th class="txt-light">ឃុំ</th>
																						  	<th class="txt-light">ស្រុក</th>
																						  	<th class="txt-light">ខេត្ត</th>
																							<th class="txt-light">ឈ្មោះស្តុក</th> 
																							<th class="txt-light">ប្រភេទទំនិញ</th> 
																							<th class="txt-light">ឈ្មោះមុខទំនិញ</th>
																							<th class="txt-light">ឯកតា</th>
																							<th class="txt-light">អត្រាប្តូរប្រាក់</th>
																							<th class="txt-light">បរិមាណ</th>
																							<th class="txt-light">តំលៃក្នុងមួយឯកតា</th>
																					      	<th class="txt-light">តំលៃសរុប</th>
																							<th class="txt-light">ថ្ងៃខែឆ្នាំសន្យាសង</th>
																							<th class="txt-light">ផ្លាកលេខឡាន</th>
																							<th class="txt-light">ឈ្មោះអ្នកបើកបរ</th>
																							<th class="txt-light">គោលដៅប្រេង</th>
																							<th class="txt-light">បរិយាយ</th>
																							<th class="txt-light">ឈ្មោះអ្នកបញ្ចូល</th>
																						  	<th class="txt-light">ថ្ងៃខែឆ្នាំបញ្ចូល</th>
																						</tr>
																					</thead>		
																					<tbody id="tblUsers"​ style="color: black;"></tbody>
																				</table>
																			</div>
																		</div>
																		<!--/span-->	
																		
																		
																		<div class="fixed-table-footer" style="display: none;">
																			<table>
																				<tbody>
																					<tr></tr>
																				</tbody>
																			</table>
																		</div>
																		<div class="fixed-table-pagination" style="display: block;">
																			<div class="pull-right pagination-detail">
																				<span class="pagination-info" style="font-size: 16px; color: black;">Showing page </span>
																				<span class="page-list" style="font-size: 16px; color: black;">
																					<span class="btn-group dropup">
																						<!-- <button type="button" class="btn btn-default btn-sm btn-outline dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
																							<span class="page-size">10</span> 
																							<span class="caret"></span>
																						</button> -->
																						<select class="form-control" id="cboName">
																							<option value="">1</option>
																							<option value="">2</option>
																							<option value="">3</option>
																							<option value="">4</option>
																							<option value="">5</option>
																							<option value="">6</option>
																							<option value="">7</option>
																							<option value="">8</option>
																							<option value="">9</option>
																							<option value="">10</option>
																						</select>
																						<!-- <ul class="dropdown-menu" role="menu">
																							<li class="active"><a href="javascript:void(0)">10</a></li>
																							<li><a href="javascript:void(0)">25</a></li>
																						</ul> -->
																					</span> of 10 pages
																				</span>
																			</div>
																			<!-- <div class="pull-right pagination">
																				<ul class="pagination">
																					<li class="page-pre"><a href="javascript:void(0)">‹</a></li>
																					<li class="page-number active"><a href="javascript:void(0)">1</a></li>
																					<li class="page-number"><a href="javascript:void(0)">2</a></li>
																					<li class="page-next"><a href="javascript:void(0)">›</a></li>
																				</ul>
																			</div> -->
																		</div>
																	</div>
																	<!-- /Row -->
															</div>
														</div>
													</div>
												</div>
											</div>
											<!-- /Row -->
												
												<div class="clearfix"></div>
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
			
			<!-- Print invoice -->
        	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		      <div class="modal-dialog" style="width: 1300px;">
			    <div class="modal-content">
			          <div class="modal-header" style="background-color: #3cb878;">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading" style="color: white;">ព្រីនរបាយការណ៍</h4>
				      </div>
				      
			          <div class="modal-body">
	          			<form id="myforms" action="#">
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
																		<h6 class="txt-dark capitalize-font" style="font-size: 18px; color: #566fc9;">ព័ត៌មានអតិថិជន</h6>
																		<div class="clearfix"></div>
																		<!-- <hr class="line"> -->
																		<hr style="margin-top: 5px; margin-bottom: 1px;">
																							
																		<div class="panel-wrapper collapse in"​ style="margin-bottom: -25px;">
																			<div class="panel-body">
																				<div class="row">
																					<div class="col-sm-12 col-xs-12">
																						<div class="form-wrap">		
																						
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">ឈ្មោះអតិថិជន:</label>
																									</div>
																								</div>
																								<!--/span-->
																								<div class="col-md-9">
																									<div class="form-group">
																										<!-- <label class="control-label mb-10">លោក ប៉ាន់ ម៉ាតាក់</label> -->
																										<label for="txtInvoiceCustName"></label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->	
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">លេខទួរស័ព្ទ:</label>
																									</div>
																								</div>
																								<!--/span-->
																								<div class="col-md-9">
																									<div class="form-group">
																										<label for="txtInvoiceCustPhone"></label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">អាស័យដ្ឋាន: </label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label for="txtInvoiceAddress"></label>
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
																		<h6 class="txt-dark capitalize-font" style="font-size: 18px; color: #566fc9;">ព័ត៌មានអ្នកបញ្ជាលក់</h6>
																		<div class="clearfix"></div>
																		<!-- <hr class="line"> -->
																		<hr style="margin-top: 5px; margin-bottom: 1px;">
																		
																		<div class="panel-wrapper collapse in" style="margin-bottom: -25px;">
																			<div class="panel-body">
																				<div class="row">
																					<div class="col-sm-12 col-xs-12">
																						<div class="form-wrap">
																						<!-- Row -->											
																						<div class="row">
																							<div class="col-md-3">
																								<div class="form-group">
																									<label class="control-label mb-10">លេខវិក័យបត្រ:</label>
																								</div>
																							</div>
																							<!--/span-->
																							<div class="col-md-9">
																								<div class="form-group">
																									<label for="txtInvoiceInvoiceNo"></label>
																								</div>
																							</div>
																							<!--/span-->
																						</div>
																						<!-- /Row -->
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">ថ្ងៃខែឆ្នាំ:</label>
																									</div>
																								</div>
																								<!--/span-->
																								<div class="col-md-9">
																									<div class="form-group">
																										<label for="txtInvoiceDate"></label>
																									</div>
																								</div>
																								<!--/span-->
																							</div>
																							<!-- /Row -->	
																							
																							<!-- Row -->											
																							<div class="row">
																								<div class="col-md-3">
																									<div class="form-group">
																										<label class="control-label mb-10">ឈ្មោះអ្នកលក់:</label>
																									</div>
																								</div>
																								<!--/span-->
																								
																								<div class="col-md-9">
																									<div class="form-group">
																										<label for="txtInvoiceUser"></label>
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
															<button type="button" id="btnExportExcel" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Export Excel</span></button>
															<button type="button" id="btnPrintNow" class="btn btn-primary btn-rounded btn-icon left-icon"> <i class="ti-save"></i> <span>Print Now</span></button>
															<!-- <hr class="line"> -->
															<hr style="margin-top: 5px; margin-bottom: 1px;">
															
															<div class="modal-body">
														       	<table data-toggle="table" class="table">
																	<thead style="background-color: rgb(86, 111, 201);">
																		<tr>
																			<th style="color: red;">លរ</th>
																			<th style="color: red;">លេខកូដទំនិញ</th>
																			<th style="color: white; font-size: 15px;">ឈ្មោះមុខទំនិញ</th>
																			<th style="color: white; font-size: 15px;">ឯកតា</th>
																			<th style="color: white; font-size: 15px;">ចំនួនឯកតា</th>
																			<th style="color: white; font-size: 15px;">ប្រភេទឯកតា</th>
																			<th style="color: white; font-size: 15px;">តំលៃក្នុងមួយឯកតា</th>
																			<th style="color: white; font-size: 15px;">តំលៃសរុប</th>
																		</tr>
																	</thead>
																	<tbody id="tblCustomersInvoice" style="color: black;"></tbody>
																</table>
																
																<div class="pull-right">
																	<div class="row">
																		<div class="col-md-12" style="margin-top: 25px;">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" value="0" id="txtCarNum" name = "txtCarNum" readonly="readonly"​​​ placeholder="Total Amount">
																			</div>
																		</div>
																		<!--/span-->
																	</div>
																	<!-- /Row -->
																	
																	<div class="row">
																		<div class="col-md-12">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" value="0" id="txtCarNum" name = "txtCarNum" readonly="readonly"​​​ placeholder="Amount Received">
																			</div>
																		</div>
																		<!--/span-->
																	</div>
																	<!-- /Row -->
																	
																	<div class="row">
																		<div class="col-md-12">
																			<div class="form-group has-success">
																				<input type="text" class="form-control" value="0" id="txtCarNum" name = "txtCarNum"​​​ readonly="readonly" placeholder="Amount​ Owe">
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
	    	<!-- End of print invoice -->
        	
		    <!-- Validate -->
			<script type="text/javascript" src='<c:url value="/resources/validation/jquery.validate.min.js"/>'></script>
		    
			<script type="text/javascript" src='<c:url value="/resources/js/customercapturelist.js"/>'> </script>
			
			<!-- JavaScripts -->
			<!-- Select2 JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
			<!-- Form Advance Init JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script>
		
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
		
	</body>
</html>