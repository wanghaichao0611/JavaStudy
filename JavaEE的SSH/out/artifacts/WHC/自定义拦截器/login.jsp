<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/11
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
${requestScope.msg}<br>
<s:form action="login" method="post">
    <table>
        <tr>
            <td><label style="text-align: right;" >用户名:</label></td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td><label style="text-align: right;">密码:</label> </td>
            <td><input type="password" name="password" autocomplete="off"></td>
        </tr>
        <tr>
            <td align="right" colspan="2">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</s:form>
</body>
</html>
