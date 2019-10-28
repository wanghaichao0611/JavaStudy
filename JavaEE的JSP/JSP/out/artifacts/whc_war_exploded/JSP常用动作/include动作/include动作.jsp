<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/3
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP include指令</title>
</head>
<body>
<jsp:include page="hello1.jsp">
    <jsp:param name="name" value="QQ"/>
</jsp:include>
</body>
</html>
