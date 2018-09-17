<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/17
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>日用品类</title>

    <link rel="icon" href="../statics/img/favicon.ico">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link href="../statics/css/bootstrap.min.css" rel="stylesheet">
    <link href="../statics/css/shop_type.css" rel="stylesheet">


    <script>
        window.onload=function(){
            var leftinstance1  = document.getElementById("content").offsetLeft;
            if(leftinstance1 == 0||leftinstance1<=95){
                document.getElementById("fixedbar").setAttribute('style',"display:none");
            };
            $(window).resize(function(){
                var leftinstance  = document.getElementById("content").offsetLeft;
                if(leftinstance == 0){
                    document.getElementById("fixedbar").setAttribute('style',"display:none");
                }
                if(leftinstance<=95){
                    document.getElementById("fixedbar").setAttribute('style',"display:none");
                }
                else
                    document.getElementById("fixedbar").setAttribute('style',"display:inline");
            });

        }
    </script>
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

<div id="fixedbar">
    <div id="accordion">
        <div class="card">
            <div class="collapsed card-header">
                <a class="card-link" data-toggle="collapse" href="#collapse0">
                    购物首页
                </a>
                <a href="/shop_index" class="float-right"><span class="badge badge-secondary">more</span></a>
            </div>
            <ul id="collapse0"class="list-group collapse"  data-parent="#accordion">
                <a href="/shop_index#section1"><li class="list-group-item">火爆商品</li></a>
                <a href="/shop_index#section2"><li class="list-group-item">优惠专区</li></a>
                <a href="/shop_index#section3"><li class="list-group-item">入学推荐</li></a>
            </ul>
        </div>
        <div class="card">
            <div class="card-header">
                <a class="collapsed card-link" data-toggle="collapse" href="#collapse1">
                    食品类
                </a>
                <a href="/shop_foods" class="float-right"><span class="badge badge-secondary">more</span></a>
            </div>
            <ul id="collapse1"class="list-group collapse"  data-parent="#accordion">
                <a href="/shop_foods#section1"><li class="list-group-item">方便食品</li></a>
                <a href="/shop_foods#section2"><li class="list-group-item">休闲食品</li></a>
                <a href="/shop_foods#section3"><li class="list-group-item">其他</li></a>
            </ul>
        </div>
        <div class="card">
            <div class="card-header">
                <a class="card-link" data-toggle="collapse" href="#collapse2">
                    日用品类
                </a>
                <a href="/shop_necessities" class="float-right"><span class="badge badge-secondary">more</span></a>
            </div>
            <ul id="collapse2" class="list-group collapse show" data-parent="#accordion">
                <a href="#section1"><li class="list-group-item">洗化用品</li></a>
                <a href="#section2"><li class="list-group-item">宿舍用品</li></a>
                <a href="#section3"><li class="list-group-item">卫生用品</li></a>
            </ul>
        </div>
        <div class="card">
            <div class="collapsed card-header">
                <a class="card-link" data-toggle="collapse" href="#collapse3">
                    百货类
                </a>
                <a href="/shop_departments" class="float-right"><span class="badge badge-secondary">more</span></a>
            </div>
            <ul id="collapse3" class="list-group collapse" data-parent="#accordion">
                <a href="/shop_departments#section1"><li class="list-group-item">针织品</li></a>
                <a href="/shop_departments#section2"><li class="list-group-item">体育用品</li></a>
                <a href="/shop_departments#section3"><li class="list-group-item">鞋帽类</li></a>
                <a href="/shop_departments#section4"><li class="list-group-item">数码产品</li></a>
                <a href="/shop_departments#section5"><li class="list-group-item">文具类</li></a>
            </ul>
        </div>
    </div>
    <!--        <div class="card">
                <div class="card-header">
                    <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
                        <a href="#section2">日用品类</a>
                    </a>
                </div>
                <div id="collapseTwo" class="collapse" data-parent="#accordion">
                    <div class="card-body">
                        “肥宅”怎么少的了！
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header">
                    <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
                        <a href="#section3">百货类</a>
                    </a>
                </div>
                <div id="collapseThree" class="collapse" data-parent="#accordion">
                    <div class="card-body">
                        买就完事儿了！
                    </div>
                </div>
            </div>-->
