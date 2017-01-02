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
        <title>Funda어드민</title>

		<!-- Editatable  Css-->
        <link rel="stylesheet" href="/resources/assets/plugins/magnific-popup/dist/magnific-popup.css" />
        <link rel="stylesheet" href="/resources/assets/plugins/jquery-datatables-editable/datatables.css" />

        <!-- App CSS -->
        <link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/bootstrap-combobox.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />
        <link href="/resources/assets/css/bootstrap-combobox.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>

        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

        <script src="/resources/assets/js/jquery.min.js"></script>
        <script src="/resources/assets/js/modernizr.min.js"></script>

        <script type="text/javascript">

            function popup(url)
            {

                //var url =encodeURI("${url}");
                var url =encodeURI(url);
                var name ="신용송부인증";
                //width=500, height=1000,
                window.open(url, name, " toolbar=no, status=no, location=no, scrollbars=yes, menubar=no, resizable=yes");
            }

            function handleSubmit() {

                //유효성검사등 폼 전송 전에 실행하는 코드
                document.getElementById("frm").submit();
                return false;
            }

            function get_chked_values(){
                var chked_val = "";
                $(":checkbox[name='chkList']:checked").each(function(pi,po){
                    chked_val += ","+po.value;
                });
                if(chked_val!="")chked_val = chked_val.substring(1);
                return chked_val;
            }

            function sendList()
            {

                var list = get_chked_values();
                //alert(list);
                if(list=='') { alert('항목을 체크하세요.'); return false;}
                document.getElementById("sendList").submit();
                return false;
            }

            $(document).ready(function(){
                $('.combobox').combobox();
            });
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
                                <h4 class="page-title">대출신청목록 (처리 대기중인 ${menu_debt}건의 대출신청 목록이 있습니다.)</h4>
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
                                    <a href="/"><i class="fa fa-search"></i></a>
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
                        <!-- end col -->
                        <!-- end row -->

                        <div class="row">
                            <div class="col-sm-12" style="float:right">
                                <div class="panel">

                                    <div class="panel-body">
                                        <form  id="sendList"  action="/updateDebtList" method="post">
                                        <div class="row">
                                                <div class="m-b-1">
                                                        <div class="col-xs-6 col-md-1">
                                                            <select class="form-control" name="debtCodeSel" class="m-b-5">
                                                                <option value="">대출구분</option>
                                                                <option value="심사대기">심사대기</option>
                                                                <option value="심사진행">심사진행</option>
                                                                <option value="심사완료">심사완료</option>
                                                                <option value="심사탈락">심사탈락</option>
                                                            </select>
                                                         </div>
                                                        <div class="col-xs-6 col-md-4">

                                                                <button type="button" class="btn btn-primary waves-effect w-md waves-light m-b-5" onclick="sendList()">변경하기</button>
                                                       </div>

                                                </div>

                                        </div>



                                        <input type="hidden" name="application_result" value="${application_result}"/>
                                        <c:set var="index_start" value="0" />
                                        <c:set var="index_end" value="0" />
                                        <c:forEach items="${application_group}" var="application_group" varStatus="status">
                                            <c:set var="index_end" value="${index_end+application_group.count}"/>
                                        <div>
                                            <li>
                                                <h4 class="page-title">${application_group.datebyday} ${application_group.dayweek} (${application_group.count})건</h4>
                                           </li>
                                        </div>
                                        <div class="editable-responsive">
                                            <table class="table table-striped" id="datatable-editable">
                                                <thead>
                                                    <tr>
                                                        <th><input type="checkbox"/> </th>
                                                        <th>상점번호</th>
                                                        <th>상점명</th>
                                                        <th>성명</th>
                                                        <th>대체키</th>
                                                      <!--  <th>대출신청액</th> -->
                                                        <th>(KCB)전략등급</th>
                                                        <th>스코어</th>
                                                        <th>평점</th>
                                                        <th>전화번호</th>
                                                        <th>신청시간</th>
                                                        <!--<th>사유</th> -->
                                                        <th>상태</th>
                                                        <th>상세보고서</th>
                                                        <th>파일업로드</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${application_result}" var="application_result"  varStatus="status" begin="${index_start}" end ="${index_end-1}">
                                                    <tr class="gradeX">
                                                        <td><input type="checkbox" name ="chkList" value="${application_result.idx}"/> </td>
                                                         <td>${application_result.idx}</td>
                                                         <td>${application_result.storeName}</td>
                                                        <td>${application_result.applicant_name}</td>
                                                        <td>${application_result.replacekey}</td>
                                                        <!-- <td>${application_result.amount}</td> -->
                                                        <td>${application_result.rainbowscore}</td>
                                                        <td>${application_result.score}</td>
                                                        <td>${application_result.creditrate}</td>
                                                         <td><input type="text" class="form-control" name="phone" value="${application_result.phone}"/></td>
                                                        <td>${application_result.dataform}</td>
                                                        <!--<td><input type="text" class="form-control" name="memo" value="${application_result.descmemo}"/></td> -->

                                                        <c:choose>
                                                        <c:when test="${application_result.fundaMemo eq '홈페이지'}">
                                                            <c:if test="${application_result.replacekey eq null  && application_result.registerkey ne null}">
                                                                <!--    <td> <a class="btn btn-primary btn-lg active" href="/kcbsendlist?registerkey=${application_result.registerkey}&idx=${application_result.idx}">저장하기</a></td>-->
                                                                <td>  <input type="button" class="btn btn-primary btn-lg active" value="팝업호출" onclick="popup('${application_result.url}');"/>  </td>
                                                            </c:if>
                                                        </c:when>
                                                        </c:choose>

                                                            <c:choose>
                                                                <c:when test="${application_result.fundaMemo eq '어드민'}">
                                                                    <c:if test="${application_result.replacekey eq null  && application_result.registerkey ne null}">
                                                                    <td> <a class="btn btn-primary btn-lg active" href="/kcbsendlist?registerkey=${application_result.registerkey}&idx=${application_result.idx}">저장하기</a></td>
                                                                    </c:if>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <c:if test="${application_result.replacekey eq null  && application_result.registerkey ne null}">
                                                                        <td> <a class="btn btn-primary btn-lg active" href="/kcbsendlist?registerkey=${application_result.registerkey}&idx=${application_result.idx}">저장하기</a></td>
                                                                    </c:if>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${application_result.debtCode eq '심사대기'}">
                                                                    <span class="label label-primary">
                                                                </c:when>
                                                                <c:when test="${application_result.debtCode eq '심사진행'}">
                                                                    <span class="label label-purple">
                                                                </c:when>
                                                                <c:when test="${application_result.debtCode eq '심사완료'}">
                                                                    <span class="label label-success">
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="label label-danger">
                                                                </c:otherwise>
                                                            </c:choose>
                                                        ${application_result.debtCode}</span></td>
                                                      <!-- <td>${application_result.storeName}</td>-->
                                                      <!--  <td>
                                                            <select class="combobox">
                                                                <option></option>
                                                                <option value="PA">Pennsylvania</option>
                                                                <option value="CT">Connecticut</option>
                                                                <option value="NY">New York</option>
                                                                <option value="MD">Maryland</option>
                                                            </select>
                                                        </td>-->

                                                          <td class="actions">

                                                            <a href="#" class="hidden on-editing save-row"><i class="fa fa-save"></i></a>
                                                            <a href="#" class="hidden on-editing cancel-row"><i class="fa fa-times"></i></a>
                                                              <a href="/debt-detail?search=${application_result.idx}" class="on-default "><i class="fa fa-pencil"></i></a>
                                                              <a href="/downloadPDF?search=${application_result.idx}" class="on-default "><i class="fa fa-pencil"></i></a>
                                                              <a href="#" class="on-default edit-row "><i class="fa fa-pencil-square"></i></a>

                                                            </td>
                                                        <td>
                                                            <form id="frm" name="frm" action="/fileupload" method="post" enctype="multipart/form-data" >
                                                                <input type="file" name="file" required="required" onchange="handleSubmit()">
                                                                <input type="hidden" name="debtCode" required="required" value="${application_result.debtCode}">
                                                            </form>
                                                        </td>
                                                    </tr>

                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                            <c:set var="index_start" value="${index_start+application_group.count}"/>
                                        </c:forEach>
                                        </form>
                                    </div>
                                    <!-- end: panel body -->
                                </div> <!-- end panel -->
                            </div> <!-- end col-->
                        </div>
                        <!-- end row -->

                    </div> <!-- container -->

                </div> <!-- content -->

                <footer class="footer">
                    2016 © Funda.
                </footer>

            </div>


			<!-- MODAL -->
			<div id="dialog" class="modal-block mfp-hide">
				<section class="panel panel-info panel-color">
					<header class="panel-heading">
						<h2 class="panel-title">Are you sure?</h2>
					</header>
					<div class="panel-body">
						<div class="modal-wrapper">
							<div class="modal-text">
								<p>Are you sure that you want to delete this row?</p>
							</div>
						</div>

						<div class="row m-t-20">
							<div class="col-md-12 text-right">
								<button id="dialogConfirm" class="btn btn-primary waves-effect waves-light">Confirm</button>
								<button id="dialogCancel" class="btn btn-default waves-effect">Cancel</button>
							</div>
						</div>
					</div>

				</section>
			</div>
			<!-- end Modal -->


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
        <script src="/resources/assets/js/boostrap-combobox.js"></script>
        <script src="/resources/assets/js/bootstrap.min.js"></script>
        <script src="/resources/assets/js/detect.js"></script>
        <script src="/resources/assets/js/fastclick.js"></script>
        <script src="/resources/assets/js/jquery.slimscroll.js"></script>
        <script src="/resources/assets/js/jquery.blockUI.js"></script>
        <script src="/resources/assets/js/waves.js"></script>
        <script src="/resources/assets/js/jquery.nicescroll.js"></script>
        <script src="/resources/assets/js/jquery.scrollTo.min.js"></script>
        <script src="/resources/assets/js/boostrap-combobox.js"></script>

        <!-- Editable js -->
	    <script src="/resources/assets/plugins/magnific-popup/dist/jquery.magnific-popup.min.js"></script>
	    <script src="/resources/assets/plugins/jquery-datatables-editable/jquery.dataTables.js"></script>
	    <script src="/resources/assets/plugins/datatables/dataTables.bootstrap.js"></script>
	    <script src="/resources/assets/plugins/tiny-editable/mindmup-editabletable.js"></script>
	    <script src="/resources/assets/plugins/tiny-editable/numeric-input-example.js"></script>
		<!-- init -->
	    <script src="/resources/assets/pages/datatables.editable.init.js"></script>

        <!-- App js -->
        <script src="/resources/assets/js/jquery.core.js"></script>
        <script src="/resources/assets/js/jquery.app.js"></script>

        <script>
			$('#mainTable').editableTableWidget().numericInputExample().find('td:first').focus();
		</script>

    </body>
</html>