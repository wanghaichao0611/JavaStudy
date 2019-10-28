<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第二个例子</title>
</head>
<body>
<form method="post" action="">
    输入用户名:<input type="text" name="userName" ><br>
    输入密  码:<input type="password" name="password"><br>
    <input type="submit" value="确定">
    <input type="reset" value="取消">
</form>
<jsp:useBean id="login" class="Bean.登录的Bean"/>
<jsp:setProperty name="login" property="*"/>
<p>用户名是:</p>
<jsp:getProperty name="login" property="userName"/>
<p>密码是:</p>
<jsp:getProperty name="login" property="password"/>
</body>
</html>
