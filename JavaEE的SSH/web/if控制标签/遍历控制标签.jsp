<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>interator</title>
</head>
<body>
<div align="center">
<table border="1px" cellpadding="0" cellspacing="0">
    <s:iterator var="name" value="{'java','java web','Oracle','Mysql'}" status="st">
        <s:if test="#st.odd">
            <tr style="background-color: white">
                <td><s:property value="name"/></td>
            </tr>
        </s:if>
        <s:else>
            <tr style="background-color: gray">
                <td>
                    <s:property value="name"/>
                </td>
            </tr>
        </s:else>
    </s:iterator>
</table>
</div>
</body>
</html>
