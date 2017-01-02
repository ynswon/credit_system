<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*,com.funda.mybatis.*" %>
<%
    String idx  = request.getParameter("idx");
    String name = request.getParameter("name");
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
        <title>Adminto - Responsive Admin Dashboard Template</title>

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
                                <h4 class="page-title">상점:${search}호</h4>
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



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <div class="row">
                            <!-- BASIC WIZARD -->
                            <!-- <div class="col-lg-6">-->
                                <div class="card-box p-b-0">
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

                        			<h4 class="header-title m-t-0 m-b-30">대출신청상세(단위 :천원)</h4>

                                    <form>
                                        <div id="basicwizard" class=" pull-in">
                                            <ul>
                                                <li><a href="#tab1" data-toggle="tab">대출신청정보</a></li>
                                                <li><a href="#tab2" data-toggle="tab">신용정보(표)</a></li>
                                                <li><a href="#tab3" data-toggle="tab">신용정보(그래프)</a></li>
                                                <li><a href="#tab4" data-toggle="tab">매출그래프</a></li>
                                                <li><a href="#tab5" data-toggle="tab">탈락사유</a></li>
                                            </ul>
                                            <div class="tab-content b-0 m-b-0">
                                                <div class="tab-pane m-t-10 fade" id="tab1">
                                                    <div class="row">
                                                        <div class="col-lg-12">
                                                        <div class="card-box">
                                                        <h4 class="header-title m-t-0 m-b-30">대출개설정보(KCB)</h4>

                                                        <table class="table m-0">
                                                            <thead>
                                                            <tr>
                                                                <th>신용정보종류</th>
                                                                <th>상세</th>
                                                                <th>상세코드</th>
                                                                <th>상세정보개수</th>
                                                            </tr>
                                                            </thead>
                                                            <tbody>
                                                            <c:forEach items="${application_data}" var="application_data_serieses">
                                                                <tr>
                                                                    <td>${application_data_serieses.typePrefix}</td>
                                                                    <td>${application_data_serieses.type}</td>
                                                                    <td>${application_data_serieses.value}</td>
                                                                    <td>${application_data_serieses.seriesCount}</td>
                                                                </tr>
                                                            </c:forEach>
                                                            </tbody>
                                                        </table>
                                                        </div>
                                                        </div>
                                                   </div>


                                                    <div class="row">
                                                        <div class="col-lg-12">
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

                                                                <h4 class="header-title m-t-0 m-b-30">신상정보</h4>

                                                                <c:set var="index" value="${application_data_serieses.seriesIdx}" />

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
                                                                    <c:forEach items="${result_017}" var="application_data_serieses">
                                                                    <c:choose>
                                                                    <c:when test="${application_data_serieses.seriesIdx eq index}">
                                                                    <tr>
                                                                        <td>${application_data_serieses.seriesName}</td>
                                                                        <td>${application_data_serieses.value}</td>
                                                                    </tr>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                    <tr></tr>
                                                                    <thead>
                                                                    <tr>
                                                                        <th>${application_data_serieses.seriesName}</th>
                                                                        <th>${application_data_serieses.value}</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <c:set var="index" value="${application_data_serieses.seriesIdx}" />
                                                                    </c:otherwise>
                                                                    </c:choose>

                                                                    </c:forEach>
                                                                    </tbody>
                                                                </table>

                                                            </div>
                                                        </div><!-- end col -->


                                                    </div>
                                                </div>

                                               <div class="tab-pane m-t-10 fade" id="tab2">
                                                    <div class="row">
                                                        <jsp:include page="/tables-basic-tab"  flush="true"></jsp:include>
                                                    </div>
                                                </div>
                                                <div class="tab-pane m-t-10 fade" id="tab3">
                                                    <div class="row">
                                                        <jsp:include page="/chart-morris-tab"  flush="true"></jsp:include>
                                                    </div>
                                                </div>

                                                <div class="tab-pane m-t-10 fade" id="tab4">
                                                    <div class="row">
                                                        <div class="form-group clearfix">
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

                                                                <h4 class="header-title m-t-0 m-b-30">Realtime Statistics</h4>


                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="tab-pane m-t-10 fade" id="tab5">
                                                    <div class="row">
                                                        <div class="col-lg-12">
                                                            <div class="card-box">
                                                                <h4 class="header-title m-t-0 m-b-30">탈락사유(KCB)</h4>

                                                                <table class="table m-0">
                                                                    <thead>
                                                                    <tr>
                                                                        <th>상세코드</th>
                                                                        <th>상세정보개수</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                    <c:forEach items="${disqualified_data}" var="disqualified_data_series">
                                                                        <tr>
                                                                            <td>${disqualified_data_series.code}</td>
                                                                            <td>${disqualified_data_series.reason}</td>
                                                                        </tr>
                                                                    </c:forEach>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <ul class="pager wizard m-b-0">
                                                    <li class="previous"><a href="#" class="btn btn-primary waves-effect waves-light">Previous</a>
                                                    </li>
                                                    <li class="next"><a href="#" class="btn btn-primary waves-effect waves-light">Next</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                        <!--    </div>-->
                            <!-- end col -->


                            <!-- end col -->

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

        <script src="/resources/assets/plugins/morris/morris.min.js"></script>
        <script src="/resources/assets/plugins/raphael/raphael-min.js"></script>
        <script src="/resources/assets/pages/jquery.morris.init.js"></script>

        <!-- Form wizard -->
        <script src="/resources/assets/plugins/bootstrap-wizard/jquery.bootstrap.wizard.js"></script>
        <script src="/resources/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>

        <!-- App js -->
        <script src="/resources/assets/js/jquery.core.js"></script>
        <script src="/resources/assets/js/jquery.app.js"></script>

        <script type="text/javascript">
            $(document).ready(function() {
                $('#basicwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

                $('#progressbarwizard').bootstrapWizard({onTabShow: function(tab, navigation, index) {
                    var $total = navigation.find('li').length;
                    var $current = index+1;
                    var $percent = ($current/$total) * 100;
                    $('#progressbarwizard').find('.bar').css({width:$percent+'%'});
                },
                'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

                $('#btnwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted','nextSelector': '.button-next', 'previousSelector': '.button-previous', 'firstSelector': '.button-first', 'lastSelector': '.button-last'});

                var $validator = $("#commentForm").validate({
                    rules: {
                        emailfield: {
                            required: true,
                            email: true,
                            minlength: 3
                        },
                        namefield: {
                            required: true,
                            minlength: 3
                        },
                        urlfield: {
                            required: true,
                            minlength: 3,
                            url: true
                        }
                    }
                });

                $('#rootwizard').bootstrapWizard({
                    'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted',
                    'onNext': function (tab, navigation, index) {
                        var $valid = $("#commentForm").valid();
                        if (!$valid) {
                            $validator.focusInvalid();
                            return false;
                        }
                    }
                });
            });

        </script>

    </body>
</html>