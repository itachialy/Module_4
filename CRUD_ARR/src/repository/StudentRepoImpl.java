package repository; // Định nghĩa gói cho lớp này.

import model.Student; // Nhập khẩu lớp Student từ gói model.

import java.util.ArrayList; // Nhập khẩu lớp ArrayList để sử dụng danh sách động.
import java.util.List; // Nhập khẩu interface List để định nghĩa kiểu danh sách.

public class StudentRepoImpl implements IStudentRepo { // Định nghĩa lớp StudentRepoImpl và chỉ định rằng nó implements (triển khai) interface IStudentRepo.
    static List<Student> list; // Khai báo một danh sách tĩnh để lưu trữ sinh viên.
    static int currentId = 1; // Khai báo biến tĩnh để theo dõi ID hiện tại cho sinh viên.

    static { // Khối khởi tạo tĩnh, chạy một lần khi lớp được tải.
        list = new ArrayList<>(); // Khởi tạo danh sách mới.
        list.add(new Student(currentId++,"Việt",18)); // Thêm sinh viên mới vào danh sách và tăng ID.
        list.add(new Student(currentId++,"Linh",18));
        list.add(new Student(currentId++,"Thương",18));
        list.add(new Student(currentId++,"Khoa",18));
        list.add(new Student(currentId++,"Itachi",18));
    }

    @Override
    public List<Student> findAll() { // Phương thức để lấy tất cả sinh viên.
        return list; // Trả về danh sách sinh viên.
    }

    @Override
    public void addStudent(Student student) { // Phương thức để thêm một sinh viên mới.
        student.setId(currentId++); // Gán ID cho sinh viên và tăng ID hiện tại.
        list.add(student); // Thêm sinh viên vào danh sách.
    }

    @Override
    public Student findById(int id) { // Phương thức tìm kiếm sinh viên theo ID.
        for (Student student : list) { // Duyệt qua danh sách sinh viên.
            if (student.getId() == id) { // Kiểm tra nếu ID trùng khớp.
                return student; // Trả về sinh viên tìm thấy.
            }
        }
        return null; // Trả về null nếu không tìm thấy.
    }

    @Override
    public void update(Student student) { // Phương thức để cập nhật thông tin sinh viên.
        for (int i = 0; i < list.size(); i++) { // Duyệt qua danh sách sinh viên.
            if (list.get(i).getId() == student.getId()) { // Kiểm tra nếu ID trùng khớp.
                list.set(i, student); // Cập nhật thông tin sinh viên.
                break; // Thoát khỏi vòng lặp.
            }
        }
    }

    @Override
    public void delete(int id) { // Phương thức để xóa sinh viên theo ID.
        for (int i = 0; i < list.size(); i++) { // Duyệt qua danh sách.
            if (list.get(i).getId() == id) { // Kiểm tra ID.
                list.remove(i); // Xóa sinh viên khỏi danh sách.
                // resetId(); Có thể gọi phương thức này để đặt lại ID nếu cần.
                break; // Thoát khỏi vòng lặp.
            }
        }
    }

    @Override
    public List<Student> findByName(String name) { // Phương thức để tìm sinh viên theo tên.
        List<Student> result = new ArrayList<>(); // Khởi tạo danh sách kết quả.
        for (Student student : list) { // Duyệt qua danh sách sinh viên.
            if (student.getName().equalsIgnoreCase(name)) { // So sánh tên (không phân biệt chữ hoa chữ thường).
                result.add(student); // Thêm sinh viên vào danh sách kết quả.
            }
        }
        return result; // Trả về danh sách sinh viên tìm thấy.
    }

    private void resetId() {
         int newId = 1; // Bắt đầu từ ID 1.
         for (Student student : list) { // Duyệt qua danh sách sinh viên.
             student.setId(newId++); // Đặt ID mới cho sinh viên.
         }
     }
}
