<%--
  Created by IntelliJ IDEA.
  User: LUOSHUN
  Date: 2018/7/16
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>这是登录</h1>
<form action="/userController/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>


