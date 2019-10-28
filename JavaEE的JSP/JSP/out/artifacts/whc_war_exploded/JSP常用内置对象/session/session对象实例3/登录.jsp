<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    session.setAttribute("customer","客户");
%>
<h3>请先登录后购物:</h3>
<hr>
<form action="购买.jsp" method="get">
    客户名:<input type="text" name="loginName">
    <input type="submit" value="登录">
</form>
</body>
</html>
