package com.coffee.digital.orders.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRequest {
    private String status;
}
