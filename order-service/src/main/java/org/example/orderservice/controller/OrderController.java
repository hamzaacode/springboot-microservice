package org.example.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.orderservice.dto.OrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/orders")
    public OrderResponse getOrders() {
        log.info("Get order list successful");

        // Example dummy data
        List<String> orders = List.of("Order 1", "Order 2", "Order 3");

        return new OrderResponse(
                "Fetched order list successfully",
                "SUCCESS",
                orders
        );
    }
}