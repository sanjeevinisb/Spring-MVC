package com.xworkz.utensils.configuration;

import com.sun.xml.internal.ws.wsdl.writer.W3CAddressingWSDLGeneratorExtension;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Utensils extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{
    public Utensils()
    {
        System.out.println("Created Utensils");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Created getServletConfigClasses");
        return new Class[]{UtensilsConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("configured urls for DispatcherService");
        return new String[] {"/"};
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resource handling by server itself...");
        configurer.enable();
    }
}