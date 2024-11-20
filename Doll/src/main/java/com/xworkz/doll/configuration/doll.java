package com.xworkz.doll.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class doll extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public doll()
    {
        System.out.println("Created Doll");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
    String[] urls={"/"};
        System.out.println("configured urls for DispatcherService");
        return urls;
}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    System.out.println("Enable static resource handling by server itself...");
    configurer.enable();
}
}


