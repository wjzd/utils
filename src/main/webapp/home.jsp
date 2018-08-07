
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.0.0.js"></script>
    <script type="text/javascript" src="js/home.js"></script>

</head>
<body>
    <h2>将电脑表格数据导入到数据库中</h2>
    <form action="/userController/upload" method="post" id="fileform">
        <input type="file" name="file"  class="uploadEventFile"/>
        <input type="text" name="num">
       <input type="submit" value="上传"/>
    </form>
</body>
</html>
