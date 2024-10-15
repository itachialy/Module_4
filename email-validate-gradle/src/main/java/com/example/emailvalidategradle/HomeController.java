package com.example.emailvalidategradle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller



public class HomeController{
    private static final String EMAIL_REGAX =
            "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private Pattern pattern;
    public HomeController(){
        pattern = Pattern.compile(EMAIL_REGAX);
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    private boolean validate(String regax){
        Matcher matcher = pattern.matcher(regax);
        return matcher.matches();
    }

    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, Model model){
        boolean isValid = this.validate(email);
        if (!isValid){
            model.addAttribute("message", "Email không hợp lệ");
        }
        model.addAttribute("email", email);
        return "success";
    }
}