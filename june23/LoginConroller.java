package com.sujith.SimpleApp.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginConroller {

    @RequestMapping("/login")
    public String login(){
        return "The login page is in the server !";
    }
}
