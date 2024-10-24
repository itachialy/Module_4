package com.example.spring_boot.controller;
import com.example.spring_boot.model.Category;
import com.example.spring_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showListCategory(Model model){
        model.addAttribute("list", iCategoryService.findAll());
        return "list_cat";
    }
    @GetMapping("show-form-create-cat")
    public String showFormCreate(Model model){
        model.addAttribute("categories", new Category());
        return "create_cat";
    }
    @PostMapping("add-category")
    public String addCategory(){
        return "redirect:/";
    }
}
