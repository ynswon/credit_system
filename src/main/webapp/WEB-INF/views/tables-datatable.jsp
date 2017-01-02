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

    <!-- DataTables -->
    <link href="/resources/assets/plugins/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/plugins/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/plugins/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/plugins/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/assets/plugins/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />

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
        <a href="index.html" class="logo"><span>Admin<span>to</span></span><i class="zmdi zmdi-layers"></i></a>
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
                    <h4 class="page-title">Datatables</h4>
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
<div class="left side-menu">
    <div class="sidebar-inner slimscrollleft">

        <!-- User -->
        <div class="user-box">
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
        </div>
        <!-- End User -->

        <!--- Sidemenu -->
        <div id="sidebar-menu">
            <ul>
                <li class="text-muted menu-title">Navigation</li>

                <li>
                    <a href="index.html" class="waves-effect"><i class="zmdi zmdi-view-dashboard"></i> <span> Dashboard </span> </a>
                </li>

                <li>
                    <a href="typography.html" class="waves-effect"><i class="zmdi zmdi-format-underlined"></i> <span> Typography </span> </a>
                </li>

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

                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect active"><i class="zmdi zmdi-view-list"></i> <span> Tables </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">
                        <li><a href="/table_basic">Basic Tables</a></li>
                        <li class="active"><li><a href="/tables-datatable">Data Table</a></li>
                        <li><a href="/tables-editable">Editable Table</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="zmdi zmdi-chart"></i><span> Charts </span> <span class="menu-arrow"></span></a>
                    <ul class="list-unstyled">
                        <li><a href="chart-flot.html">Flot Chart</a></li>
                        <li><a href="chart-morris.html">Morris Chart</a></li>
                        <li><a href="chart-chartist.html">Chartist Charts</a></li>
                        <li><a href="chart-other.html">Other Chart</a></li>
                    </ul>
                </li>

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

            </ul>
            <div class="clearfix"></div>
        </div>
        <!-- Sidebar -->
        <div class="clearfix"></div>

    </div>

</div>
<!-- Left Sidebar End -->



<!-- ============================================================== -->
<!-- Start right Content here -->
<!-- ============================================================== -->
<div class="content-page">
<!-- Start content -->
<div class="content">
<div class="container">

<div class="row">
<div class="col-sm-12">
<div class="card-box table-responsive">
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

<h4 class="header-title m-t-0 m-b-30">Default Example</h4>

<table id="datatable" class="table table-striped table-bordered">
<thead>
<tr>
    <th>Name</th>
    <th>Position</th>
    <th>Office</th>
    <th>Age</th>
    <th>Start date</th>
    <th>Salary</th>
</tr>
</thead>

<tbody>
<tr>
    <td>Tiger Nixon</td>
    <td>System Architect</td>
    <td>Edinburgh</td>
    <td>61</td>
    <td>2011/04/25</td>
    <td>$320,800</td>
</tr>
<tr>
    <td>Garrett Winters</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>63</td>
    <td>2011/07/25</td>
    <td>$170,750</td>
</tr>
<tr>
    <td>Ashton Cox</td>
    <td>Junior Technical Author</td>
    <td>San Francisco</td>
    <td>66</td>
    <td>2009/01/12</td>
    <td>$86,000</td>
</tr>
<tr>
    <td>Cedric Kelly</td>
    <td>Senior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2012/03/29</td>
    <td>$433,060</td>
</tr>
<tr>
    <td>Airi Satou</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>33</td>
    <td>2008/11/28</td>
    <td>$162,700</td>
</tr>
<tr>
    <td>Brielle Williamson</td>
    <td>Integration Specialist</td>
    <td>New York</td>
    <td>61</td>
    <td>2012/12/02</td>
    <td>$372,000</td>
</tr>
<tr>
    <td>Herrod Chandler</td>
    <td>Sales Assistant</td>
    <td>San Francisco</td>
    <td>59</td>
    <td>2012/08/06</td>
    <td>$137,500</td>
</tr>
<tr>
    <td>Rhona Davidson</td>
    <td>Integration Specialist</td>
    <td>Tokyo</td>
    <td>55</td>
    <td>2010/10/14</td>
    <td>$327,900</td>
</tr>
<tr>
    <td>Colleen Hurst</td>
    <td>Javascript Developer</td>
    <td>San Francisco</td>
    <td>39</td>
    <td>2009/09/15</td>
    <td>$205,500</td>
</tr>
<tr>
    <td>Sonya Frost</td>
    <td>Software Engineer</td>
    <td>Edinburgh</td>
    <td>23</td>
    <td>2008/12/13</td>
    <td>$103,600</td>
</tr>
<tr>
    <td>Jena Gaines</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>30</td>
    <td>2008/12/19</td>
    <td>$90,560</td>
</tr>
<tr>
    <td>Quinn Flynn</td>
    <td>Support Lead</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2013/03/03</td>
    <td>$342,000</td>
</tr>
<tr>
    <td>Charde Marshall</td>
    <td>Regional Director</td>
    <td>San Francisco</td>
    <td>36</td>
    <td>2008/10/16</td>
    <td>$470,600</td>
</tr>
<tr>
    <td>Haley Kennedy</td>
    <td>Senior Marketing Designer</td>
    <td>London</td>
    <td>43</td>
    <td>2012/12/18</td>
    <td>$313,500</td>
</tr>
<tr>
    <td>Tatyana Fitzpatrick</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>19</td>
    <td>2010/03/17</td>
    <td>$385,750</td>
</tr>
<tr>
    <td>Michael Silva</td>
    <td>Marketing Designer</td>
    <td>London</td>
    <td>66</td>
    <td>2012/11/27</td>
    <td>$198,500</td>
</tr>
<tr>
    <td>Paul Byrd</td>
    <td>Chief Financial Officer (CFO)</td>
    <td>New York</td>
    <td>64</td>
    <td>2010/06/09</td>
    <td>$725,000</td>
</tr>
<tr>
    <td>Gloria Little</td>
    <td>Systems Administrator</td>
    <td>New York</td>
    <td>59</td>
    <td>2009/04/10</td>
    <td>$237,500</td>
</tr>
<tr>
    <td>Bradley Greer</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>41</td>
    <td>2012/10/13</td>
    <td>$132,000</td>
</tr>
<tr>
    <td>Dai Rios</td>
    <td>Personnel Lead</td>
    <td>Edinburgh</td>
    <td>35</td>
    <td>2012/09/26</td>
    <td>$217,500</td>
</tr>
<tr>
    <td>Jenette Caldwell</td>
    <td>Development Lead</td>
    <td>New York</td>
    <td>30</td>
    <td>2011/09/03</td>
    <td>$345,000</td>
</tr>
<tr>
    <td>Yuri Berry</td>
    <td>Chief Marketing Officer (CMO)</td>
    <td>New York</td>
    <td>40</td>
    <td>2009/06/25</td>
    <td>$675,000</td>
</tr>
<tr>
    <td>Caesar Vance</td>
    <td>Pre-Sales Support</td>
    <td>New York</td>
    <td>21</td>
    <td>2011/12/12</td>
    <td>$106,450</td>
</tr>
<tr>
    <td>Doris Wilder</td>
    <td>Sales Assistant</td>
    <td>Sidney</td>
    <td>23</td>
    <td>2010/09/20</td>
    <td>$85,600</td>
</tr>
<tr>
    <td>Angelica Ramos</td>
    <td>Chief Executive Officer (CEO)</td>
    <td>London</td>
    <td>47</td>
    <td>2009/10/09</td>
    <td>$1,200,000</td>
</tr>
<tr>
    <td>Gavin Joyce</td>
    <td>Developer</td>
    <td>Edinburgh</td>
    <td>42</td>
    <td>2010/12/22</td>
    <td>$92,575</td>
</tr>
<tr>
    <td>Jennifer Chang</td>
    <td>Regional Director</td>
    <td>Singapore</td>
    <td>28</td>
    <td>2010/11/14</td>
    <td>$357,650</td>
</tr>
<tr>
    <td>Brenden Wagner</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>28</td>
    <td>2011/06/07</td>
    <td>$206,850</td>
</tr>
<tr>
    <td>Fiona Green</td>
    <td>Chief Operating Officer (COO)</td>
    <td>San Francisco</td>
    <td>48</td>
    <td>2010/03/11</td>
    <td>$850,000</td>
