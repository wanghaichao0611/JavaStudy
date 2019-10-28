<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/7/7
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
     <form action="userAction_*.action" method="post">
         用户名:<input type="text" name="username"/><br>
         密&nbsp;&nbsp;&nbsp;码<input type="password" name="password"/><br>
         <input type="submit" value="添加">
     </form>
</body>
</html>
