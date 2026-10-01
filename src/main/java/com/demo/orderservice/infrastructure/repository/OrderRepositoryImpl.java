package com.demo.orderservice.infrastructure.repository;

import com.demo.orderservice.domain.entity.Order;
import com.demo.orderservice.domain.repository.OrderRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final OrderJpaRepository jpaRepo;

    public OrderRepositoryImpl(OrderJpaRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    public Order save(Order o) { return jpaRepo.save(o); }
    public Optional<Order> findById(Long id) { return jpaRepo.findById(id); }
    public List<Order> findAll() { return jpaRepo.findAll(); }
}