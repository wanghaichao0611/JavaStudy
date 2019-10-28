<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>对象应用实例2</title>
</head>
<body>
以下是out对象其他常用方法的使用:
<hr>
获取缓存区大小:<%=out.getBufferSize()%>
<br>
获取剩余缓存区大小:
<%=out.getRemaining()%>
<br>
判断是否自动刷新:<%=out.isAutoFlush()%>
<br>
<%
    out.print("值是改变命运，知识改变生活!<br>");
    out.print("当前剩余缓冲区的大小:"+out.getRemaining()+"<br>");
    out.flush();
    out.print("当前可用缓存区的大小:"+out.getRemaining()+"<br>");
    out.clearBuffer();
    out.print("当前可用缓冲区的大小:"+out.getRemaining()+"<br>");
    out.flush();
%>
<hr>
</body>
</html>
