<%@ page import="java.sql.*" %>
<%@ page   pageEncoding="utf-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除处理的界面</title>
</head>
<body>
<%
    String f=request.getParameter("Name");
    Connection conn=null;
    Statement stmt=null;
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (ClassNotFoundException e){e.printStackTrace();}
    try
    {
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/企业系统存储?serverTimezone=UTC", "root", "whc19970611");
        stmt=conn.createStatement();
        stmt.executeUpdate("delete from 客户账户信息 where 姓名='"+f+"'");;
        response.sendRedirect("http://localhost:8080/_war_exploded/whole/customer/deleteSuccess.jsp");
        return;
    }catch (java.sql.SQLException e){e.printStackTrace();}
    finally {
        try {
            if (stmt!= null) stmt.close();
            if (conn!= null) conn.close();
        }catch (java.sql.SQLException e){e.printStackTrace();}
    }
%>
</body>
</html>
