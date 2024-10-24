package com.example.spring_boot.service.iplm;

import com.example.spring_boot.model.Category;
import com.example.spring_boot.repository.ICategoryRepository;
import com.example.spring_boot.repository.IProductRepository;
import com.example.spring_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void saveCat(Category category) {
        iCategoryRepository.save(category);
    }


    @Override
    public void deleteCat(Long id) throws Exception {
        if (iProductRepository.existsByCategoryId(id)) {
            throw new Exception("Không thể xóa mục này vì vẫn còn sản phẩm liên kết.");
        }
        iCategoryRepository.deleteById(id);
    }

}
