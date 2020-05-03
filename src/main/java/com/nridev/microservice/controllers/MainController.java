package com.nridev.microservice.controllers;

import com.nridev.microservice.models.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/helloWorld")
    public HelloWorld helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloWorld(counter.incrementAndGet(),
                String.format(template, name));
    }

}
