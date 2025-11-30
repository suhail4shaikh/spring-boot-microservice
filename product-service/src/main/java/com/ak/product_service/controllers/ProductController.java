package com.ak.product_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public ResponseEntity<String> getInfo() {
        return ResponseEntity.ok().body("Response coming from product service on port: " + port);
    }
}
