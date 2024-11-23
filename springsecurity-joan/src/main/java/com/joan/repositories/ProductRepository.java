package com.joan.repositories;

import org.springframework.data.repository.CrudRepository;

import com.joan.entities.Product;

public interface  ProductRepository extends CrudRepository<Product, Long> {}
