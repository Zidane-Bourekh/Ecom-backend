package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
    
    private Long id;
    private String email;
    private String password;

    public Customer() {}
    
    public Customer(Long id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }





}
