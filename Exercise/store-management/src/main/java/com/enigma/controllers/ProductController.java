package com.enigma.controllers;
import com.enigma.entities.Product;
import com.enigma.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productsService;

    @GetMapping("/product/{id}")
    public Product getByID(@PathVariable String id){
        return productsService.getId(id);
    }

    @PostMapping("/product")

    public void addProduct( @RequestBody Product product){
        productsService.addProduct(product);
    }

    @GetMapping("/products")
    public void getProductList(){
        productsService.getAll();
    }

    @GetMapping("/products/{name}")
    public List<Product> getByName(@PathVariable String name){
        return productsService.getByName(name);
    }

    @GetMapping("/products/{name}/h{quantity}")
    public List<Product> getByNameAndQuantity(@PathVariable String name, @PathVariable Integer quantity){
        return productsService.getByNameAndQuantity(name,quantity);
    }
}
