package com.example.spring_boot.service;

import com.example.spring_boot.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
    Optional<Category> findById(Long id);
    void saveCat(Category category);
    void deleteCat(Long id) throws Exception;

}
