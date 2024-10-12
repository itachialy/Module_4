package com.example.spring_mvc.controller;
import com.example.spring_mvc.model.Student;
import com.example.spring_mvc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    private IStudentService iStudentService;

    @GetMapping("")
    public String findAll(Model model){
        List<Student> list = iStudentService.findAll();
        model.addAttribute("students", list);
        return "home";
    }

    @GetMapping("show-create-form")
    public String showCreateForm(){
        return "create";
    }

    @PostMapping("add")
    public String addNewStudent(@ModelAttribute Student student){
        iStudentService.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("show-edit-form/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Student students = iStudentService.findById(id);
        model.addAttribute("student",students);
        return "update";
    }

    @PostMapping("edit")
    public String save(@ModelAttribute Student student){
        iStudentService.update(student);
        return "redirect:/";
    }
    @PostMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        iStudentService.delete(id); // Gọi phương thức xóa từ service
        return "redirect:/"; // Quay lại danh sách học viên
    }
}
