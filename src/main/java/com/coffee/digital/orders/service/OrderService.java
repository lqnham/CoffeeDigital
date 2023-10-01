package com.coffee.digital.orders.service;

import com.coffee.digital.orders.dto.OrderRequest;
import com.coffee.digital.orders.dto.OrderResponse;

public interface OrderService {

    OrderResponse order(OrderRequest orderRequest);
}
