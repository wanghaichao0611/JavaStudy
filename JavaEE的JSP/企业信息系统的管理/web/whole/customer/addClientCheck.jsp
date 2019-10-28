<%@ page import="java.sql.*" %>
<%@ page   pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/7
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息检查</title>
</head>
<body>
<%
    String a=request.getParameter("clientName");
    String b=request.getParameter("clientPhone");
    String c=request.getParameter("clientAddress");
    String d=request.getParameter("clientEmail");
    Connection conn=null;
    Statement stmt=null;
        try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (ClassNotFoundException e){e.printStackTrace();}
    try
    {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/企业系统存储?serverTimezone=UTC","root","whc19970611");
        stmt=conn.createStatement();
        stmt.executeUpdate("insert into 客户账户信息 values ('"+a+"','"+b+"','"+c+"','"+d+"')");
        response.sendRedirect("http://localhost:8080/_war_exploded/whole/customer/addSuccess.jsp");
        return;
    }catch (java.sql.SQLException e){e.printStackTrace();}
    finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }catch (java.sql.SQLException e){e.printStackTrace();}
    }
%>
</body>
</html>
