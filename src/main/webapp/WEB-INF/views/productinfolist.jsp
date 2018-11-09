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
		
		<!-- select2 CSS -->
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/css/select2.min.css"/>' type="text/css">
		
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
							<h5 class="txt-light">បញ្ជីមុខទំនិញ</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">View</a></li>
								<li><a href="#"><span>បញ្ជីមុខទំនិញ</span></a></li>
							</ol>
						</div>
						<!-- /Breadcrumb -->
					</div>
					<!-- /Title -->
					
					<div class="row">
						<div class="col-sm-12">
							<div class="panel panel-default card-view">
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="form-wrap">
											
											<div class="row">
												<div class="col-sm-3">
											        <div class="form-group">
											        	<label class="control-label mb-10">ឈ្មោះទំនិញ</label>
											        	<div class="form-group has-success">
															<select class="form-control select2" id="cboProductCode" name = "cboProductCode">
																<option value="">ជ្រើសរើសឈ្មោះទំនិញ</option>
															</select>
														</div>
											        </div>
											    </div>
												<!--/span-->
												<div class="col-sm-1">
											        <div class="form-group">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
															<button type="submit" id="btnSearch" class="btn btn-primary btn-rounded btn-icon left-icon"> 
											        			<i class="glyphicon glyphicon-search"></i><span>ស្វែងរក</span>
											        		</button>
														</div>
											        </div>
											    </div>
												<!--/span-->
												
												<%-- <div class="col-sm-1">
											        <div class="form-group">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
											        		<a href='<c:url value="/supplier"/>'>
																<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
																	<i class="glyphicon glyphicon-plus"></i> 
																	<span>បញ្ចូលអ្នកផ្គត់ផ្គង់</span>
																</button>
											        		</a>
														</div>
													</div>
											    </div> --%>
										        <!--/span-->
											</div>
											<!-- /Row -->
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>	
					<!-- /Row -->
					
					<!-- Row -->
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-default card-view">
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<div class="form-wrap">
													<form action="#">
														<div class="form-body">
															<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;"><i class="glyphicon glyphicon-th-list mr-10"></i>បញ្ជីព័ត៌មានអ្នកផ្គត់ផ្គង់</h6>
															<div class="clearfix"></div>
															<hr>
															<div class="row">
																<div class="col-md-12">
																	<div class="form-group">
																		<!-- <table data-toggle="table" class="table table-hover" data-height="400"> -->
																		<table data-toggle="table" class="table table-hover">
																			<thead style="background-color: rgb(86, 111, 201);">
																				<tr>
																					<th class="txt-light">លរ</th>
																					<th class="txt-light">លេខកូដ</th> 
																					<th class="txt-light">ប្រភេទទំនិញ</th> 
																					<th class="txt-light">ឈ្មោះទំនិញ</th>
																					<th class="txt-light">រូបិយបណ្ណ</th> 
																					<th class="txt-light">តំលៃលក់ដុំ</th> 
																					<th class="txt-light">តំលៃលក់រាយ</th>
																					<th class="txt-light">ចំនួនឯកតា</th> 
																					<th class="txt-light">កំណត់ចំណាំ</th> 
																					<th class="txt-light">ឈ្មោះអ្នកប្រើប្រាស់</th>
																					<th class="txt-light">ថ្ងៃខែឆ្នាំបញ្ចូល</th>
																					<th class="txt-light">កែប្រែ</th>
																				</tr>
																			</thead>
																			<tbody id="tblCustomers" style="color: black;"></tbody>
																		</table>
																	</div>
																</div>
																<!--/span-->
																
																<!-- next page -->
																<div class="fixed-table-pagination" style="display: block;">
																	<div class="pull-left pagination-detail">
																		<button type="button" id="btnNext" class="btn btn-primary btn-rounded btn-icon left-icon"><i class="glyphicon glyphicon-chevron-left"></i>​​</button>
																		<button type="button" id="btnPrevious" class="btn btn-primary btn-rounded btn-icon left-icon"><i class="glyphicon glyphicon-chevron-right"></i>​​</button>
																		<!-- <span class="page-list" style="font-size: 16px; color: black;">
																			<button type="button" id="btnNext" class="btn btn-primary btn-rounded btn-icon left-icon"><i class="glyphicon glyphicon-search"></i>​​<span></span></button>
																		</span> -->
																	</div>
																</div>
																<!--/next page-->
																
																<!-- <div style="margin-top: 50px;"></div> -->
																
																<!-- pagination-->
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
																				</select>
																			</span> of 10 pages
																		</span>
																	</div>
																</div>
																<!--/pagination-->
																
															</div>
															<!-- /Row -->
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
        	
        	<!-- Add new record -->
        	<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="add" aria-hidden="true">
		      <div class="modal-dialog">
			    <div class="modal-content">
		          <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			        <h4 class="modal-title custom_align" id="Heading">Add New Branches</h4>
			      </div>
		          <div class="modal-body">
		          	<div class="form-group">
			        	<input class="form-control " type="text" placeholder="Tiger Nixon">
			        </div>
			        <div class="form-group">
			        	<input class="form-control " type="text" placeholder="System Architect">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" placeholder="Edinburgh">
			        </div>
			      </div>
		         	<div class="modal-footer ">
			        	<button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Add</button>
			      </div>
		        </div>
			    <!-- /.modal-content --> 
			  </div>
			      <!-- /.modal-dialog --> 
	    	</div>
        	<!-- End of add new record -->
        	
        	<!-- Update data -->
        	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		      <div class="modal-dialog">
			    <div class="modal-content">
		          <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			        <h4 class="modal-title custom_align" id="Heading">កែប្រែព័ត៌មានមុខទំនិញ</h4>
			      </div>
		          <div class="modal-body">
			          	<div class="form-group">
				        	<input class="form-control " type="text" id="txtUpdateCode" name = "txtUpdateCode" readonly="readonly" placeholder="លេខកូដ">
				        </div>
			          	<div class="form-group">
				        	<input class="form-control " type="text" id="txtUpdateName" name = "txtUpdateName" readonly="readonly" placeholder="ឈ្មោះមុខទំនិញ">
				        </div>
				        <div class="form-group">
				        	<input class="form-control " type="text" id="txtUpdatePrice" name = "txtUpdatePhone" placeholder="តំលៃលក់ដុំ">
				        </div>
				        <div class="form-group">
				        	<input class="form-control " type="text" id="txtUpdateUnitPrice" name = "txtUpdatePhone" placeholder="តំលៃលក់រាយ">
				        </div>
			      </div>
		         	<div class="modal-footer ">
			        	<button type="button" id="btnEdit" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> កែប្រែព័ត៌មាន</button>
			      </div>
		        </div>
			    <!-- /.modal-content --> 
			  </div>
			      <!-- /.modal-dialog --> 
	    	</div>
	    	<!-- End of update data -->
	    	
		    <!-- Delete record -->
		    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="delete" aria-hidden="true">
		     	<div class="modal-dialog">
				    <div class="modal-content">
			          <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading">Delete</h4>
				      </div>
				      
			          <div class="modal-body has-success">
				       	<div class="alert alert-danger">
				       		<span class="glyphicon glyphicon-warning-sign "></span>  តើអ្នកពិតជាចង់លុបព័ត៌មានអ្នកផ្គត់ផ្គង់ <samp><label for="myalue"></label></samp> មែនឫ ?
				       	</div>
				      </div>
				      
	        		  <div class="modal-footer ">
				        <button type="button" id="btnDelete" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
				        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
				      </div>
			        </div>
				    <!-- /.modal-content --> 
			  	</div>
			      <!-- /.modal-dialog --> 
		    </div>
		    <!-- End of delete record -->
	    	
		<script type="text/javascript" src='<c:url value="/resources/js/productinfolist.js"/>'> </script>
		
		<!-- JavaScripts -->
		<!-- Select2 JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
		<!-- Form Advance Init JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script>
		
		<!-- Bootstrap Datetimepicker JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
		
	</body>
</html>