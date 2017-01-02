<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*,com.funda.mybatis.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <!-- App Favicon -->
        <link rel="shortcut icon" href="/resources/assets/images/favicon.ico">

        <!-- App title -->
        <title>Funda</title>

        <!-- App CSS -->
        <link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

        <script src="/resources/assets/js/modernizr.min.js"></script>


    </head>


    <body class="fixed-left">

        <!-- Begin page -->
        <div id="wrapper">

            <!-- Top Bar Start -->
            <div class="topbar">

                <!-- LOGO -->
                <div class="topbar-left">
                    <a href="/index" class="logo"><span>Funda<span>Admin</span></span><i class="zmdi zmdi-layers"></i></a>
                </div>

                <!-- Button mobile view to collapse sidebar menu -->
                <div class="navbar navbar-default" role="navigation">
                    <div class="container">

                        <!-- Page title -->
                        <ul class="nav navbar-nav navbar-left">
                            <li>
                                <button class="button-menu-mobile open-left">
                                    <i class="zmdi zmdi-menu"></i>
                                </button>
                            </li>
                            <li>
                                <h4 class="page-title">KCB보고서</h4>
                            </li>
                        </ul>

                        <!-- Right(Notification and Searchbox -->
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <!-- Notification -->
                                <div class="notification-box">
                                    <ul class="list-inline m-b-0">
                                        <li>
                                            <a href="javascript:void(0);" class="right-bar-toggle">
                                                <i class="zmdi zmdi-notifications-none"></i>
                                            </a>
                                            <div class="noti-dot">
                                                <span class="dot"></span>
                                                <span class="pulse"></span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <!-- End Notification bar -->
                            </li>
                            <li class="hidden-xs">
                                <form role="search" class="app-search" action="/table_basic">
                                    <input type="text" placeholder="Search..."
                                           class="form-control" name="search">
                                    <a href=""><i class="fa fa-search"></i></a>
                                </form>
                            </li>
                        </ul>

                    </div><!-- end container -->
                </div><!-- end navbar -->
            </div>
            <!-- Top Bar End -->


            <!-- ========== Left Sidebar Start ========== -->
            <jsp:include page="/menu"/>
            <!-- Left Sidebar End -->



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <div class="row">
							<div class="col-lg-6">
								<div class="card-box">
                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                        			<h4 class="header-title m-t-0 m-b-30">신용평점</h4>

                                    <table class="table m-0">
                                        <thead>
                                            <tr>
                                                <th>점수</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${result_018}" var="application_data_serieses">
                                                <tr>
                                                    <td>${application_data_serieses.seriesName}</td>
                                                    <td>${application_data_serieses.value}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
								</div>
							</div><!-- end col -->

                            <div class="col-lg-6">
								<div class="card-box">

                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                                    <h4 class="header-title m-t-0 m-b-30">신용평점영향요소</h4>

                                    <table class="table m-0">
                                        <thead>
                                        <tr>
                                            <th>점수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${result_020}" var="application_data_serieses">
                                            <tr>
                                                <td>${application_data_serieses.seriesName}</td>
                                                <td>${application_data_serieses.value}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

								</div>
							</div><!-- end col -->

						</div>
                        <!-- End row -->

                        <div class="row">
							<div class="col-lg-6">
								<div class="card-box">
                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                                    <h4 class="header-title m-t-0 m-b-30">대출개설정보(KFB)</h4>

                                    <c:set var="index" value="0" />

                                    <table class="table m-0">
                                        <thead>
                                        <c:choose>
                                            <c:when test="${application_data_serieses.seriesIdx eq index}">
                                            </c:when>
                                            <c:otherwise>
                                                <tr>
                                                    <th>점수</th>
                                                </tr>
                                                <c:set var="index" value="${application_data_serieses.seriesIdx}" />
                                            </c:otherwise>
                                        </c:choose>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${result_023}" var="application_data_serieses">
                                            <c:choose>
                                                <c:when test="${application_data_serieses.seriesIdx eq index}">
                                                </c:when>
                                                <c:otherwise>
                                                    <tr>
                                                        <th>점수</th>
                                                    </tr>
                                                    <c:set var="index" value="${application_data_serieses.seriesIdx}" />
                                                </c:otherwise>
                                            </c:choose>
                                            <tr>
                                                <td>${application_data_serieses.seriesName}</td>
                                                <td>${application_data_serieses.value}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

								</div>
							</div><!-- end col -->

                            <div class="col-lg-6">
								<div class="card-box">

                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                                    <h4 class="header-title m-t-0 m-b-30">대출개설정보(KCB)</h4>

                                    <table class="table m-0">
                                        <thead>
                                        <tr>
                                            <th>점수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${result_024}" var="application_data_serieses">
                                            <tr>
                                                <td>${application_data_serieses.seriesName}</td>
                                                <td>${application_data_serieses.value}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

								</div>
							</div><!-- end col -->

						</div>
                        <!-- end row -->


                        <div class="row">
                            <div class="col-lg-6">
                                <div class="card-box">
                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                                    <h4 class="header-title m-t-0 m-b-30">카드개설정보(KFB)</h4>

                                    <table class="table m-0">
                                        <thead>
                                        <tr>
                                            <th>점수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${result_027}" var="application_data_serieses">
                                            <tr>
                                                <td>${application_data_serieses.seriesName}</td>
                                                <td>${application_data_serieses.value}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                            </div><!-- end col -->

                            <div class="col-lg-6">
                                <div class="card-box">

                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                                    <h4 class="header-title m-t-0 m-b-30">연대보증정보(KFB)</h4>

                                    <table class="table m-0">
                                        <thead>
                                        <tr>
                                            <th>점수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${result_036}" var="application_data_serieses">
                                            <tr>
                                                <td>${application_data_serieses.seriesName}</td>
                                                <td>${application_data_serieses.value}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                            </div><!-- end col -->

                        </div>
                        <!-- end row -->

<!--
                        <div class="row">
							<div class="col-lg-6">
								<div class="card-box">
                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                        			<h4 class="header-title m-t-0 m-b-30">Condensed table</h4>

                                    <p class="text-muted font-13 m-b-15">
                                        Add <code>.table-condensed</code> to make tables more compact by cutting cell padding in half.
                                    </p>

                                    <table class="table table-condensed m-0">

                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>First Name</th>
                                                <th>Last Name</th>
                                                <th>Username</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Mark</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">2</th>
                                                <td>Jacob</td>
                                                <td>Thornton</td>
                                                <td>@fat</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">3</th>
                                                <td>Larry</td>
                                                <td>the Bird</td>
                                                <td>@twitter</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">4</th>
                                                <td>Mark</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">5</th>
                                                <td>Jacob</td>
                                                <td>Thornton</td>
                                                <td>@fat</td>
                                            </tr>
                                        </tbody>
                                    </table>

								</div>
							</div> --> <!-- end col -->

                           <!-- <div class="col-lg-6">
								<div class="card-box">
                                    <div class="dropdown pull-right">
                                        <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown" aria-expanded="false">
                                            <i class="zmdi zmdi-more-vert"></i>
                                        </a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Action</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Separated link</a></li>
                                        </ul>
                                    </div>

                        			<h4 class="header-title m-t-0 m-b-30">Contextual classes</h4>

                                    <p class="text-muted font-13 m-b-15">
                                        Use contextual classes to color table rows or individual cells.
                                    </p>

                                    <table class="table m-b-0">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>Column heading</th>
                                                <th>Column heading</th>
                                                <th>Column heading</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="active">
                                                <th scope="row">1</th>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                            </tr>

                                            <tr class="success">
                                                <th scope="row">2</th>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                            </tr>

                                            <tr class="info">
                                                <th scope="row">3</th>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                            </tr>

                                            <tr class="warning">
                                                <th scope="row">4</th>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                            </tr>

                                            <tr class="danger">
                                                <th scope="row">5</th>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                                <td>Column content</td>
                                            </tr>
                                        </tbody>
                                    </table>

								</div>
							</div>--><!-- end col -->

						</div>
                        <!-- end row -->


                    </div> <!-- container -->

                </div> <!-- content -->

                <footer class="footer">
                    2016 © Funda.
                </footer>

            </div>


            <!-- ============================================================== -->
            <!-- End Right content here -->
            <!-- ============================================================== -->


            <!-- Right Sidebar -->
            <div class="side-bar right-bar">
                <a href="javascript:void(0);" class="right-bar-toggle">
                    <i class="zmdi zmdi-close-circle-o"></i>
                </a>
                <h4 class="">Notifications</h4>
                <div class="notification-list nicescroll">
                    <ul class="list-group list-no-border user-list">
                        <li class="list-group-item">
                            <a href="#" class="user-list-item">
                                <div class="avatar">
                                    <img src="/resources/assets/images/users/avatar-2.jpg" alt="">
                                </div>
                                <div class="user-desc">
                                    <span class="name">Michael Zenaty</span>
                                    <span class="desc">There are new settings available</span>
                                    <span class="time">2 hours ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item">
                            <a href="#" class="user-list-item">
                                <div class="icon bg-info">
                                    <i class="zmdi zmdi-account"></i>
                                </div>
                                <div class="user-desc">
                                    <span class="name">New Signup</span>
                                    <span class="desc">There are new settings available</span>
                                    <span class="time">5 hours ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item">
                            <a href="#" class="user-list-item">
                                <div class="icon bg-pink">
                                    <i class="zmdi zmdi-comment"></i>
                                </div>
                                <div class="user-desc">
                                    <span class="name">New Message received</span>
                                    <span class="desc">There are new settings available</span>
                                    <span class="time">1 day ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item active">
                            <a href="#" class="user-list-item">
                                <div class="avatar">
                                    <img src="/resources/assets/images/users/avatar-3.jpg" alt="">
                                </div>
                                <div class="user-desc">
                                    <span class="name">James Anderson</span>
                                    <span class="desc">There are new settings available</span>
                                    <span class="time">2 days ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item active">
                            <a href="#" class="user-list-item">
                                <div class="icon bg-warning">
                                    <i class="zmdi zmdi-settings"></i>
                                </div>
                                <div class="user-desc">
                                    <span class="name">Settings</span>
                                    <span class="desc">There are new settings available</span>
                                    <span class="time">1 day ago</span>
                                </div>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
            <!-- /Right-bar -->

        </div>
        <!-- END wrapper -->



        <script>
            var resizefunc = [];
        </script>

        <!-- jQuery  -->
        <script src="/resources/assets/js/jquery.min.js"></script>
        <script src="/resources/assets/js/bootstrap.min.js"></script>
        <script src="/resources/assets/js/detect.js"></script>
        <script src="/resources/assets/js/fastclick.js"></script>
        <script src="/resources/assets/js/jquery.slimscroll.js"></script>
        <script src="/resources/assets/js/jquery.blockUI.js"></script>
        <script src="/resources/assets/js/waves.js"></script>
        <script src="/resources/assets/js/jquery.nicescroll.js"></script>
        <script src="/resources/assets/js/jquery.scrollTo.min.js"></script>

        <!-- App js -->
        <script src="/resources/assets/js/jquery.core.js"></script>
        <script src="/resources/assets/js/jquery.app.js"></script>

    </body>
</html>