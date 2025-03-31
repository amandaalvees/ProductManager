package com.example.ProductManager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProductManager.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}