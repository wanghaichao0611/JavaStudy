<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/6
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户</title>
</head>
<body>
<<table style="font-size: 20pt;color: darkorchid" align="center" width="500">
    <tr>
        <td><a href="../system/客户查询信息.jsp">客户查询</a></td>
        <td>
            <a href="../customer/addClient.jsp">客户添加</a>
        </td>
        <td>
            <a href="../customer/updateClient.jsp">客户修改</a>
        </td>
        <td>
            <a href="../customer/deleteClient.jsp">客户删除</a>
        </td>
    </tr>
</table>
<br>
<hr>
<br>
<table align="center" width="700" border="2">
    <tr>
        <th colspan="4">查看客户信息</th>
    </tr>
    <tr>
        <td>姓名</td>
        <td>电话</td>
        <td>地址</td>
        <td>邮箱</td>
    </tr>
</table>
</body>
</html>
