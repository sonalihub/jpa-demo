package com.jpademo.service;

import com.jpademo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductService {
    //save operation
    Product saveProduct(Product product);
    //Read operation
    List<Product> fetchProductList();
    //update operation

    Product updateProduct(Product product, Integer id);

    // Delete operation
    void deleteProductById(Integer id);

    Product patchProduct(Integer id, Product incompleteProduct) throws IllegalAccessException;
}
