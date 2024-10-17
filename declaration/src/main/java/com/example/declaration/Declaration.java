package com.example.declaration;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Declaration {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String gender;
    private String quocTich;
    private int cccd;
    private String vehicle;
    private String token;

    public Declaration() {
    }

    public Declaration(String name, LocalDate dob, String gender, String quocTich,
                       int cccd, String vehicle, String token) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.quocTich = quocTich;
        this.cccd = cccd;
        this.vehicle = vehicle;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
