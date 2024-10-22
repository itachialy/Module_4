package com.example.product_th.service;
import com.example.product_th.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct(Product product);
    Product findById(int id);
    void save(Product product);
    void delete(int id);
    List<Product> findByName(String name);

}
