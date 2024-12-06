package com.itachialy.final_exam_m4.controller;

import com.itachialy.final_exam_m4.model.Product;
import com.itachialy.final_exam_m4.service.ICategoryService;
import com.itachialy.final_exam_m4.service.IProductService;
import jakarta.validation.Valid;
import org.hibernate.annotations.ConcreteProxy;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private IProductService iProductService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("search")
    public String searchAdvance(@RequestParam(required = false) String name,
                                @RequestParam(required = false) String price,
                                @RequestParam(required = false) String category,
                                @RequestParam(defaultValue = "1") int page,
                                Model model){

        Page<Product> productPage = iProductService.search(name, price, category, PageRequest.of(page -1, 5));
        int totalPages = productPage.getTotalPages();
        model.addAttribute("list", productPage.getContent());
        model.addAttribute("currentPage", productPage.getNumber() + 1);
        model.addAttribute("totalPages", totalPages > 0 ? totalPages : 1);

        model.addAttribute("listC", iCategoryService.findAll());
        model.addAttribute("selectedName", name);
        model.addAttribute("selectedPrice", price);
        model.addAttribute("selectedCategory", category);

        return "home";
    }

    @GetMapping("")
    public String showHomePage(@RequestParam(defaultValue = "1") int page,
                               Model model) {
        Page<Product> productPage = iProductService.findAll(PageRequest.of(page -1, 5));
        int totalPages = productPage.getTotalPages();

        model.addAttribute("list", productPage);
        model.addAttribute("listC", iCategoryService.findAll());

        model.addAttribute("products", productPage.getContent());
        model.addAttribute("currentPage", productPage.getNumber() + 1);
        model.addAttribute("totalPages", totalPages > 0 ? totalPages : 1);
        return "home";
    }

    @GetMapping("/create-form")
    public String showCreateForm(Model model){
        model.addAttribute("products", new Product());
        model.addAttribute("listC", iCategoryService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String addCustomer(@Valid @ModelAttribute("products") Product product,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes, Model model) {
        new Product().validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("listC", iCategoryService.findAll());
            return "create";
        }
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới sản phẩm thành công.");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes){
        Product product = iProductService.findById(id);
        if (product != null){
            iProductService.delete(id);
            redirectAttributes.addFlashAttribute("msg", "Xóa sản phẩm thành công");
        }
        return "redirect:/";
    }

    @PostMapping("/products/delete")
    public String deleteProduct(@RequestParam("productIds") List<Long> productIds){
        for(Long id : productIds){
            iProductService.delete(id);
        }
        return "redirect:/";
    }

    @PostMapping("/delete_all")
    public String deleteAllProducts() {
        iProductService.deleteAllProducts();
        return "redirect:/";
    }
}
