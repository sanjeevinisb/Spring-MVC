package com.xworkz.utensils.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.utensils")
public class UtensilsConfiguration {
    public UtensilsConfiguration(){
        System.out.println("Created UtensilsConfiguration");
    }
}
