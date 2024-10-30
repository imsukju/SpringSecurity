package com.springsecurity2.springsecurity2.sercurity;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class CustomAuthenticationProvider implements AuthenticationProvider
{
	
	private UserDetailsService uds; //jdbc detail manager
	
	public CustomAuthenticationProvider(UserDetailsService uds)
	{
		this.uds = uds;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		log.info("what is principal : " + authentication.getPrincipal());
		String password = String.valueOf(authentication.getCredentials());
		
		
		UserDetails ud =uds.loadUserByUsername(username);
		if(ud.getUsername().equals(username) && ud.getPassword().equals(password))
		{
			return new UsernamePasswordAuthenticationToken(username, password,Arrays.asList());
		}
		else
		{
			throw new AuthenticationCredentialsNotFoundException("Not Match Error");
		}
		
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
