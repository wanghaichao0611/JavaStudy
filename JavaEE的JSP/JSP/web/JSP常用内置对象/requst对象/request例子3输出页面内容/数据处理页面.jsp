<%@ page import="java.util.Vector" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据处理界面</title>
</head>
<body>
<%
    java.lang.String strText,strInteger,strCheckbox1,strCheckbox2;
    java.lang.String strSelect,strOut,errOut;
    Integer intInteger;
    int errsCount;
    Vector errs=new Vector();
    strText=request.getParameter("text");
    if(strText.length()==0)
    {
        errs.addElement(new java.lang.String("文本内容没有值输入:"));
    }
    strInteger=request.getParameter("integer");
    try
    {
        intInteger=Integer.valueOf(strInteger);
    }catch (NumberFormatException e){
        errs.addElement(new java.lang.String("整数类型需要输入数字!"));
        intInteger=new Integer(0);
    }
    strCheckbox1=request.getParameter("checkbox1");
    strCheckbox2=request.getParameter("checkbox2");
    if(strCheckbox1==null)
    {
        strCheckbox1="没有被选中";
    }else{strCheckbox1="被选中";}
    if (strCheckbox2==null)
    {
       strCheckbox2="没有被选中";
    }else {strCheckbox2="被选中";}
    strSelect=request.getParameter("select");
    strOut="文本内容的值是:"+intInteger;
    strOut+="<br>整数类型的值是:"+intInteger;
    strOut+="<br>复选框 1"+strCheckbox1;
    strOut+="<br>复选框 2"+strCheckbox2;
    strOut+="<br>下拉列表的值是:"+strSelect+"<br>";
    errsCount= errs.size();
    errOut=new String("");
    //输出错误！
    for (int i=0;i<errsCount;i++)
    {
        errOut+=errs.elementAt(i).toString();
        errOut+="<br>";
    }
    out.println("数据处理结果<br>");
    out.println(strOut);
    if(errsCount!=0)
    {
        out.println("错误原因<br>");
        out.println(errOut);
    }
%>
</body>
</html>
