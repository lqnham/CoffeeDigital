package com.coffee.digital.orders.repository;

import com.coffee.digital.orders.entity.OrderEntity;
import com.coffee.digital.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRepository<OrderEntity, Integer> {
}
