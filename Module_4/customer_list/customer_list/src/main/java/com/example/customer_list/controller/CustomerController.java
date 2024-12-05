package com.example.customer_list.controller;

import com.example.customer_list.model.Customer;
import com.example.customer_list.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private IService iService;
    @GetMapping("")


//    public String showList(Model model){
//        List<Customer> list = iService.findAll();
//        model.addAttribute("customers", list);
//        System.out.println(list);
//        return "list";
//    }

//    public ModelAndView showList(){
//        ModelAndView modelAndView = new ModelAndView("list");
//        List<Customer> list = iService.findAll();
//        modelAndView.addObject("customers", list);
//        return modelAndView;
//    }
    public String showList(HttpServletRequest request){
        List<Customer> list = iService.findAll();
        request.setAttribute("customers",list);
        return "list";
    }
}
