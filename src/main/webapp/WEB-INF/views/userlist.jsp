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
							<h5 class="txt-light">បញ្ជីឈ្មោះអ្នកប្រើប្រាស់</h5>
						</div>
					
						<!-- Breadcrumb -->
						<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
							<ol class="breadcrumb">
								<li><a href="index.html">User Authentication</a></li>
								<li><a href="#"><span>បញ្ជីអ្នកប្រើប្រាស់</span></a></li>
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
											        	<label class="control-label mb-10">ឈ្មោះអ្នកប្រើប្រាស់</label>
											        	<div class="form-group has-success">
															<input type="text" id="texSearch" class="form-control" placeholder="ឈ្មោះអ្នកប្រើប្រាស់">
														</div>
											        </div>
											    </div>
												<!--/span-->
												
												<div class="col-sm-1">
											        <div class="form-group">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
															<button type="button" id="btnSearch" class="btn btn-primary btn-rounded btn-icon left-icon"> 
											        			<i class="glyphicon glyphicon-search"></i><span>ស្វែងរក</span>
											        		</button>
														</div>
											        </div>
											    </div>
											    
											    <div class="col-sm-1">
											        <div class="form-group">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
															<a title='edit status'  href='<c:url value='/userForm'/>' class='btn btn-success btn-sm'>Add</a>
														</div>
											        </div>
											    </div>
											    
											<%--  <div class="pull-right">
												<a href='<c:url value="/userlist"/>'>
													<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
														<i class="ti-menu-alt "></i> 
														<span>បញ្ជីអ្នកប្រើប្រាស់</span>
													</button>
												</a>
											</div> --%>
											    
												<!--/span-->
												
												<%-- <div class="col-sm-1">
											        <div class="form-group">
											        	<div style="margin-top: 30px;"></div>
											        	<div class="form-group has-success">
											        		<a href='<c:url value="/chartaccount"/>'>
																<button class="btn btn-primary btn-rounded btn-icon left-icon"> 
																	<i class="glyphicon glyphicon-plus"></i> 
																	<span>បញ្ចូល Chart Account</span>
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
															<h6 class="txt-dark capitalize-font" style="font-size: 14px; color: #566fc9;"><i class="glyphicon glyphicon-th-list mr-10"></i>បញ្ជីព័ត៌មានអ្នកប្រើប្រាស់</h6>
															<div class="clearfix"></div>
															<hr>
															<div class="row">
																<div class="col-md-12">
																	<div class="form-group">
																		<!-- <table data-toggle="table" class="table table-hover" data-height="400"> -->
																		<table data-toggle="table" class="table table-hover">
																			<thead style="background-color: rgb(86, 111, 201);">
																				<tr>
																					<th class="txt-light">លេខកូដ</th>
																					<th class="txt-light">ឈ្មោះអ្នកប្រើប្រាស់</th>
																					<th class="txt-light">លេខទូរស័ព្ទ</th>
																					<th class="txt-light">អាស័យដ្ឋាន</th>
																					<th class="txt-light">លុបអ្នកប្រើប្រាស់</th>
																					<th class="txt-light">Action</th>
																				</tr>
																			</thead>
																			
																			<tbody id="tblCustomers" style="color: black;"></tbody>
																			
																		</table>
																		<div class="text-center" style="margin: 0px 0;" id="pagination"></div>
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
		          <div class="modal-header" style="background-color: #3cb878;">
			        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			        <h4 class="modal-title custom_align" id="Heading" style="color: white;">កែប្រែព័ត៌មាន Chart Account</h4>
			      </div>
		          <div class="modal-body">
		          	<div class="form-group">
			        	<input class="form-control " type="text" id="txtEditCode" readonly="readonly" placeholder="លេខកូដ">
			        </div>
		          	<div class="form-group">
			        	<input class="form-control " type="text" id="txtEditPart" readonly="readonly" placeholder="Part">
			        </div>
			        <div class="form-group">
			        	<input class="form-control " type="text" id="txtEditDest" readonly="readonly" placeholder="បរិយាយ">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtEditName" readonly="readonly" placeholder="ឈ្មោះមុខទំនិញ">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtEditUsd" readonly="readonly" placeholder="រូបិយប័ណ្">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtEditGaras" placeholder="តំលៃហ្គារាស">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtEditCase" placeholder="តំលៃបោះដុំ">
			        </div>
			        <div class="form-group">
			      		<input class="form-control " type="text" id="txtEditEach" placeholder="តំលៃរាយ">
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
			          <div class="modal-header" style="background-color: #3cb878;">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				        <h4 class="modal-title custom_align" id="Heading" style="color: white;">លុបព័ត៌មានអ្នកប្រើប្រាស់</h4>
				      </div>
				      
			          <div class="modal-body has-success">
				       	<div class="alert alert-danger">
				       		<span class="glyphicon glyphicon-warning-sign "></span>តើអ្នកពិតជាចង់លុបព័ត៌មាន <samp><label for="myalue"></label></samp> មែនឫ ?
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
	    	
		<%-- <script type="text/javascript" src='<c:url value="/resources/js/userlist.js"/>'> </script> --%>
		
		<!-- JavaScripts -->
		<!-- Select2 JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/select2/dist/js/select2.full.min.js"/>'> </script>
		<!-- Form Advance Init JavaScript -->
		<%-- <script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/form-advance-data.js"/>'> </script> --%>
		
		<!-- Bootstrap Datetimepicker JavaScript -->
		<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>'> </script>
		
		
	
		<script type="text/javascript">
	var page = {
		limit		:	5,
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
			$("#btnSearch").attr("disabled", true);
		},
		
		initData	:	function() {
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
			
			
			//delete all
			$("#deleteSelect").click(function(){
				page.deleteProcess();
			});
			 
		},
		
		list	:	function(offset) {
			//alert("list"+offset);
			var key = ($("#texSearch").val() == "")? null:$("#texSearch").val();
			$.ajax({
	    		url 		: page.url+'/userlist/'+offset+'/'+page.limit+'/'+key,
	            type 		: 'get',
	            async		: true,
	            contentType : 'application/json;charset=utf-8',
	            success 	: function(data) {
				            	if(data.result == true) {
				            		$("tbody").html(page.listDetail(data));
				            		//console.log(data);
				            		page.pageNumber		=	data.pagination.totalPage;
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
			var str="";
			for(var i=0; i<data.body.length ; i++) {
				str +="<tr>"
					+"<td>"+data.body[i].userCode+"</td>"
					+"<td>"+data.body[i].username+"</td>"
					+"<td>"+data.body[i].phone+"</td>"
					+"<td>"+data.body[i].address+"</td>"
					+"<td>"+data.body[i].enabled+"</td>"
					+"<td >"
					+"<a title='view status'  onclick=page.deleteProcess('"+data.body[i].userCode+"') class='btn btn-danger btn-sm'>Delete</a> &nbsp;"
					+"<a title='edit status'  href='"+page.url+'user/edit/'+data.body[i].id+"' class='btn btn-success btn-sm'>Edit</a> &nbsp;"              
					+"<td>"
				+"</tr>" ;
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
		
		
		deleteProcess	: 	function(id) {
			swal({
				  title 			: 'Are you sure?',
				  text 				: "You won't be able to revert this!",
				  type 				: 'warning',
				  showCancelButton 	: true,
				  confirmButtonColor: '#3085d6',
				  cancelButtonColor : '#d33',
				  confirmButtonText : 'Yes, delete it!'
				}).then(function () {
					
					if (id != "") {
						 $.ajax({  
			                    url 	: page.url+'/user/delete/'+id,
			                    type 	:'delete',
			                    contentType: 'application/json;charset=utf-8', 
			                    success : function(data) { 
			                            if(data.result ==  true ) {
			                            	page.list(page.offset);
			                                swal(
												    'Deleted!',
												    'Your file has been deleted.',
												    'success'
												  )
			                            }
			                       },  
			                    error: function(data) {
			                    	console.log("ERROR CONTROLLER..." + JSON.stringify(data));
			                    }
			                }); 
					}else {
						swal('Oops...', 'ID went wrong!','error')
					} 
					
				})
		}
	};
	page.init();
</script>
	</body>
</html>