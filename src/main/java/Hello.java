package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String hello(@RequestParam (value = "name",defaultValue = "Burul") String name){
        return "Hello World!" + name;
    }
}
