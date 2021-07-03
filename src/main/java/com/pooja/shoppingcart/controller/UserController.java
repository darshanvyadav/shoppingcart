package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.dto.UserDomain;
import com.pooja.shoppingcart.model.User;
import com.pooja.shoppingcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired


    @GetMapping(value = "/user")
    public User getUser() {return null;}

    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping(value = "/user")
    public User updateUser() {return null;}

    @DeleteMapping(value = "/user")
    public User deleteUser() {return null;}
}
