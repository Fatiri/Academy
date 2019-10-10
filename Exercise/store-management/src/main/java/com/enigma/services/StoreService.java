package com.enigma.services;
import com.enigma.entities.Store;
import java.util.List;

public interface StoreService {

    public Store save(Store store);
    public Store getStore(Integer id);
    List<Store> getAll();
}
