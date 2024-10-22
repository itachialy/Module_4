package com.example.product_th.controller;

import com.example.product_th.model.Product;
import com.example.product_th.service.IProductService;
import com.example.product_th.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping("")
    public String findAll(Model model){
        List<Product> list = iProductService.findAll();
        model.addAttribute("list", list);
        return "home";
    }
    @GetMapping("/showFormCreate")
    public String formCreate(Model model){
        model.addAttribute("productCreate", new Product());
        return "create";
    }
    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes){
        iProductService.addProduct(product);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công");
        return "redirect:/";
    }
    @GetMapping("/showFormEdit/{id}")
    public String formEdit(@PathVariable("id") int id, Model model){
        Product product = iProductService.findById(id);
        if (product != null) {
            model.addAttribute("productEdit", product);
            return "update";
        } else {
            return "redirect:/";
        }
    }
    @PostMapping("/edit")
    public String save(@ModelAttribute("products") Product product, RedirectAttributes redirectAttributes){
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("edits", "Cập nhật thành công");
        return "redirect:/";
    }

   @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes){
        iProductService.delete(id);
       redirectAttributes.addFlashAttribute("del", "Xóa thành công sản phẩm đã chọn.");
       return "redirect:/";
   }
    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<Product> products = iProductService.findByName(name);
        model.addAttribute("list", products);
        return "home";
    }
}
