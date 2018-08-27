<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zm
  Date: 2018/3/13
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<head>
    <title>校园通知</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--web_icon--%>
    <link rel="icon" href="../statics/img/favicon.ico">
    <!-- Bootstrap core CSS -->
    <link href="../statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../statics/css/blog.css" rel="stylesheet">
</head>
<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark "><!--导航栏-->
        <a class="navbar-brand" href="/backtoindex">USHARE</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button><!--缩小下拉栏-->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">校园迎新</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">报道流程</a>
                        <a class="dropdown-item" href="/shop_index">物品购置</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">资源共享</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="/club_index">社团组织信息</a>
                        <a class="dropdown-item" href="/school_message_index">校园通知</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">入学购物</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="/shop_index">美联福超市</a>
                        <a class="dropdown-item" href="/user_items">购物车</a>
                    </div>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light my-2 my-sm-0" type="submit">查找</button>&nbsp;
                <button class="btn btn-outline-primary my-2 my-sm-1"><a href="/signin">登出</a></button>
            </form>
        </div>
    </nav>
</header>

<div class="container">
    <br>
    <div class="jumbotron text-center">
        <h1>比赛、竞赛、学校重要通知</h1>
        <p>text 文字部分</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
    </div>
    <div class="jumbotron ">
        <div class="alert alert-danger" role="alert">
            红色表示学校<a href="#" class="alert-link">紧急通知</a>
        </div>
        <form action="#" method="get">
             <c:forEach var="li" items="${list}">
                 <div class="alert alert-danger" role="alert">
                     <a>${li.title}</a>
                     <blockquote class="pull-right">${li.department}</blockquote>
                 </div>
             </c:forEach>
        </form>
    </div>
    <div class="jumbotron ">
        <div class="alert alert-warning" role="alert">
            黄色表示重大<a href="#" class="alert-link">比赛、竞赛信息</a>
        </div>
    </div>
    <div class="jumbotron ">
        <div class="alert alert-success" role="alert">
            绿色表是<a href="#" class="alert-link">课外活动报名</a>
        </div>
    </div>
    <div class="jumbotron ">
        <div class="alert alert-info" role="alert">
            蓝色表示是<a href="#" class="alert-link">待定</a>
        </div>
    </div>
</div>

<footer class="blog-footer">
    <p>
        <a href="#">回到顶部</a>
    </p>
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<script type="text/javascript" src="../statics/js/jquery-3.3.1 .js"></script>
<script type="text/javascript" src="../statics/js/bootstrap.min.js"></script>
</body>
</html>
