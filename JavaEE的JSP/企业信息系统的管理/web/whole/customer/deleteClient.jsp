<%@ page   pageEncoding="utf-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body>
<form action="addClientCheck.jsp" method="post">
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
    <table align="center" width="300" style="font-style: oblique">
        <tr>
            <th style="font-size: 25pt;color:darkorchid">删除客户信息</th>
        </tr>
        <tr>
            <td><hr></td>
        </tr>
        <tr>
            <td><hr></td>
        </tr>
        <tr>
            <td><input type="text" name="Name" placeholder="请删除你的的客户名称" size="35"></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="确认">&nbsp;&nbsp;&nbsp;
                <input type="reset" value="取消">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
