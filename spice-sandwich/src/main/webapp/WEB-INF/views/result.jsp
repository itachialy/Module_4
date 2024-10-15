<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Các Gia Vị Đã Chọn</h2>
<ul>
    <c:forEach var="c" items="${condiment}">
        <li>${c}</li>
    </c:forEach>
</ul>
<a href="/">Trở lại</a>
</body>
</html>
