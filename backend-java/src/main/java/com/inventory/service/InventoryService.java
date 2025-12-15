package com.inventory.service;

import com.inventory.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InventoryService {

    private ArrayList<Product> list = new ArrayList<>();

    public ArrayList<Product> getAll() {
        return list;
    }

    public void add(Product p) {
        list.add(p);
    }

    public Product search(String name) {
        for (Product p : list) {
            if (p.name.equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    public void update(Product updated) {
        Product p = search(updated.name);
        if (p != null) {
            p.quantity = updated.quantity;
            p.price = updated.price;
        }
    }

    public void delete(String name) {
        Product p = search(name);
        if (p != null) list.remove(p);
    }
}
