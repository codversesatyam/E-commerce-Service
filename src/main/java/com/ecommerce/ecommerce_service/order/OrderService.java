package com.ecommerce.ecommerce_service.order;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final KafkaTemplate<String , String> kafkaTemplate;



    public Order placeOrder(Order order, String userEmail) {
        Order savedOrder = orderRepository.save(order);
        kafkaTemplate.send(
                "order-events",
                "Order placed by " + userEmail + " with amount " + savedOrder.getTotalAmount()
        );

        return savedOrder;
    }
}

