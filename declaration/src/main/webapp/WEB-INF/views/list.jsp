<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 3px;
        }
        td.symptom {
            text-align: left; /* Canh trái cho cột triệu chứng */
        }
        td.radio {
            text-align: center; /* Canh giữa cho cột chứa radio */
            vertical-align: middle; /* Canh giữa theo chiều dọc */
        }

    </style>
</head>
<body>
    <form:form action="/show" method="post" modelAttribute="declaration">
        <label>Họ tên(ghi chữ IN HOA):</label>
        <form:input type="text" path="name"/> <br>

        <label>Năm sinh:</label>
        <form:input type="date"  path="dob"/>

        <label>Giới tính:</label>
        <form:select path="gender">
            <form:option value="">-Chọn-</form:option> <!-- Tùy chọn trống -->
            <form:option value="Nam">Nam</form:option>
            <form:option value="Nữ">Nữ</form:option>
        </form:select>

        <label>Quốc tịch:</label>
        <form:input type="text" path="quocTich"/> <br>

        <label>Số hộ chiếu hoặc số CCCD hoặc giấy thông hành hợp pháp:</label> <br>
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
                <td class="symptom">Sốt</td>
                <td class="radio"><input type="radio" name="symptom[0]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[0]" value="no"></td>
                <td class="symptom">Nôn/buồn nôn</td>
                <td class="radio"><input type="radio" name="symptom[1]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[1]" value="no"></td>
            </tr>
            <tr>
                <td class="symptom">Ho</td>
                <td class="radio"><input type="radio" name="symptom[2]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[2]" value="no"></td>
                <td class="symptom">Tiêu chảy</td>
                <td class="radio"><input type="radio" name="symptom[3]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[3]" value="no"></td>
            </tr>
            <tr>
                <td class="symptom">Khó thở</td>
                <td class="radio"><input type="radio" name="symptom[4]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[4]" value="no"></td>
                <td class="symptom">Xuất huyết ngoài da</td>
                <td class="radio"><input type="radio" name="symptom[5]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[5]" value="no"></td>
            </tr>
            <tr>
                <td class="symptom">Đau họng</td>
                <td class="radio"><input type="radio" name="symptom[6]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[6]" value="no"></td>
                <td class="symptom">Nổi ban ngoài da</td>
                <td class="radio"><input type="radio" name="symptom[7]" value="yes" required></td>
                <td class="radio"><input type="radio" name="symptom[7]" value="no"></td>
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
            <td><input type="radio" name="animalExposure" value="yes" required></td>
            <td><input type="radio" name="animalExposure" value="no"></td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV</td>
            <td><input type="radio" name="closeContact" value="yes" required></td>
            <td><input type="radio" name="closeContact" value="no"></td>
        </tr>
    </table> <br>
        <input type="submit" value="Gửi tờ khai">
</form:form>
</body>
</html>
