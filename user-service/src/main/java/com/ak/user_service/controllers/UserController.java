package com.ak.user_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public ResponseEntity<String> getUserInfo() {
        return ResponseEntity.ok().body("Response coming from user service on port: " + port);
    }
}
