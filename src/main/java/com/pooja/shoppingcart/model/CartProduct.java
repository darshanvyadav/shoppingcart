package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class CartProduct {
    private String ProductId;
    private String productName;
    private Integer quantity;
    private float totalPrice;
}
