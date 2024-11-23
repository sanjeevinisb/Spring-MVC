package com.xworkz.utensils.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Spoon {
    public Spoon(){
        System.out.println("Created spoon");
    }
}
