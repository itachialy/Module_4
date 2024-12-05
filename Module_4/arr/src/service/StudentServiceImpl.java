package service;

import model.Student;
import repository.IStudentRepo;
import repository.StudentRepoImpl;

public class StudentServiceImpl implements IStudentService{
    IStudentRepo iStudentRepo = new StudentRepoImpl();
    @Override
    public Student[] findAll() {
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
}
