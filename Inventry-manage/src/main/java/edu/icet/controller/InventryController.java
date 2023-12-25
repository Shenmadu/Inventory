package edu.icet.controller;

import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;
import edu.icet.service.InventoryService;
import edu.icet.service.InventryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")

public class InventryController {

    @Autowired
    InventoryService service;
    @GetMapping("/get-items")
    public Iterable<ItemEntity> getAll(){
        return service.getAll();
    }
    @PostMapping("/add-items")
    public void addItem(@RequestBody Item item){

        service.addItem(item);
    }
}
