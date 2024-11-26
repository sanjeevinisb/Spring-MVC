package com.xworkz.cricket.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Cricket")
public class CricketConfiguration {
        public CricketConfiguration(){
            System.out.println("Created CricketConfiguration");
        }

        @Bean
        public String teamName()
        {
            System.out.println("registering teamName with spring");
            String teamName = new String("RCB");
            return teamName;
        }
        @Bean
        public double budget()
        {
            System.out.println("registering budget with spring");
            return 300000.00;
        }
        @Bean
        public String ownerName()
        {
            System.out.println("registering owner name with spring");
            String ownerName = new String ("Prathmesh");
            return ownerName;
        }
        @Bean
        public double batCost()
        {
            System.out.println("registering bat cost with spring");
            return 2500.00;
        }

        @Bean
        public double ballCost()
        {
            System.out.println("registering ball cost with spring");
            return 1500.00;
        }

    }


