<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Email Validate</h1>
<h3>${message}</h3>
<form action="validate" method="post">
    <input type="text" name="email">
    <input type="submit" value="validate">
</form>



</body>
</html>