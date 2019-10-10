package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockMvcClientHttpRequestFactory;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoreControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    StoreRepository storeRepository;

    @Test
    public void saveStore_should_return_statusOk() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Store store = new Store("Jajang","Jalan Konoha","Jualan Sarung","096783827");
        mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(store))).andExpect(status().isOk());
    }

    @Test
    public void  store_productShow_should_return_ResponeContent() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Store store = new Store("Jajang","Jalan Konoha","Jualan Sarung","096783827");

         String response =  mockMvc.perform(post("/store")
                 .contentType(MediaType.APPLICATION_JSON)
                 .content(mapper.writeValueAsString(store))).andReturn().getResponse().getContentAsString();

         store = new ObjectMapper().readValue(response, Store.class);

        Assert.assertEquals(store, storeRepository.findById(store.getId()).get());
    }

    @Test
    public void  Store_getAllProduct_should_true_whenSizeEquals_2(){

    }

}