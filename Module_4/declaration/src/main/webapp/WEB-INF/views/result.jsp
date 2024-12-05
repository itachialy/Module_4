<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả khai báo y tế</title>
</head>
<body>
<h2>Kết quả khai báo y tế</h2>

<p><strong>Họ tên:</strong> ${declaration.name}</p>
<p><strong>Năm sinh:</strong> ${declaration.dob}</p>
<p><strong>Giới tính:</strong> ${declaration.gender}</p>
<p><strong>Quốc tịch:</strong> ${declaration.quocTich}</p>
<p><strong>Số hộ chiếu/CCCD:</strong> ${declaration.cccd}</p>

<h3>Triệu chứng trong 14 ngày qua</h3>
<c:choose>
    <c:when test="${not empty selectedSymptoms}">
        <ul>
            <c:forEach var="symptom" items="${selectedSymptoms}">
                <li>${symptom}</li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <p>Không có triệu chứng nào.</p>
    </c:otherwise>
</c:choose>

<h3>Lịch sử phơi nhiễm trong 14 ngày qua</h3>
<c:choose>
    <c:when test="${not empty selectedExposure}">
        <ul>
            <c:forEach var="exposure" items="${selectedExposure}">
                <li>${exposure}</li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <p>Không có tiếp xúc nào được ghi nhận.</p>
    </c:otherwise>
</c:choose>

<a href="/">Trở về trang khai báo</a>
</body>
</html>
