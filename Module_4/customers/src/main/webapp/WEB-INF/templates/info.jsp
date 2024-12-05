
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset style="width: 500px">
    <legend>Customer Information</legend>
    <form action="customers/edit" method="post">
        <table>
            <tr>
<%--                <td>Id</td>--%>
                <td><input hidden="hidden" type="text" name="id" value="${customerEdit.id}" readonly></td>
            </tr>
            <tr>
                <td>Tên</td>
                <td><input type="text" name="name" value="${customerEdit.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${customerEdit.email}"></td>
            </tr>
            <tr>
                <td>Địa chỉ</td>
                <td><input type="text" name="address" value="${customerEdit.address}"></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Luu</button>
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
