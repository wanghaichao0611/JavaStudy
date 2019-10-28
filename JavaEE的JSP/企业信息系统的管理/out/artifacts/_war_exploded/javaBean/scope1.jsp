<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope</title>
</head>
<body>
<table>
    <tr>
        <td class="title">第一个页面被访问</td>
    </tr>
</table>
<jsp:useBean id="counter" class="Bean.ApplicationtScopeBean" scope="application"/>scope1.jsp(页面)
<br>
<a href="scope2.jsp">scope2.jsp</a>
<br>
<a href="scope3.jsp">scope3.jsp</a>
<br>
3个页面共被访问了<jsp:getProperty name="counter" property="accessCount"/>次。
</body>
</html>
