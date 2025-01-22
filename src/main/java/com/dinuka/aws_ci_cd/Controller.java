package com.dinuka.aws_ci_cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloController() {
        return "Hello World";
    }

    @GetMapping("/hello/2")
    public String helloController2() {
        return "Hello World";
    }

    @GetMapping("/hello/3")
    public String helloController3() {
        return "Hello World";
    }
}
