package com.securitydemo1.securitydemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig 
{
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetailsService userDetailsService = new InMemoryUserDetailsManager();
		
		return userDetailsService;
		
		
	}
	
	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception
	{
		http.httpBasic(Customizer.withDefaults());
		
		http.authorizeRequests(c -> c.anyRequest().authenticated());
		
		return http.build();
	}
}
