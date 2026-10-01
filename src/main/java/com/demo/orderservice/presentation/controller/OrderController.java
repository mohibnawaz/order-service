package com.demo.orderservice.presentation.controller;

import com.demo.orderservice.application.service.OrderService;
import com.demo.orderservice.domain.entity.Order;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody Order o) { return service.create(o); }

    @GetMapping
    public List<Order> getAll() { return service.getAll(); }
}