package com.demo.orderservice.application.service.impl;

import com.demo.orderservice.application.service.OrderService;
import com.demo.orderservice.domain.entity.Order;
import com.demo.orderservice.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repo;

    public OrderServiceImpl(OrderRepository repo) {
        this.repo = repo;
    }

    public Order create(Order o) { return repo.save(o); }
    public List<Order> getAll() { return repo.findAll(); }
}