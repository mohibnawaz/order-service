package com.demo.orderservice.application.service;

import com.demo.orderservice.domain.entity.Order;
import java.util.List;

public interface OrderService {
    Order create(Order o);
    List<Order> getAll();
}