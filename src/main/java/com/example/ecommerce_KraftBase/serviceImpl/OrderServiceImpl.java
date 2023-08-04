package com.example.ecommerce_KraftBase.serviceImpl;

import com.example.ecommerce_KraftBase.model.Order;
import com.example.ecommerce_KraftBase.repository.OrderRepository;
import com.example.ecommerce_KraftBase.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order updateOrder(Long id, Order updatedOrder) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            // Update the order attributes here
            order.setOrderDate(updatedOrder.getOrderDate());
            order.setTotalAmount(updatedOrder.getTotalAmount());

            // Update the order's relationships (in this case, the Many-to-One relationship with customers and the Many-to-Many relationship with products)
            order.setCustomer(updatedOrder.getCustomer());
            order.setProducts(updatedOrder.getProducts());

            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

