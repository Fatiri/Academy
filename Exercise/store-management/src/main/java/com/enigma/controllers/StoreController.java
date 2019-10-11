package com.enigma.controllers;
import com.enigma.entities.Store;
import com.enigma.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

     @GetMapping("/store/{id}")
    public Store getStoreById(@PathVariable Integer id){
         return storeService.getStore(id);
     }

     @PostMapping("/store")
    public  Store saveStore(@RequestBody Store store){
         return storeService.save(store);
     }

     @GetMapping("/stores")
    public List<Store> getAll(){
        return storeService.getAll();
     }

     @PostMapping("/delete/{id}")
    public void deleteStoreById(@PathVariable Integer id){
         storeService.delletingStore(id);
     }
}
