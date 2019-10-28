<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/10
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<div align="center">
    <form action="login1.action" method="post">
        用户名:<input type="text" name="username"/>
        密  码:<input type="password" name="password"/>
        <input type="submit" value="登录"/>
    </form>
</div>
</body>
</html>