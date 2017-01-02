<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,com.funda.mybatis.*"%>
<%

%>
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
        <title>Funda - Responsive Admin Dashboard Template</title>

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
        <script language="javascript">
            function popup()
            {
                var url =encodeURI("${url}");
                var url ="${url}";
                var name ="신용송부인증";
                //width=500, height=1000,
                window.open(url, name, " toolbar=no, status=no, location=no, scrollbars=yes, menubar=no, resizable=yes");
            }
        </script>
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
                                <h4 class="page-title">KCB신용송부인증</h4>
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
                                <form role="search" class="app-search">
                                    <input type="text" placeholder="Search..."
                                           class="form-control">
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


            <!-- Left Sidebar End -->



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">
                        <div class="row">

                            <h4 class="header-title m-t-0 m-b-30">테스트페이지</h4>

                            <form action="/popup" >
                                <div class="form-group">
                                    <label for="name">이름</label>
                                    <input type="text" name="name"
                                           placeholder="Enter user name" class="form-control" id="name">
                                </div>
                                <div class="form-group">
                                    <label for="sex">성별</label>
                                    <input  type="text"  name="sex"
                                           placeholder="Enter email" class="form-control" id="sex">
                                </div>
                                <div class="form-group">
                                    <label for="pass1">생년월일</label>
                                    <input  type="text" id="pass1" name="birthdate" placeholder="Birthdate"
                                           class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="phone">전화번호</label>
                                    <input   type="text"
                                           placeholder="Phone" class="form-control" name="phone" id="phone">
                                </div>

                                <div class="form-group">
                                    <label for="url">Url</label>
                                    <input   type="text"
                                             placeholder="Url" class="form-control" name="url" value="${url}" id="url">
                                </div>

                                <div class="form-group">
                                    <label for="registerkey">registerkey</label>
                                    <input   type="text"
                                             placeholder="registerkey" class="form-control" name="registerkey" value="${registerkey}" id="registerkey">
                                </div>

                                <div class="form-group">
                                    <label for="result">Result</label>
                                    <input   type="text"
                                             placeholder="result" class="form-control" name="result" value="${result}" id="result">
                                </div>

                                <div class="form-group">
                                    <label for="result_report">result_report</label>
                                    <input   type="text"
                                             placeholder="result" class="form-control" name="result_report" value="${result_report}" id="result_report">
                                </div>

                                <div class="form-group text-right m-b-0">
                                    <button class="btn btn-primary waves-effect waves-light  btn-lg" type="submit">
                                        전송
                                    </button>
                                    <input type="button" class="btn btn-primary btn-lg active" value="팝업호출" onclick="popup();"/>

                                    <!--
                                    <a class="btn btn-primary btn-lg active" href="/kcbsend?registerkey=${registerkey}">저장하기</a>
                                    -->
                                </div>



                            </form>

                        </div>
                        <!-- end row -->
                    </div>

                </div> <!-- content -->

                <footer class="footer">
                    2016 © Funda.
                </footer>

                </div>
                </div>

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

        <!-- Validation js (Parsleyjs) -->
        <script type="text/javascript" src="/resources/assets/plugins/parsleyjs/dist/parsley.min.js"></script>

        <!-- App js -->
        <script src="/resources/assets/js/jquery.core.js"></script>
        <script src="/resources/assets/js/jquery.app.js"></script>

        <script type="text/javascript">
			$(document).ready(function() {
				$('form').parsley();
			});
		</script>

    </body>
</html>