package com.example.api.service;

import com.example.api.model.Item;
import com.example.api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item getItemById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Item createItem(Item item) {
        return repository.save(item);
    }

    public Item updateItem(Long id, Item itemDetails) {
        Item item = getItemById(id);
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
