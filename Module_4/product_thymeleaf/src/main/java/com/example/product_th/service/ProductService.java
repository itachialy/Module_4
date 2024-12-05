package com.example.product_th.service;
import com.example.product_th.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService{
    private static final List<Product> list;
    static {
        list = new ArrayList<>();
        list.add(new Product(1, "Iphone 16 Pro Mini", 20500000, "Black", "Apple" ));
        list.add(new Product(2, "Samsung Galaxy 55 Ultra", 9000000, "Black", "Samsung" ));
        list.add(new Product(3, "Huawei P100x Ultra", 15000000, "White", "Huawei" ));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void addProduct(Product product) {
        list.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : list){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId() == product.getId()){
                list.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId() == id){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : list){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(product);
            }
        }
        return result;
    }
}
