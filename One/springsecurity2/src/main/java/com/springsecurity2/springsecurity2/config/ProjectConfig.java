package com.springsecurity2.springsecurity2.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.springsecurity2.springsecurity2.sercurity.CustomAuthenticationProvider;

@Configuration
public class ProjectConfig 
{
	private final CustomAuthenticationProvider cap;
	
	
	public ProjectConfig(@Lazy CustomAuthenticationProvider cap)
	{
		this.cap = cap;
	}

	
	
	
	

	
	@Bean
	PasswordEncoder passwordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	

	// springboot ??? spring security 3.0 부터 더이상 websecurity? 를 뭘하지않는다?

	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception
	{
		//spring boot starter security의 Basic 인증에 관한 디폴트 기능을 수정없이 그대로 사용하겠다는의미
		http.httpBasic(Customizer.withDefaults());
		
		http.authorizeRequests(c -> c.anyRequest().authenticated()); // 인증받지 않는 사용자는 전부 쳐내라?
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService(DataSource dataSuorce)
	{
		String usersByUsernameQuery =
				"select username, password, enabled from spring.users where username = ?";
		
		String authsByUsernameQuery =
				"select username, password, authority from spring.authorities where username = ?";
		
		var userDetailManager = new JdbcUserDetailsManager(dataSuorce);
		userDetailManager.setUsersByUsernameQuery(usersByUsernameQuery);
		userDetailManager.setAuthoritiesByUsernameQuery(authsByUsernameQuery);
		return userDetailManager;
		
	}
	


}
