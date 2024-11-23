package com.xworkz.fan.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(" com.xworkz.fan")
public class FanConfiguration {

    public FanConfiguration()
    {

        System.out.println("Created FanConfiguration");
    }
}
