<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Thêm mới sinh viên
<form action="add" method="post">
<%--    <input type="text" name="id" placeholder="id" required /> <br>--%>
    <input type="text" name="name" placeholder="Tên" required /> <br>
    <input type="text" name="email" placeholder="Email" required /> <br>
    <input type="number" name="age" placeholder="Tuổi" required /> <br>
    <button type="submit">Thêm mới</button>
</form>
</body>
</html>
