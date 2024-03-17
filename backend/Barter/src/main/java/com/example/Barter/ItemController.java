package com.example.Barter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public Item createPosting(@RequestBody Item item){
        return itemService.createPosting(item);
    }
}
