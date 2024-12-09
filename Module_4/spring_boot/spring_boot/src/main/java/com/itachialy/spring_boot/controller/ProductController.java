package com.itachialy.spring_boot.controller;

import com.itachialy.spring_boot.model.Product;
import com.itachialy.spring_boot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String showList(Model model,
                           @RequestParam(name = "page", required = false, defaultValue = "1")int page){
        Pageable pageable = PageRequest.of(page - 1, 3);
        Page<Product> productPage = iProductService.findAll(pageable);
        model.addAttribute("list", productPage);
        return "home";
    }

    @GetMapping("show-form-create")
    public String showFormCreate(Model model){
        return "create";
    }
}
