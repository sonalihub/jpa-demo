package com.jpademo.service.impl;

import com.jpademo.helper.Patch;
import com.jpademo.entity.Product;
import com.jpademo.repository.ProductRepository;
import com.jpademo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        Product product1=new Product();
      /*  product1.setId(1);
        product1.setPrice(100);
        product1.setPname("chair");
        product1.setBatchno("1");
        product1.setNoofproduct(1);
        productRepository.saveAndFlush(product1);*/
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchProductList() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product productDb = productRepository.getById(id);

        if (Objects.nonNull(product.getPname()) && !"".equalsIgnoreCase(product.getPname()))
            productDb.setPname(product.getPname());

        if (Objects.nonNull(product.getBatchno()) && !"".equalsIgnoreCase(product.getBatchno()))
            productDb.setBatchno(product.getBatchno());

        if (Objects.nonNull(product.getPrice()))
            productDb.setPrice(product.getPrice());

        return productRepository.save(productDb);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product patchProduct(Integer id, Product incompleteProduct) throws IllegalAccessException {
        Product existingProd= productRepository.getById(id);
        Patch.internPatcher(existingProd,incompleteProduct);
        return productRepository.save(existingProd);
    }

}
