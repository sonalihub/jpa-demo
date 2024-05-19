package com.jpademo.controller;

import com.jpademo.pojo.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
  /*  url: http://localhost:8080/product*/

    @GetMapping
    public String getProduct() {
        return "getProduct was called";
    }

    @PostMapping
    public String createProduct() {
        return "createProduct was called";
    }

    @PutMapping
    public String updateProduct() {
        return "updateProduct was called";
    }

    @PatchMapping
    public String patchProduct() {
        return "patchProduct was called";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "deleteProduct was called";
    }
}
