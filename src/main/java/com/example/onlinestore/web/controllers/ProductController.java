package com.example.onlinestore.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.onlinestore.web.model.Product;

@Controller
public class ProductController {
    private static List<Product> products = new ArrayList<>();
    private static Long idCount = 0L;
    static {
        products.add(new Product(++idCount, "SS-S9", "Samsung Galaxy", 500D, 50, "samsung-s9.png"));
        products.add(new Product(++idCount, "NK-5P", "Nokia 5.1 plus", 60D, 60, null));
        products.add(new Product(++idCount, "IP-7", "iPhone 7", 600D, 30, "iphone-7.png"));
    }

    @GetMapping({"/", "/products"})
    public String action (Model model){
        model.addAttribute("products", products);
        return "list";
    }
}
