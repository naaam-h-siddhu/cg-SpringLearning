package org.bridgelabz.siddhu.springlearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String mapping(){
        return "Hello from Bridgelabz";
    }
}
