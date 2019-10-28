<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page   pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            background-color: darkmagenta;
        }
        div{
            width: 200px;
            height: 200px;
        }
        .center-in-center{
            position: absolute;
            top: 50%;
            left: 50%;
            -webkit-transform: translate(-50%, -50%);
            -moz-transform: translate(-50%, -50%);
            -ms-transform: translate(-50%, -50%);
            -o-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
        }
    </style>
</head>
<body>
<form action="loginCheck.jsp" method="post" style="font-style: initial;font-size: 10pt">
<div class="center-in-center">
    <img src="imges/微笑.jpg" alt="微笑" width="200" height="150">
    <br>
        <input type="text" name="userName" placeholder="用户名" style="height: 30px;width: 200px">
        <input type="password" name="password" placeholder="密码" style="height: 30px;width: 200px">
        <br>
        <input type="submit" height="20px" value="登录"  style="width: 35px; height: 30px;">&nbsp;&nbsp;&nbsp;
        <input type="reset"  height="20px" value="取消"  style="width: 35px; height: 30px;">
</div>
</form>
</body>
</html>
