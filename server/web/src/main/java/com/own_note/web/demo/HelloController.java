package com.own_note.web.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Home() {return "Spring Home!\n"; }

    @GetMapping("/hello")
    public  String Hello() {
        return "Hello React! \n";
    }
}
