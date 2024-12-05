package com.example.spring_mvc.controller;

import com.example.spring_mvc.model.Student;
import com.example.spring_mvc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @GetMapping("")
    public String findAll(Model model) {
        List<Student> list = iStudentService.findAll();
        model.addAttribute("students", list);
        return "home";
    }

    @GetMapping("show-create-form")
    public String showCreateForm(Model model) {
        model.addAttribute("studentCreate", new Student());
        return "create";
    }

    @PostMapping("add")
    public String addNewStudent(@ModelAttribute("studentCreate") Student student, RedirectAttributes redirectAttributes) {
        iStudentService.addStudent(student);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công");

        return "redirect:/";
    }

    @GetMapping("show-edit-form/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Student students = iStudentService.findById(id);
        model.addAttribute("studentEdit", students);
        return "update";
    }

    @PostMapping("edit")
    public String save(@ModelAttribute("studentEdit") Student student, RedirectAttributes redirectAttributes) {
        iStudentService.update(student);
        redirectAttributes.addFlashAttribute("edits", "Cập nhật thành công");

        return "redirect:/";
    }

    @PostMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id, RedirectAttributes redirectAttributes) {
        iStudentService.delete(id); // Gọi phương thức xóa từ service
        redirectAttributes.addFlashAttribute("del", "Xóa thành công sản phẩm đã chọn.");

        return "redirect:/"; // Quay lại danh sách học viên
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<Student> students = iStudentService.searchByName(name);
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("students", iStudentService.findById(id));
        return "view";
    }

}

