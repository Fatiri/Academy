package com.enigma.services;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
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
        Integer quantity = 11;
        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(1000));
        Integer reduced = product.getQuantity()-quantity;
        product.deductQuantity(quantity);
        Product addProduct = productService.addProduct(product);

        assertEquals(reduced,addProduct.getQuantity());
    }

    @Test // Unitest Logika deduct jka stock quantity dibeli tidak boleh minus atau lebih kecil dari pesanan
    public void product_Added_when_quantity_beHigher_thanPurchasing(){
        Integer quantity = 11;
        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(1000));
        Product addingProduct = productService.addProduct(product);
        String getId = addingProduct.getId();

        assertTrue(quantity < productService.getId(getId).getQuantity());
    }

    @Test // Unit Test Get price By Id
    public void product_getPrice_expectedShowing_getById(){

        Product product = new Product("Sasuke Saringan",10, BigDecimal.valueOf(100,00));
        Product result = productService.addProduct(product);
        String getId = result.getId();
        BigDecimal prices = result.getPrice();

        assertEquals(prices ,productService.getId(getId).getPrice() );
    }

    @Test // Unit Test get Product By Id
    public void product_getProduct_showing_when_getById(){
        Product expected = new Product("Sasuke Saringan",10, new BigDecimal(0));
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        productService.addProduct(product);
        String getId = product.getId();

        assertEquals(expected, productRepository.findById(getId).get());
    }

    @Test // Unitest Get Product By Name
    public void product_getProduct_showing_when_getByName(){
        Product product = new Product("Sasuke Saringan",10, new BigDecimal(0));
        Product product1 = new Product("sokur Saringan",10, new BigDecimal(0));
        Product product2 = new Product("sasuna Saringan",10, new BigDecimal(0));
        Product product3 = new Product("Mona Saringan",10, new BigDecimal(0));
        productService.addProduct(product);
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
        String getname = "lpo";
        List<Product> products = productService.getByName(getname);

        assertEquals(products, productRepository.findAllByNameContains(getname));
    }



}