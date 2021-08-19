package com.viltgroup.adobeRestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityTester {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }
}
