<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sửa học viên</h2>
<form action="/edit" method="post">
    <input type="hidden" name="id" value="${student.id}"/>
    <input type="text" name="name" value="${student.name}" required /> <br>
    <input type="text" name="email" value="${student.email}" required /> <br>
    <input type="number" name="age" value="${student.age}" required /> <br>
    <button type="submit">Cập nhật</button>
</form>
<a href="/">Quay lại</a>
</body>
</html>
