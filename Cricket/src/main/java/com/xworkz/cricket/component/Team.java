package com.xworkz.cricket.component;

import org.springframework.beans.factory.annotation.Autowired;

public class Team {

    @Autowired
    private String teamName;

    public Team()
    {
        System.out.println("Created Team");
    }

}
