package com.jenkins_docker.dockercicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class Demo {
    @GetMapping("/demo")
    public String helloWorld() {
        return "Hello, Dockerized Jenkins!";
    }

//    @GetMapping("/demo2")
//    public String helloWorld2() {
//        return "Hello, Dockerized Jenkins NI !";
//    }
}
