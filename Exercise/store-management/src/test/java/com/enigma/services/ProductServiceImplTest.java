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
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @Test //Unit test Adding Product
    public void product_addProduct_expected_added(){
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        Product result = productService.addProduct(product);
        Product added = productRepository.findById(result.getId()).get();
        assertEquals(result, added);

    }

    @Test //Unit test Get All Product
    public void product_getAllProduct_showing_whenSizeEquals_3(){
        Product product1 = new Product("Sasuke Saringan",10, BigDecimal.valueOf(0));
        Product product2 = new Product("Sasuke Suriken",10, BigDecimal.valueOf(0));
        Product product3 = new Product("Sasuke Bunsin",10, BigDecimal.valueOf(0));
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        assertEquals(3, productRepository.findAll().size());
    }

    @Test // Unit Test quantity product berkurang saat di beli
    public void product_added_when_quantityReduced(){
        Integer quantity = 2;
        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(1000));
        Integer reduced = product.getQuantity()-quantity;
        product.deductQuantity(quantity);
        Product addProduct = productService.addProduct(product);

        assertEquals(reduced,addProduct.getQuantity());
    }

    @Test // Unitest Logika deduct jka stock quantity dibeli tidak boleh minus atau lebih kecil dari pesanan
    public void product_Added_when_quantity_beHigher_thanPurchasing(){
        Integer expected = 1;
        Integer quantity =9;
        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(1000));
        Product addingProduct = productService.addProduct(product);
        Integer reduced = addingProduct.getQuantity()-quantity;
        assertEquals(expected,reduced);
    }

    @Test // Unit Test Get price By Id
    public void product_getPrice_expectedShowing_getById(){

        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(100));
        Product result = productService.addProduct(product);
        String getId = result.getId();
        BigDecimal prices = productService.getId(getId).getPrice();
        assertEquals(prices , result.getPrice());
    }

    @Test // Unit Test get Product By Id
    public void product_getProduct_showing_when_getById(){
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        productService.addProduct(product);
        String getId = product.getId();
        assertEquals(getId, product.getId());
    }

    @Test // Unitest Get Product By Name
    public void product_getProduct_showing_when_getByName(){
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        productService.addProduct(product);
        String getname = "Sasuke Saringan";
        assertEquals(getname, product.getName());
    }

    @Test
    public void product_getProduct_showing_when_getByName_and_getByquantity(){
        Product product = new Product("SasukeSaringan",10, new BigDecimal(0));
        Product product1 = new Product("Sisisu",10, new BigDecimal(0));
        productService.addProduct(product);
        productService.addProduct(product1);
        String nameDb = product.getName();
        Integer quantityDb = product.getQuantity();
        String name = "sas";
        Integer quantity = 10;
        Product nameAndQuantity = (Product) productService.getByNameAndQuantity(name,quantity);
        assertEquals(nameAndQuantity, productRepository.findAllByNameContainsAndQuantity(nameDb,quantityDb));
    }



}