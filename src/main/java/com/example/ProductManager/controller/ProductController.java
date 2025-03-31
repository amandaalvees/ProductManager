package com.example.ProductManager.controller;


import com.example.ProductManager.model.Product;
import com.example.ProductManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000") // Permite chamadas do react
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = service.findById(id);
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        // Verifica se o produto existe
        Optional<Product> existingProduct = service.findById(id);
        if (!existingProduct.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        // Atualiza os campos do produto existente
        Product updatedProduct = existingProduct.get();
        updatedProduct.setName(product.getName());
        updatedProduct.setDescription(product.getDescription());
        updatedProduct.setPrice(product.getPrice());

        // Salva o produto atualizado
        Product savedProduct = service.save(updatedProduct);
        return ResponseEntity.ok(savedProduct);
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}