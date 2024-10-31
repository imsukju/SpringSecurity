package com.mych09_01.mych09_01.init;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import com.mych09_01.mych09_01.filter.LoggingFilter;

import jakarta.servlet.FilterRegistration;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

@Component
public class CustomServletContext implements ServletContextInitializer 
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("loggingFilter", new LoggingFilter());
		// TODO Auto-generated method stub
		
		filterRegistration.addMappingForUrlPatterns(null, false, "/*");

	}

}