</tr>
<tr>
    <td>Shou Itou</td>
    <td>Regional Marketing</td>
    <td>Tokyo</td>
    <td>20</td>
    <td>2011/08/14</td>
    <td>$163,000</td>
</tr>
<tr>
    <td>Michelle House</td>
    <td>Integration Specialist</td>
    <td>Sidney</td>
    <td>37</td>
    <td>2011/06/02</td>
    <td>$95,400</td>
</tr>
<tr>
    <td>Suki Burks</td>
    <td>Developer</td>
    <td>London</td>
    <td>53</td>
    <td>2009/10/22</td>
    <td>$114,500</td>
</tr>
<tr>
    <td>Prescott Bartlett</td>
    <td>Technical Author</td>
    <td>London</td>
    <td>27</td>
    <td>2011/05/07</td>
    <td>$145,000</td>
</tr>
<tr>
    <td>Gavin Cortez</td>
    <td>Team Leader</td>
    <td>San Francisco</td>
    <td>22</td>
    <td>2008/10/26</td>
    <td>$235,500</td>
</tr>
<tr>
    <td>Martena Mccray</td>
    <td>Post-Sales support</td>
    <td>Edinburgh</td>
    <td>46</td>
    <td>2011/03/09</td>
    <td>$324,050</td>
</tr>
<tr>
    <td>Unity Butler</td>
    <td>Marketing Designer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/12/09</td>
    <td>$85,675</td>
</tr>
<tr>
    <td>Howard Hatfield</td>
    <td>Office Manager</td>
    <td>San Francisco</td>
    <td>51</td>
    <td>2008/12/16</td>
    <td>$164,500</td>
</tr>
<tr>
    <td>Hope Fuentes</td>
    <td>Secretary</td>
    <td>San Francisco</td>
    <td>41</td>
    <td>2010/02/12</td>
    <td>$109,850</td>
</tr>
<tr>
    <td>Vivian Harrell</td>
    <td>Financial Controller</td>
    <td>San Francisco</td>
    <td>62</td>
    <td>2009/02/14</td>
    <td>$452,500</td>
</tr>
<tr>
    <td>Timothy Mooney</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>37</td>
    <td>2008/12/11</td>
    <td>$136,200</td>
</tr>
<tr>
    <td>Jackson Bradshaw</td>
    <td>Director</td>
    <td>New York</td>
    <td>65</td>
    <td>2008/09/26</td>
    <td>$645,750</td>
</tr>
<tr>
    <td>Olivia Liang</td>
    <td>Support Engineer</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2011/02/03</td>
    <td>$234,500</td>
</tr>
<tr>
    <td>Bruno Nash</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>38</td>
    <td>2011/05/03</td>
    <td>$163,500</td>
</tr>
<tr>
    <td>Sakura Yamamoto</td>
    <td>Support Engineer</td>
    <td>Tokyo</td>
    <td>37</td>
    <td>2009/08/19</td>
    <td>$139,575</td>
</tr>
<tr>
    <td>Thor Walton</td>
    <td>Developer</td>
    <td>New York</td>
    <td>61</td>
    <td>2013/08/11</td>
    <td>$98,540</td>
</tr>
<tr>
    <td>Finn Camacho</td>
    <td>Support Engineer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/07/07</td>
    <td>$87,500</td>
</tr>
<tr>
    <td>Serge Baldwin</td>
    <td>Data Coordinator</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2012/04/09</td>
    <td>$138,575</td>
</tr>
<tr>
    <td>Zenaida Frank</td>
    <td>Software Engineer</td>
    <td>New York</td>
    <td>63</td>
    <td>2010/01/04</td>
    <td>$125,250</td>
</tr>
<tr>
    <td>Zorita Serrano</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>56</td>
    <td>2012/06/01</td>
    <td>$115,000</td>
</tr>
<tr>
    <td>Jennifer Acosta</td>
    <td>Junior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>43</td>
    <td>2013/02/01</td>
    <td>$75,650</td>
</tr>
<tr>
    <td>Cara Stevens</td>
    <td>Sales Assistant</td>
    <td>New York</td>
    <td>46</td>
    <td>2011/12/06</td>
    <td>$145,600</td>
</tr>
<tr>
    <td>Hermione Butler</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>47</td>
    <td>2011/03/21</td>
    <td>$356,250</td>
</tr>
<tr>
    <td>Lael Greer</td>
    <td>Systems Administrator</td>
    <td>London</td>
    <td>21</td>
    <td>2009/02/27</td>
    <td>$103,500</td>
</tr>
<tr>
    <td>Jonas Alexander</td>
    <td>Developer</td>
    <td>San Francisco</td>
    <td>30</td>
    <td>2010/07/14</td>
    <td>$86,500</td>
</tr>
<tr>
    <td>Shad Decker</td>
    <td>Regional Director</td>
    <td>Edinburgh</td>
    <td>51</td>
    <td>2008/11/13</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Michael Bruce</td>
    <td>Javascript Developer</td>
    <td>Singapore</td>
    <td>29</td>
    <td>2011/06/27</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Donna Snider</td>
    <td>Customer Support</td>
    <td>New York</td>
    <td>27</td>
    <td>2011/01/25</td>
    <td>$112,000</td>
</tr>
</tbody>
</table>
</div>
</div><!-- end col -->
</div>
<!-- end row -->


<div class="row">
<div class="col-sm-12">
<div class="card-box table-responsive">
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

<h4 class="header-title m-t-0 m-b-30">Buttons Example</h4>

<table id="datatable-buttons" class="table table-striped table-bordered">
<thead>
<tr>
    <th>Name</th>
    <th>Position</th>
    <th>Office</th>
    <th>Age</th>
    <th>Start date</th>
    <th>Salary</th>
</tr>
</thead>

<tbody>
<tr>
    <td>Tiger Nixon</td>
    <td>System Architect</td>
    <td>Edinburgh</td>
    <td>61</td>
    <td>2011/04/25</td>
    <td>$320,800</td>
</tr>
<tr>
    <td>Garrett Winters</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>63</td>
    <td>2011/07/25</td>
    <td>$170,750</td>
</tr>
<tr>
    <td>Ashton Cox</td>
    <td>Junior Technical Author</td>
    <td>San Francisco</td>
    <td>66</td>
    <td>2009/01/12</td>
    <td>$86,000</td>
</tr>
<tr>
    <td>Cedric Kelly</td>
    <td>Senior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2012/03/29</td>
    <td>$433,060</td>
</tr>
<tr>
    <td>Airi Satou</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>33</td>
    <td>2008/11/28</td>
    <td>$162,700</td>
</tr>
<tr>
    <td>Brielle Williamson</td>
    <td>Integration Specialist</td>
    <td>New York</td>
    <td>61</td>
    <td>2012/12/02</td>
    <td>$372,000</td>
</tr>
<tr>
    <td>Herrod Chandler</td>
    <td>Sales Assistant</td>
    <td>San Francisco</td>
    <td>59</td>
    <td>2012/08/06</td>
    <td>$137,500</td>
</tr>
<tr>
    <td>Rhona Davidson</td>
    <td>Integration Specialist</td>
    <td>Tokyo</td>
    <td>55</td>
    <td>2010/10/14</td>
    <td>$327,900</td>
</tr>
<tr>
    <td>Colleen Hurst</td>
    <td>Javascript Developer</td>
    <td>San Francisco</td>
    <td>39</td>
    <td>2009/09/15</td>
    <td>$205,500</td>
</tr>
<tr>
    <td>Sonya Frost</td>
    <td>Software Engineer</td>
    <td>Edinburgh</td>
    <td>23</td>
    <td>2008/12/13</td>
    <td>$103,600</td>
</tr>
<tr>
    <td>Jena Gaines</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>30</td>
    <td>2008/12/19</td>
    <td>$90,560</td>
</tr>
<tr>
    <td>Quinn Flynn</td>
    <td>Support Lead</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2013/03/03</td>
    <td>$342,000</td>
</tr>
<tr>
    <td>Charde Marshall</td>
    <td>Regional Director</td>
    <td>San Francisco</td>
    <td>36</td>
    <td>2008/10/16</td>
    <td>$470,600</td>
</tr>
<tr>
    <td>Haley Kennedy</td>
    <td>Senior Marketing Designer</td>
    <td>London</td>
    <td>43</td>
    <td>2012/12/18</td>
    <td>$313,500</td>
</tr>
<tr>
    <td>Tatyana Fitzpatrick</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>19</td>
    <td>2010/03/17</td>
    <td>$385,750</td>
