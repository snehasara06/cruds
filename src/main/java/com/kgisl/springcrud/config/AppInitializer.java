package com.kgisl.springcrud.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
    {System.out.println("AppInitializer");}
    @Override
    protected Class<?>[] getRootConfigClasses() {
     return new Class[] {AppContext.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    return new Class[] {MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
       return new String[]{"/"};
    }

    
}
