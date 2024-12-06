package com.itachialy.final_exam_m4.service.impl;

import com.itachialy.final_exam_m4.model.Category;
import com.itachialy.final_exam_m4.repository.ICategoryRepository;
import com.itachialy.final_exam_m4.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }
}
