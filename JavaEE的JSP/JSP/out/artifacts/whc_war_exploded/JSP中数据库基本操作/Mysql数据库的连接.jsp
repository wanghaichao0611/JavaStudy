<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>mysql的连接</title>
    <link rel="short icon" href="favicon.ico">
</head>
<body>
<h2>使用MySQL的驱动访问Mysql数据库</h2>
<table border="1" bgcolor="#663399" align="center">
<hr>
    <%
        String url="jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        Connection conn=null;
        Statement  stmt=null;
        ResultSet  rs=null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");}catch(ClassNotFoundException e){ e.printStackTrace();}
        try {
            conn = DriverManager.getConnection(url,"root", "whc19970611");
            stmt=conn.createStatement();
            String sql="select * from student";
            rs=stmt.executeQuery(sql);
        while (rs.next())
            {
        %>
<tr>
    <td><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>
    <td><%=rs.getString(5)%></td>
</tr>
<%
        }}catch (java.sql.SQLException e){e.printStackTrace();}
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }catch (java.sql.SQLException e){e.printStackTrace();}
%>
</table>
<hr>
</body>
</html>
