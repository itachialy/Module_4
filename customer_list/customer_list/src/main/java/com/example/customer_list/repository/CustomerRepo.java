package com.example.customer_list.repository;

import com.example.customer_list.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepo implements IRepo{
    private static List<Customer> list;
    static {


        list = new ArrayList<>();
       Customer s1 = new Customer(1, "Viet", "Viet@gmail.com", "Da Nang");
       Customer s2 = new Customer(2, "Khoa", "Khoa@gmail.com", "Da Nang");
       Customer s3 = new Customer(3, "Thuong", "Thuong@gmail.com", "Da Nang");
       list.add(s1);
       list.add(s2);
       list.add(s3);
    }
    @Override
    public List<Customer> findAll() {
        return list;
    }
}
