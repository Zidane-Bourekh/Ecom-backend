package com.example.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Long id, String email, String password) {
        Customer c = new Customer(id, email, password);
        customerRepository.save(c);
    }

    public void removeCustomer(Long id) {
        Optional<Customer> c = customerRepository.findById(id);
        if (c.isEmpty())
            throw new IllegalArgumentException("This customer does not exist");
        customerRepository.delete(c.get());
    }
    

}
