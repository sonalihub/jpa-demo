package com.jpademo.controller;

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

    @Test
    void getProduct_whenCalled_returnsMessage() {
        assertEquals(productController.getProduct(), "getProduct was called");
    }

    @Test
    void createProduct_whenCalled_returnsMessage() {
        assertEquals(productController.createProduct(), "createProduct was called");
    }
    @Test
    void updateProduct_whenCalled_returnsMessage() {
        assertEquals(productController.updateProduct(), "updateProduct was called");
    }
    @Test
    void patchProduct_whenCalled_returnsMessage() {
        assertEquals(productController.patchProduct(), "patchProduct was called");
    }
    @Test
    void deleteProduct_whenCalled_returnsMessage() {
        assertEquals(productController.deleteProduct(), "deleteProduct was called");
    }

}
