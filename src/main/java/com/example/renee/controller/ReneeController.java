package com.example.renee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReneeController {

    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Version bumped to 0.1";
    }
}
