<%@page import="java.sql.*" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/7
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询客户的信息</title>
</head>
<body>
<<table style="font-size: 20pt;color: darkorchid" align="center" width="500">
    <tr>
        <td><a href="客户查询信息.jsp">客户查询</a></td>
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
<%
    Connection conn=null;
    Statement  stmt=null;
    ResultSet  rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (ClassNotFoundException e){e.printStackTrace();}
    try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/企业系统存储?serverTimezone=UTC","root","whc19970611");
        stmt=conn.createStatement();
        rs=stmt.executeQuery("select * from 客户账户信息");
        while (rs.next()){
%>
<tr>
    <td><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>
</tr>
<%
        }}catch (java.sql.SQLException e){e.printStackTrace();}
    finally {
        try
        {
            if (rs!=null) rs.close();
            if (stmt!=null) stmt.close();
            if (conn!=null) conn.close();
        }catch (java.sql.SQLException e){e.printStackTrace();}
        }
%>
</table>
</body>
</html>
