package com.joan.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joan.entities.Product;
import com.joan.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @GetMapping()
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id) {
        Optional<Product> productOptional =  productService.findById(id);
        productOptional.ifPresent( product -> );
    }

}
