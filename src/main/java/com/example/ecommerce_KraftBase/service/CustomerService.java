package com.example.ecommerce_KraftBase.service;

import com.example.ecommerce_KraftBase.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer updatedCustomer);
    void deleteCustomer(Long id);
}
