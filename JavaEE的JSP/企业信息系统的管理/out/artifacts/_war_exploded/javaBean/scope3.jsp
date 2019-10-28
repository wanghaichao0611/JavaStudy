<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope3</title>
</head>
<body>
</table>
<jsp:useBean id="counter" class="Bean.ApplicationtScopeBean" scope="application"/>scope3.jsp(页面)
<br>
<a href="scope1.jsp">scope1.jsp</a>
<br>
<a href="scope2.jsp">scope2.jsp</a>
<br>
3个页面共被访问了<jsp:getProperty name="counter" property="accessCount"/>次。
</body>
</html>
