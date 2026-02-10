package com.ecommerce.ecommerce_service.order;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;
    private Double totalAmount;

    public Order() {}

    public Order(String userEmail, Double totalAmount) {
        this.userEmail = userEmail;
        this.totalAmount = totalAmount;
    }

}

