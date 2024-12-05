<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency</title>
</head>
<body>
<h1>Chuyển đổi USD sang VNĐ</h1>
<form action="convert" method="post">
    Tỉ giá: <input type="text" name="exchangeRate" required/><br/>
    Số USD: <input type="text" name="usdAmount" required/><br/>
    <input type="submit" value="Convert"/> <br>
    Kết quả : ${result}

<%--      <c:if test="${not empty result}">
        <h2>Kết quả chuyển đổi</h2>
        <p>Số tiền VNĐ: ${result}</p>
    </c:if>--%>
</form>
</body>
</html>
