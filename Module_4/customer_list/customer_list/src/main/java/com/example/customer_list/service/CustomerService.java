package com.example.customer_list.service;

import com.example.customer_list.model.Customer;
import com.example.customer_list.repository.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements IService{
    @Autowired
    protected IRepo iRepo;
    @Override
    public List<Customer> findAll() {
        return iRepo.findAll();
    }
}
