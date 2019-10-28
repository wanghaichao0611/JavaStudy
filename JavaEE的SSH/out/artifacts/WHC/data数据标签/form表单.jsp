<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/11
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<s:form>
    <s:textfield label="用户名" name="username"/>
    <s:password label="密码" name="password"/>
    <s:password label="确认密码" name="password"/>
    <s:radio name="sex" list="#{'1':'男','2':'女'}" value="0"/>
    <s:textarea label="个性签名" name="description" rows="5" cols="15"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>
