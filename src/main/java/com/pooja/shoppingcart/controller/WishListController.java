package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.model.WishList;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishListController {

    @GetMapping(value = "/wishlist/{userId}")
    public WishList getWishListById() {return null;}

    @PostMapping(value = "/wishlist/{userId}/{productId}")
    public WishList createWishList() {return null;}

    @DeleteMapping(value = "/wishlist/{userId}/{productId}")
    public WishList deleteWishListById() {return null;}
}
