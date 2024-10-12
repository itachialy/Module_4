package com.example.spring_mvc.repository;

import com.example.spring_mvc.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo implements IStudentRepo{
    private static final List<Student> list;

    static {
        list = new ArrayList<>();
        list.add(new Student(1, "Quang Viet", "viet@gmail.com", 18));
        list.add(new Student(2, "Anh Khoa", "khoa@gmail.com", 19));
        list.add(new Student(3, "Kim Thuong", "thuong@gmail.com", 20));
        list.add(new Student(4, "Itachi", "itachi@gmail.com", 21));
    }

    @Override
    public List<Student> findAll() {
        return list;
    }

    @Override
    public Student findById(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student; // Trả về học viên nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i); // Xóa học viên nếu tìm thấy
                break; // Dừng vòng lặp sau khi đã xóa
            }
        }
    }

    @Override
    public void addStudent(Student student) {
        list.add(student); // Thêm học viên
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student); // Cập nhật thông tin học viên
                break; // Dừng vòng lặp sau khi đã cập nhật
            }
        }
    }
}
