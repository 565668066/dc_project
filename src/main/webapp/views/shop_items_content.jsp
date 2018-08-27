<%--
  Created by IntelliJ IDEA.
  User: zm
  Date: 2018/3/22
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>详情</title>

    <!-- Bootstrap -->
    <link href="../statics/css/shop_css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../statics/css/shop_css/shop.css">
    <link rel="stylesheet" type="text/css" href="../statics/css/shop_css/items.css">
    <link rel="stylesheet" type="text/css" href="../statics/css/shop_css/content.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="../statics/css/shop_css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <script src="../statics/js/shop_js/ie-emulation-modes-warning.js"></script>
</head>
<body>

<div class="contanier">
    <div class="page-header">
        <div class="search">
            <form action="" target="">
                <table>
                    <tr>
                        <th><input type="text" class="blank" placeholder="请输入商品名称"></th><th><input type="submit" value="搜索" class="butt"></th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="manu">
            <ul>
                <li><a href="/shop_items1">家居用品</a></li>
                <li><a href="/shop_items2">食品饮料</a></li>
                <li><a href="/shop_items3">文具用品</a></li>
                <li><a href="/shop_items4">运动器材</a></li>
            </ul>
        </div>
        <div id="clear"></div>
    </div>

    <div class="specify">
        <div class="top">
            <div class="left">
                <img src="../statics/img/shop_image/shamb.jpg">
            </div>
            <div class="right">
                <div class="title">
                    枯发救星潘婷洗发水丝质顺滑750ml
                </div>
                <div class="price">
                    <table>
                        <tr>
                            <th>价格</th><th><s>¥39.80</s></th>
                        </tr>
                        <tr>
                            <th>促销价</th><th><b>¥19.90</b></th>
                        </tr>
                        <tr>
                            <th>位置</th><th>美联福超市洗护区</th>
                        </tr>
                        <tr>
                            <th>库存</th><th>1888</th>
                        </tr>
                    </table>
                </div>
                <div class="buy">
                    <table>
                        <tr>
                            <th><input type="submit" value="立即购买" id="buynow"></th>
                            <th><input type="submit" value="加入购物车" id="addit"></th>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div id="clear"></div>
        <div class="middle">
            <div class="price">
                <table>
                    <tr><th>品牌名称：潘婷</th></tr>
                    <tr><th></th></tr>
                    <tr><th></th></tr>
                    <tr><th></th></tr>
                    <tr><th>产品参数</th></tr>
                    <tr><th></th></tr>
                    <tr>
                        <th>是否为特殊用途化妆品: 否</th><th>型号: 潘婷丝质洗发水套装</th><th>是否量贩装: 是</th>
                    </tr>
                    <tr>
                        <th>功效: 脆弱开叉护理 丰盈蓬松 改善毛躁</th><th>净含量: 750mL</th><th>适用对象: 通用</th>
                    </tr>
                    <tr>
                        <th>保质期: 3年</th><th>产地: 中国大陆</th>
                    </tr>
                </table>
            </div>
            <div class="detail">
                <img src="../statics/img/shop_image/shamb1.jpg">
                <img src="../statics/img/shop_image/shamb2.jpg">
                <img src="../statics/img/shop_image/shamb3.jpg">
                <img src="../statics/img/shop_image/shamb4.jpg">
            </div>
        </div>
    </div>
</div>

<%--js--%>
<script type="text/javascript" src="../statics/js/jquery-3.3.1%20.js"></script>
<script type="text/javascript" src="../statics/js/shop_js/bootstrap.min.js"></script>
<script type="text/javascript" src="../statics/js/shop_js/docs.min.js"></script>

</body>
</html>
<tr><th></th></tr>
