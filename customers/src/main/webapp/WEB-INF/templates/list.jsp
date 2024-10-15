<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
        <thead>
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>Email</th>
            <th>Địa chi</th>
            <th>Chức năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach varStatus="s" items="${customer}" var="c">
            <tr>
                <td>${s.count}</td>
                <td>${c.name}</td>
                <td>${c.email}</td>
                <td>${c.address}</td>
                <td><a href="customers/edit_form/${c.id}">Sửa</a></td>
            </tr>
        </c:forEach>
        </tbody>
</table>
</body>
</html>
