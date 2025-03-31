package com.example.ProductManager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite qualquer URL para o React na porta 3000 acessar os recursos na API
        registry.addMapping("/**").allowedOrigins("http://localhost:3000");
    }
}
