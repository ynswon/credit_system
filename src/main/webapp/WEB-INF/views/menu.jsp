<%--
  Created by IntelliJ IDEA.
  User: wonjun-pc
  Date: 2016-06-17
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import ="java.util.*,com.funda.mybatis.*" %>
<% request.setCharacterEncoding("utf-8");
%>
<% response.setContentType("text/html; charset=utf-8"); %>
<link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
<link href="/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />
<div class="left side-menu">
    <div class="sidebar-inner slimscrollleft">

        <!-- User -->
     <!--   <div class="user-box">
            <div class="user-img">
                <img src="/resources/assets/images/users/avatar-1.jpg" alt="user-img" title="Mat Helme" class="img-circle img-thumbnail img-responsive">
                <div class="user-status offline"><i class="zmdi zmdi-dot-circle"></i></div>
            </div>
            <h5><a href="#">Mat Helme</a> </h5>
            <ul class="list-inline">
                <li>
                    <a href="#" >
                        <i class="zmdi zmdi-settings"></i>
                    </a>
                </li>

                <li>
                    <a href="#" class="text-custom">
                        <i class="zmdi zmdi-power"></i>
                    </a>
                </li>
            </ul>
        </div>-->
        <!-- End User -->

        <!--- Sidemenu -->
        <div id="sidebar-menu">
            <ul>
                <li class="text-muted menu-title">Navigation</li>

                <!--
                <li>
                    <a href="/index" class="waves-effect active"><i class="zmdi zmdi-view-dashboard"></i> <span> Dashboard </span> </a>
                </li>


                <li>
                    <a href="typography.html" class="waves-effect"><i class="zmdi zmdi-format-underlined"></i> <span> Typography </span> </a>
                </li>
-->
                <!--
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-invert-colors"></i> <span> User Interface </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">
                        <li><a href="ui-buttons.html">Buttons</a></li>
                        <li><a href="ui-cards.html">Cards</a></li>
                        <li><a href="ui-checkbox-radio.html">Checkboxs-Radios</a></li>
                        <li><a href="ui-material-icons.html">Material Design Icons</a></li>
                        <li><a href="ui-font-awesome-icons.html">Font Awesome</a></li>
                        <li><a href="ui-themify-icons.html">Themify Icons</a></li>
                        <li><a href="ui-modals.html">Modals</a></li>
                        <li><a href="ui-notification.html">Notification</a></li>
                        <li><a href="ui-range-slider.html">Range Slider</a></li>
                        <li><a href="ui-components.html">Components</a>
                        <li><a href="ui-sweetalert.html">Sweet Alert</a>
                        <li><a href="ui-treeview.html">Tree view</a>
                        <li><a href="ui-widgets.html">Widgets</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-collection-text"></i><span class="label label-warning pull-right">7</span><span> Forms </span> </a>
                    <ul class="list-unstyled">
                        <li><a href="form-elements.html">General Elements</a></li>
                        <li><a href="form-advanced.html">Advanced Form</a></li>
                        <li><a href="form-validation.html">Form Validation</a></li>
                        <li><a href="form-wizard.html">Form Wizard</a></li>
                        <li><a href="form-fileupload.html">Form Uploads</a></li>
                        <li><a href="form-wysiwig.html">Wysiwig Editors</a></li>
                        <li><a href="form-xeditable.html">X-editable</a></li>
                    </ul>
                </li>
            -->
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-view-list"></i> <span> 대출관리 </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">

                        <li><a href="/tables-editable?debt_code=심사대기">대출신청목록(${menu_debt1})</a></li>
                        <li><a href="/tables-editable?debt_code=심사진행">심사진행중목록(${menu_debt2})</a></li>
                        <li><a href="/tables-editable?debt_code=심사완료">심사완료목록(${menu_debt3})</a></li>
                        <li><a href="/tables-editable?debt_code=심사탈락">심사탈락목록(${menu_debt4})</a></li>

                        <li><a href="/debt-detail">세부대출내역</a></li>
                        <li><a href="/table_basic">KCB보고서(표)</a></li>
                        <li><a href="/chart-morris">KCB보고서(그래프)</a></li>
                        <li><a href="/test-page">신용송부인증</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-chart"></i><span> 알고리즘 </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">
                        <!-- <li><a href="chart-flot.html">Flot Chart</a></li>-->

                        <!-- <li><a href="chart-chartist.html">Chartist Charts</a></li>-->
                        <li><a href="/number">매출예측</a></li>
                        <li><a href="/number_seoul">매출예측(서울대)</a></li>
                    </ul>
                </li>
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-chart"></i><span> 자료관리 </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">
                        <!-- <li><a href="chart-flot.html">Flot Chart</a></li>-->
                        <li><a href="/chart-morris">공시자료</a></li>
                        <!-- <li><a href="chart-chartist.html">Chartist Charts</a></li>-->
                        <li><a href="/file-manager">파일관리</a></li>
                    </ul>
                </li>
                <!--
                                <li>
                                    <a href="calendar.html" class="waves-effect"><i class="zmdi zmdi-calendar"></i><span> Calendar </span></a>
                                </li>

                                <li>
                                    <a href="inbox.html" class="waves-effect"><i class="zmdi zmdi-email"></i><span class="label label-purple pull-right">New</span><span> Mail </span></a>
                                </li>

                                                <li class="has_sub">
                                                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-collection-item"></i><span> Pages </span> <span class="menu-arrow"></span></a>
                                                    <ul class="list-unstyled">
                                                        <li><a href="page-starter.html">Starter Page</a></li>
                                                        <li><a href="page-login.html">Login</a></li>
                                                        <li><a href="page-register.html">Register</a></li>
                                                        <li><a href="page-recoverpw.html">Recover Password</a></li>
                                                        <li><a href="page-lock-screen.html">Lock Screen</a></li>
                                                        <li><a href="page-confirm-mail.html">Confirm Mail</a></li>
                                                        <li><a href="page-404.html">Error 404</a></li>
                                                        <li><a href="page-500.html">Error 500</a></li>
                                                    </ul>
                                                </li>

                                                <li class="has_sub">
                                                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-layers"></i><span>Extra Pages </span> <span class="menu-arrow"></span></a>
                                                    <ul class="list-unstyled">
                                                        <li><a href="extras-projects.html">Projects</a></li>
                                                        <li><a href="extras-tour.html">Tour</a></li>
                                                        <li><a href="extras-taskboard.html">Taskboard</a></li>
                                                        <li><a href="extras-taskdetail.html">Task Detail</a></li>
                                                        <li><a href="extras-profile.html">Profile</a></li>
                                                        <li><a href="extras-maps.html">Maps</a></li>
                                                        <li><a href="extras-contact.html">Contact list</a></li>
                                                        <li><a href="extras-pricing.html">Pricing</a></li>
                                                        <li><a href="extras-timeline.html">Timeline</a></li>
                                                        <li><a href="extras-invoice.html">Invoice</a></li>
                                                        <li><a href="extras-faq.html">FAQ</a></li>
                                                        <li><a href="extras-gallery.html">Gallery</a></li>
                                                        <li><a href="extras-email-template.html">Email template</a></li>
                                                        <li><a href="extras-maintenance.html">Maintenance</a></li>
                                                        <li><a href="extras-comingsoon.html">Coming soon</a></li>
                                                    </ul>
                                                </li>
                                                -->
            </ul>
            <div class="clearfix"></div>
        </div>
        <!-- Sidebar -->
        <div class="clearfix"></div>

    </div>

</div>