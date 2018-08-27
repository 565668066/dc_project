<%--
  Created by IntelliJ IDEA.
  User: zm
  Date: 2018/3/22
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="#">

    <title>登录界面</title>

    <!-- Bootstrap core CSS -->
    <link href="../dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
</head>

<body class="text-center">
<form class="form-signin">
    <img class="mb-4" src="../us.png" alt="" width="85" height="85">
    <h1 class="h3 mb-3 font-weight-normal">请登录</h1>
    <label for="inputEmail" class="sr-only">账号</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="请输入账号" required autofocus>
    <label for="inputPassword" class="sr-only">密码</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="请输入密码" required>
    <div class="checkbox mb-3">
        <label style="float: left;">
            <input type="checkbox" value="remember-me"> 记住账号
        </label>
        <label style="float: right;">
            <a href="#">注册账号</a>
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    <p class="mt-5 mb-3 text-muted">&copy; USHARE</p>
</form>
</body>
</html>