</tr>
<tr>
    <td>Michael Silva</td>
    <td>Marketing Designer</td>
    <td>London</td>
    <td>66</td>
    <td>2012/11/27</td>
    <td>$198,500</td>
</tr>
<tr>
    <td>Paul Byrd</td>
    <td>Chief Financial Officer (CFO)</td>
    <td>New York</td>
    <td>64</td>
    <td>2010/06/09</td>
    <td>$725,000</td>
</tr>
<tr>
    <td>Gloria Little</td>
    <td>Systems Administrator</td>
    <td>New York</td>
    <td>59</td>
    <td>2009/04/10</td>
    <td>$237,500</td>
</tr>
<tr>
    <td>Bradley Greer</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>41</td>
    <td>2012/10/13</td>
    <td>$132,000</td>
</tr>
<tr>
    <td>Dai Rios</td>
    <td>Personnel Lead</td>
    <td>Edinburgh</td>
    <td>35</td>
    <td>2012/09/26</td>
    <td>$217,500</td>
</tr>
<tr>
    <td>Jenette Caldwell</td>
    <td>Development Lead</td>
    <td>New York</td>
    <td>30</td>
    <td>2011/09/03</td>
    <td>$345,000</td>
</tr>
<tr>
    <td>Yuri Berry</td>
    <td>Chief Marketing Officer (CMO)</td>
    <td>New York</td>
    <td>40</td>
    <td>2009/06/25</td>
    <td>$675,000</td>
</tr>
<tr>
    <td>Caesar Vance</td>
    <td>Pre-Sales Support</td>
    <td>New York</td>
    <td>21</td>
    <td>2011/12/12</td>
    <td>$106,450</td>
</tr>
<tr>
    <td>Doris Wilder</td>
    <td>Sales Assistant</td>
    <td>Sidney</td>
    <td>23</td>
    <td>2010/09/20</td>
    <td>$85,600</td>
</tr>
<tr>
    <td>Angelica Ramos</td>
    <td>Chief Executive Officer (CEO)</td>
    <td>London</td>
    <td>47</td>
    <td>2009/10/09</td>
    <td>$1,200,000</td>
</tr>
<tr>
    <td>Gavin Joyce</td>
    <td>Developer</td>
    <td>Edinburgh</td>
    <td>42</td>
    <td>2010/12/22</td>
    <td>$92,575</td>
</tr>
<tr>
    <td>Jennifer Chang</td>
    <td>Regional Director</td>
    <td>Singapore</td>
    <td>28</td>
    <td>2010/11/14</td>
    <td>$357,650</td>
</tr>
<tr>
    <td>Brenden Wagner</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>28</td>
    <td>2011/06/07</td>
    <td>$206,850</td>
</tr>
<tr>
    <td>Fiona Green</td>
    <td>Chief Operating Officer (COO)</td>
    <td>San Francisco</td>
    <td>48</td>
    <td>2010/03/11</td>
    <td>$850,000</td>
</tr>
<tr>
    <td>Shou Itou</td>
    <td>Regional Marketing</td>
    <td>Tokyo</td>
    <td>20</td>
    <td>2011/08/14</td>
    <td>$163,000</td>
</tr>
<tr>
    <td>Michelle House</td>
    <td>Integration Specialist</td>
    <td>Sidney</td>
    <td>37</td>
    <td>2011/06/02</td>
    <td>$95,400</td>
</tr>
<tr>
    <td>Suki Burks</td>
    <td>Developer</td>
    <td>London</td>
    <td>53</td>
    <td>2009/10/22</td>
    <td>$114,500</td>
</tr>
<tr>
    <td>Prescott Bartlett</td>
    <td>Technical Author</td>
    <td>London</td>
    <td>27</td>
    <td>2011/05/07</td>
    <td>$145,000</td>
</tr>
<tr>
    <td>Gavin Cortez</td>
    <td>Team Leader</td>
    <td>San Francisco</td>
    <td>22</td>
    <td>2008/10/26</td>
    <td>$235,500</td>
</tr>
<tr>
    <td>Martena Mccray</td>
    <td>Post-Sales support</td>
    <td>Edinburgh</td>
    <td>46</td>
    <td>2011/03/09</td>
    <td>$324,050</td>
</tr>
<tr>
    <td>Unity Butler</td>
    <td>Marketing Designer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/12/09</td>
    <td>$85,675</td>
</tr>
<tr>
    <td>Howard Hatfield</td>
    <td>Office Manager</td>
    <td>San Francisco</td>
    <td>51</td>
    <td>2008/12/16</td>
    <td>$164,500</td>
</tr>
<tr>
    <td>Hope Fuentes</td>
    <td>Secretary</td>
    <td>San Francisco</td>
    <td>41</td>
    <td>2010/02/12</td>
    <td>$109,850</td>
</tr>
<tr>
    <td>Vivian Harrell</td>
    <td>Financial Controller</td>
    <td>San Francisco</td>
    <td>62</td>
    <td>2009/02/14</td>
    <td>$452,500</td>
</tr>
<tr>
    <td>Timothy Mooney</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>37</td>
    <td>2008/12/11</td>
    <td>$136,200</td>
</tr>
<tr>
    <td>Jackson Bradshaw</td>
    <td>Director</td>
    <td>New York</td>
    <td>65</td>
    <td>2008/09/26</td>
    <td>$645,750</td>
</tr>
<tr>
    <td>Olivia Liang</td>
    <td>Support Engineer</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2011/02/03</td>
    <td>$234,500</td>
</tr>
<tr>
    <td>Bruno Nash</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>38</td>
    <td>2011/05/03</td>
    <td>$163,500</td>
</tr>
<tr>
    <td>Sakura Yamamoto</td>
    <td>Support Engineer</td>
    <td>Tokyo</td>
    <td>37</td>
    <td>2009/08/19</td>
    <td>$139,575</td>
</tr>
<tr>
    <td>Thor Walton</td>
    <td>Developer</td>
    <td>New York</td>
    <td>61</td>
    <td>2013/08/11</td>
    <td>$98,540</td>
</tr>
<tr>
    <td>Finn Camacho</td>
    <td>Support Engineer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/07/07</td>
    <td>$87,500</td>
</tr>
<tr>
    <td>Serge Baldwin</td>
    <td>Data Coordinator</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2012/04/09</td>
    <td>$138,575</td>
</tr>
<tr>
    <td>Zenaida Frank</td>
    <td>Software Engineer</td>
    <td>New York</td>
    <td>63</td>
    <td>2010/01/04</td>
    <td>$125,250</td>
</tr>
<tr>
    <td>Zorita Serrano</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>56</td>
    <td>2012/06/01</td>
    <td>$115,000</td>
</tr>
<tr>
    <td>Jennifer Acosta</td>
    <td>Junior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>43</td>
    <td>2013/02/01</td>
    <td>$75,650</td>
</tr>
<tr>
    <td>Cara Stevens</td>
    <td>Sales Assistant</td>
    <td>New York</td>
    <td>46</td>
    <td>2011/12/06</td>
    <td>$145,600</td>
</tr>
<tr>
    <td>Hermione Butler</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>47</td>
    <td>2011/03/21</td>
    <td>$356,250</td>
</tr>
<tr>
    <td>Lael Greer</td>
    <td>Systems Administrator</td>
    <td>London</td>
    <td>21</td>
    <td>2009/02/27</td>
    <td>$103,500</td>
</tr>
<tr>
    <td>Jonas Alexander</td>
    <td>Developer</td>
    <td>San Francisco</td>
    <td>30</td>
    <td>2010/07/14</td>
    <td>$86,500</td>
</tr>
<tr>
    <td>Shad Decker</td>
    <td>Regional Director</td>
    <td>Edinburgh</td>
    <td>51</td>
    <td>2008/11/13</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Michael Bruce</td>
    <td>Javascript Developer</td>
    <td>Singapore</td>
    <td>29</td>
    <td>2011/06/27</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Donna Snider</td>
    <td>Customer Support</td>
    <td>New York</td>
    <td>27</td>
    <td>2011/01/25</td>
    <td>$112,000</td>
</tr>
</tbody>
</table>
</div>
</div><!-- end col -->
</div>
<!-- end row -->


<div class="row">
<div class="col-sm-12">
<div class="card-box table-responsive">

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

<h4 class="header-title m-t-0 m-b-30">Fixed Header example</h4>

