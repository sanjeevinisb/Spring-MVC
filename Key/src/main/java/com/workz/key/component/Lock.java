package com.workz.key.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Lock {

    @Qualifier("lockType")
    private String name;

    public Lock() {
        System.out.println("Created no-arg const of Lock");
    }
}
