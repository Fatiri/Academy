package com.enigma.services;
import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Override
    public Store save(Store store) {
        storeRepository.save(store);
        return store;
    }

    @Override
    public Store getStore(Integer id) {
        if (!storeRepository.findById(id).isPresent()) {

        }
        return storeRepository.findById(id).get();
    }

    @Override
    public List<Store> getAll() {
      return storeRepository.findAll();
    }

    @Override
    public void delletingStore(Integer id) {
          storeRepository.deleteById(id);
    }
}
