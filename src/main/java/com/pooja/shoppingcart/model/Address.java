package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;
}
