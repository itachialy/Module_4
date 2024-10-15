package service;

import model.Student;

public interface IStudentService {
    Student[] findAll();
    void addStudent(Student student);
    Student findById(int id);
    void update(Student student);
    void delete(int id);
}
