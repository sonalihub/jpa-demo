package com.jpademo.controller;

import com.jpademo.entity.Product;
import com.jpademo.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    /*  url: http://localhost:8080/product*/
    @Autowired
    private ProductService productService;

    //save operation
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.fetchProductList();
    }

    /*@PostMapping
    public String createProduct() {
        return "createProduct was called";
    }*/

    @PutMapping("{id}")
    public Product updateProduct(@RequestBody Product product,
                                 @PathVariable("id") Integer productId) {
        return productService.updateProduct(product, productId);
    }

    @PatchMapping("{id}")
    public Product patchProduct(@PathVariable Integer id, @RequestBody Product incompleteProduct) throws IllegalAccessException {
        return productService.patchProduct(id, incompleteProduct);
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable("id")
                                Integer departmentId) {
        productService.deleteProductById(departmentId);
        return "product deleted successfully";
    }


}
