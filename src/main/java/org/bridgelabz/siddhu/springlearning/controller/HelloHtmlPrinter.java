package org.bridgelabz.siddhu.springlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloHtmlPrinter {
    @GetMapping("/helloHtml")
    public String htmlPrinter(Model model){
        return "hello";
    }
}
