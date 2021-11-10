package com.refactorizando.example.custom.starter.controllers;

import com.refactorizando.example.starter.time.logging.TimeLogging;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping 
public class ApiController {

    @GetMapping
    @TimeLogging
    public String sayHi() {
        return "HI !!!";
    }
}
