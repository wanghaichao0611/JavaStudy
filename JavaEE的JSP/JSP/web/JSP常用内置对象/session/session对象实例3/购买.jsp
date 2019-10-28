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
    <title>购买</title>
</head>
<body>
<%
    String na=request.getParameter("loginName");
    session.setAttribute("name",na);
%>
<h3>请输入你想购买的产品:</h3>
<hr>
<form action="结算.jsp" method="get">
    要购买的产品:<input type="text" name="goodsName">
    <input type="submit" value="确认">
</form>
</body>
</html>
