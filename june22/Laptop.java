package com.sujith.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
//@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("The compilation is doing this on i dont knpw");
    }
}
