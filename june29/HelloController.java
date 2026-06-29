package com.sujith.SpringSec.Contoller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpSession session){
        return "Hello from the Server !" + session.getId();
    }

}
