<%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/9
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>guess</title>
</head>
<body>
<jsp:useBean id="guess" class="Bean.GuessNumber" scope="session"/>
<%
    String strGuess=response.encodeRedirectURL("guess.jsp"),
    strGetNumber=response.encodeRedirectURL("getNumber.jsp");
%>
<hr>
<jsp:setProperty name="guess" property="guessNumber" param="guessNumber"/>
这是第<jsp:getProperty name="guess" property="guessCount"/>次猜.
<jsp:getProperty name="guess" property="result"/>
你猜的数是<jsp:getProperty name="guess" property="guessNumber"/>.
<%
    if (guess.isRight()==false)
    {
%>
<form action="<%=strGuess%>" method="get">
    请再猜一次:<input type="text" name="guessNumber">
    <input type="submit" value="提交">
</form>
<%
    }
%>
<hr>
<a href="<%=strGetNumber%>">重新开始猜数</a>
</body>
</html>
