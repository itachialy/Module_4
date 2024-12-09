package com.itachialy.spring_boot.repository;

import com.itachialy.spring_boot.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAll(Pageable pageable);
}
