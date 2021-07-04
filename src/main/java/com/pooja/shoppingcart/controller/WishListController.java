package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.model.WishList;
import com.pooja.shoppingcart.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishListController {

    @Autowired
    WishListRepository wishListRepository;

    @GetMapping(value = "/wishlist/{uid}")
    public WishList getWishListById(@PathVariable String id) {
        return wishListRepository.findByUserId(id).orElseThrow(() ->
                new RuntimeException("WishList Not found for the user id "+ id));
    }

    @PostMapping(value = "/wishlist")
    public WishList createWishList(@RequestBody WishList wishList) {
        return wishListRepository.save(wishList);
    }

    @PostMapping(value = "/wishlist/{userId}")
    public WishList createWishList(@RequestBody WishList wishList, @PathVariable String userId) {
        WishList wishListFromDb = wishListRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("WishList Not found for the user id " + userId));
        wishListFromDb.setIsDeleted(wishList.getIsDeleted());
        wishListFromDb.setProductIds(wishList.getProductIds());
        return wishListRepository.save(wishListFromDb);
    }

    @DeleteMapping(value = "/wishlist/{userId}/{productId}")
    public WishList deleteWishListById( @PathVariable String userId) {
        WishList wishListFromDb = wishListRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("WishList Not found for the user id " + userId));
        wishListFromDb.setIsDeleted(true);
        return wishListRepository.save(wishListFromDb);
    }
}
