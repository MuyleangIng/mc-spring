package com.example.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {

    @Value("${user.test.property:dev}")
    private String testProperty;

    @GetMapping("/test-config")
    public String getTestConfig() {
        return "Test Property: " + testProperty;
    }
}