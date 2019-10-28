<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response对象应用</title>
</head>
<body>
<h3>现在的时间是:</h3>
<hr>
<%=new java.util.Date()%>
<%
    response.setHeader("refresh","1");
%>
<hr>
</body>
</html>
