<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/3
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>setProperty</title>
</head>
<body>
jsp:setproperty实例
<hr>
<jsp:useBean id="time" class="java.util.Date">
    <jsp:setProperty name="time" property="hours" value="ok"/>
    <jsp:setProperty name="time" property="minutes" value="mm"/>
    <jsp:setProperty name="time" property="seconds" value="ss"/>
</jsp:useBean>
<br>
设置属性后的时间:<%=time%>
<br>
</body>
</html>
