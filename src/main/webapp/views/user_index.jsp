<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/27
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>优享</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--web_icon--%>
    <link rel="icon" href="../statics/img/favicon.ico">
    <!-- Bootstrap core CSS -->
    <link href="../statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../statics/css/carousel.css" rel="stylesheet">
</head>
<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark "><!--导航栏-->
        <a class="navbar-brand" href="/gotoindex">优share</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button><!--缩小下拉栏-->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">校园迎新</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">报道流程</a>
                        <a class="dropdown-item" href="#">物品购置</a>
                    </div>
                </li>
                <li>

                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">资源共享</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="/club_index">社团组织信息</a>
                        <a class="dropdown-item" href="/school_message_index">校园通知</a>
                    </div>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light my-2 my-sm-0" type="submit">查找</button>&nbsp;
                <button class="btn btn-outline-primary my-2 my-sm-1">注册/登录</button>
            </form>
        </div>
    </nav>
</header>

<main role="main">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="first-slide" src="img/p_1.png" alt="First slide">
                <div class="container">
                    <div class="carousel-caption "><!--text-left-->
                        <h1>This is for BIT</h1>
                        <p>This website is for BITERs,and design by youshare company.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn More</a></p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="second-slide" src="../statics/img/p_2.png" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>校园迎新</h1>
                        <p>报到流程+必需品购置</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">了解详情</a></p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="third-slide" src="../statics/img/p_3.png" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption"><!--text-right-->
                        <h1>资源共享</h1>
                        <p>社团组织信息+校园通知</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">了解详情</a></p>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>



    <div class="container marketing">

        <!-- Three columns of text below the carousel -->
        <div class="row">
            <div class="col-lg-4">
                <img class="rounded-0" src="../statics/img/grey.png" alt="Generic placeholder image" width="140" height="140">
                <h2>校园迎新</h2>
                <p>text</p>
                <p><a class="btn btn-secondary" href="#" role="button">了解详情 &raquo;</a></p>
            </div>
            <!-- /.col-lg-4 -->

            <div class="col-lg-4">
            </div><!-- /.col-lg-4 -->

            <div class="col-lg-4">
                <img class="rounded-0" src="../statics/img/grey.png" alt="Generic placeholder image" width="140" height="140">
                <h2>资源共享</h2>
                <p>text</p>
                <p><a class="btn btn-secondary" href="#" role="button">了解详情 &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
        </div><!-- /.row -->


        <!-- START THE FEATURETTES -->

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">开学报到从哪开始？</h2><!--<span class="text-muted">It'll blow your mind.</span>-->
                <p class="lead">不用方，这里有一份chuan新的攻略等你查收。</p>
            </div>
            <div class="col-md-5">
                <img class="featurette-image img-fluid mx-auto" src="../statics/img/pink.png" alt="Generic placeholder image">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7 order-md-2">
                <h2 class="featurette-heading">开学伊始，好奇宝宝该去哪寻找？<span class="text-muted">See for yourself.</span></h2>
                <p class="lead"> </p>
            </div>
            <div class="col-md-5 order-md-1">
                <img class="featurette-image img-fluid mx-auto" src="../statics/img/pink.png" alt="Generic placeholder image">
            </div>
        </div>

        <hr class="featurette-divider">
        <!-- /END THE FEATURETTES -->
    </div><!-- /.container -->

    <!-- FOOTER -->
    <footer class="container">
        <p class="float-right"><a href="#">回到顶部</a></p>
        <p>&copy; youshare</p>
    </footer>
</main>

<!-- Bootstrap core JavaScript
================================================== -->
<script src="../statics/js/jquery-3.3.1.js"></script>
<script src="../statics/js/bootstrap.min.js"></script>
</body>
</html>
