package com.pooja.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "WishList")
@Data
public class WishList {
    @Id
    private String wishListId;
    private String userId;
    private List<String> productIds;
    private Boolean isDeleted;
}
