package com.pooja.shoppingcart.repository;

import com.pooja.shoppingcart.model.WishList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WishListRepository extends MongoRepository<WishList, String> {
    public Optional<WishList> findByUserId(String id);
}
