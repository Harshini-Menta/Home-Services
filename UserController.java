package com.home.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.entity.UserInfo;
import com.home.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<String> registerUser(@RequestBody UserInfo user) {
        userService.register(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/logins")
    public ResponseEntity<String> loginUser(@RequestBody UserInfo user) {
        // Implement user login logic and authentication here
        if (userService.authenticate(user)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Login failed");
        }
    }
    @GetMapping("/user/{userId}")
    public UserInfo getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
}
}