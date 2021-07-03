package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document
public class WishList {
    private UUID wishListId;
    private UUID userId;
    private UUID productId;
    private Boolean isDeleted;
}
