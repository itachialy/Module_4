<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Kết quả khai báo</title>
</head>
<body>
<h2>Kết quả khai báo</h2>
<h5>Các triệu chứng đã chọn:</h5>
<ul>
    <c:forEach var="symptom" items="${selectedSymptoms}">
        <li>${symptom}</li>
    </c:forEach>
</ul>

<h5>Thông tin cá nhân:</h5>
<p>Họ tên: ${declaration.name}</p>
<p>Năm sinh: ${declaration.dob}</p>
<p>Giới tính: ${declaration.gender}</p>
<p>Quốc tịch: ${declaration.quocTich}</p>
<p>Số CCCD: ${declaration.cccd}</p>
</body>
</html>
