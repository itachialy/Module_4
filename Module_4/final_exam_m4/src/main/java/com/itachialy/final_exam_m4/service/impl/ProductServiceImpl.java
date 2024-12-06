package com.itachialy.final_exam_m4.service.impl;

import com.itachialy.final_exam_m4.model.Product;
import com.itachialy.final_exam_m4.repository.IProductRepository;
import com.itachialy.final_exam_m4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> search(String name, String price, String category, Pageable pageable ) {
        return iProductRepository.searchAdvance(name, price, category, pageable);
    }

    @Override
    public void deleteAllProducts() {
        iProductRepository.deleteAll();
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return iProductRepository.findById(id).orElse(null);
    }
}
