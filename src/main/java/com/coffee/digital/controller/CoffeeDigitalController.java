package com.coffee.digital.controller;

import com.coffee.digital.constants.ApiVersion;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Version 1", description = "Version 1 of extract management APIs")
@RestController
@RequestMapping(value = ApiVersion.API_V1 + "/orders")
@RequiredArgsConstructor
public class CoffeeDigitalController {
    @PostMapping(path = "/order")
    public void orderItem() {

    }
}
