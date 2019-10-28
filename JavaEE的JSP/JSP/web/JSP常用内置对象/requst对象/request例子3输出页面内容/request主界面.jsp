<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="数据处理页面.jsp" method="post">
<p>文本内容:<input type="text" name="text"></p>
<p>数据类型:<input type="text" name="integer"></p>
<p>复选框:</p>
    <p>
        1.<input type="checkbox" name="checkbox1" value="1"><br>
        2.<input type="checkbox" name="checkbox2" value="1">
    </p>
    <p>
        下拉列表:
        <select name="select" size="1">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
        </select>
    </p>
    <p><input type="submit" name="submit" value="提交"></p>
</form>
</body>
</html>
