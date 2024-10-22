package com.example.spring_mvc.service;

import com.example.spring_mvc.model.Student;
import com.example.spring_mvc.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepo iStudentRepo;
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
    public List<Student> searchByName(String name) {
        return iStudentRepo.searchByName(name);
    }
}
