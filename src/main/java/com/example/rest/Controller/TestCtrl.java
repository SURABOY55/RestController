package com.example.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCtrl {
    
    @GetMapping("/test")
    public String getRandom() {
        return "TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
    }
}