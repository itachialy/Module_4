package com.itachialy.spring_boot.service;

import com.itachialy.spring_boot.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct(Product product);
    Page<Product> findAll(Pageable pageable);

}
