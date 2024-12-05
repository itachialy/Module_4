<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<a href="show-create-form">Thêm mới học viên</a>
<h2>Danh sách học viên</h2>
<table border="1px">
    <thead>
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Tuổi</th>
        <th colspan="2">Chức năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach varStatus="s" var="c" items="${students}">
        <tr>
            <td>${s.count}</td>
            <td>${c.name}</td>
            <td>${c.email}</td>
            <td>${c.age}</td>
            <td>
                <a href="show-edit-form/${c.id}">Sửa</a>
                <form action="delete/${c.id}" method="post" style="display:inline;">
                    <button type="submit"  onclick="return confirmDelete('${c.name}');" >Xóa</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    <script>
        function confirmDelete(name) {
            return confirm("Bạn có chắc chắn muốn xóa học viên " + name + " không?");
        }
    </script>
</table>
</body>
</html>
