<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session例子2</title>
</head>
<body>
<hr>
session创建的时间是:<%=session.getCreationTime()%>&nbsp;
<%=new Date(session.getCreationTime())%>
<br>
session的ID号:<%=session.getId()%>
<br>
客户最近一次访问的时间是:<%=session.getLastAccessedTime()%>&nbsp;
<%=new java.sql.Time(session.getLastAccessedTime())%>
<br>
两次请求间隔多长时间 session将被取消(ms):
<%=session.getMaxInactiveInterval()%>
<br>
是否是新创建的session:<%=session.isNew()?"是":"否"%>
<hr>
<%
    session.setAttribute("name","汪海潮");
    session.setAttribute("password","10086");
%>
姓名:<%=session.getAttribute("name")%>
<br>
密码:<%=session.getAttribute("password")%>
<<br>
ID号:<%=session.getId()%>
<br>
<%
    session.setMaxInactiveInterval(500);
%>
最大有效时间:<%=session.getMaxInactiveInterval()%>
<br>
<%
    session.removeAttribute("name");
%>
姓名:<%=session.getAttribute("name")%>
<hr>
</body>
</html>
