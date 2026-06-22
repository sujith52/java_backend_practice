package com.sujith.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Alien {
    @Autowired
    @Qualifier("desktop")
    private Computer comp;

//    public Alien(Laptop laptop){
//        this.laptop = laptop;
//    }
//    @Autowired
//    public  void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();

        System.out.println("The alien class has building the things !");
    }
}
