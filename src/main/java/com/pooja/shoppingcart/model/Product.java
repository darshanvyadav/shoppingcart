package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document(collection = "Products")
public class Product {
    private UUID productId;
    private String productName;
    private String productImageLink;
    private String manufacturer;
    private CategoryName categoryName;
    private float price;
    private Boolean isDeleted;
}
