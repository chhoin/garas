<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"​​​​pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- <html lang="en"> -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Prepaid Accrued Module</title>
		
		<!-- select2 CSS -->
		<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/css/select2.min.css"/>' type="text/css">
		
		<!-- <script src="Scripts/jquery-1.3.2.js" type="text/javascript"></script> -->
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
							<h5 class="txt-light">បញ្ជីព័ត៌មានអតិថិជន</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">View</a></li>
								<li><a href="#"><span>បញ្ជីព័ត៌មានអតិថិជន</span></a></li>
							</ol>
						</div>
						<!-- /Breadcrumb -->
					</div>
					<!-- /Title -->
					
					<div class="row">
						<div class="col-sm-12">
							<div class="panel panel-default card-view" style="height: 130px;">
								<div class="panel-wrapper collapse in">
									<div class="panel-body">
										<div class="form-wrap">
											<div class="panel-heading">
												<div class="row">
												<div class="col-sm-3">
											        <div class="form-group">
											        	<label class="control-label mb-10">ឈ្មោះអតិថិជន</label>
											        	<div class="form-group has-success">
															<select class="form-control select2" id="cboName">
																<option value="">Show Data All</option>
															</select>
														</div>
											        </div>
											    </div>
												<!--/span-->
												
												<div class="col-sm-3">
											        <div class="form-group">
											        	<label class="control-label mb-10">លេខទូរស័ព្ទ</label>
											        	<div class="form-group has-success">
															<select class="form-control select2" id="cboPhone">
																<option value="">Show Data All</option>
															</select>
														</div>
											        </div>
											    </div>
												<!--/span-->
												
												<div class="col-sm-4">
											        <div class="form-group">
											        	<label class="control-label mb-10">អាស័យដ្ឋាន </label>
											        	<div class="form-group has-success">
															<select class="form-control select2" id="cboVillage">
																<option value="">Show Data All</option>
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
															<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #428BCA;"><i class="glyphicon glyphicon-th-list mr-10"></i>List of Sub Branches</h6>
															<h6 class="pull-right" style="font-size: 14px; color: #428BCA;"><i class="glyphicon glyphicon-th-list mr-10"></i>Export to Excel File</h6>
															<div style="margin-top: 25px;"></div>
															<!-- Table -->
															<div class="row">
																<div class="col-md-12">
																	<div class="form-group">
																		<!-- data-height="400" -->
																		<table data-toggle="table" class="table table-hover">
																			<thead style="background-color: #428BCA;">
																				<tr>														                           
																					<th class="txt-light">លរ</th>
																					<th class="txt-light">លេខកូដ</th>
																				    <th class="txt-light">ឈ្មោះអតិថិជន</th>
																				    <th class="txt-light">ភេទ</th>
																				    <th class="txt-light">លេខទូរស័ព្ទ</th>
																				    <th class="txt-light">ភូមិ</th>
																				    <th class="txt-light">ឃុំ</th>
																				    <th class="txt-light">ស្រុក</th>
																				    <th class="txt-light">ខេត្ត</th>
																				    <th class="txt-light">ឈ្មោះអ្នកបញ្ចូល</th>
																				    <th class="txt-light">ថ្ងៃខែឆ្នាំបញ្ចូល</th>
																				    <th class="txt-light">កែប្រែ</th>
		      																		<th class="txt-light">លុប</th>
																				</tr>
																			</thead>
																			<tbody id="tbody"​ style="color: black;"></tbody>
																		</table>
																	</div>
																</div>
																<!-- /span -->
															</div>	
															<!-- /Table -->			
																										
															<!-- Pagination -->
															<div class="fixed-table-pagination" style="color: black;">
																<div class="pull-left pagination-detail" id="pagination">
																	
																</div>
															</div>
															<!-- /Pagination -->
															
														</div>
													</form>
												</div>
											</div>
										</div>
										<!-- /Row -->
										
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
							<p style="color: white;">2019 &copy; កម្មវិធីគ្រប់គ្រងអាជីវកម្ម បង្កើតឡើងដោយ Smart Solution</p>
						</div>
					</div>
				</footer>
				<!-- /Footer -->
			
			</div>
			<!-- /Main Content -->
        	
        	<!-- Update data -->
        	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
		      <div class="modal-dialog">
			    <div class="modal-content">
		          <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			        <h4 class="modal-title custom_align" id="Heading">Update</h4>
			      </div>
		          <div class="modal-body">
		          	<div class="form-group">
			        	<input class="form-control " type="text" id="txtname" readonly="readonly" placeholder="aa">
			        </div>
			        <div class="form-group">
			        	<input class="form-control " type="text" id="txtsale" placeholder="aa">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtbuy" placeholder="aa">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtmiddle" placeholder="aa">
			        </div>
			      </div>
		         	<div class="modal-footer ">
			        	<button type="button" id="btnEdit" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Update</button>
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
				        <h4 class="modal-title custom_align" id="Heading">Delete</h4>
				      </div>
			          <div class="modal-body">
				       	<div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> are you sure?</div>
				      </div>
	        		  <div class="modal-footer ">
				        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> yes</button>
				        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
				      </div>
			        </div>
				    <!-- /.modal-content --> 
			  	</div>
			      <!-- /.modal-dialog --> 
		    </div>
		    <!-- End of delete record -->
		    
			<script type="text/javascript" src='<c:url value="/resources/js/customerlist.js"/>'> </script>
			
			<!-- JavaScripts -->
			<!-- Select2 JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
			<!-- Form Advance Init JavaScript -->
			<%-- <script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script> --%>
		
			<!-- Bootstrap Datetimepicker JavaScript -->
			<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var page = {
				limit		:	10,
				offset		:	1,
				pageNumber	:	0,
				currentPage	:	1,
				url			:	"<c:url value='/'/>",
				init	:	function() {
					page.initInterface();
					page.initData();
					page.initEvent();
				},
				
				initInterface	:	function() {
					//$("#btnSearch").attr("disabled", true);
					//$("#deleteSelect").attr("disabled", true);
				},
				
				initData	:	function() {
					page.renderListComboBoxName();
					page.renderListComboBoxPhone();
					page.list(page.offset);
				},
				
				initEvent	:	function() {
					//search event
					 $("#texSearch").keypress(function(e){
						if( this.value.length > 1 && e.keyCode == 13 ){
							page.list(page.offset);
						}
					}).keyup(function(e){
						if( this.value.length >= 1 ){
							$("#btnSearch").removeAttr('disabled');
						}else{
							$("#btnSearch").attr('disabled', true);
							page.list(page.offset);
						}
					}); 
					
					$("#btnSearch").click(function(){
							page.list(page.offset);
					});
															
					//**jquery click event on dynamically generated elements
					$(document).on('click','.checkId',function(e){
						e.stopPropagation();
			 			if( $(".checkId:checked").length == 0){
			 				$('#deleteSelect').attr('disabled', true);
			 				$("#deleteAll").attr("checked", false);
						}else{
							$('#deleteSelect').attr('disabled', false);
						}
					});															 
				},
				
				list	:	function(offset) {
					//alert("list"+offset);
					var name = ($("#cboName").val() == "")? "null":$("#cboName").val();
					var phone = ($("#cboPhone").val() == "")? "null":$("#cboPhone").val();
					var address = ($("#cboVillage").val() == "")? "null":$("#cboVillage").val();
					
					$.ajax({
			    		url 		: page.url+'api/customerlists/'+name+','+phone+','+address+','+offset+','+page.limit,
			            type 		: 'get',
			            async		: true,
			            contentType : 'application/json;charset=utf-8',
			            success 	: function(data) {
			            				//console.log(JSON.stringify(data));
			            				/* $("tbody").html(page.listDetail(data.DATA));
						            	page.pageNumber		= data.totalPage; //TODO
						            	page.pagination(); */
						            	console.log(JSON.stringify(data));
						             	if(data.result == true) {
						            		$("tbody").html(page.listDetail(data.DATA));
						            		page.pageNumber		= data.totalPage;
						            		page.pagination();
						            	} else {
						            		 $('#tbody').html('');
					                         $('#pagination').html('');
						            	} 
			            },
			            error 		: function(data) {
			            	console.log("ERROR CONTROLLER..." + JSON.stringify(data));
			            }
			        });	
				},
				
				listDetail	:	function(data) {
					//alert(data);
					var str="";
					for(var i=0; i<data.length ; i++) {
						str +="<tr>"
								+"<td>"+data[i].autoId+"</td>"
								+"<td>"+data[i].custCode+"</td>"
								+"<td>"+data[i].custKhName+"</td>"
								+"<td>"+data[i].gender+"</td>"
								+"<td>"+data[i].phone+"</td>"
								+"<td>"+data[i].villageCode+"</td>"
								+"<td>"+data[i].communeCode+"</td>"
								+"<td>"+data[i].districtCode+"</td>"
								+"<td>"+data[i].provinceCode+"</td>"
								+"<td>"+data[i].userName+"</td>"
								+"<td>"+data[i].entryDate+"</td>"
								+"<td>"
								+"<p data-placement='top' data-toggle='tooltip' title='Edit'><button type='button' id='btnEEdit' class='btn btn-primary btn-xs' data-title='Edit' data-toggle='modal' data-target='#edit' ><span class='glyphicon glyphicon-pencil'></span> </button></p>"
								+"</td>"
								+"<td>"+data[i].autoId+"</td>"
							+"</tr>";
					}
					return str;
				},
				
				pagination	:	function() {
					$('#pagination').bootpag({
				        total 		: parseInt(page.pageNumber),
				        maxVisible	: 5,
				        leaps		: true,
				        firstLastUse: true,
				        first 		: '&#8592;',
				        last 		: '&#8594;',
				        wrapClass 	: 'pagination',
				        activeClass : 'active',
				        disabledClass: 'disabled',
				        nextClass 	: 'next',
				        prevClass 	: 'prev',
				        lastClass 	: 'last',
				        firstClass 	: 'first'
				    }).on("page", function(event, num) {
				    		page.loadPagination(parseInt(num));
							page.offset = num;
				    });
				}, 
				
				//if I check in bootpag it not work
				loadPagination	:	function(num) {
					if(page.currentPage != num){
						//alert(num);
						page.currentPage = num;
						page.list(num);
					}
				},
				
				renderListComboBoxName : function() {
					var url = baseUrl + "api/customerlistcomboname";
					$.get(url, function(customers){
						$.each(customers, function(index, customer){
							var option = $('<option />');
							option.attr('value', customer.custCode)
								  .text(customer.custKhName);
						    $('#cboName').append(option);
						});
					});
				},
				
				renderListComboBoxPhone : function() {
					var url = baseUrl + "api/customerlistcombophone";
					$.get(url, function(customers){
						$.each(customers, function(index, customer){
							var option = $('<option />');
							option.attr('value', this.value).text(customer.phone);
						    $('#cboPhone').append(option);
						});
					});
				}
			};
			page.init();
		});
		
		</script>
				
	</body>
</html>