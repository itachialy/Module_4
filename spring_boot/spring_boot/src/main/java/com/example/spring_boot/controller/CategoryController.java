package com.example.spring_boot.controller;
import com.example.spring_boot.model.Category;
import com.example.spring_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showListCategory(Model model){
        model.addAttribute("list", iCategoryService.findAll());
        return "/category/list_cat";
    }
    @GetMapping("show-form-create-cat")
    public String showFormCreate(Model model){
        model.addAttribute("categories", new Category());
        return "/category/create_cat";
    }
    @PostMapping("add-category")
    public String addCategory(@ModelAttribute("categories") Category category){
        iCategoryService.saveCat(category);
        return "redirect:/category";
    }

    @PostMapping("delete-cat/{id}")
    public String deleteCategory(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            Optional<Category> existCategory = iCategoryService.findById(id);
            if (existCategory.isPresent()) {
                iCategoryService.deleteCat(id);
                redirectAttributes.addFlashAttribute("del", "Xóa thành công.");
            }
        } catch (Exception e) {
            // Nếu có lỗi xảy ra, thông báo cho người dùng
            redirectAttributes.addFlashAttribute("error", e.getMessage());
        }
        return "redirect:/category";
    }
}
