package com.demo.orderservice.infrastructure.repository;

import com.demo.orderservice.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order, Long> {
}