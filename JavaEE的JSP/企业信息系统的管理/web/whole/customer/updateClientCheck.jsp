<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/7
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.sql.*" %>
<%@ page   pageEncoding="utf-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改的页面</title>
</head>
<body>
<%
    String q=request.getParameter("name");
    String b=request.getParameter("phone");
    String c=request.getParameter("address");
    String d=request.getParameter("mail");
    Connection conn=null;
    Statement stmt=null;
    try{
    if (q.equals(""))
    {
        response.sendRedirect("http://localhost:8080/_war_exploded/whole/customer/updateClient.jsp");
       return;
    }}catch (NullPointerException e){e .printStackTrace();}
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/企业系统存储?serverTimezone=UTC", "root", "whc19970611");
            stmt=conn.createStatement();
            stmt.executeUpdate("update 客户账户信息 set 电话='"+b+"' where 姓名='"+q+"'");
            stmt.executeUpdate("update 客户账户信息 set 地址='"+c+"' where 姓名='"+q+"'");
            stmt.executeUpdate("update 客户账户信息 set 邮箱='"+d+"' where 姓名='"+q+"'");
            response.sendRedirect("http://localhost:8080/_war_exploded/whole/customer/updateSuccess.jsp");
            return;
          }catch (java.sql.SQLException e){e.printStackTrace();}
        finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
%>
</body>
</html>
