package com.example.ssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/info")
    public String info() {
        return "Leshkovych Oleksandra KP-23";
    }
}
