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
							<h5 class="txt-light">ស្វែងរកព័ត៌មានចំណាយផ្សេងៗ</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">គ្រប់គ្រងប្រេង</a></li>
								<li><a href="#"><span>ចំណាយផ្សេងៗ</span></a></li>
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
											        	<label class="control-label mb-10">ចាប់ពីថ្ងៃខែឆ្នាំ </label>
											            <div class='input-group has-success' id='datetimepicker10'>
											                <input type='text' id="txtFrom" class="form-control" placeholder="DD-MM-YYYY" />
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
												
												<div class="col-sm-3">
											        <div class="form-group">
											        	<label class="control-label mb-10">ដល់ថ្ងៃខែឆ្នាំ</label>
											            <div class='input-group has-success' id='datetimepicker9'>
											                <input type='text' id="txtTo" class="form-control" placeholder="DD-MM-YYYY" />
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
												
												<div class="col-sm-3">
											        <div class="form-group">
											        	<label class="control-label mb-10">ប្រភេទចំណាយ</label>
											        	<div class="form-group has-success">
															<select class="form-control select2" id="cboType">
																<option value=""></option>
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
												
												<div class="col-sm-2">
											        <div class="pull-right">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
											        		<a href='<c:url value="/expence"/>'>
																<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
																	<i class="glyphicon glyphicon-plus"></i> 
																	<span>ចំណាយផ្សេងៗ</span>
																</button>
											        		</a>
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
															<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;"><i class="glyphicon glyphicon-th-list mr-10"></i>បញ្ជីព័ត៌មានប្រភេទចំណាយផ្សេងៗ</h6>
															<div class="clearfix"></div>
															<hr>
															<div class="row">
																<div class="col-md-12">
																	<div class="form-group">
																	<!-- data-height="400" -->
																		<table data-toggle="table" class="table table-hover">
																			<thead style="background-color: rgb(86, 111, 201);">
																				<tr>
														                            <th class="txt-light">លរ</th>
														                            <th class="txt-light">លេខកូដ</th>
																					<th class="txt-light">ប្រភេទចំណាយ</th>
																					<th class="txt-light">ថ្ងៃខែឆ្នាំចំណាយ</th>
																					<th class="txt-light">រូបិយប័ណ្ណ</th>
																					<th class="txt-light">ចំនួនទឹកប្រាក់</th> 
																					<th class="txt-light">កំណត់ចំំណាំ</th>
																					<th class="txt-light">ឈ្មោះអ្នកបញ្ចូល</th>
																					<th class="txt-light">ថ្ងៃខែឆ្នាំបញ្ចូល</th>
														                            <th class="txt-light">លុបព័ត៌មាន</th></th>
																				</tr>
																			</thead>
																			<!-- <tfoot>
																				<tr>
																					<th>auto_ID</th>
														                            <th>EXP_ID</th>
																					<th>EXP_TYPE</th>
																					<th>EXP_DATE</th>
																					<th>CURRENCY</th>
																					<th>AMOUNT</th> 
																					<th>[DES]</th>
																					<th>INPUTTER</th>
																					<th>DATE_TIME</th>
														                            <th>លុប</th></th>
																				</tr>
																			</tfoot> -->

																			<tbody id="tblUsers" style="color: black;">	          
		       																</tbody>
																		</table>
																	</div>
																</div>
																<!--/span-->
																
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
			        <h4 class="modal-title custom_align" id="Heading">កែប្រែព័ត៌មានរូបិយប័ណ្ណ</h4>
			      </div>
		          <div class="modal-body">
		          	<div class="form-group">
			        	<input class="form-control " type="text" id="txtname" readonly="readonly" placeholder="ឈ្មោះរូបិយប័ណ្ណ">
			        </div>
			        <div class="form-group has-success">
			        	<input class="form-control " type="text" id="txtsale" placeholder="លក់ចេញ">
			        </div>
			        <div class="form-group has-success">
			      		<input class="form-control " type="text" id="txtbuy" placeholder="ទិញចូល">
			        </div>
			        <div class="form-group has-success">
			      		<input class="form-control " type="text" id="txtmiddle" placeholder="តំលៃកណ្តាល">
			        </div>
			      </div>
		         	<div class="modal-footer">
			        	<button type="button" id="btnEdit" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> កែប្រែព័ត៌មាន</button>
			      </div>
		        </div>
			    <!-- /.modal-content --> 
			  </div>
			      <!-- /.modal-dialog --> 
	    	</div>
	    	<!-- End of update data -->
		    
		    <!-- Delete record -->
		    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		     	<div class="modal-dialog">
				    <div class="modal-content">
			          <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading">លុបព័ត៌មានប្រភេទចំណាយ</h4>
				      </div>
				      
			          <div class="modal-body has-success">
				       	<div class="alert alert-danger">
				       		<span class="glyphicon glyphicon-warning-sign">
				       		</span> តើអ្នកពិតជាចង់លុបព័ត៌មានប្រភេទចំណាយ 
				       		<samp>
				       			<label for="myalue"></label>
				       		</samp> មែនឫ ?
				       	</div>
				      </div>
				      
	        		  <div class="modal-footer ">
				        <button type="button" id="btnDelete" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> បាទ</button>
				        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> ទេ</button>
				      </div>
			        </div>
				    <!-- /.modal-content --> 
			  	</div>
			      <!-- /.modal-dialog --> 
		    </div>
		    <!-- End of delete record -->
        
			<script type="text/javascript" src='<c:url value="/resources/js/expence_list.js"/>'> </script>
			
			<!-- JavaScripts -->
			<!-- Select2 JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
			<!-- Form Advance Init JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script>
			
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
			
		
	</body>
</html>