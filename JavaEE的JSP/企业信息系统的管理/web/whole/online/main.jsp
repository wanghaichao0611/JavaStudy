<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<!--body-->
<frameset rows="*" cols="14%,*">
    <frame src="left.jsp" name="left" scrolling="no" noresize="noresize" frameborder="no"/>
    <frameset rows="50%,*" cols="*">
        <frame src="top.jsp" name="top" scrolling="no" noresize="noresize" frameborder="no"/>
        <frame src="bottom.jsp" name="main" noresize="noresize" frameborder="no"/>
    </frameset>
</frameset>
<body>
</body>
</html>
