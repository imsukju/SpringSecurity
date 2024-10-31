package com.mych09_01.mych09_01.filter;

import java.io.IOException;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class StaticKeyAuthenticationFilter implements Filter
{
	@Value("${authorization.key}")
	private String authorizationKey;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		var httpRequest = (HttpServletRequest)request;
		var httpResponse = (HttpServletResponse)response;
		
		String authentication = httpRequest.getHeader("Authorization");
		
		if(authorizationKey.equals(authentication))
		{
			chain.doFilter(request,response);
		}
		else
		{
			httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}

}
