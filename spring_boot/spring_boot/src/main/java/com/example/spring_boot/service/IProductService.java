package com.example.spring_boot.service;

import com.example.spring_boot.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    void delete(Long id);
}
