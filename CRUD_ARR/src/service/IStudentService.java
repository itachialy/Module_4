package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void addStudent(Student student);
    Student findById(int id);
    void update(Student student);
    void delete(int id);
    List<Student> findByName(String name);

}
