<%--
  Created by IntelliJ IDEA.
  User: wonjun-pc
  Date: 2016-06-20
  Time: 오후 5:36
  To change this template use File | Settings | File Templates.
--%>
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
                    <h4 class="page-title">파일관리</h4>
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
                    <form role="search" class="app-search" action="">
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
            <object type="text/html" width="100%" height="1000" data="http://52.78.246.148/Filemanager/" allowFullScreen></object>
       </div>
    </div>
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