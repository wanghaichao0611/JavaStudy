<%@ page import="javax.naming.Name" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/11
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>property</title>
</head>
<body>
输出字符串:
<s:property value="'Name'"/><br>
忽略HTML代码:
<s:property value="'<h3>Name</h3>'" escapeHtml="true"/><br>
不忽略HTML代码:
<s:property value="'<h3>Name/h3>'" escapeHtml="false"/><br>
输出默认值:
<s:property value="" default="true"/><br>
</body>
</html>
