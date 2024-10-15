package controller;

import model.Student;
import service.IStudentService;
import service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    IStudentService iStudentService = new StudentServiceImpl();
    public void findAll(){
        Student[] students = iStudentService.findAll();
        for (Student s : students){
            if (s != null){
                System.out.println(s);
            }
        }
    }
    public void addStudent() {
        System.out.print("Nhập ID sinh viên: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = scanner.nextInt();

        Student student = new Student(id, name, age);
        iStudentService.addStudent(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void updateStudent() {
        System.out.print("Nhập ID sinh viên cần cập nhật: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới
        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi mới: ");
        int age = scanner.nextInt();

        Student updatedStudent = new Student(id, name, age);
        iStudentService.update(updatedStudent);
    }

    public void deleteStudent() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = scanner.nextInt();
        iStudentService.delete(id);
        System.out.println("Xóa sinh viên thành công!");
    }

}
