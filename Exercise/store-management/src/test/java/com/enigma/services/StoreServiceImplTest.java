package com.enigma.services;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceImplTest {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    StoreService storeService;

    @Test
    public void Store_save_expected_created(){
     Store store = new Store("Jajang","Jalan Konoha","Jualan Sarung","096783827");
     Store result = storeService.save(store);
     Store getStore = storeRepository.findById(result.getId()).get();
     assertEquals(result, getStore);

    }

    @Test
    public void Store_getAllProduct_should_true_whenSizeEquals_2(){
        Store newStore1 = new Store("Nao","Jalan Sunagaka","Jualan Celana","096783827");
        Store newStore2 = new Store("Mui","Jalan Konoha","Jualan Sarung","096783827");

        storeService.save(newStore1);
        storeService.save(newStore2);

     assertEquals(2, storeRepository.findAll().size());
    }

    @Test
    public void store_productShow_when_getProduct_byId(){

    }

}