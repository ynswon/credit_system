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
                <c:forEach items="${result_023}" var="application_data_serieses">
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

