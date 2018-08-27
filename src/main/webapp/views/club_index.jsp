<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zm
  Date: 2018/3/5
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>社团组织</title>
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
    <header class="blog-header py-3 text-center">
        <a class="blog-header-logo text-dark font-weight-normal" href="#">社团&&组织</a>
    </header>

    <div class="jumbotron p-3 p-md-5 text-white rounded bg-dark">
        <div class="col-md-6 px-0">
            <h1 class="display-4 font-italic">北京理工大学学生组织</h1>
            <p class="lead my-3">文本部分 text message </p>
            <p class="lead mb-0"><a href="#" class="text-white font-weight-bold">了解更多关于北理社团和组织</a></p>
        </div>
    </div>
    <form action="#" method="get">
        <div class="row mb-2">
            <c:forEach var="li" items="${list}">
                <div class="col-md-6" action>
                    <div class="card flex-md-row mb-4 box-shadow h-md-250">
                        <div class="card-body d-flex flex-column align-items-start">
                            <h3 class="mb-0">
                                <a class="text-dark" href="#">${li.clubName}</a>
                            </h3>
                            <div class="mb-1 text-muted">${li.newsTime}</div>
                            <p class="card-text mb-auto">${li.content}</p>
                            <!--<a href="#">Continue reading</a>-->
                        </div>
                            <img class="card-img-right flex-auto d-none d-md-block" src="../statics/img/blue.png" alt="card image cap">
                    </div>
                </div>
            </c:forEach>
        </div>
    </form>
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
