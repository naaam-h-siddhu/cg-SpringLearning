package org.bridgelabz.siddhu.springlearning;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("hello")
    public String printer(){
        return "Hello From BridgeLabs";
    }
}
