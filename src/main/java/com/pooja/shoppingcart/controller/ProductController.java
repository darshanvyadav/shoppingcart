package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping(value = "/Product/{id}")
    public Product getProductById(){return null;}

    @GetMapping(value = "/Product")
    public Product getAllProduct(){return null;}

    @PutMapping(value = "/Product{id}")
    public Product updateProduct(){return null;}

    @PostMapping(value = "/Product")
    public Product createProduct(){return null;}

    @DeleteMapping(value = "/Product{id}")
    public Product deleteProduct(){return null;}
}
