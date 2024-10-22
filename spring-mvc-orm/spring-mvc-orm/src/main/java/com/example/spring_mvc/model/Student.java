package com.example.spring_mvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student_name", columnDefinition = "LONGTEXT NOT NULL")
    private String name;
    private String email;
    private int salary;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    public Student() {
    }

    public Student(int id, String name, String email, int salary, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.dob = dob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
