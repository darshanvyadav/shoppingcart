package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.model.Cart;
import com.pooja.shoppingcart.model.CartProduct;
import com.pooja.shoppingcart.model.User;
import com.pooja.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    CartRepository cartRepository;

    @GetMapping(value = "/cart/{userId}")
    public Cart getCartByUserId() {return null;}

    @PostMapping(value = "/cart")
    public Cart createCartByUserId(@RequestBody User user) {
        return null;
    }

    @PutMapping(value = "/cart/{userId}/{productId}")
    public CartProduct updateProductInCart() {return null;}

    @DeleteMapping(value = "/cart/{userId}/{productId}")
    public CartProduct deleteProductInCart() {return null;}
}
