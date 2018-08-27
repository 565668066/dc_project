<%--
  Created by IntelliJ IDEA.
  User: zm
  Date: 2018/3/21
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>购物清单</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--web_icon--%>
    <link rel="icon" href="../statics/img/favicon.ico">
    <!-- Bootstrap core CSS -->
    <link href="../statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../statics/css/userItems.css" rel="stylesheet">
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
<main role="main">

    <section class="jumbotron text-center">
        <div class="container">
            <h1 class="jumbotron-heading">用户购物清单</h1>
            <p class="lead text-muted">下方的内容为用户的清单缩略图</p>
        </div>
    </section>

    <div class="album py-5 bg-light">
        <div class="container">

            <div class="row">
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card mb-4 box-shadow">
                        <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=缩略图" alt="Card image cap">
                        <div class="card-body">
                            <p class="card-text">上面试商品的缩略图，下面内容是商品名称和简单信息。</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">详情</button>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">编辑</button>
                                </div>
                                <small class="text-muted">（此处可以放添加时间）</small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>

<footer class="text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">回到顶部</a>
        </p>
        <p>&copy;USHARE company</p>
        <p>New to USHARE? <a href="../../">Visit the homepage</a> of us</p>
    </div>
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<script type="text/javascript" src="../statics/js/jquery-3.3.1 .js"></script>
<script type="text/javascript" src="../statics/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../statics/js/vendor/popper.min.js"></script>
<script type="text/javascript" src="../statics/js/vendor/holder.min.js"></script>
</body>
</html>
