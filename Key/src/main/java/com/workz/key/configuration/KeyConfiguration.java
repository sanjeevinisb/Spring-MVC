package com.workz.key.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.workz.key")
public class KeyConfiguration {
    public KeyConfiguration() {
        System.out.println("Created KeyConfiguration");
    }

    @Bean
    public String lockType() {
        System.out.println("registering lockType with spring");
        return "Knob lock";
    }

    @Bean
    public String brand() {
        System.out.println("registering brand with spring");
        return "Ozone";
    }

    @Bean
    public String anotherLockType() {
        System.out.println("registering anotherLockType with spring");
        return "Deadbolt lock";
    }
}
