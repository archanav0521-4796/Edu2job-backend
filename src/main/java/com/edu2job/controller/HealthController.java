package com.edu2job.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Edu2Job Backend is Running!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}