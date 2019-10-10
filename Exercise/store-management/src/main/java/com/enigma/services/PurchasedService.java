package com.enigma.services;
import com.enigma.entities.Purchased;

import java.util.List;

public interface PurchasedService {

    public void purchasing(Purchased purchased);
    public  List<Purchased> getAllPurchase();

}
