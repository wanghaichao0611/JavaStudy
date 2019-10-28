<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设置bean属性</title>
</head>
<body>
<jsp:useBean id="login" class="Bean.登录的Bean"/>
<jsp:setProperty name="login" property="userName" value="007"/>
<jsp:setProperty name="login" property="password" value="whc"/>
<h3>使用动作显示JavaBean中的数据:</h3>
<hr>
用户名;<jsp:getProperty name="login" property="userName"/><br>
密码是:<jsp:getProperty name="login" property="password"/>
</body>
</html>
