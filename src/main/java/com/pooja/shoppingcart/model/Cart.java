package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;


@Document(collection = "Cart")
@Data
public class Cart {
    @Id
    private String cartId;
    private String userId;
    private List<CartProduct> cartProduct;
    private float grandTotal;
    private Boolean isDeleted;
}
