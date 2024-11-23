package com.xworkz.mobile.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mobile")
public class MobileConfiguration {
    public MobileConfiguration(){
        System.out.println("Created MobileConfiguration");
    }
}
