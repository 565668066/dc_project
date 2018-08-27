<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/11
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>社团·添加</title>

    <!-- Bootstrap core CSS -->
    <link href=" /statics/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href=" /statics/font-awesome/css/font-awesome.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href=" /statics/css/style.css" rel="stylesheet">
    <link href=" /statics/css/style-responsive.css" rel="stylesheet">
    <link rel="stylesheet" href=" /statics/css/to-do.css">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<section id="container" >
    <!-- **********************************************************************************************************************************************************
    TOP BAR CONTENT & NOTIFICATIONS
    *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
        </div>
        <!--logo start-->
        <a href="/admin_index" class="logo"><b>优share·管理·系统</b></a>
        <!--logo end-->

        <div class="top-menu">
            <ul class="nav pull-right top-menu">
                <li><a class="logout" href="/logout">Logout</a></li>
            </ul>
        </div>
    </header>
    <!--header end-->

    <!-- **********************************************************************************************************************************************************
    MAIN SIDEBAR MENU
    *********************************************************************************************************************************************************** -->
    <!--sidebar start-->
    <aside>
        <div id="sidebar"  class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu" id="nav-accordion">

                <p class="centered"><a href="/admin_index"><img src="/statics/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                <h5 class="centered">管理员 admin</h5>

                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-users"></i>
                        <span>用户·管理</span>
                    </a>
                    <ul class="sub">
                        <li><a href="/admin_user_query">用户·信息</a></li>
                        <li><a href="/admin_club_query">社团·信息</a></li>
                    </ul>

                </li>

                <li class="sub-menu">
                    <a href="javascript:;" >
                        <i class="fa fa-calendar"></i>
                        <span>活动·管理</span>
                    </a>
                    <ul class="sub">
                        <li><a href="/admin_schoolMessage_query">学校活动·信息</a> </li>
                        <li><a href="/admin_clubMessage_query">社团组织活动·信息</a></li>
                    </ul>
                </li>

                <li class="sub-menu">
                    <a  href="javascript:;" >
                        <i class="fa fa-rmb"></i>
                        <span>交易·管理</span>
                    </a>
                    <ul class="sub">
                        <li><a  href="/admin_commodity_query">美联福·交易</a></li>
                    </ul>
                </li>

                <%--                <li class="sub-menu">
                                    <a  href="javascript:;" >
                                        <i class="fa fa-users"></i>
                                        <span>学生·管理</span>
                                    </a>
                                    <ul class="sub">
                                        <li><a  href="/student_admin_query">学生·信息</a></li>

                                    </ul>
                                </li>--%>

            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->

    <!-- **********************************************************************************************************************************************************
    MAIN CONTENT
    *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <h3><i class="fa fa-angle-right"></i> 社团·添加</h3>

            <!-- BASIC FORM ELELEMNTS -->
            <div class="row mt">
                <div class="col-lg-12">
                    <div class="form-panel">
                        <h4 class="mb"><i class="fa fa-angle-right"></i> 社团基本信息</h4>
                        <form class="form-horizontal style-form" action="javascript:sub()" method="post">
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">·社团编号：</label>
                                <div class="col-sm-11">
                                    <input type="text" class="form-control" name="id" value="${club.getId()}">

                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">·社团名称：</label>
                                <div class="col-sm-11">
                                    <input type="text" onchange="sub()" class="form-control" name="clubName" value="${club.getClubName()}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">·社长：</label>
                                <div class="col-sm-11">
                                    <input type="text" class="form-control" name="manager" value="${club.getManager()}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">·建立时间：</label>
                                <div class="col-sm-11">
                                    <input type="text" class="form-control" name="buildTime" value="${club.getBuildTime()}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">·简介：</label>
                                <div class="col-sm-11">
                                    <input type="text" class="form-control" name="intro" value="${club.getIntro()}">
                                </div>
                            </div>
                            <div><br>${error}</div>
                            <div class="form-group">
                                <label class="col-sm-1 col-sm-1 control-label">
                                    <input type="submit" class="btn-theme btn" value="确定添加">
                                </label>
                            </div>
                        </form>
                    </div>
                </div><!-- col-lg-12-->
            </div><!-- /row -->
        </section>
    </section>
    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer ">
        <div class="text-center ">
            Copyright - © - 2018 - All Right Reserved - 优share

        </div>
    </footer>
    <!--footer end-->
</section>

<!-- js placed at the end of the document so the pages load faster -->
<script src=" /statics/js/jquery.js"></script>
<script src=" /statics/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src=" /statics/js/jquery.dcjqaccordion.2.7.js"></script>
<script src=" /statics/js/jquery.scrollTo.min.js"></script>
<script src=" /statics/js/jquery.nicescroll.js" type="text/javascript"></script>


<!--common script for all pages-->
<script src=" /statics/js/common-scripts.js"></script>

<!--script for this page-->
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script src=" /statics/js/tasks.js" type="text/javascript"></script>

<script>
    jQuery(document).ready(function() {
        TaskList.initTaskWidget();
    });

    $(function() {
        $( "#sortable" ).sortable();
        $( "#sortable" ).disableSelection();
    });

    function sub() {
        $.post("/validate", "username", function(result) {
            if (result['code'] result.code == 1)
                alert(result.msg)
        });
    }
</script>


<script>
    //custom select box



</script>

</body>
</html>

