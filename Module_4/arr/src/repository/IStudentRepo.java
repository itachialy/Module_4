package repository;

import model.Student;

public interface IStudentRepo {
    Student[] findAll();
    void addStudent(Student student);
    Student findById(int id);
    void update(Student student);
    void delete(int id);
}
