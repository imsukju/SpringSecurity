package com.mych09_03.mych09_03.filter;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.security.web.csrf.CsrfToken;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CsrfTokkenLogger implements Filter{
	// TODO Auto-generated method stub
	Logger logger = Logger.getLogger(CsrfTokkenLogger.class.getName());
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		Object o = request.getAttribute("_csrf");
		CsrfToken token = (CsrfToken) o;
		logger.info("CSRF token" + token.getToken());
	}

}
