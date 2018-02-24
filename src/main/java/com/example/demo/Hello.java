package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String goTo(){
        return "Hi";
    }
    @RequestMapping("/hello")
    public String hello(@RequestParam (value = "surname",defaultValue = "Burul") String name){
        return "Hello World!" + name;
    }
    @RequestMapping("/hello22")
    public String hello2(){
        return "Hi";
    }
}
