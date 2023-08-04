package com.example.ecommerce_KraftBase.repository;

import com.example.ecommerce_KraftBase.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
