package com.pooja.shoppingcart.controller;


import com.pooja.shoppingcart.model.User;
import com.pooja.shoppingcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable String id) {
         return userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("user Not found for the id "+ id));
    }

    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping(value = "/user/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        User userFromDb = userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("user Not found for the id "+ id));
        userFromDb.setAddress(user.getAddress());
        userFromDb.setEmail(user.getEmail());
        userFromDb.setFirstName(user.getFirstName());
        userFromDb.setLastName(user.getLastName());
        userFromDb.setPhoneNumber(user.getPhoneNumber());
        userFromDb.setPassword(user.getPassword());
        userFromDb.setIsDeleted(user.getIsDeleted());
        return userRepository.save(userFromDb);
    }

    @DeleteMapping(value = "/user/{id}")
    public User deleteUser(@PathVariable String id) {
        User userFromDb = userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("user Not found for the id "+ id));
        userFromDb.setIsDeleted(true);
        return userRepository.save(userFromDb);
    }
}
