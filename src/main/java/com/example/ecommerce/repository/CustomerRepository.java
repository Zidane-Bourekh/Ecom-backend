package com.example.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
    public List<Customer> findByEmailContaining(String email);
}
