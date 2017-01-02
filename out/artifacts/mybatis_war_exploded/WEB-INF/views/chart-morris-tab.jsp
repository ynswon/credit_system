<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*,com.funda.mybatis.*" %>

<link rel="stylesheet" href="/resources/assets/plugins/morris/morris.css">


<link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />
    <div class="row">
        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
                        <i class="zmdi zmdi-more-vert"></i>
                    </a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Line Chart</a></li>
                    </ul>
                </div>

                <h4 class="header-title m-t-0 m-b-30">신용평점</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>신용평점</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-1" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">대출계좌수</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>대출계좌수</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-3" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

    </div>
    <!-- end row -->


    <div class="row">
        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">신용등급</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>신용등급</h5>
                        </li>
                    </ul>
                </div>

                <!--
                <div id="morris-bar-stacked" style="height: 300px;"></div>-->
                <div id="morris-line-example-2" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">총약정금액</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>총약정금액</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-4" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

    </div>
    <!-- end row -->

    <div class="row">
        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">상환금액</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>상환금액</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-5" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">대출잔액</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>대출잔액</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-6" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->
    </div>
    <!-- end row -->

    <div class="row">
        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">연체금액</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>연체금액</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-7" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->

        <div class="col-lg-6">
            <div class="card-box">
                <div class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                       aria-expanded="false">
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

                <h4 class="header-title m-t-0 m-b-30">최장연체일수</h4>

                <div class="text-center">
                    <ul class="list-inline chart-detail-list">
                        <li>
                            <h5 style="color: #71b6f9;"><i class="fa fa-circle m-r-5"></i>최장연체일수</h5>
                        </li>
                        <!--
                        <li>
                            <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                        </li>-->
                    </ul>
                </div>
                <div id="morris-line-example-8" style="height: 300px;"></div>

            </div>
        </div><!-- end col-->
    </div>
