package com.example.ecommerce_KraftBase.service;

import com.example.ecommerce_KraftBase.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product updatedProduct);
    void deleteProduct(Long id);
}
