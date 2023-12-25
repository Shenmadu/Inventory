package edu.icet.service;

import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;
import edu.icet.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventryServiceImpl implements InventoryService{
    @Autowired
    InventoryRepository repository;
    @Override
    public Iterable<ItemEntity> getAll(){
        return repository.findAll();
    }

    @Override
    public void addItem(Item item) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(item.getName());
        itemEntity.setPrice(item.getPrice());


        repository.save(itemEntity);
    }
}
