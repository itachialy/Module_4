<<<<<<< HEAD
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration</title>
    <style>
        .warning {
            color: #D80000; /* Màu đỏ cho cảnh báo */
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">TỜ KHAI Y TẾ</h1>
<h2 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h2>
<p class="warning">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>

<form:form action="/show" method="post" modelAttribute="declaration">
    <label>Họ tên(ghi chữ IN HOA):</label>
    <form:input type="text" path="name"/><br>

    <label>Năm sinh (*)</label>
    <form:input type="date" path="dob"/><br>

    <label>Giới tính (*)</label>
    <form:select path="gender">
        <form:option value="">-Chọn-</form:option>
        <form:option value="Nam">Nam</form:option>
        <form:option value="Nữ">Nữ</form:option>
    </form:select><br>

    <label>Quốc tịch (*)</label>
    <form:input type="text" path="quocTich"/><br>

    <label>Số hộ chiếu hoặc số CCCD hoặc giấy thông hành hợp pháp (*)</label>
    <form:input type="number" path="cccd"/><br>

    <label>Thông tin đi lại (*)</label>
    <form:radiobutton value="Tàu bay" path="vehicle"/> Tàu bay
    <form:radiobutton value="Tàu thuyền" path="vehicle"/> Tàu thuyền
    <form:radiobutton value="Ô tô" path="vehicle"/> Ô tô
    <form:radiobutton value="Khác" path="vehicle"/> Khác(Ghi rõ)<br>

    <h5>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không? (*)</h5>
    <table border="1">
        <tr>
            <th>Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
            <th>Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        <tr>
            <td>Sốt</td>
            <td><form:radiobutton path="symptoms[0]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[0]" value="no"/></td>
            <td>Nôn/buồn nôn</td>
            <td><form:radiobutton path="symptoms[1]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[1]" value="no"/></td>
        </tr>
        <tr>
            <td>Ho</td>
            <td><form:radiobutton path="symptoms[2]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[2]" value="no"/></td>
            <td>Tiêu chảy</td>
            <td><form:radiobutton path="symptoms[3]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[3]" value="no"/></td>
        </tr>
        <tr>
            <td>Khó thở</td>
            <td><form:radiobutton path="symptoms[4]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[4]" value="no"/></td>
            <td>Xuất huyết ngoài da</td>
            <td><form:radiobutton path="symptoms[5]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[5]" value="no"/></td>
        </tr>
        <tr>
            <td>Đau họng</td>
            <td><form:radiobutton path="symptoms[6]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[6]" value="no"/></td>
            <td>Nổi ban ngoài da</td>
            <td><form:radiobutton path="symptoms[7]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[7]" value="no"/></td>
        </tr>
    </table>

    <h5>Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/Chị có (*)</h5>
    <table border="1">
        <tr>
            <th></th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        <tr>
            <td>Đến trang trại chăn nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật</td>
            <td><form:radiobutton path="exposure[0]" value="yes"/></td>
            <td><form:radiobutton path="exposure[0]" value="no"/></td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV</td>
            <td><form:radiobutton path="exposure[1]" value="yes"/></td>
            <td><form:radiobutton path="exposure[1]" value="no"/></td>
        </tr>
    </table>

    <input type="submit" value="Gửi tờ khai">
</form:form>
</body>
</html>
=======
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration</title>
    <style>
        .warning {
            color: #D80000; /* Màu đỏ cho cảnh báo */
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">TỜ KHAI Y TẾ</h1>
<h2 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h2>
<p class="warning">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>

<form:form action="/show" method="post" modelAttribute="declaration">
    <label>Họ tên(ghi chữ IN HOA):</label>
    <form:input type="text" path="name"/> <br>

    <div class="form-group">
        <label>Năm sinh (*)</label>
        <form:input type="date" path="dob"/>
    </div>
    <div class="form-group">
        <label>Giới tính (*)</label>
        <form:select path="gender">
            <form:option value="">-Chọn-</form:option>
            <form:option value="Nam">Nam</form:option>
            <form:option value="Nữ">Nữ</form:option>
        </form:select>
    </div>
    <div class="form-group">
        <label>Quốc tịch (*)</label>
        <form:input type="text" path="quocTich" placeholder="Quốc tịch (*)"/>
    </div>

    <label>Số hộ chiếu hoặc số CCCD hoặc giấy thông hành hợp pháp (*)</label>
    <form:input type="number" path="cccd"/> <br>

    <h5>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không? (*)</h5>
    <table border="1">
        <tr>
            <th>Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
            <th>Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        <tr>
            <td>Sốt</td>
            <td><form:radiobutton path="symptoms[0]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[0]" value="no"/></td>
            <td>Nôn/buồn nôn</td>
            <td><form:radiobutton path="symptoms[1]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[1]" value="no"/></td>
        </tr>
        <tr>
            <td>Ho</td>
            <td><form:radiobutton path="symptoms[2]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[2]" value="no"/></td>
            <td>Tiêu chảy</td>
            <td><form:radiobutton path="symptoms[3]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[3]" value="no"/></td>
        </tr>
        <tr>
            <td>Khó thở</td>
            <td><form:radiobutton path="symptoms[4]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[4]" value="no"/></td>
            <td>Xuất huyết ngoài da</td>
            <td><form:radiobutton path="symptoms[5]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[5]" value="no"/></td>
        </tr>
        <tr>
            <td>Đau họng</td>
            <td><form:radiobutton path="symptoms[6]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[6]" value="no"/></td>
            <td>Nổi ban ngoài da</td>
            <td><form:radiobutton path="symptoms[7]" value="yes"/></td>
            <td><form:radiobutton path="symptoms[7]" value="no"/></td>
        </tr>
    </table>

    <h5>Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/Chị có (*)</h5>
    <table border="1">
        <tr>
            <th></th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        <tr>
            <td>Đến trang trại chăn nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật</td>
            <td><form:radiobutton path="exposure[0]" value="yes"/></td>
            <td><form:radiobutton path="exposure[0]" value="no"/></td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV</td>
            <td><form:radiobutton path="exposure[1]" value="yes"/></td>
            <td><form:radiobutton path="exposure[1]" value="no"/></td>
        </tr>
    </table>

    <input type="submit" value="Gửi tờ khai">
</form:form>
</body>
</html>
>>>>>>> 95975503b3bb70174b416ca2b781baf517fcd788
