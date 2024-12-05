package com.example.customers.service;

import com.example.customers.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
        customers.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customers.add(new Customer(3, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));

    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer c : customers){
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
