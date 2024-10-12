package service;

import model.Student;
import repository.IStudentRepo;
import repository.StudentRepoImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
    IStudentRepo iStudentRepo = new StudentRepoImpl();


    @Override
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepo.addStudent(student);
    }

    @Override
    public Student findById(int id) {
        return iStudentRepo.findById(id);
    }

    @Override
    public void update(Student student) {
        iStudentRepo.update(student);
    }

    @Override
    public void delete(int id) {
        iStudentRepo.delete(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return iStudentRepo.findByName(name);
    }
}
