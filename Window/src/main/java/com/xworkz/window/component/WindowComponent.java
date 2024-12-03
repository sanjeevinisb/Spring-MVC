package com.xworkz.window.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class WindowComponent {

    public WindowComponent()
    {
        System.out.println("Created WindowComponent");
    }

    @RequestMapping("/press")
    public String onPress()
    {
        System.out.println("running onPress in WindowComponent");
        return "index.jsp";
    }
}
