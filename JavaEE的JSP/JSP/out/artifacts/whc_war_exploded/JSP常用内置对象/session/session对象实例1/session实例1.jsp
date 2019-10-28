<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
<%
    int number=10000;
    Object obj=session.getAttribute("number");
    if (obj==null)
    {
        session.setAttribute("number",String.valueOf(number));
    }
    else {
        number=Integer.parseInt(obj.toString());
        number+=1;
        session.setAttribute("number",String.valueOf(number));
    }
%>
你是第<%=number%>访问本网站的用户。
</body>
</html>
