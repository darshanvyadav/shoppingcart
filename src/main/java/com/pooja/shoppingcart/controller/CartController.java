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
    public Cart getCartByUserId(@PathVariable String userId) {
        return cartRepository.findByUserId(userId).orElseThrow(() ->
                new RuntimeException("Cart Not found for the id "+ userId));
    }

    @PostMapping(value = "/cart")
    public Cart createCartByUserId(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    @PostMapping(value = "/cart/{userId}")
    public Cart updateProductInCart(@PathVariable String userId, @RequestBody Cart cart) {
        Cart cartFromDb = cartRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cart Not found for the id " + userId));
        cartFromDb.setCartProduct(cart.getCartProduct());
        cartFromDb.setIsDeleted(cart.getIsDeleted());
        cartFromDb.setGrandTotal(cart.getGrandTotal());
        return cartRepository.save(cartFromDb);
    }
    @DeleteMapping(value = "/cart/{userId}")
    public Cart deleteProductInCart(@PathVariable String userId) {
        Cart cartFromDb = cartRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cart Not found for the id " + userId));
        cartFromDb.setIsDeleted(true);
        return cartRepository.save(cartFromDb);
    }
}
