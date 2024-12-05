package repository;

import model.Student;

public class StudentRepoImpl implements IStudentRepo{
    static int index = 0;
    static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student(1, "Vệt", 18);
        students[1] = new Student(2, "Vệt", 18);
        students[2] = new Student(3, "Vệt", 18);
        students[3] = new Student(4, "Vệt", 18);
        students[4] = new Student(5, "Vệt", 18);
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        if (index < students.length) {
            students[index++] = student;
        } else {
            System.out.println("No more space to add a new student.");
        }
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == student.getId()) {
                students[i] = student;
                System.out.println("Cập nhật sinh viên thành công!");
                return;
            }
        }
        System.out.println("Sinh viên với ID " + student.getId() + " không tìm thấy.");
    }


    @Override
    public void delete(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null; // Mark as deleted
                return;
            }
        }
        System.out.println("Student with id " + id + " not found.");
    }
}
