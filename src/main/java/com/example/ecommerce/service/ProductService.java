package com.example.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product p) {
        productRepository.save(p);
    }

    public Product getProduct(long id) {
        Optional<Product> productOpt = productRepository.findById(id);
        if(productOpt.isPresent()) return productOpt.get();
        throw new IllegalArgumentException("This product doesn' exist");
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(long id, Product p){
        Product existingProduct = getProduct(id);
        existingProduct.setDescription(p.getDescription());
        existingProduct.setName(p.getName());
        existingProduct.setPrice(p.getPrice());
        existingProduct.setStock(p.getStock());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(long id){
        productRepository.deleteById(id);
    }


}
