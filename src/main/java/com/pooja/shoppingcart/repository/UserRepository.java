package com.pooja.shoppingcart.repository;

import com.pooja.shoppingcart.controller.UserController;
import com.pooja.shoppingcart.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
