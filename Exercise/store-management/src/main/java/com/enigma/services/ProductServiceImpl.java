package com.enigma.services;
import com.enigma.entities.Product;
import com.enigma.entities.Store;
import com.enigma.exception.InsufficientQuantityException;
import com.enigma.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StoreService storeService;

    @Override
    public Product addProduct(Product product) {

        productRepository.save(product);

        return product;
    }

    @Override
    public Product getId(String id) {
        if (!productRepository.findById(id).isPresent()) {
            return new Product();
        }
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void deduct(String id, Integer quantity) {

     Product product = getId(id);

     if (product.getQuantity()<quantity){
        throw  new InsufficientQuantityException();
     }

         product.deductQuantity(quantity);
         addProduct(product);
    }

    @Override
    public BigDecimal deductTotalPrice(String id) {

        return getId(id).getPrice();
    }

    @Override
    public List<Product> getByName(String name) {

        return productRepository.findAllByNameContains(name);
    }

    @Override
    public List<Product> getProductByStoreId(Integer id) {
        Store store = storeService.getStore(id);
        return store.getProducts();
    }

    @Override
    public Product save(Product product) {
        Store store = Product.getStore();
        product.setStore(store);
        return productRepository.save(product);
    }
}
