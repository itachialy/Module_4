package com.example.spring_mvc.repository;

import com.example.spring_mvc.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo implements IStudentRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        //JPQL : java persistence query language
        String jpql = "select s from Student s";
        TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);
        //HQL : hybernite query language
//        String hql = "from Student s where s.name like :searchName";
//        TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);
//        typedQuery.setParameter("searchName", "%viet%");
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = findById(id);
        if (student != null){
            entityManager.remove(student);
        }
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        entityManager.persist(student);// Thêm học viên
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public List<Student> searchByName(String name) {
        String jpql = "select s from Student s where s.name like : searchName";
        TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);
        typedQuery.setParameter("searchName", "%" + name + "%");
        return typedQuery.getResultList();
    }
}
