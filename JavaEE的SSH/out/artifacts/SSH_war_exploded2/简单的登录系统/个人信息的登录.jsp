<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/13
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<style type="text/css">
    *{
        margin: 0;
        padding: 0;
        background-color: blueviolet;
    }
    div{
        width: 100px;
        height: 100px;
    }
    .center-in-center{
        position: absolute;
        top: 50%;
        left: 50%;
        -webkit-transform: translate(-50%, -50%);
        -moz-transform: translate(-50%, -50%);
        -ms-transform: translate(-50%, -50%);
        -o-transform: translate(-50%, -50%);
        transform: translate(-50%, -50%);
    }
</style>
<body>
<div class="center-in-center" >
<s:form action="dl" method="post">
<table align="center">
    <tr>
        <th>
            用户名:<input type="text" name="username">
        </th>
    </tr>
    <tr>
        <th>
            密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password">
        </th>
    </tr>
    <tr>
        <td colspan="3">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;<a href="../简单的登录系统/注册.jsp">注册</a>
        </td>
    </tr>
</table>
</s:form>
</div>
</body>
</html>
