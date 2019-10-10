package com.enigma.controllers;
import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.PurchasedRepository;
import com.enigma.services.ProductService;
import com.enigma.services.PurchasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PurchasedController {

    @Autowired
    PurchasedService purchasedService;

    @PostMapping("/purchasing")
    public void purchasing( @RequestBody Purchased purchased){

         purchasedService.purchasing(purchased);
    }

    @GetMapping("/purchases")
    public List<Purchased> listPuschase(){
        return purchasedService.getAllPurchase();
    }
}
