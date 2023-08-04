package com.example.ecommerce_KraftBase.repository;

import com.example.ecommerce_KraftBase.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
