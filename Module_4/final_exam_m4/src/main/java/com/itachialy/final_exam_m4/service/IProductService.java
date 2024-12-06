package com.itachialy.final_exam_m4.service;

import com.itachialy.final_exam_m4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    Page<Product> findAll(Pageable pageable);

    List<Product> findAll();
    void delete(Long id);
    void save(Product product);

    Product findById(Long id);
    Page<Product> search(String name, String price, String category, Pageable pageable);
    void deleteAllProducts();

}
