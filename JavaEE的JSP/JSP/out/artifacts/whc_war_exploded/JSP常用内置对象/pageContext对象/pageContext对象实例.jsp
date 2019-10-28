<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext对象</title>
</head>
<body>
<h3>使用pageContext对象获取其他内置对象中的值:</h3>
<hr>
<%
    request.setAttribute("name","java程序设计与项目实训教程");
    session.setAttribute("name","JSP程序设计技术教程");
    application.setAttribute("name","SSH");
%>
request对象中的值;<%=pageContext.getRequest().getAttribute("name")%><br>
session对象中的值:<%=pageContext.getSession().getAttribute("name")%><br>
application对象中的值:<%=pageContext.getServletContext().getAttribute("name")%>
<hr>
</body>
</html>
