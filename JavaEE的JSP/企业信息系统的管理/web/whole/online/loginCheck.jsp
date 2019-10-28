<%@ page import="java.sql.*" %>
<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%><%@ page   pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理</title>
</head>
<body>
<%
    String userName=request.getParameter("userName");
    String password=request.getParameter("password");
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    boolean flag;
    if (userName.equals("")){
        response.sendRedirect("http://localhost:8080/_war_exploded/whole/online/login.jsp");
        return;
    }
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (ClassNotFoundException e){e.printStackTrace();}
    try
    {
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/企业系统存储?serverTimezone=UTC","root","whc19970611");
        stmt=conn.createStatement();
        rs=stmt.executeQuery("select * from 客户登录信息 where 用户名='"+userName+"'");
             if (rs.next()) {
                 if (rs.getString("密码").equals(password)) flag=true; else { flag=false;}
                 if (flag){
                     response.sendRedirect("http://localhost:8080/_war_exploded/whole/online/main.jsp");
                     return;
                 }else{
                     response.sendRedirect("http://localhost:8080/_war_exploded/whole/online/login.jsp");
                     return;
                 }
             }}catch (java.sql.SQLException e){e.printStackTrace();}
finally {
        try {
            if (rs!=null) rs.close();
            if (stmt!=null) stmt.close();
            if (conn!=null) conn.close();
        }catch (java.sql.SQLException e){e.printStackTrace();}
    }
%>
</body>
</html>
