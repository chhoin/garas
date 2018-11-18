<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<title>Prepaid Accrued Module</title>
	<meta name="description" content="Kenny is a Dashboard & Admin Site Responsive Template by hencework." />
	<meta name="keywords" content="admin, admin dashboard, admin template, cms, crm, Kenny Admin, kennyadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application" />
	<meta name="author" content="hencework"/>
	
	<!-- Favicon -->
	<!-- <link rel="shortcut icon" href="favicon.ico"> -->
	<link rel="icon" href="favicon.ico" type="image/x-icon">

	<!-- Bootstrap table CSS -->
	<link rel="stylesheet" href='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap-table/dist/bootstrap-table.css"/>' type="text/css">
	
	<!-- Date time picker -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker3.min.css">
	
	<!-- Custom CSS -->
	<link rel="stylesheet" href='<c:url value="/resources/designs/main/dist/css/style.css"/>' type="text/css">
	
	<script type="text/javascript">
		var baseUrl = "<c:url value='/'/>";
	</script>
	
</head>

<body>
	<!--Preloader-->
	<div class="preloader-it">
		<div class="la-anim-1"></div>
	</div>
	<!--/Preloader-->
    <div class="wrapper">

       <!-- Top Menu Items -->
		<nav class="navbar navbar-inverse navbar-fixed-top" style="background-color: #428BCA;">
				<a id="toggle_nav_btn" class="toggle-left-nav-btn inline-block mr-20 pull-left" href="javascript:void(0);" style="color: white;"><i class="fa fa-bars"></i></a>
				<%-- <a href='<c:url value="home"/>'><img class="brand-img pull-left" src='<c:url value="/resources/designs/main/dist/img/logo"/>' alt="HengPhea Garas Station" style="color: white; font-size: 25px;"></a> --%>
				<a href='<c:url value="home"/>'><span class ="brand-img pull-left" style="color: white; font-size: 25px;">HengPhea Garas Station</span></a>
				<ul class="nav navbar-right top-nav pull-right">
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell top-nav-icon"></i><span class="top-nav-icon-badge"><label for="getCounts"></label></span></a>
						<ul class="dropdown-menu alert-dropdown" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
							<li>
								<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 80px;"><div class="streamline message-box message-nicescroll-bar" style="overflow: hidden; width: auto; height: 320px;">
									<div class="sl-item">
										<div class="sl-avatar avatar avatar-sm avatar-circle">
											<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user.png"/>' alt="avatar">
										</div>
										<div class="sl-content">
											<a href='<c:url value="customerinvoicelistalert"/>' class="inline-block capitalize-font  pull-left">បញ្ជីអ្នកជំពាក់ប្រាក់</a>
											<span class="inline-block font-12  pull-right">12/10/16</span>
											<div class="clearfix"></div>
											<p>List of Debtors!</p>
										</div>
									</div>
									<%-- <hr>
									<div class="sl-item">
										<div class="icon">
											<i class="fa fa-spotify"></i>
										</div>
										<div class="sl-content">
											<a href="javascript:void(0)" class="inline-block capitalize-font  pull-left">
											2 voice mails</a>
											<span class="inline-block font-12  pull-right">2pm</span>
											<div class="clearfix"></div>
											<p>Neque porro quisquam est</p>
										</div>
									</div>
									<hr>
									<div class="sl-item">
										<div class="icon">
											<i class="fa fa-whatsapp"></i>
										</div>
										<div class="sl-content">
											<a href="javascript:void(0)" class="inline-block capitalize-font  pull-left">8 voice messanger</a>
											<span class="inline-block font-12 pull-right">1pm</span>
											<div class="clearfix"></div>
											<p>8 texts</p>
										</div>
									</div>
									<hr>
									<div class="sl-item">
										<div class="icon">
											<i class="fa fa-envelope"></i>
										</div>
										<div class="sl-content">
											<a href="javascript:void(0)" class="inline-block capitalize-font  pull-left">2 new messages</a>
											<span class="inline-block font-12  pull-right">1pm</span>
											<div class="clearfix"></div>
											<p>ashjs@gmail.com</p>
										</div>
									</div>
									<hr>
									<div class="sl-item">
										<div class="sl-avatar avatar avatar-sm avatar-circle">
											<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user4.png"/>' alt="avatar">
										</div>
										<div class="sl-content">
											<a href="javascript:void(0)" class="inline-block capitalize-font  pull-left">Sandy Doe</a>
											<span class="inline-block font-12  pull-right">1pm</span>
											<div class="clearfix"></div>
											<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
										</div>
									</div> --%>
								</div><div class="slimScrollBar" style="background: rgb(60, 184, 120) none repeat scroll 0% 0%; width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51) none repeat scroll 0% 0%; opacity: 0.2; z-index: 90; right: 1px;"></div></div>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle pr-0" data-toggle="dropdown"><img src='<c:url value="/resources/designs/main/dist/img/user1.png"/>' alt="user_auth" class="user-auth-img img-circle"><span class="user-online-status"></span></a>
						<ul class="dropdown-menu user-auth-dropdown" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
							<%-- <li>
								<a href='<c:url value="#"/>'><i class="fa fa-fw fa-user"></i> Profile</a>
							</li> --%>
							<%-- <li>
								<a href='<c:url value="#"/>'><i class="fa fa-fw fa-gear"></i> Change New Password</a>
							</li> --%>
							<li class="divider"></li>
							<li>
								<a href='<c:url value="login"/>'><i class="fa fa-fw fa-power-off"></i> Log Out</a>
							</li>
						</ul>
					</li>
				</ul>
				<div class="collapse navbar-search-overlap" id="site_navbar_search">
					<form role="search">
						<div class="form-group mb-0">
							<div class="input-search">
								<div class="input-group">	
									<input id="overlay_search" name="overlay-search" class="form-control pl-30" placeholder="Search" type="text">
									<span class="input-group-addon pr-30">
									<a href="javascript:void(0)" class="close-input-overlay" data-target="#site_navbar_search" data-toggle="collapse" aria-label="Close" aria-expanded="true"><i class="fa fa-times"></i></a>
									</span> 
								</div>
							</div>
						</div>
					</form>
				</div>
		</nav>
		<!-- /Top Menu Items -->
		
		
		<!-- Left Sidebar Menu -->
			<div class="fixed-sidebar-left">
				<ul class="nav navbar-nav side-nav nicescroll-bar">
					<!-- <li>
						<a  class="active" href="javascript:void(0);" data-toggle="collapse" data-target="#dashboard_dr"><i class="icon-picture mr-10"></i>Dashboard <span class="pull-right"></span></a>
					</li> -->
					
					<security:authentication var="menus" property="principal.menus" />
				
					<li>
						<a href="javascript:void(0);" data-toggle="collapse" data-target="#table_dr"><i class="icon-grid mr-10"></i>ផ្នែកនាំទំនិញចូល<span class="pull-right"><i class="fa fa-fw fa-angle-down"></i></span></a>
						<ul id="table_dr" class="collapse collapse-level-1">
							<c:forEach items="${menus}" var="item">
							    <c:if test="${item.menu == '1' }">
							    	<li><a href='<c:url value="${item.menuValue}"/>'>${item.menuName}</a></li>
							    </c:if>
							</c:forEach>					
						</ul>
					</li>
					
					<li>
						<a href="javascript:void(0);" data-toggle="collapse" data-target="#pages_dr"><i class="icon-grid mr-10"></i>ផ្នែកលក់ទំនិញ<span class="pull-right"><i class="fa fa-fw fa-angle-down"></i></span></a>
						<ul id="pages_dr" class="collapse collapse-level-1">
							<c:forEach items="${menus}" var="item">
							    <c:if test="${item.menu == '2' }">
							    	<li><a href='<c:url value="${item.menuValue}"/>'>${item.menuName}</a></li>
							    </c:if>
							</c:forEach>
						</ul>
					</li>
					
					<li>
						<a href="#" data-toggle="collapse" data-target="#dropdown_dr_lv1"><i class="icon-grid mr-10"></i>Tools<span class="pull-right"><i class="fa fa-fw fa-angle-down"></i></span></a>
						<ul id="dropdown_dr_lv1" class="collapse collapse-level-1">
							<li><a href='<c:url value="customer"/>'>បញ្ចូលអតិថិជន</a></li>
							<li><a href='<c:url value="supplier"/>'>បញ្ចូលអ្នកផ្គត់ផ្គង់</a></li>
							<li><a href='<c:url value="productinfo"/>'>បញ្ចូលមុខទំនិញ</a></li>
							<li><a href='<c:url value="income"/>'>បញ្ចូលចំណូលផ្សេងៗ</a></li>
							<li><a href='<c:url value="expense"/>'>បញ្ចូលចំណាយផ្សេងៗ</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#" data-toggle="collapse" data-target="#dropdown_dr_lv3"><i class="icon-grid mr-10"></i>View<span class="pull-right"><i class="fa fa-fw fa-angle-down"></i></span></a>
						<ul id="dropdown_dr_lv3" class="collapse collapse-level-1">
							<li><a href='<c:url value="customerlist"/>'>បញ្ជីអតិថិជន</a></li>
							<li><a href='<c:url value="supplierlist"/>'>បញ្ជីអ្នកផ្គត់ផ្គង់</a></li>
							<li><a href='<c:url value="supplierlist"/>'>បញ្ជីមុខទំនិញ</a></li>
							<li><a href='<c:url value="supplierlist"/>'>បញ្ជីចំណូលផ្សេងៗ</a></li>
							<li><a href='<c:url value="supplierlist"/>'>បញ្ជីចំណាយផ្សេងៗ</a></li>
						</ul>
					</li>
					
				</ul>
			</div>
			<!-- /Left Sidebar Menu -->
		
		<!-- Right Sidebar Menu -->
		<div class="fixed-sidebar-right">
			<ul class="right-sidebar nicescroll-bar">
				<li>
					<div  class="tab-struct custom-tab-1">
						<ul role="tablist" class="nav nav-tabs" id="right_sidebar_tab">
							<li class="active" role="presentation"><a aria-expanded="true"  data-toggle="tab" role="tab" id="chat_tab_btn" href="#chat_tab">chat</a></li>
							<li role="presentation" class=""><a  data-toggle="tab" id="messages_tab_btn" role="tab" href="#messages_tab" aria-expanded="false">messages</a></li>
							<li role="presentation" class=""><a  data-toggle="tab" id="todo_tab_btn" role="tab" href="#todo_tab" aria-expanded="false">todo</a></li>
						</ul>
						<div class="tab-content" id="right_sidebar_content">
							<div  id="chat_tab" class="tab-pane fade active in" role="tabpanel">
								<div class="chat-box-wrap">
									<form role="search">
										<div class="input-group mb-15">
											<input type="text" id="example-input1-group2" name="example-input1-group2" class="form-control" placeholder="Search">
											<span class="input-group-btn">
											<button type="button" class="btn  btn-default"><i class="fa fa-search"></i></button>
											</span>
										</div>
									</form>
									<ul class="chat-list-wrap">
										<li class="chat-list">
											<div class="chat-body">
												<a  href="javascript:void(0)">
													<div class="chat-data">
														<img class="user-img img-circle"  src='<c:url value="/resources/designs/main/dist/img/user.png"/>' alt="user"/>
														<div class="user-data">
															<span class="name block capitalize-font">ryan gosling</span>
															<span class="time block txt-grey">2pm</span>
														</div>
														<div class="status away"></div>
														<div class="clearfix"></div>
													</div>
												</a>
												<a  href="javascript:void(0)">
													<div class="chat-data">
														<!-- <img class="user-img img-circle" <img src='<c:url value="/resources/designs/main/dist/img/user1.png"/>' alt="user"/> -->
														<div class="user-data">
															<span class="name block capitalize-font">ryan gosling</span>
															<span class="time block txt-grey">1pm</span>
														</div>
														<div class="status offline"></div>
														<div class="clearfix"></div>
													</div>
												</a>
												<a  href="javascript:void(0)">
													<div class="chat-data">
														<!-- <img class="user-img img-circle"  <img src='<c:url value="/resources/designs/main/dist/img/user2.png"/>' alt="user"/> -->
														<div class="user-data">
															<span class="name block capitalize-font">ryan gosling</span>
															<span class="time block txt-grey">2pm</span>
														</div>
														<div class="status online"></div>
														<div class="clearfix"></div>
													</div>
												</a>
												<a  href="javascript:void(0)">
													<div class="chat-data">
														<!-- <img class="user-img img-circle"  <img src='<c:url value="/resources/designs/main/dist/img/user3.png"/>' alt="user"/> -->
														<div class="user-data">
															<span class="name block capitalize-font">ryan gosling</span>
															<span class="time block txt-grey">2pm</span>
														</div>
														<div class="status online"></div>
														<div class="clearfix"></div>
													</div>
												</a>
												<a  href="javascript:void(0)">
													<div class="chat-data">
														<img class="user-img img-circle"  src='<c:url value="/resources/designs/main/dist/img/user4.png"/>' alt="user"/>
														<div class="user-data">
															<span class="name block capitalize-font">ryan gosling</span>
															<span class="time block txt-grey">2pm</span>
														</div>
														<div class="status online"></div>
														<div class="clearfix"></div>
													</div>
												</a>
											</div>
										</li>
									</ul>
								</div>
							</div>
							<div id="messages_tab" class="tab-pane fade" role="tabpanel">
								<div class="message-box-wrap">
									<div class="streamline message-box">
										<div class="sl-item">
											<div class="sl-avatar avatar avatar-sm avatar-circle">
												<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user.png"/>' alt="avatar"/>
											</div>
											<div class="sl-content">
												<a href="javascript:void(0)" class="inline-block capitalize-font  mb-5 pull-left">Sandy Doe</a>
												<span class="inline-block font-12 mb-5 pull-right">12/10/16</span>
												<div class="clearfix"></div>
												<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
											</div>
										</div>
										<hr/>
										<div class="sl-item">
											<div class="sl-avatar avatar avatar-sm avatar-circle">
												<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user1.png"/>' alt="avatar"/>
											</div>
											<div class="sl-content">
												<a href="javascript:void(0)" class="inline-block capitalize-font  mb-5 pull-left">Sandy Doe</a>
												<span class="inline-block font-12 mb-5 pull-right">2pm</span>
												<div class="clearfix"></div>
												<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
											</div>
										</div>
										<hr/>
										<div class="sl-item">
											<div class="sl-avatar avatar avatar-sm avatar-circle">
												<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user2.png"/>' alt="avatar"/>
											</div>
											<div class="sl-content">
												<a href="javascript:void(0)" class="inline-block capitalize-font  mb-5 pull-left">Sandy Doe</a>
												<span class="inline-block font-12 mb-5 pull-right">1pm</span>
												<div class="clearfix"></div>
												<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
											</div>
										</div>
										<hr/>
										<div class="sl-item">
											<div class="sl-avatar avatar avatar-sm avatar-circle">
												<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user3.png"/>' alt="avatar"/>
											</div>
											<div class="sl-content">
												<a href="javascript:void(0)" class="inline-block capitalize-font  mb-5 pull-left">Sandy Doe</a>
												<span class="inline-block font-12 mb-5 pull-right">1pm</span>
												<div class="clearfix"></div>
												<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
											</div>
										</div>
										<hr/>
										<div class="sl-item">
											<div class="sl-avatar avatar avatar-sm avatar-circle">
												<img class="img-responsive img-circle" src='<c:url value="/resources/designs/main/dist/img/user4.png"/>' alt="avatar"/>
											</div>
											<div class="sl-content">
												<a href="javascript:void(0)" class="inline-block capitalize-font  mb-5 pull-left">Sandy Doe</a>
												<span class="inline-block font-12 mb-5 pull-right">1pm</span>
												<div class="clearfix"></div>
												<p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit</p>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div  id="todo_tab" class="tab-pane fade" role="tabpanel">
								<div class="todo-box-wrap">
									<!-- Todo-List -->
									<ul class="todo-list">
										<li class="todo-item">
											<div class="checkbox checkbox-default">
												<input type="checkbox" id="checkbox01"/>
												<label for="checkbox01">Record The First Episode Of HTML Tutorial</label>
											</div>
										</li>
										<li class="todo-item">
											<div class="checkbox checkbox-pink">
												<input type="checkbox" id="checkbox02"/>
												<label for="checkbox02">Prepare The Conference Schedule</label>
											</div>
										</li>
										<li class="todo-item">
											<div class="checkbox checkbox-warning">
												<input type="checkbox" id="checkbox03" checked/>
												<label for="checkbox03">Decide The Live Discussion Time</label>
											</div>
										</li>
										<li class="todo-item">
											<div class="checkbox checkbox-success">
												<input type="checkbox" id="checkbox04" checked/>
												<label for="checkbox04">Prepare For The Next Project</label>
											</div>
										</li>
										<li class="todo-item">
											<div class="checkbox checkbox-danger">
												<input type="checkbox" id="checkbox05" checked/>
												<label for="checkbox05">Finish Up AngularJs Tutorial</label>
											</div>
										</li>
										<li class="todo-item">
											<div class="checkbox checkbox-purple">
												<input type="checkbox" id="checkbox06" checked/>
												<label for="checkbox06">Finish Infinity Project</label>
											</div>
										</li>
									</ul>
									<!-- /Todo-List -->
								</div>
							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>
		<!-- /Right Sidebar Menu -->

        <!-- Main Content -->
        
        <!-- /Main Content -->

    	
    <!-- /#wrapper -->
    
	<!-- JavaScript -->
    <!-- <script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script> -->
	
    <!-- jQuery -->
    <script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/jquery/dist/jquery.min.js"/>'> </script>

    <!-- Bootstrap Core JavaScript -->
    <script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"/>'> </script>
    
	<!-- Bootstrap-table JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/vendors/bower_components/bootstrap-table/dist/bootstrap-table.min.js"/>'> </script>
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/bootstrap-table-data.js"/>'> </script>
	
	<!-- Slimscroll JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/jquery.slimscroll.js"/>'> </script>
	
	<!-- Fancy Dropdown JS -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/dropdown-bootstrap-extended.js"/>'> </script>
	
	<!-- Init JavaScript -->
	<script type="text/javascript" src='<c:url value="/resources/designs/main/dist/js/init.js"/>'> </script>
	
	<%-- <script type="text/javascript" src='<c:url value="/resources/js/home.js"/>'> </script> --%>
	
	<!-- Pangination -->
	<%-- <script type="text/javascript" src='<c:url value="/resources/js/bootpage.js"/>'> </script> --%>
	<script type="text/javascript" src='<c:url value="/resources/js/jquery.bootpag.min.js"/>'> </script>
	<!-- /Pagination -->
	
</body>
</html>
