<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据处理界面</title>
</head>
<body>
<% String a=request.getParameter("name");
   String b=request.getParameter("submit");
%>
获取客户端提交的文本和按钮信息如下:
<hr>
文本框输入的信息:<%=a%>
<br>
按钮信息:<%=b%>
<hr>
</body>
</html>
