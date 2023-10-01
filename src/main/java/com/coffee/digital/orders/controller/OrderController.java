package com.coffee.digital.orders.controller;

import com.coffee.digital.core.constants.ApiVersion;
import com.coffee.digital.orders.dto.OrderRequest;
import com.coffee.digital.orders.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Version 1", description = "Version 1 of Orders APIs")
@RestController
@RequestMapping(value = ApiVersion.API_V1 + "/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;
    @PostMapping(path = "/order")
    public void orderItem(@Valid OrderRequest orderRequest) {
        service.order(orderRequest);
    }
}