<table id="datatable-fixed-header" class="table table-striped table-bordered">
<thead>
<tr>
    <th>Name</th>
    <th>Position</th>
    <th>Office</th>
    <th>Age</th>
    <th>Start date</th>
    <th>Salary</th>
</tr>
</thead>

<tbody>
<tr>
    <td>Tiger Nixon</td>
    <td>System Architect</td>
    <td>Edinburgh</td>
    <td>61</td>
    <td>2011/04/25</td>
    <td>$320,800</td>
</tr>
<tr>
    <td>Garrett Winters</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>63</td>
    <td>2011/07/25</td>
    <td>$170,750</td>
</tr>
<tr>
    <td>Ashton Cox</td>
    <td>Junior Technical Author</td>
    <td>San Francisco</td>
    <td>66</td>
    <td>2009/01/12</td>
    <td>$86,000</td>
</tr>
<tr>
    <td>Cedric Kelly</td>
    <td>Senior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2012/03/29</td>
    <td>$433,060</td>
</tr>
<tr>
    <td>Airi Satou</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>33</td>
    <td>2008/11/28</td>
    <td>$162,700</td>
</tr>
<tr>
    <td>Brielle Williamson</td>
    <td>Integration Specialist</td>
    <td>New York</td>
    <td>61</td>
    <td>2012/12/02</td>
    <td>$372,000</td>
</tr>
<tr>
    <td>Herrod Chandler</td>
    <td>Sales Assistant</td>
    <td>San Francisco</td>
    <td>59</td>
    <td>2012/08/06</td>
    <td>$137,500</td>
</tr>
<tr>
    <td>Rhona Davidson</td>
    <td>Integration Specialist</td>
    <td>Tokyo</td>
    <td>55</td>
    <td>2010/10/14</td>
    <td>$327,900</td>
</tr>
<tr>
    <td>Colleen Hurst</td>
    <td>Javascript Developer</td>
    <td>San Francisco</td>
    <td>39</td>
    <td>2009/09/15</td>
    <td>$205,500</td>
</tr>
<tr>
    <td>Sonya Frost</td>
    <td>Software Engineer</td>
    <td>Edinburgh</td>
    <td>23</td>
    <td>2008/12/13</td>
    <td>$103,600</td>
</tr>
<tr>
    <td>Jena Gaines</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>30</td>
    <td>2008/12/19</td>
    <td>$90,560</td>
</tr>
<tr>
    <td>Quinn Flynn</td>
    <td>Support Lead</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2013/03/03</td>
    <td>$342,000</td>
</tr>
<tr>
    <td>Charde Marshall</td>
    <td>Regional Director</td>
    <td>San Francisco</td>
    <td>36</td>
    <td>2008/10/16</td>
    <td>$470,600</td>
</tr>
<tr>
    <td>Haley Kennedy</td>
    <td>Senior Marketing Designer</td>
    <td>London</td>
    <td>43</td>
    <td>2012/12/18</td>
    <td>$313,500</td>
</tr>
<tr>
    <td>Tatyana Fitzpatrick</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>19</td>
    <td>2010/03/17</td>
    <td>$385,750</td>
</tr>
<tr>
    <td>Michael Silva</td>
    <td>Marketing Designer</td>
    <td>London</td>
    <td>66</td>
    <td>2012/11/27</td>
    <td>$198,500</td>
</tr>
<tr>
    <td>Paul Byrd</td>
    <td>Chief Financial Officer (CFO)</td>
    <td>New York</td>
    <td>64</td>
    <td>2010/06/09</td>
    <td>$725,000</td>
</tr>
<tr>
    <td>Gloria Little</td>
    <td>Systems Administrator</td>
    <td>New York</td>
    <td>59</td>
    <td>2009/04/10</td>
    <td>$237,500</td>
</tr>
<tr>
    <td>Bradley Greer</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>41</td>
    <td>2012/10/13</td>
    <td>$132,000</td>
</tr>
<tr>
    <td>Dai Rios</td>
    <td>Personnel Lead</td>
    <td>Edinburgh</td>
    <td>35</td>
    <td>2012/09/26</td>
    <td>$217,500</td>
</tr>
<tr>
    <td>Jenette Caldwell</td>
    <td>Development Lead</td>
    <td>New York</td>
    <td>30</td>
    <td>2011/09/03</td>
    <td>$345,000</td>
</tr>
<tr>
    <td>Yuri Berry</td>
    <td>Chief Marketing Officer (CMO)</td>
    <td>New York</td>
    <td>40</td>
    <td>2009/06/25</td>
    <td>$675,000</td>
</tr>
<tr>
    <td>Caesar Vance</td>
    <td>Pre-Sales Support</td>
    <td>New York</td>
    <td>21</td>
    <td>2011/12/12</td>
    <td>$106,450</td>
</tr>
<tr>
    <td>Doris Wilder</td>
    <td>Sales Assistant</td>
    <td>Sidney</td>
    <td>23</td>
    <td>2010/09/20</td>
    <td>$85,600</td>
</tr>
<tr>
    <td>Angelica Ramos</td>
    <td>Chief Executive Officer (CEO)</td>
    <td>London</td>
    <td>47</td>
    <td>2009/10/09</td>
    <td>$1,200,000</td>
</tr>
<tr>
    <td>Gavin Joyce</td>
    <td>Developer</td>
    <td>Edinburgh</td>
    <td>42</td>
    <td>2010/12/22</td>
    <td>$92,575</td>
</tr>
<tr>
    <td>Jennifer Chang</td>
    <td>Regional Director</td>
    <td>Singapore</td>
    <td>28</td>
    <td>2010/11/14</td>
    <td>$357,650</td>
</tr>
<tr>
    <td>Brenden Wagner</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>28</td>
    <td>2011/06/07</td>
    <td>$206,850</td>
</tr>
<tr>
    <td>Fiona Green</td>
    <td>Chief Operating Officer (COO)</td>
    <td>San Francisco</td>
    <td>48</td>
    <td>2010/03/11</td>
    <td>$850,000</td>
</tr>
<tr>
    <td>Shou Itou</td>
    <td>Regional Marketing</td>
    <td>Tokyo</td>
    <td>20</td>
    <td>2011/08/14</td>
    <td>$163,000</td>
</tr>
<tr>
    <td>Michelle House</td>
    <td>Integration Specialist</td>
    <td>Sidney</td>
    <td>37</td>
    <td>2011/06/02</td>
    <td>$95,400</td>
</tr>
<tr>
    <td>Suki Burks</td>
    <td>Developer</td>
    <td>London</td>
    <td>53</td>
    <td>2009/10/22</td>
    <td>$114,500</td>
</tr>
<tr>
    <td>Prescott Bartlett</td>
    <td>Technical Author</td>
    <td>London</td>
    <td>27</td>
    <td>2011/05/07</td>
    <td>$145,000</td>
</tr>
<tr>
    <td>Gavin Cortez</td>
    <td>Team Leader</td>
    <td>San Francisco</td>
    <td>22</td>
    <td>2008/10/26</td>
    <td>$235,500</td>
</tr>
<tr>
    <td>Martena Mccray</td>
    <td>Post-Sales support</td>
    <td>Edinburgh</td>
    <td>46</td>
    <td>2011/03/09</td>
    <td>$324,050</td>
</tr>
<tr>
    <td>Unity Butler</td>
    <td>Marketing Designer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/12/09</td>
    <td>$85,675</td>
</tr>
<tr>
    <td>Howard Hatfield</td>
    <td>Office Manager</td>
    <td>San Francisco</td>
    <td>51</td>
    <td>2008/12/16</td>
    <td>$164,500</td>
</tr>
<tr>
    <td>Hope Fuentes</td>
    <td>Secretary</td>
    <td>San Francisco</td>
    <td>41</td>
    <td>2010/02/12</td>
    <td>$109,850</td>
</tr>
<tr>
    <td>Vivian Harrell</td>
    <td>Financial Controller</td>
    <td>San Francisco</td>
    <td>62</td>
    <td>2009/02/14</td>
    <td>$452,500</td>
</tr>
<tr>
    <td>Timothy Mooney</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>37</td>
    <td>2008/12/11</td>
    <td>$136,200</td>
</tr>
<tr>
    <td>Jackson Bradshaw</td>
    <td>Director</td>
    <td>New York</td>
    <td>65</td>
    <td>2008/09/26</td>
    <td>$645,750</td>
</tr>
<tr>
    <td>Olivia Liang</td>
    <td>Support Engineer</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2011/02/03</td>
    <td>$234,500</td>
