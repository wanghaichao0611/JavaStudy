<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 10:12
  To change this template use File | Settings | File Templates.t
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个登录界面</title>
</head>
<body>
<form action="loginCheck.jsp">
    <table>
        <tr>
            <td>输入用户名:</td>
            <td><input type="text" name="name" size="16" value="<%=request.getParameter("name")%>"></td>
        </tr>
        <tr>
            <td>输入密码:</td>
            <td><input type="password" name="password" size="16"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
