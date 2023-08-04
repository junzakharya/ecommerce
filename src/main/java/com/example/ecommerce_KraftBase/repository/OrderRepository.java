package com.example.ecommerce_KraftBase.repository;

import com.example.ecommerce_KraftBase.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
