<<<<<<< HEAD
package com.example.demo_binding;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class Declaration {
    private String[] symptoms; // Mảng lưu triệu chứng
    private String[] exposure;  // Mảng lưu lịch sử phơi nhiễm
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String gender;
    private String quocTich;
    private int cccd;
    private String vehicle;

    public Declaration() {
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Declaration(String name, LocalDate dob, String gender, String quocTich,
                       int cccd, String vehicle) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.quocTich = quocTich;
        this.cccd = cccd;
        this.vehicle = vehicle;
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
    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public String[] getExposure() {
        return exposure;
    }

    public void setExposure(String[] exposure) {
        this.exposure = exposure;
    }

}
=======
package com.example.demo_binding;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class Declaration {
    private String[] symptoms; // Mảng lưu triệu chứng
    private String[] exposure;  // Mảng lưu lịch sử phơi nhiễm
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String gender;
    private String quocTich;
    private int cccd;

    public Declaration() {
    }

    public Declaration(String name, LocalDate dob, String gender, String quocTich,
                       int cccd, String vehicle) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.quocTich = quocTich;
        this.cccd = cccd;
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
    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public String[] getExposure() {
        return exposure;
    }

    public void setExposure(String[] exposure) {
        this.exposure = exposure;
    }

}
>>>>>>> 95975503b3bb70174b416ca2b781baf517fcd788
