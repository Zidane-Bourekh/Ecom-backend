package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                                        //id is immutable

    @Setter
    private String name;
    @Setter
    private String description;

    private double price;                                   //custom setter to avoid negative price
    private int stock;                                      //custom setter to avoid negative stock

    public Product() {} // Constructeur par défaut

    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public void setPrice(double nprice){
        if(nprice<0) throw new IllegalArgumentException("price cannot be negative");
        price = nprice;
    }
    public void setStock(int nstock){
        if(nstock<0) throw new IllegalArgumentException("stock cannot be negative");
        stock = nstock; 
    }

    public void addStock(int n){
        stock +=n;
    }
    
    public void removeStock(int n){
        setStock(stock-n);
    }


}
