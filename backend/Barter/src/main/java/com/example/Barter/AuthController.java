package com.example.Barter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginDto userLoginDto) {
        boolean isAuthenticated = authService.authenticateUser(userLoginDto.getEmail(), userLoginDto.getPassword());

        if (isAuthenticated) {
            // Login successful
            return ResponseEntity.ok().body("User successfully logged in.");
        } else {
            // Login failed
            return ResponseEntity.badRequest().body("Invalid email or password.");
        }
    }
}