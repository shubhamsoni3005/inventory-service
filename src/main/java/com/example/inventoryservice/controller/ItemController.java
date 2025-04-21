package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final List<Map<String, Object>> items = new ArrayList<>();

    @GetMapping
    public List<Map<String, Object>> getItems() {
        return items;
    }

    @PostMapping
    public Map<String, Object> addItem(@RequestBody Map<String, Object> item) {
        items.add(item);
        return item;
    }
}