</tr>
<tr>
    <td>Bruno Nash</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>38</td>
    <td>2011/05/03</td>
    <td>$163,500</td>
</tr>
<tr>
    <td>Sakura Yamamoto</td>
    <td>Support Engineer</td>
    <td>Tokyo</td>
    <td>37</td>
    <td>2009/08/19</td>
    <td>$139,575</td>
</tr>
<tr>
    <td>Thor Walton</td>
    <td>Developer</td>
    <td>New York</td>
    <td>61</td>
    <td>2013/08/11</td>
    <td>$98,540</td>
</tr>
<tr>
    <td>Finn Camacho</td>
    <td>Support Engineer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/07/07</td>
    <td>$87,500</td>
</tr>
<tr>
    <td>Serge Baldwin</td>
    <td>Data Coordinator</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2012/04/09</td>
    <td>$138,575</td>
</tr>
<tr>
    <td>Zenaida Frank</td>
    <td>Software Engineer</td>
    <td>New York</td>
    <td>63</td>
    <td>2010/01/04</td>
    <td>$125,250</td>
</tr>
<tr>
    <td>Zorita Serrano</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>56</td>
    <td>2012/06/01</td>
    <td>$115,000</td>
</tr>
<tr>
    <td>Jennifer Acosta</td>
    <td>Junior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>43</td>
    <td>2013/02/01</td>
    <td>$75,650</td>
</tr>
<tr>
    <td>Cara Stevens</td>
    <td>Sales Assistant</td>
    <td>New York</td>
    <td>46</td>
    <td>2011/12/06</td>
    <td>$145,600</td>
</tr>
<tr>
    <td>Hermione Butler</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>47</td>
    <td>2011/03/21</td>
    <td>$356,250</td>
</tr>
<tr>
    <td>Lael Greer</td>
    <td>Systems Administrator</td>
    <td>London</td>
    <td>21</td>
    <td>2009/02/27</td>
    <td>$103,500</td>
</tr>
<tr>
    <td>Jonas Alexander</td>
    <td>Developer</td>
    <td>San Francisco</td>
    <td>30</td>
    <td>2010/07/14</td>
    <td>$86,500</td>
</tr>
<tr>
    <td>Shad Decker</td>
    <td>Regional Director</td>
    <td>Edinburgh</td>
    <td>51</td>
    <td>2008/11/13</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Michael Bruce</td>
    <td>Javascript Developer</td>
    <td>Singapore</td>
    <td>29</td>
    <td>2011/06/27</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Donna Snider</td>
    <td>Customer Support</td>
    <td>New York</td>
    <td>27</td>
    <td>2011/01/25</td>
    <td>$112,000</td>
</tr>
</tbody>
</table>
</div>
</div><!-- end col -->
</div>
<!-- end row -->


<div class="row">
<div class="col-sm-12">
<div class="card-box table-responsive">
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

<h4 class="header-title m-t-0 m-b-30">KeyTable example</h4>

<table id="datatable-keytable" class="table table-striped table-bordered">
<thead>
<tr>
    <th>Name</th>
    <th>Position</th>
    <th>Office</th>
    <th>Age</th>
    <th>Start date</th>
    <th>Salary</th>
</tr>
</thead>

<tbody>
<tr>
    <td>Tiger Nixon</td>
    <td>System Architect</td>
    <td>Edinburgh</td>
    <td>61</td>
    <td>2011/04/25</td>
    <td>$320,800</td>
</tr>
<tr>
    <td>Garrett Winters</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>63</td>
    <td>2011/07/25</td>
    <td>$170,750</td>
</tr>
<tr>
    <td>Ashton Cox</td>
    <td>Junior Technical Author</td>
    <td>San Francisco</td>
    <td>66</td>
    <td>2009/01/12</td>
    <td>$86,000</td>
</tr>
<tr>
    <td>Cedric Kelly</td>
    <td>Senior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2012/03/29</td>
    <td>$433,060</td>
</tr>
<tr>
    <td>Airi Satou</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>33</td>
    <td>2008/11/28</td>
    <td>$162,700</td>
</tr>
<tr>
    <td>Brielle Williamson</td>
    <td>Integration Specialist</td>
    <td>New York</td>
    <td>61</td>
    <td>2012/12/02</td>
    <td>$372,000</td>
</tr>
<tr>
    <td>Herrod Chandler</td>
    <td>Sales Assistant</td>
    <td>San Francisco</td>
    <td>59</td>
    <td>2012/08/06</td>
    <td>$137,500</td>
</tr>
<tr>
    <td>Rhona Davidson</td>
    <td>Integration Specialist</td>
    <td>Tokyo</td>
    <td>55</td>
    <td>2010/10/14</td>
    <td>$327,900</td>
</tr>
<tr>
    <td>Colleen Hurst</td>
    <td>Javascript Developer</td>
    <td>San Francisco</td>
    <td>39</td>
    <td>2009/09/15</td>
    <td>$205,500</td>
</tr>
<tr>
    <td>Sonya Frost</td>
    <td>Software Engineer</td>
    <td>Edinburgh</td>
    <td>23</td>
    <td>2008/12/13</td>
    <td>$103,600</td>
</tr>
<tr>
    <td>Jena Gaines</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>30</td>
    <td>2008/12/19</td>
    <td>$90,560</td>
</tr>
<tr>
    <td>Quinn Flynn</td>
    <td>Support Lead</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2013/03/03</td>
    <td>$342,000</td>
</tr>
<tr>
    <td>Charde Marshall</td>
    <td>Regional Director</td>
    <td>San Francisco</td>
    <td>36</td>
    <td>2008/10/16</td>
    <td>$470,600</td>
</tr>
<tr>
    <td>Haley Kennedy</td>
    <td>Senior Marketing Designer</td>
    <td>London</td>
    <td>43</td>
    <td>2012/12/18</td>
    <td>$313,500</td>
</tr>
<tr>
    <td>Tatyana Fitzpatrick</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>19</td>
    <td>2010/03/17</td>
    <td>$385,750</td>
</tr>
<tr>
    <td>Michael Silva</td>
    <td>Marketing Designer</td>
    <td>London</td>
    <td>66</td>
    <td>2012/11/27</td>
    <td>$198,500</td>
</tr>
<tr>
    <td>Paul Byrd</td>
    <td>Chief Financial Officer (CFO)</td>
    <td>New York</td>
    <td>64</td>
    <td>2010/06/09</td>
    <td>$725,000</td>
</tr>
<tr>
    <td>Gloria Little</td>
    <td>Systems Administrator</td>
    <td>New York</td>
    <td>59</td>
    <td>2009/04/10</td>
    <td>$237,500</td>
</tr>
<tr>
    <td>Bradley Greer</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>41</td>
    <td>2012/10/13</td>
    <td>$132,000</td>
</tr>
<tr>
    <td>Dai Rios</td>
    <td>Personnel Lead</td>
    <td>Edinburgh</td>
    <td>35</td>
    <td>2012/09/26</td>
    <td>$217,500</td>
</tr>
<tr>
    <td>Jenette Caldwell</td>
    <td>Development Lead</td>
    <td>New York</td>
    <td>30</td>
    <td>2011/09/03</td>
    <td>$345,000</td>
</tr>
<tr>
    <td>Yuri Berry</td>
    <td>Chief Marketing Officer (CMO)</td>
    <td>New York</td>
    <td>40</td>
    <td>2009/06/25</td>
    <td>$675,000</td>
</tr>
<tr>
    <td>Caesar Vance</td>
    <td>Pre-Sales Support</td>
    <td>New York</td>
    <td>21</td>
    <td>2011/12/12</td>
    <td>$106,450</td>
</tr>
<tr>
    <td>Doris Wilder</td>
    <td>Sales Assistant</td>
    <td>Sidney</td>
    <td>23</td>
    <td>2010/09/20</td>
    <td>$85,600</td>
</tr>
<tr>
    <td>Angelica Ramos</td>
    <td>Chief Executive Officer (CEO)</td>
    <td>London</td>
    <td>47</td>
    <td>2009/10/09</td>
    <td>$1,200,000</td>
</tr>
<tr>
    <td>Gavin Joyce</td>
    <td>Developer</td>
    <td>Edinburgh</td>
    <td>42</td>
    <td>2010/12/22</td>
    <td>$92,575</td>
</tr>
<tr>
    <td>Jennifer Chang</td>
    <td>Regional Director</td>
    <td>Singapore</td>
    <td>28</td>
    <td>2010/11/14</td>
    <td>$357,650</td>
