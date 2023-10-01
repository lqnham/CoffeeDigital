package com.coffee.digital.orders.service.impl;


import com.coffee.digital.orders.dto.OrderRequest;
import com.coffee.digital.orders.dto.OrderResponse;
import com.coffee.digital.orders.entity.OrderEntity;
import com.coffee.digital.orders.repository.OrderRepository;
import com.coffee.digital.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    @Override
    public OrderResponse order(OrderRequest orderRequest) {
        OrderEntity entity = new OrderEntity();
        entity.setOrderStatus("Placed");
        repository.save(entity);
        return OrderResponse.builder().id(entity.getId())
                .build();
    }
}
