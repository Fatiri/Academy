package com.enigma.services;
import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.PurchasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchasedServiceImpl implements PurchasedService {

    @Autowired
    PurchasedRepository purchasedRepository;

    @Autowired
    ProductService productService;

    @Override
    public void purchasing(Purchased purchased) {

        productService.deduct(purchased.getProductId(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.deductTotalPrice(purchased.getProductId()));
        purchasedRepository.save(purchased);

    }

    @Override
    public List<Purchased> getAllPurchase() {
        return purchasedRepository.findAll();
    }


}
