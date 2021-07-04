package com.pooja.shoppingcart.controller;

import com.pooja.shoppingcart.model.Product;
import com.pooja.shoppingcart.model.User;
import com.pooja.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/product/{id}")
    public Product getProductById(@PathVariable String id){
        return productRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Product Not found for the id "+ id));
    }

    @GetMapping(value = "/product")
    public List<Product> getAllProduct(){
        return  productRepository.findAll();
    }

    @PostMapping(value = "/product/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product){
        Product productFromDb = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product Not found for the id " + id));
        productFromDb.setProductName(product.getProductName());
        productFromDb.setPrice(product.getPrice());
        productFromDb.setProductImageLink(product.getProductImageLink());
        productFromDb.setCategoryName(product.getCategoryName());
        productFromDb.setManufacturer(product.getManufacturer());
        productFromDb.setIsDeleted(product.getIsDeleted());
        return productRepository.save(productFromDb);
    }

    @PostMapping(value = "/product")
    public Product createProduct(@RequestBody Product product){return productRepository.save(product);}

    @DeleteMapping(value = "/product/{id}")
    public Product deleteProduct(@PathVariable String id){
        Product productFromDb = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product Not found for the id " + id));
        productFromDb.setIsDeleted(true);
        return productRepository.save(productFromDb);
    }
}
