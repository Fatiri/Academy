package com.enigma.services;
import com.enigma.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);
    public Product getId(String id);
    public List<Product> getAll();
    public void deduct(String id, Integer quantity);
    public BigDecimal deductTotalPrice(String id);
    public List<Product> getByName (String name);
    public List<Product> getProductByStoreId(Integer id);
    public Product save(Product product);

}
