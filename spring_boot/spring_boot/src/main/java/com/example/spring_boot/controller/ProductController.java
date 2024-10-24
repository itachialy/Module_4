package com.example.spring_boot.controller;

import com.example.spring_boot.model.Product;
import com.example.spring_boot.service.ICategoryService;
import com.example.spring_boot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("list", iProductService.findAll());
        return "home";
    }

    @GetMapping("show-form-create")
    public String showFormCreate(Model model) {
        model.addAttribute("productC", new Product());
        model.addAttribute("listC", iCategoryService.findAll());
        return "create";
    }

    // Thêm sản phẩm mới
    @PostMapping("add")
    public String addNewProduct(@ModelAttribute("productC") Product product, RedirectAttributes redirectAttributes) {
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("add", "Thêm mới thành công");
        return "redirect:/";
    }

    @PostMapping("delete/{id}")
    public String deleteById(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        Optional<Product> existingProduct = iProductService.findById(id);
        if (existingProduct.isPresent()) {
            iProductService.delete(id);
            redirectAttributes.addFlashAttribute("del", "Xóa thành công sản phẩm đã chọn.");
        }
        return "redirect:/";
    }

    @GetMapping("show-form-edit/{id}")
    public String showFormEdit(@PathVariable Long id, Model model) {
        Optional<Product> existingProduct = iProductService.findById(id);
        if (existingProduct.isPresent()) {
            model.addAttribute("productE", existingProduct.get());
            model.addAttribute("listE", iCategoryService.findAll());
        }
        return "update";
    }

    @PostMapping("update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("productE") Product product, RedirectAttributes redirectAttributes) {
        Optional<Product> existingProduct = iProductService.findById(id);
        if (existingProduct.isPresent()) {
            iProductService.save(product);
            redirectAttributes.addFlashAttribute("edit", "Cập nhật sản phẩm thành công");
        }
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model) {
        Optional<Product> optionalProduct = iProductService.findById(id);
        if (optionalProduct.isPresent()) {
            model.addAttribute("product", optionalProduct.get());
            model.addAttribute("categories", iCategoryService.findAll());
        }
        return "view"; // Trả về trang view để hiển thị thông tin sản phẩm
    }

}
