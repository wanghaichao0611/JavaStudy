<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application对象</title>
</head>
<body>
<br>
JSP引擎名及Servlet版本号:<%=application.getServerInfo()%>
<br>
<%
    application.setAttribute("name","Java程序设计与项目教程");
    out.print(application.getAttribute("name"+"<br>"));
    application.removeAttribute("name");
    out.print(application.getAttribute("name"+"<br>"));
%>
</body>
</html>
