<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application对象</title>
</head>
<body>
<%
    String a=(String)application.getAttribute("count");
    int count=0;
    if (a!=null)
        count=Integer.parseInt(a)+1;
    application.setAttribute("count",String.valueOf(count));
%>
您是<%=application.getAttribute("count")%>位访问者!
</body>
</html>
