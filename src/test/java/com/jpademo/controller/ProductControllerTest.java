package com.jpademo.controller;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Ignore
    void getProduct_whenCalled_returnsMessage() {
        assertEquals(productController.getProducts(), "getProduct was called");
    }

    @Ignore
    void getProduct_whenCalled_returnsMessage() {
        assertEquals(productController.createProduct(), "createProduct was called");
    }
    @Ignore
    void updateProduct_whenCalled_returnsMessage() {
        assertEquals(productController.updateProduct(), "updateProduct was called");
    }
    @Ignore
    void patchProduct_whenCalled_returnsMessage() {
        assertEquals(productController.patchProduct(), "patchProduct was called");
    }
    @Ignore

    void deleteProduct_whenCalled_returnsMessage() {
        assertEquals(productController.deleteProduct(), "deleteProduct was called");
    }

}
