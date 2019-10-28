<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/3
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> </title>
</head>
<body>
<jsp:useBean id="user" scope="page" class="存放bean的包.User注册Bean"/>
<jsp:setProperty name="user" property="*"/>
注册成功:
<hr/>
使用Bean属性方法:
<br/>
用户名:<%=user.getUserName()%>
<br/>
密码:<%=user.getPassword()%>
<br/>
年龄:<%=user.getAge()%>
<hr/>
使用getProperty动作:
<br/>
用户名:<jsp:getProperty name="user" property="userName"/>
<br/>
密码:<jsp:getProperty name="user" property="password"/>
<br/>
年龄:<jsp:getProperty name="user" property="age"/>
<br/>
</body>
</html>
