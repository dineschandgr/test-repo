package com.example.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    // localhost:8090/test/hello
    @GetMapping("/hello")
    public String test(){
        return "test";
    }

    // localhost:8090/test/demo
    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }

}


