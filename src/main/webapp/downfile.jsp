<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>"/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>导出数据</title>
</head>
<body>
<h1>将数据以excel形式从数据库导出到电脑</h1>
<form action="/userController/exceldownload" method="post">
    电话：<input type="text" name="tel"/><br/>
    密码：<input type="password" name="pd"/><br>
    <input type="submit" value="导出Excel"/>

</form>
</body>
</html>
