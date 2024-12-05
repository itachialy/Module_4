package com.itachialy.final_exam_m4.repository;

import com.itachialy.final_exam_m4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "(?1 IS NULL OR p.name LIKE %?1%) AND " +
            "(?2 IS NULL OR p.price LIKE %?2%)")
    List<Product> searchAdvance(String name, String price);

}
