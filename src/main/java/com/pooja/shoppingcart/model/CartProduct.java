package com.pooja.shoppingcart.model;

import lombok.Data;

import java.util.UUID;

@Data
public class CartProduct {
    private UUID ProductId;
    private String productName;
    private Integer quantity;
    private float totalPrice;
}
