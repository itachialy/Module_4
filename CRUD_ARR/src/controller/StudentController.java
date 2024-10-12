package controller;

import model.Student;
import service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final StudentServiceImpl studentService = new StudentServiceImpl();
    private static final Scanner sc = new Scanner(System.in);
    public void findAll(){
        System.out.println("Danh sách sinh viên:");
        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }
    }
    public void addStudent(){
        System.out.print("Nhập ID: ");
        int idToAdd = Integer.parseInt(sc.nextLine());
        sc.nextLine(); // Đọc dòng mới
        System.out.print("Nhập tên: ");
        String nameToAdd = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int ageToAdd = Integer.parseInt(sc.nextLine());
        studentService.addStudent(new Student(idToAdd, nameToAdd, ageToAdd));
        System.out.println("Đã thêm sinh viên thành công!");
    }
    public void findById(){
        System.out.print("Nhập ID cần tìm: ");
        int idToFind = Integer.parseInt(sc.nextLine());
        Student foundStudent = studentService.findById(idToFind);
        if (foundStudent != null) {
            System.out.println("Sinh viên tìm thấy: " + foundStudent);
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + idToFind);
        }
    }
    public void save(){
        System.out.print("Nhập ID sinh viên cần cập nhật: ");
        int idToUpdate = Integer.parseInt(sc.nextLine());
        sc.nextLine(); // Đọc dòng mới
        System.out.print("Nhập tên mới: ");
        String nameToUpdate = sc.nextLine();
        System.out.print("Nhập tuổi mới: ");
        int ageToUpdate = Integer.parseInt(sc.nextLine());
        studentService.update(new Student(idToUpdate, nameToUpdate, ageToUpdate));
        System.out.println("Đã cập nhật sinh viên thành công!");
    }
    public void delete(){
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int idToDelete = Integer.parseInt(sc.nextLine());
        studentService.delete(idToDelete);
        System.out.println("Đã xóa sinh viên thành công!");
    }
    public void findByName(){

        System.out.println("Nhập tên cần tìm kiếm: ");
        String nameToFind = sc.nextLine();
        List<Student> foundStudent = studentService.findByName(nameToFind);
        if (!foundStudent.isEmpty()){
            System.out.println("Đã tìm thấy sinh viên với tên " + nameToFind + " : " + foundStudent);
        }else {
            System.out.println("Không tìm thấy sinh viên với tên: " + nameToFind);
        }
    }

}