</tr>
<tr>
    <td>Brenden Wagner</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>28</td>
    <td>2011/06/07</td>
    <td>$206,850</td>
</tr>
<tr>
    <td>Fiona Green</td>
    <td>Chief Operating Officer (COO)</td>
    <td>San Francisco</td>
    <td>48</td>
    <td>2010/03/11</td>
    <td>$850,000</td>
</tr>
<tr>
    <td>Shou Itou</td>
    <td>Regional Marketing</td>
    <td>Tokyo</td>
    <td>20</td>
    <td>2011/08/14</td>
    <td>$163,000</td>
</tr>
<tr>
    <td>Michelle House</td>
    <td>Integration Specialist</td>
    <td>Sidney</td>
    <td>37</td>
    <td>2011/06/02</td>
    <td>$95,400</td>
</tr>
<tr>
    <td>Suki Burks</td>
    <td>Developer</td>
    <td>London</td>
    <td>53</td>
    <td>2009/10/22</td>
    <td>$114,500</td>
</tr>
<tr>
    <td>Prescott Bartlett</td>
    <td>Technical Author</td>
    <td>London</td>
    <td>27</td>
    <td>2011/05/07</td>
    <td>$145,000</td>
</tr>
<tr>
    <td>Gavin Cortez</td>
    <td>Team Leader</td>
    <td>San Francisco</td>
    <td>22</td>
    <td>2008/10/26</td>
    <td>$235,500</td>
</tr>
<tr>
    <td>Martena Mccray</td>
    <td>Post-Sales support</td>
    <td>Edinburgh</td>
    <td>46</td>
    <td>2011/03/09</td>
    <td>$324,050</td>
</tr>
<tr>
    <td>Unity Butler</td>
    <td>Marketing Designer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/12/09</td>
    <td>$85,675</td>
</tr>
<tr>
    <td>Howard Hatfield</td>
    <td>Office Manager</td>
    <td>San Francisco</td>
    <td>51</td>
    <td>2008/12/16</td>
    <td>$164,500</td>
</tr>
<tr>
    <td>Hope Fuentes</td>
    <td>Secretary</td>
    <td>San Francisco</td>
    <td>41</td>
    <td>2010/02/12</td>
    <td>$109,850</td>
</tr>
<tr>
    <td>Vivian Harrell</td>
    <td>Financial Controller</td>
    <td>San Francisco</td>
    <td>62</td>
    <td>2009/02/14</td>
    <td>$452,500</td>
</tr>
<tr>
    <td>Timothy Mooney</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>37</td>
    <td>2008/12/11</td>
    <td>$136,200</td>
</tr>
<tr>
    <td>Jackson Bradshaw</td>
    <td>Director</td>
    <td>New York</td>
    <td>65</td>
    <td>2008/09/26</td>
    <td>$645,750</td>
</tr>
<tr>
    <td>Olivia Liang</td>
    <td>Support Engineer</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2011/02/03</td>
    <td>$234,500</td>
</tr>
<tr>
    <td>Bruno Nash</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>38</td>
    <td>2011/05/03</td>
    <td>$163,500</td>
</tr>
<tr>
    <td>Sakura Yamamoto</td>
    <td>Support Engineer</td>
    <td>Tokyo</td>
    <td>37</td>
    <td>2009/08/19</td>
    <td>$139,575</td>
</tr>
<tr>
    <td>Thor Walton</td>
    <td>Developer</td>
    <td>New York</td>
    <td>61</td>
    <td>2013/08/11</td>
    <td>$98,540</td>
</tr>
<tr>
    <td>Finn Camacho</td>
    <td>Support Engineer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/07/07</td>
    <td>$87,500</td>
</tr>
<tr>
    <td>Serge Baldwin</td>
    <td>Data Coordinator</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2012/04/09</td>
    <td>$138,575</td>
</tr>
<tr>
    <td>Zenaida Frank</td>
    <td>Software Engineer</td>
    <td>New York</td>
    <td>63</td>
    <td>2010/01/04</td>
    <td>$125,250</td>
</tr>
<tr>
    <td>Zorita Serrano</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>56</td>
    <td>2012/06/01</td>
    <td>$115,000</td>
</tr>
<tr>
    <td>Jennifer Acosta</td>
    <td>Junior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>43</td>
    <td>2013/02/01</td>
    <td>$75,650</td>
</tr>
<tr>
    <td>Cara Stevens</td>
    <td>Sales Assistant</td>
    <td>New York</td>
    <td>46</td>
    <td>2011/12/06</td>
    <td>$145,600</td>
</tr>
<tr>
    <td>Hermione Butler</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>47</td>
    <td>2011/03/21</td>
    <td>$356,250</td>
</tr>
<tr>
    <td>Lael Greer</td>
    <td>Systems Administrator</td>
    <td>London</td>
    <td>21</td>
    <td>2009/02/27</td>
    <td>$103,500</td>
</tr>
<tr>
    <td>Jonas Alexander</td>
    <td>Developer</td>
    <td>San Francisco</td>
    <td>30</td>
    <td>2010/07/14</td>
    <td>$86,500</td>
</tr>
<tr>
    <td>Shad Decker</td>
    <td>Regional Director</td>
    <td>Edinburgh</td>
    <td>51</td>
    <td>2008/11/13</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Michael Bruce</td>
    <td>Javascript Developer</td>
    <td>Singapore</td>
    <td>29</td>
    <td>2011/06/27</td>
    <td>$183,000</td>
</tr>
<tr>
    <td>Donna Snider</td>
    <td>Customer Support</td>
    <td>New York</td>
    <td>27</td>
    <td>2011/01/25</td>
    <td>$112,000</td>
</tr>
</tbody>
</table>
</div>
</div><!-- end col -->
</div>
<!-- end row -->



<div class="row">
<div class="col-sm-12">
<div class="card-box table-responsive">

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

<h4 class="header-title m-t-0 m-b-30">Responsive example</h4>

<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
<thead>
<tr>
    <th>First name</th>
    <th>Last name</th>
    <th>Position</th>
    <th>Office</th>
    <th>Age</th>
    <th>Start date</th>
    <th>Salary</th>
    <th>Extn.</th>
    <th>E-mail</th>
</tr>
</thead>
<tbody>
<tr>
    <td>Tiger</td>
    <td>Nixon</td>
    <td>System Architect</td>
    <td>Edinburgh</td>
    <td>61</td>
    <td>2011/04/25</td>
    <td>$320,800</td>
    <td>5421</td>
    <td>t.nixon@datatables.net</td>
</tr>
<tr>
    <td>Garrett</td>
    <td>Winters</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>63</td>
    <td>2011/07/25</td>
    <td>$170,750</td>
    <td>8422</td>
    <td>g.winters@datatables.net</td>
</tr>
<tr>
    <td>Ashton</td>
    <td>Cox</td>
    <td>Junior Technical Author</td>
    <td>San Francisco</td>
    <td>66</td>
    <td>2009/01/12</td>
    <td>$86,000</td>
    <td>1562</td>
    <td>a.cox@datatables.net</td>
</tr>
<tr>
    <td>Cedric</td>
    <td>Kelly</td>
    <td>Senior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2012/03/29</td>
    <td>$433,060</td>
    <td>6224</td>
    <td>c.kelly@datatables.net</td>
</tr>
<tr>
    <td>Airi</td>
    <td>Satou</td>
    <td>Accountant</td>
    <td>Tokyo</td>
    <td>33</td>
    <td>2008/11/28</td>
    <td>$162,700</td>
    <td>5407</td>
    <td>a.satou@datatables.net</td>
</tr>
<tr>
    <td>Brielle</td>
    <td>Williamson</td>
    <td>Integration Specialist</td>
    <td>New York</td>
    <td>61</td>
    <td>2012/12/02</td>
    <td>$372,000</td>
    <td>4804</td>
    <td>b.williamson@datatables.net</td>
</tr>
<tr>
    <td>Herrod</td>
    <td>Chandler</td>
    <td>Sales Assistant</td>
    <td>San Francisco</td>
    <td>59</td>
    <td>2012/08/06</td>
    <td>$137,500</td>
    <td>9608</td>
    <td>h.chandler@datatables.net</td>
</tr>
<tr>
    <td>Rhona</td>
    <td>Davidson</td>
    <td>Integration Specialist</td>
    <td>Tokyo</td>
    <td>55</td>
    <td>2010/10/14</td>
    <td>$327,900</td>
    <td>6200</td>
    <td>r.davidson@datatables.net</td>
