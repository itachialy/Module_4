<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Kết quả khai báo</h1>

<h3>Thông tin cá nhân:</h3>
<p>Họ tên: ${declaration.name}</p>
<p>Năm sinh: ${declaration.dob}</p>
<p>Giới tính: ${declaration.gender}</p>
<p>Quốc tịch: ${declaration.quocTich}</p>
<p>Số CCCD: ${declaration.cccd}</p>
<p>Thông tin đi lại: ${declaration.vehicle}</p>

<h3>Triệu chứng trong 14 ngày qua</h3>

<ul>
    <c:forEach var="symptom" items="${selectedSymptoms}">
        <li>${symptom}</li>
    </c:forEach>
</ul>


<h3>Lịch sử phơi nhiễm trong 14 ngày qua</h3>
<ul>
    <c:forEach var="exposure" items="${selectedExposure}">
        <li>${exposure}</li>
    </c:forEach>
</ul>
<a href="/">Quay về trang chủ</a>

</body>
</html>
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Kết quả khai báo</h1>

<h3>Thông tin cá nhân:</h3>
<p>Họ tên: ${declaration.name}</p>
<p>Năm sinh: ${declaration.dob}</p>
<p>Giới tính: ${declaration.gender}</p>
<p>Quốc tịch: ${declaration.quocTich}</p>
<p>Số CCCD: ${declaration.cccd}</p>

<h3>Triệu chứng trong 14 ngày qua</h3>

<ul>
    <c:forEach var="symptom" items="${selectedSymptoms}">
        <li>${symptom}</li>
    </c:forEach>
</ul>


<h3>Lịch sử phơi nhiễm trong 14 ngày qua</h3>
<ul>
    <c:forEach var="exposure" items="${selectedExposure}">
        <li>${exposure}</li>
    </c:forEach>
</ul>
<a href="/">Quay về trang chủ</a>

</body>
</html>
>>>>>>> 95975503b3bb70174b416ca2b781baf517fcd788