</div>

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
                        <a class="dropdown-item" href="/to_be_continue">报道流程</a>
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
<div class="container" id="content">
    <!--    <nav class="navbar navbar-expand-md bg-info navbar-light  rounded">
            <a class="navbar-brand" href="#">Shopping</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample" aria-controls="navbarsExample" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExample">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">食品类</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href="#">方便食品</a>
                            <a class="dropdown-item" href="#">休闲食品</a>
                            <a class="dropdown-item" href="#">其他</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown02" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">日用品类</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown02">
                            <a class="dropdown-item" href="#">洗化用品</a>
                            <a class="dropdown-item" href="#">宿舍用品</a>
                            <a class="dropdown-item" href="#">卫生用品</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">百货类</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown03">
                            <a class="dropdown-item" href="#">针织品</a>
                            <a class="dropdown-item" href="#">体育用品</a>
                            <a class="dropdown-item" href="#">鞋帽类</a>
                            <a class="dropdown-item" href="#">数码产品</a>
                            <a class="dropdown-item" href="#">文具类</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">饮料</a>
                    </li>
                    <li>
                        <a href="#" class="nav-link">酒类</a>
                    </li>
                </ul>
            </div>
        </nav>-->

    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- 指示符 -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
        </ul>

        <!-- 轮播图片 -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://static.runoob.com/images/mix/img_fjords_wide.jpg">
                <div class="carousel-caption">
                    <h3>北理“618”</h3>
                    <p>剁！剁！剁！</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="https://static.runoob.com/images/mix/img_nature_wide.jpg">
            </div>
            <div class="carousel-item">
                <img src="https://static.runoob.com/images/mix/img_mountains_wide.jpg">
            </div>
        </div>

        <!-- 左右切换按钮 -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div><!--轮播-->

    <div class="alert alert-info" id="section1">
        <strong>洗化用品</strong>
    </div>
    <div class="row row1">
        <div class="card col-md-3 col-sm-6">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot1.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">方便面</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥4.5</span></h5></a>
                <!-- <a href="#" class="btn btn-info">219</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot2.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"> <h5 class="card-title">小风扇</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥69</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot3.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">严选牛奶</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥88</span></h5></a>
                <!-- <a href="#" class="btn btn-info">88</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot4.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">电动牙刷</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥219</span></h5></a>
                <!-- <a href="#" class="btn btn-info">129</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot5.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">每日坚果</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥35.8</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot6.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">手帕纸</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥5.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot7.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">沐浴拖鞋</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥24.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/hot8.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">雪麸蛋糕</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥9.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
    </div>
    <div class="alert alert-primary" id="section2">
        <strong>宿舍用品</strong>
    </div>
    <div class="row row1">
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece1.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">炭火烤肉</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥9.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece2.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">炭火烤肠</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥9.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece3.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">手撕肉条</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥20</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece4.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">牛肉粒</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥18</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece5.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">小黄鱼</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥13</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece6.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">带鱼段</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥17.3</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece7.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">鱼豆腐</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥16</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece8.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">鸭脖</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥16</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
    </div>
    <div class="alert alert-success" id="section3">
        <strong>卫生用品</strong>
    </div>
    <div class="row row1">
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece1.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">三角笔</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥9.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece2.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">文具盒</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥9.9</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece3.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">笔记本</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥20</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece4.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">紫薯饼</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥18</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece5.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">开口板栗</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥13</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece6.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">抽纸</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥17.3</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece7.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">袜子</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥16</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
        <div class="card col-md-3 col-sm-6" style="max-width: 50%">
            <div class="card-header">
                <a href="#"><img class="card-img-top" src="../statics/img/shop_image/nece8.png" alt="Card image" style="width:100%"></a>
            </div>
            <div class="card-body">
                <a href="#"><h5 class="card-title">香皂</h5></a>
                <!-- <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p> -->
                <a href="#"><h5><span class="badge badge-info">￥16</span></h5></a>
                <!-- <a href="#" class="btn btn-info">69</a> -->
            </div>
        </div>
    </div>

    <footer>
        <hr>
        <div class="row bottom-content">
            <div class="col-md-6 ">
                <p>北京理工大学 版权所有 地址：北京海淀区中关村南大街5号 邮编：100081</p>
                <p>服务邮箱：(网页内容)xxx@bit.edu.cn (网络服务)xxx@bit.edu.cn</p>
                <p>京ICP备xxx号　京公网安备xxx号</p>
            </div>
            <div class="col-md-6">
                <p>快速链接：
                    <a href="#">网站首页</a>
                    <a href="#">北理主页</a>
                    <a href="#">北理在线</a>
                </p>
                <p>客服服务：
                    <a href="#">在线客服</a>
                    <a href="#">用户反馈</a>
                </p>
                <div>
                    <div class="float-left">关于我们：
                        <a href="#">USHARE&MLF</a>
                        <a href="#">用户反馈</a>
                    </div>
                    <div class="float-right">关注我们：
                        <a href="#"><span><img src="../statics/img/shop_image/qq.png"></span></a>
                        <a href="#"><span><img src="../statics/img/shop_image/微信.png"></span></a>
                        <a href="#"><span><img src="../statics/img/shop_image/微博.png"></span></a>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>

<script src="../statics/js/jquery-3.3.1 .js"></script>
<script src="../statics/js/bootstrap.min.js"></script>
</body>
</html>