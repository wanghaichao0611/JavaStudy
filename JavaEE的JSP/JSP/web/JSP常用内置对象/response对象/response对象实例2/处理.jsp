
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<title>处理</title>
<body>
<%
    String address=request.getParameter("link");
    if(address!=null)
    {
        if (address.equals("QH"))
            response.sendRedirect("http://www.tup.tsinghua.edu.cn/");
        else
            response.sendRedirect("http://www.moe.edu.cn/");
    }
%>
</body>
</html>
