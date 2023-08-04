package com.example.ecommerce_KraftBase.serviceImpl;

import com.example.ecommerce_KraftBase.model.Customer;
import com.example.ecommerce_KraftBase.repository.CustomerRepository;
import com.example.ecommerce_KraftBase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            // Update the customer attributes here
            customer.setName(updatedCustomer.getName());
            customer.setEmail(updatedCustomer.getEmail());

            // Update the customer's relationships (in this case, the One-to-Many relationship with orders)
            customer.setOrders(updatedCustomer.getOrders());

            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

