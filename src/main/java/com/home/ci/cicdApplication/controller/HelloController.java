package com.home.ci.cicdApplication.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Gradle : Hello Spring Boot! and Hi all";
    }

}