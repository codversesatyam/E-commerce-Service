package com.ecommerce.ecommerce_service.order;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        String userEmail = "user@test.com";
        return orderService.placeOrder(order, userEmail);
    }
}