</tr>
<tr>
    <td>Colleen</td>
    <td>Hurst</td>
    <td>Javascript Developer</td>
    <td>San Francisco</td>
    <td>39</td>
    <td>2009/09/15</td>
    <td>$205,500</td>
    <td>2360</td>
    <td>c.hurst@datatables.net</td>
</tr>
<tr>
    <td>Sonya</td>
    <td>Frost</td>
    <td>Software Engineer</td>
    <td>Edinburgh</td>
    <td>23</td>
    <td>2008/12/13</td>
    <td>$103,600</td>
    <td>1667</td>
    <td>s.frost@datatables.net</td>
</tr>
<tr>
    <td>Jena</td>
    <td>Gaines</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>30</td>
    <td>2008/12/19</td>
    <td>$90,560</td>
    <td>3814</td>
    <td>j.gaines@datatables.net</td>
</tr>
<tr>
    <td>Quinn</td>
    <td>Flynn</td>
    <td>Support Lead</td>
    <td>Edinburgh</td>
    <td>22</td>
    <td>2013/03/03</td>
    <td>$342,000</td>
    <td>9497</td>
    <td>q.flynn@datatables.net</td>
</tr>
<tr>
    <td>Charde</td>
    <td>Marshall</td>
    <td>Regional Director</td>
    <td>San Francisco</td>
    <td>36</td>
    <td>2008/10/16</td>
    <td>$470,600</td>
    <td>6741</td>
    <td>c.marshall@datatables.net</td>
</tr>
<tr>
    <td>Haley</td>
    <td>Kennedy</td>
    <td>Senior Marketing Designer</td>
    <td>London</td>
    <td>43</td>
    <td>2012/12/18</td>
    <td>$313,500</td>
    <td>3597</td>
    <td>h.kennedy@datatables.net</td>
</tr>
<tr>
    <td>Tatyana</td>
    <td>Fitzpatrick</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>19</td>
    <td>2010/03/17</td>
    <td>$385,750</td>
    <td>1965</td>
    <td>t.fitzpatrick@datatables.net</td>
</tr>
<tr>
    <td>Michael</td>
    <td>Silva</td>
    <td>Marketing Designer</td>
    <td>London</td>
    <td>66</td>
    <td>2012/11/27</td>
    <td>$198,500</td>
    <td>1581</td>
    <td>m.silva@datatables.net</td>
</tr>
<tr>
    <td>Paul</td>
    <td>Byrd</td>
    <td>Chief Financial Officer (CFO)</td>
    <td>New York</td>
    <td>64</td>
    <td>2010/06/09</td>
    <td>$725,000</td>
    <td>3059</td>
    <td>p.byrd@datatables.net</td>
</tr>
<tr>
    <td>Gloria</td>
    <td>Little</td>
    <td>Systems Administrator</td>
    <td>New York</td>
    <td>59</td>
    <td>2009/04/10</td>
    <td>$237,500</td>
    <td>1721</td>
    <td>g.little@datatables.net</td>
</tr>
<tr>
    <td>Bradley</td>
    <td>Greer</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>41</td>
    <td>2012/10/13</td>
    <td>$132,000</td>
    <td>2558</td>
    <td>b.greer@datatables.net</td>
</tr>
<tr>
    <td>Dai</td>
    <td>Rios</td>
    <td>Personnel Lead</td>
    <td>Edinburgh</td>
    <td>35</td>
    <td>2012/09/26</td>
    <td>$217,500</td>
    <td>2290</td>
    <td>d.rios@datatables.net</td>
</tr>
<tr>
    <td>Jenette</td>
    <td>Caldwell</td>
    <td>Development Lead</td>
    <td>New York</td>
    <td>30</td>
    <td>2011/09/03</td>
    <td>$345,000</td>
    <td>1937</td>
    <td>j.caldwell@datatables.net</td>
</tr>
<tr>
    <td>Yuri</td>
    <td>Berry</td>
    <td>Chief Marketing Officer (CMO)</td>
    <td>New York</td>
    <td>40</td>
    <td>2009/06/25</td>
    <td>$675,000</td>
    <td>6154</td>
    <td>y.berry@datatables.net</td>
</tr>
<tr>
    <td>Caesar</td>
    <td>Vance</td>
    <td>Pre-Sales Support</td>
    <td>New York</td>
    <td>21</td>
    <td>2011/12/12</td>
    <td>$106,450</td>
    <td>8330</td>
    <td>c.vance@datatables.net</td>
</tr>
<tr>
    <td>Doris</td>
    <td>Wilder</td>
    <td>Sales Assistant</td>
    <td>Sidney</td>
    <td>23</td>
    <td>2010/09/20</td>
    <td>$85,600</td>
    <td>3023</td>
    <td>d.wilder@datatables.net</td>
</tr>
<tr>
    <td>Angelica</td>
    <td>Ramos</td>
    <td>Chief Executive Officer (CEO)</td>
    <td>London</td>
    <td>47</td>
    <td>2009/10/09</td>
    <td>$1,200,000</td>
    <td>5797</td>
    <td>a.ramos@datatables.net</td>
</tr>
<tr>
    <td>Gavin</td>
    <td>Joyce</td>
    <td>Developer</td>
    <td>Edinburgh</td>
    <td>42</td>
    <td>2010/12/22</td>
    <td>$92,575</td>
    <td>8822</td>
    <td>g.joyce@datatables.net</td>
</tr>
<tr>
    <td>Jennifer</td>
    <td>Chang</td>
    <td>Regional Director</td>
    <td>Singapore</td>
    <td>28</td>
    <td>2010/11/14</td>
    <td>$357,650</td>
    <td>9239</td>
    <td>j.chang@datatables.net</td>
</tr>
<tr>
    <td>Brenden</td>
    <td>Wagner</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>28</td>
    <td>2011/06/07</td>
    <td>$206,850</td>
    <td>1314</td>
    <td>b.wagner@datatables.net</td>
</tr>
<tr>
    <td>Fiona</td>
    <td>Green</td>
    <td>Chief Operating Officer (COO)</td>
    <td>San Francisco</td>
    <td>48</td>
    <td>2010/03/11</td>
    <td>$850,000</td>
    <td>2947</td>
    <td>f.green@datatables.net</td>
</tr>
<tr>
    <td>Shou</td>
    <td>Itou</td>
    <td>Regional Marketing</td>
    <td>Tokyo</td>
    <td>20</td>
    <td>2011/08/14</td>
    <td>$163,000</td>
    <td>8899</td>
    <td>s.itou@datatables.net</td>
</tr>
<tr>
    <td>Michelle</td>
    <td>House</td>
    <td>Integration Specialist</td>
    <td>Sidney</td>
    <td>37</td>
    <td>2011/06/02</td>
    <td>$95,400</td>
    <td>2769</td>
    <td>m.house@datatables.net</td>
</tr>
<tr>
    <td>Suki</td>
    <td>Burks</td>
    <td>Developer</td>
    <td>London</td>
    <td>53</td>
    <td>2009/10/22</td>
    <td>$114,500</td>
    <td>6832</td>
    <td>s.burks@datatables.net</td>
</tr>
<tr>
    <td>Prescott</td>
    <td>Bartlett</td>
    <td>Technical Author</td>
    <td>London</td>
    <td>27</td>
    <td>2011/05/07</td>
    <td>$145,000</td>
    <td>3606</td>
    <td>p.bartlett@datatables.net</td>
</tr>
<tr>
    <td>Gavin</td>
    <td>Cortez</td>
    <td>Team Leader</td>
    <td>San Francisco</td>
    <td>22</td>
    <td>2008/10/26</td>
    <td>$235,500</td>
    <td>2860</td>
    <td>g.cortez@datatables.net</td>
</tr>
<tr>
    <td>Martena</td>
    <td>Mccray</td>
    <td>Post-Sales support</td>
    <td>Edinburgh</td>
    <td>46</td>
    <td>2011/03/09</td>
    <td>$324,050</td>
    <td>8240</td>
    <td>m.mccray@datatables.net</td>
</tr>
<tr>
    <td>Unity</td>
    <td>Butler</td>
    <td>Marketing Designer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/12/09</td>
    <td>$85,675</td>
    <td>5384</td>
    <td>u.butler@datatables.net</td>
