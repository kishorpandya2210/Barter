package com.example.Barter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item createPosting(Item item){
        return itemRepository.save(item);
    }
}
