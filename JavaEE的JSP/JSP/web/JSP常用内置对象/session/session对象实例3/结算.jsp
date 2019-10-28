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
    <title>结算</title>
</head>
<body>
<%
    String gn=request.getParameter("goodsName");
    session.setAttribute("goods",gn);
    String 客户=(String)session.getAttribute("customer");
    String 姓名=(String)session.getAttribute("name");
    String 商品=(String)session.getAttribute("goods");
%>
<h3>结账信息:</h3>
<hr>
<%=客户%>的姓名是:<%=姓名%>
<br>
你购买的商品是:<%=商品%>
</body>
</html>
