
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
