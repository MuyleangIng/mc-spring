package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RefreshScope
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Value("${user.test.property:default-value}")
    private String testProperty;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/test-property")
    public String getTestProperty() {
        return "Test Property: " + testProperty;
    }
}