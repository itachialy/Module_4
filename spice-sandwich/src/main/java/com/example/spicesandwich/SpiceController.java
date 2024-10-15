package com.example.spicesandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class SpiceController {
    @RequestMapping("/")
    public String showForm() {
        return "form"; // Trả về view chứa form lựa chọn gia vị
    }

    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "result";
    }

}
