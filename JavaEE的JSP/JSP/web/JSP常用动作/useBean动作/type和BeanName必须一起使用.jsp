<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/3
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>beanName的使用</title>
</head>
<body>
<jsp:useBean id="time" type="java.io.Serializable"
beanName="java.util.Date"/>
现在的时间是:<%=time%>
</body>
</html>
