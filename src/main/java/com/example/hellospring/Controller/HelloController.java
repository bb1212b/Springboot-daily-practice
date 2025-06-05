package com.example.hellospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, 백엔더 주원이의 API 만들기!! ";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
