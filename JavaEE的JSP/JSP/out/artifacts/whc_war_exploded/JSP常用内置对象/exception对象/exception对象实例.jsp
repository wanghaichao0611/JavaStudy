<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exception对象</title>
</head>
<body>
<h3>以下是异常信息:</h3>
<hr>
<%
    int x=9,y=0,z;
    try
    {
        z=x/y;
    }catch (Exception e){
        out.print(e.toString()+"<br>");
    }
%>
<hr>
</body>
</html>
