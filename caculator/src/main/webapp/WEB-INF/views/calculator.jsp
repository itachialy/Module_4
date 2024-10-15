<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="" method="post">
    <input type="number" name="num1" required>
    <input type="number" name="num2" required> <br>
    <select name="operation" required>
        <option value="Addition">Addition (+)</option>
        <option value="Subtraction">Subtraction (-)</option>
        <option value="Multiplication">Multiplication (×)</option>
        <option value="Division">Division (÷)</option>
    </select> <br>
    <input type="submit" value="Calculate">
</form>

<c:if test="${not empty result}">
    <h2>Result: ${result}</h2>
</c:if>

<c:if test="${not empty error}">
    <h2 style="color:red;">Error: ${error}</h2>
</c:if>
</body>
</html>
