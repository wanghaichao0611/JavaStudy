<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Handle</title>
</head>
<body>
<jsp:useBean id="cart" scope="session" class="Bean.shop"/>
<jsp:setProperty name="cart" property="*"/>
<%
    cart.processRequest(request);
%>
<br>您已经选购的图书有:
<ol>
    <%
        String[] item=cart.getItems();
        for (int i=0;i<item.length;i++){
    %>
    <li><%=item[i]%></li>
    <%
        }
    %>
</ol>
<br>
<hr>
<%@include file="shop.jsp"%>
</body>
</html>
