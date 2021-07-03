package com.pooja.shoppingcart.repository;

import com.pooja.shoppingcart.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartRepository extends MongoRepository<Cart, UUID> {
}
