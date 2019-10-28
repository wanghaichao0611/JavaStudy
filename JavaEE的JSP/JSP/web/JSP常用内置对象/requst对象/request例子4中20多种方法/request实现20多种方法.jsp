<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: 汪海潮
  Date: 2019/6/4
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>20多中方法的应用</title>
</head>
<body>
<hr>
<%
    request.setAttribute("name","小强");
    request.setAttribute("Password","123456");
    request.setAttribute("Email","whc@qq.com");
    request.removeAttribute("Password");
    Enumeration e=request.getAttributeNames();
    String attrName;
    while(e.hasMoreElements())
    {
        attrName=e.nextElement().toString();
        out.print(attrName+"="+request.getAttribute(attrName)+"<br>");
    }
    request.setCharacterEncoding("ISO-8859-1");
%>
<%=request.getCharacterEncoding()%>
Content Length:<%=request.getContentLength()%><br>
Content Type:<%=request.getContentType()%>
<%=request.getContextPath()%><br>
服务器地址:<%=request.getLocalAddr()%><br>
服务器名称:<%=request.getLocalName()%><br>
<%=request.getMethod()%><br>
<%=request.getProtocol()%><br>
客户端地址:<%=request.getRemoteAddr()%><br>
客户端名称:<%=request.getRemoteHost()%><br>
客户端端口:<%=request.getRemotePort()%><br>
验证用户名:<%=request.getRemoteUser()%><br>
获取session:<%=request.getRequestedSessionId()%><br>
请求URI:<%=request.getRequestURI()%><br>
请求URL:<%=request.getRequestURL()%><br>
服务器名字:<%=request.getServerName()%><br>
服务器端口:<%=request.getServerPort()%><br>
<%=request.getServletPath()%><br>
<%=request.getSession().getId()%><br>
请求的会话ID是否通过Cookie传入:
<%=request.isRequestedSessionIdFromCookie()%><br>
请求的会话ID是否通过URL传入:
<%=request.isRequestedSessionIdFromURL()%><br>
请求的会话ID是否仍然有效:
<%=request.isRequestedSessionIdValid()%><br>
<%=request.isSecure()%><br>
<hr>
</body>
</html>
