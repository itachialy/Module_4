
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>Chọn gia vị cho Sandwich</h2>--%>
<%--<form action="save" method="post">--%>
<%--    <input type="checkbox" name="condiment" value="Lettuce"> Lettuce--%>
<%--    <input type="checkbox" name="condiment" value="Tomato"> Tomato--%>
<%--    <input type="checkbox" name="condiment" value="Mustard"> Mustard--%>
<%--    <input type="checkbox" name="condiment" value="Sprouts"> Sprouts <br>--%>
<%--    <button type="submit">Save</button>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chọn gia vị cho Sandwich</title>
</head>
<body>
<h2>Chọn gia vị cho Sandwich</h2>
<form action="save" method="post">
    <h3>Lettuce</h3>
    <label>
        <input type="radio" name="lettuce" value="Có" required> Có
    </label>
    <label>
        <input type="radio" name="lettuce" value="Không"> Không
    </label><br>

    <h3>Tomato</h3>
    <label>
        <input type="radio" name="tomato" value="Có" required> Có
    </label>
    <label>
        <input type="radio" name="tomato" value="Không"> Không
    </label><br>

    <h3>Mustard</h3>
    <label>
        <input type="radio" name="mustard" value="Có" required> Có
    </label>
    <label>
        <input type="radio" name="mustard" value="Không"> Không
    </label><br>

    <h3>Sprouts</h3>
    <label>
        <input type="radio" name="sprouts" value="Có" required> Có
    </label>
    <label>
        <input type="radio" name="sprouts" value="Không"> Không
    </label><br>

    <button type="submit">Save</button>
</form>
</body>
</html>
