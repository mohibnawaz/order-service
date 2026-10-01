package com.demo.orderservice.domain.repository;

import com.demo.orderservice.domain.entity.Order;
import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAll();
}