package ch.zhaw.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/test")
    public String test() {
return "Hello World app is up and running!"; }
}



