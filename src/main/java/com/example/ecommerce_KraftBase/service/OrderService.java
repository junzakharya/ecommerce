package com.example.ecommerce_KraftBase.service;

import com.example.ecommerce_KraftBase.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order updateOrder(Long id, Order updatedOrder);
    void deleteOrder(Long id);
}
