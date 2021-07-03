package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document
public class Cart {
    @Id
    private UUID cartId;
    private UUID userId;
    private CartProduct cartProduct;
    private float grandTotal;
    private Boolean isDeleted;
}
