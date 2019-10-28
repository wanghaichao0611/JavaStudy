<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shop</title>
</head>
<body>
<form method="get" action="shopHandle.jsp">
    <br>
    请选择你要添加或者删除图书种类:
    <hr>
    添加商品:
    <select name="item">
        <option>JAVA图书</option>
        <option>JSP</option>
        <option>SSH</option>
        <option>SSM</option>
        <option>Spring</option>
    </select>
    <br>
    <hr>
    <input type="submit" name="submit" value="添加">
    <input type="submit" name="submit" value="删除">
</form>
</body>
</html>
