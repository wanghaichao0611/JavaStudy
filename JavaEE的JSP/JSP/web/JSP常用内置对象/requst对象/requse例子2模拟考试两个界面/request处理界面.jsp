<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理过后的界面</title>
</head>
<body>
<%
    int e=0,f=0,g=0,h=0;
   String a=request.getParameter("1");
   String b=request.getParameter("2");
   String c=request.getParameter("3");
   String d=request.getParameter("4");
   if (a==null) a="";
   else if (a.equals("A")) e++;
   if (b==null) b="";
   else if (b.equals("A")) f++;
   if (c==null) c="";
   else if (c.equals("A")) g++;
   if (d==null) d="";
   else if (d.equals("A")) h++;
%>
<h3>您本次测试成绩是:</h3>
<%=(e+f+g+h)/4*100%>分
</body>
</html>
