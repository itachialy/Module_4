package com.itachialy.final_exam_m4.model;

import jakarta.persistence.*;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Set;

@Entity
@Table(name = "product")
public class Product implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String checked;
    @NotBlank(message = "Không được để trống.")
    @Size(min = 5, max = 50, message = "Tên sản phẩm phải là 5 đến 50 ký tự")
    private String name;
    private String price;
    @NotBlank(message = "Không được để trống.")
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    Category category;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String check) {
        this.checked = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        String price = product.getPrice();
        if (price == null || price.trim().isEmpty()) {
            errors.rejectValue("price", "", "Không được để trống.");
        } else {
            try {
                if (Long.parseLong(product.getPrice()) < 100000) {
                    errors.rejectValue("price", "", "Giá bắt đầu phải lớn hơn 100,000 VNĐ");
                }

            } catch (NumberFormatException e) {
                errors.rejectValue("price", "", "Giá bắt đầu phải là số.");
            }
        }
    }
}
