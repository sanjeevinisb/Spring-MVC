package com.xworkz.window.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.window")
public class WindowConfiguration {

    public WindowConfiguration()
    {
        System.out.println("Created WindowConfiguration");
    }
}
