<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>随机生成一个数字</title>
</head>
<body>
<jsp:useBean id="guess" class="Bean.GuessNumber" scope="session"/>
<%
    Random random=new Random();
    int answer=1+random.nextInt(100);
    String str=response.encodeRedirectURL("guess.jsp");
%>
<jsp:setProperty name="guess" property="answer" value="<%=answer%>"/>
<h3>随机生成一个1到100的之间的整数，你猜下是什么数?</h3>
<hr>
<form action="<%=str%>" method="get">
    输入你猜的数:<input type="text" name="guessNumber">
    <input type="submit" value="提交">
</form>
</body>
</html>
