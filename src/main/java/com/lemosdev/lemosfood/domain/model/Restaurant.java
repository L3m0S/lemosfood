package com.lemosdev.lemosfood.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Restaurant {

    private Long id;

    private String name;

    @Column(name = "shipping_fee")
    private BigDecimal shippingFee;
}
