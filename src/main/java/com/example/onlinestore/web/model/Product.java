package com.example.onlinestore.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
   
    private Long id;
    private String code;
    private String name;
    private Double price;
    private Integer quantity;
    private String image;

    
}
