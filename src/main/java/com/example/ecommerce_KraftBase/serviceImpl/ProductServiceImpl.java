package com.example.ecommerce_KraftBase.serviceImpl;

import com.example.ecommerce_KraftBase.model.Product;
import com.example.ecommerce_KraftBase.repository.ProductRepository;
import com.example.ecommerce_KraftBase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            // Update the product attributes here
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setStockQuantity(updatedProduct.getStockQuantity());

            // Update the product's relationships (in this case, the Many-to-Many relationship with orders)
            product.setOrders(updatedProduct.getOrders());

            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

