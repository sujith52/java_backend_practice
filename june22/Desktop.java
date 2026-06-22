package com.sujith.DemoApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {
    public void compile(){
        System.out.println("The compilation is faster bcz of nvidia rtx bro");
    }
}
