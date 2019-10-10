package com.enigma.services;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @Test
    public void product_addProduct_expected_added(){
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        Product result = productService.addProduct(product);
        Product added = productRepository.findById(result.getId()).get();
        assertEquals(result, added);

    }

    @Test
    public void product_getAllProduct_showing_whenSizeEquals_3(){
        Product product1 = new Product("Sasuke Saringan",10, BigDecimal.valueOf(0));
        Product product2 = new Product("Sasuke Suriken",10, BigDecimal.valueOf(0));
        Product product3 = new Product("Sasuke Bunsin",10, BigDecimal.valueOf(0));
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        assertEquals(3, productRepository.findAll().size());
    }

    @Test
    public void product_save_when_quantityReduced(){
        Integer quantity = 2;
        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(0));
        Integer result = product.getQuantity()-quantity;
        product.deductQuantity(quantity);
        Product fuck = productService.addProduct(product);

        assertEquals(result,fuck.getQuantity());
    }

    @Test
    public void product_save_when_priceMultiplied_byQuantity(){
        Product product1 = new Product("Sasuke Saringan",10, BigDecimal.valueOf(0));

    }





}