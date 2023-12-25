package edu.icet.service;

import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;

import java.util.List;

public interface InventoryService {
    public Iterable<ItemEntity> getAll();
    void addItem(Item item);
}
