<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/13
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%><%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册的页面</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            background-color: cadetblue;
        }
        div{
            width: 200px;
            height: 200px;
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
</head>
<body>

<div class="center-in-center">
    <h2 style="font-style: italic;color: darkmagenta" align="center">请注册你的账号</h2>
    <s:form action="zc"  method="post">
        <table border="0" width="300">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码:</td>
                <td><input type="password" name="passWord"></td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td><input type="password" name="enTrue"></td>
            </tr>
            <tr>
                <td>邮箱:</td>
                <td><input type="text" name="Mail"></td>
            </tr>
            <tr>
                <td>电话:</td>
                <td><input type="text" name="Phone"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="注册"></td>
                <td><input type="reset" name="重置"></td>
            </tr>
        </table>
    </s:form>
</div>
</body>
</html>
