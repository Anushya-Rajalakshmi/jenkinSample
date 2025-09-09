package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/greet")
    public String greeting(){
        return "hello , this is jenkins sample program and it is edited";
    }
}
