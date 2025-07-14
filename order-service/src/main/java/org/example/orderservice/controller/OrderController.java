package org.example.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @GetMapping("/orders")
    public String getOrders() {
        System.out.println("getOrders");
        log.info("Get order list successful");
        return "Order Service: List of orders";
    }
}