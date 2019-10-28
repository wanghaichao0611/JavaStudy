<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/5
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<hr>
<% response.setBufferSize(10240);%>
<%=response.getBufferSize()%>
<br>
<% response.setCharacterEncoding("UTF-8");%>
<%=response.getCharacterEncoding()%>
<br>
网站友情链接:
<hr>
<form action="处理.jsp" method="post">
    <select name="link">
        <option value="QH" selected>中国清华大学出版社</option>
        <option value="JY">中华人民共和国教育部</option>
    </select>
    <input type="submit" name="submit" value="确定">
</form>
<hr>
</body>
</html>
