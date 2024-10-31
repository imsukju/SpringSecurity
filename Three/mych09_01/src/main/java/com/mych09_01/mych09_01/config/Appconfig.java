package com.mych09_01.mych09_01.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.mych09_01.mych09_01.filter.LoggingFilter;
import com.mych09_01.mych09_01.filter.StaticKeyAuthenticationFilter;

@Configuration
public class Appconfig 
{
	private StaticKeyAuthenticationFilter skaFilter;
	
	public Appconfig(StaticKeyAuthenticationFilter skaFilter)
	{
		this.skaFilter = skaFilter;
	}

	 @Bean
	    public UserDetailsService userDetailsService() {
	        var manager = new InMemoryUserDetailsManager();

	        var user1 = User.withUsername("john")
	                        .password("12345")
//	                        .roles("ADMIN")
	                        .authorities("ROLE_ADMIN","read","premium")
	                        .build();

	        var user2 = User.withUsername("jane")
	                        .password("12345")
	                        .authorities("read")
	                        .build();
	        
	        var user3 = User.withUsername("bill")
		                .password("12345")
		                .authorities("read","premium")
		                .build();
	        var user4 = User.withUsername("kris")
	                .password("12345")
	                .authorities("ROLE_MANAGER","premium","read")
	                .build();
	        
	        var user5 = User.withUsername("wood")
	                .password("12345")
	                .authorities("ROLE_MANAGER","premium","write","read")
	                .build();
	        
	        manager.createUser(user1);
	        manager.createUser(user2);
	        manager.createUser(user3);
	        manager.createUser(user4);
	        manager.createUser(user5);
	        return manager;
	    }
	    
		@Bean
		public PasswordEncoder passwordEncoder() {
		    return NoOpPasswordEncoder.getInstance();
		}
	
	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception
	{
		// 디폴트로 AnonymousAuthenticationFilter가 사용됨
		//:BasicAuthenticationFilter 가 사용되지 않음
		//Filter filter, Class<? extends Filter> atFilter
		http.addFilterAt(skaFilter
				,BasicAuthenticationFilter.class).authorizeHttpRequests(
						c -> c.anyRequest().permitAll().and().addFilter(skaFilter));
		
		return http.build();
	}
	
	@Bean
    public FilterRegistrationBean<LoggingFilter> customFilterRegistration() {
        FilterRegistrationBean<LoggingFilter> registrationBean = 
        		new FilterRegistrationBean<>(new LoggingFilter());
        
        registrationBean.setOrder(1); // 필터의 우선순위 설정
        registrationBean.addUrlPatterns("/*"); // 필터를 적용할 URL 패턴 설정
        
        return registrationBean;
    }
	
}
