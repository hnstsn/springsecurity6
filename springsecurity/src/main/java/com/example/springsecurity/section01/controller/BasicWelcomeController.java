package com.example.springsecurity.section01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicWelcomeController {

    @GetMapping("/basic/welcome")
    public String welcome() {
        return "welcome basic spring security";
    }
}
