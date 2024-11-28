package com.workz.key.component;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    public Bike() {
    System.out.println("Created no-arg const of Bike ");
    }

    @Override
    public int minPrice() {
        System.out.println("running minPrice");
        return 50000;
    }

    @Override
    public int maxPrice() {
        System.out.println("running maxPrice");
        return 100000;
    }
}
