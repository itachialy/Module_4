package com.example.spring_boot.service.iplm;

import com.example.spring_boot.model.Product;
import com.example.spring_boot.repository.IProductRepository;
import com.example.spring_boot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product); // Thêm mới hoặc cập nhật
    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }
}
