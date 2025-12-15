package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*") 
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product p) {
        service.add(p);
    }

    @GetMapping("/search/{name}")
    public Product search(@PathVariable String name) {
        return service.search(name);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product p) {
        service.update(p);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteProduct(@PathVariable String name) {
        service.delete(name);
    }
}
