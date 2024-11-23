package com.xworkz.mobile.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Mobile extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public Mobile(){
        System.out.println("Created Mobile");

    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Created getServletConfigClasses");
        return new Class[] {MobileConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};

    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resource handling by server itself...");
        configurer.enable();
    }

}