</tr>
<tr>
    <td>Howard</td>
    <td>Hatfield</td>
    <td>Office Manager</td>
    <td>San Francisco</td>
    <td>51</td>
    <td>2008/12/16</td>
    <td>$164,500</td>
    <td>7031</td>
    <td>h.hatfield@datatables.net</td>
</tr>
<tr>
    <td>Hope</td>
    <td>Fuentes</td>
    <td>Secretary</td>
    <td>San Francisco</td>
    <td>41</td>
    <td>2010/02/12</td>
    <td>$109,850</td>
    <td>6318</td>
    <td>h.fuentes@datatables.net</td>
</tr>
<tr>
    <td>Vivian</td>
    <td>Harrell</td>
    <td>Financial Controller</td>
    <td>San Francisco</td>
    <td>62</td>
    <td>2009/02/14</td>
    <td>$452,500</td>
    <td>9422</td>
    <td>v.harrell@datatables.net</td>
</tr>
<tr>
    <td>Timothy</td>
    <td>Mooney</td>
    <td>Office Manager</td>
    <td>London</td>
    <td>37</td>
    <td>2008/12/11</td>
    <td>$136,200</td>
    <td>7580</td>
    <td>t.mooney@datatables.net</td>
</tr>
<tr>
    <td>Jackson</td>
    <td>Bradshaw</td>
    <td>Director</td>
    <td>New York</td>
    <td>65</td>
    <td>2008/09/26</td>
    <td>$645,750</td>
    <td>1042</td>
    <td>j.bradshaw@datatables.net</td>
</tr>
<tr>
    <td>Olivia</td>
    <td>Liang</td>
    <td>Support Engineer</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2011/02/03</td>
    <td>$234,500</td>
    <td>2120</td>
    <td>o.liang@datatables.net</td>
</tr>
<tr>
    <td>Bruno</td>
    <td>Nash</td>
    <td>Software Engineer</td>
    <td>London</td>
    <td>38</td>
    <td>2011/05/03</td>
    <td>$163,500</td>
    <td>6222</td>
    <td>b.nash@datatables.net</td>
</tr>
<tr>
    <td>Sakura</td>
    <td>Yamamoto</td>
    <td>Support Engineer</td>
    <td>Tokyo</td>
    <td>37</td>
    <td>2009/08/19</td>
    <td>$139,575</td>
    <td>9383</td>
    <td>s.yamamoto@datatables.net</td>
</tr>
<tr>
    <td>Thor</td>
    <td>Walton</td>
    <td>Developer</td>
    <td>New York</td>
    <td>61</td>
    <td>2013/08/11</td>
    <td>$98,540</td>
    <td>8327</td>
    <td>t.walton@datatables.net</td>
</tr>
<tr>
    <td>Finn</td>
    <td>Camacho</td>
    <td>Support Engineer</td>
    <td>San Francisco</td>
    <td>47</td>
    <td>2009/07/07</td>
    <td>$87,500</td>
    <td>2927</td>
    <td>f.camacho@datatables.net</td>
</tr>
<tr>
    <td>Serge</td>
    <td>Baldwin</td>
    <td>Data Coordinator</td>
    <td>Singapore</td>
    <td>64</td>
    <td>2012/04/09</td>
    <td>$138,575</td>
    <td>8352</td>
    <td>s.baldwin@datatables.net</td>
</tr>
<tr>
    <td>Zenaida</td>
    <td>Frank</td>
    <td>Software Engineer</td>
    <td>New York</td>
    <td>63</td>
    <td>2010/01/04</td>
    <td>$125,250</td>
    <td>7439</td>
    <td>z.frank@datatables.net</td>
</tr>
<tr>
    <td>Zorita</td>
    <td>Serrano</td>
    <td>Software Engineer</td>
    <td>San Francisco</td>
    <td>56</td>
    <td>2012/06/01</td>
    <td>$115,000</td>
    <td>4389</td>
    <td>z.serrano@datatables.net</td>
</tr>
<tr>
    <td>Jennifer</td>
    <td>Acosta</td>
    <td>Junior Javascript Developer</td>
    <td>Edinburgh</td>
    <td>43</td>
    <td>2013/02/01</td>
    <td>$75,650</td>
    <td>3431</td>
    <td>j.acosta@datatables.net</td>
</tr>
<tr>
    <td>Cara</td>
    <td>Stevens</td>
    <td>Sales Assistant</td>
    <td>New York</td>
    <td>46</td>
    <td>2011/12/06</td>
    <td>$145,600</td>
    <td>3990</td>
    <td>c.stevens@datatables.net</td>
</tr>
<tr>
    <td>Hermione</td>
    <td>Butler</td>
    <td>Regional Director</td>
    <td>London</td>
    <td>47</td>
    <td>2011/03/21</td>
    <td>$356,250</td>
    <td>1016</td>
    <td>h.butler@datatables.net</td>
</tr>
<tr>
    <td>Lael</td>
    <td>Greer</td>
    <td>Systems Administrator</td>
    <td>London</td>
    <td>21</td>
    <td>2009/02/27</td>
    <td>$103,500</td>
    <td>6733</td>
    <td>l.greer@datatables.net</td>
</tr>
<tr>
    <td>Jonas</td>
    <td>Alexander</td>
    <td>Developer</td>
    <td>San Francisco</td>
    <td>30</td>
    <td>2010/07/14</td>
    <td>$86,500</td>
    <td>8196</td>
    <td>j.alexander@datatables.net</td>
</tr>
<tr>
    <td>Shad</td>
    <td>Decker</td>
    <td>Regional Director</td>
    <td>Edinburgh</td>
    <td>51</td>
    <td>2008/11/13</td>
    <td>$183,000</td>
    <td>6373</td>
    <td>s.decker@datatables.net</td>
</tr>
<tr>
    <td>Michael</td>
    <td>Bruce</td>
    <td>Javascript Developer</td>
    <td>Singapore</td>
    <td>29</td>
    <td>2011/06/27</td>
    <td>$183,000</td>
    <td>5384</td>
    <td>m.bruce@datatables.net</td>
</tr>
<tr>
    <td>Donna</td>
    <td>Snider</td>
    <td>Customer Support</td>
    <td>New York</td>
    <td>27</td>
    <td>2011/01/25</td>
    <td>$112,000</td>
    <td>4226</td>
    <td>d.snider@datatables.net</td>
</tr>
</tbody>
</table>
</div>
</div><!-- end col -->
</div>
<!-- end row -->


<div class="row">
    <div class="col-sm-12">
        <div class="card-box table-responsive">
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

            <h4 class="header-title m-t-0 m-b-30">Scroller Datatable example</h4>

            <table id="datatable-scroller" class="table table-striped table-bordered nowrap"
                   cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>ZIP / Post code</th>
                    <th>Country</th>
                </tr>
                </thead>
            </table>
        </div>
    </div><!-- end col -->
</div>
<!-- end row -->


</div> <!-- container -->

</div> <!-- content -->

<footer class="footer">
    2016 © Adminto.
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

<!-- Datatables-->
<script src="/resources/assets/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.bootstrap.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.buttons.min.js"></script>
<script src="/resources/assets/plugins/datatables/buttons.bootstrap.min.js"></script>
<script src="/resources/assets/plugins/datatables/jszip.min.js"></script>
<script src="/resources/assets/plugins/datatables/pdfmake.min.js"></script>
<script src="/resources/assets/plugins/datatables/vfs_fonts.js"></script>
<script src="/resources/assets/plugins/datatables/buttons.html5.min.js"></script>
<script src="/resources/assets/plugins/datatables/buttons.print.min.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.fixedHeader.min.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.keyTable.min.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.responsive.min.js"></script>
<script src="/resources/assets/plugins/datatables/responsive.bootstrap.min.js"></script>
<script src="/resources/assets/plugins/datatables/dataTables.scroller.min.js"></script>

<!-- Datatable init js -->
<script src="/resources/assets/pages/datatables.init.js"></script>

<!-- App js -->
<script src="/resources/assets/js/jquery.core.js"></script>
<script src="/resources/assets/js/jquery.app.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        $('#datatable').dataTable();
        $('#datatable-keytable').DataTable( { keys: true } );
        $('#datatable-responsive').DataTable();
        $('#datatable-scroller').DataTable( { ajax: "/resources/assets/plugins/datatables/json/scroller-demo.json", deferRender: true, scrollY: 380, scrollCollapse: true, scroller: true } );
        var table = $('#datatable-fixed-header').DataTable( { fixedHeader: true } );
    } );
    TableManageButtons.init();

</script>

</body>
</html>