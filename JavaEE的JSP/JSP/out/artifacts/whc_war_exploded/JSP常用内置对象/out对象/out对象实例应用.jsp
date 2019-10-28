<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out对象</title>
</head>
<body>
<%
    for (int i=0;i<3;i++)
        out.println("<h3>我的理想是什么……</h3>");
    String str="我一定学号JSP升序设计课程!";
    out.print(str+"<br>");
    out.println("加油!");
%>
</body>
</html>
