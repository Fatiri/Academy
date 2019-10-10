package com.enigma.controllers;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import com.enigma.repositories.ProductRepository;
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
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ProductRepository productRepository;

    @Test
    public void getByID() throws Exception {

    }

    @Test //Controller Add Product status
    public void addProduct_should_return_statusOk() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        mockMvc.perform(post("/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(product))).andExpect(status().isOk());
    }

    @Test
    public void  product_productShow_should_return_ResponeContent() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        String response =  mockMvc.perform(post("/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(product))).andReturn().getResponse().getContentAsString();

        product = new ObjectMapper().readValue(response, Product.class);

        Assert.assertEquals(product, productRepository.findById(product.getId()).get());
    }

    @Test
    public void getProductList() throws Exception {

    }

    @Test
    public void getByName() {
    }

    @Test
    public void getByNameAndQuantity() {
    }
}