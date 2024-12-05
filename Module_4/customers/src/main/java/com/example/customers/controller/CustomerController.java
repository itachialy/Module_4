package com.example.customers.controller;

import com.example.customers.model.Customer;
import com.example.customers.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customer = iCustomerService.findAll();
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("edit_form/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Customer customerEdit = iCustomerService.findById(id);
        model.addAttribute("customerEdit",customerEdit);
        return "info";
    }

    @PostMapping("edit")
    public String editCustomer(Customer customer){
        iCustomerService.save(customer);
        return "redirect:/customers";
    }
}
