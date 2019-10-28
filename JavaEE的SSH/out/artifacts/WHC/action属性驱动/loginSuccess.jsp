<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/10
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<p align="center">
    登录成功!
    您的用户名是<%=request.getAttribute("user.username")%>
</p>
</body>
</html>
