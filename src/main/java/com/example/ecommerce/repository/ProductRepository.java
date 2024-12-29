package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;   
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByNameContaining(String name);  //Generate the SQL request corresponding Select* From product WHERE name LIKE %name%
}

