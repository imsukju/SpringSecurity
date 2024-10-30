package com.my08_01.my08_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
@Configuration
public class Appconfig 
{
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var manager = new InMemoryUserDetailsManager();
//
//        var user1 = User.withUsername("john")
//                        .password("12345")
//                        .roles("ADMIN")
//                        .build();
//
//        var user2 = User.withUsername("jane")
//                        .password("12345")
//                        .roles("MANAGER")
//                        .build();
//
//        manager.createUser(user1);
//        manager.createUser(user2);
//
//        return manager;
//    }
	
    @Bean
    public UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager();

        var user1 = User.withUsername("john")
                        .password("12345")
//                        .roles("ADMIN")
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
	
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
//  {
//      http.httpBasic(Customizer.withDefaults());
//
//      http.authorizeHttpRequests(
//          c -> c.requestMatchers("/hello").hasRole("ADMIN")
//          .requestMatchers("/ciao").hasRole("MANAGER")
//          .requestMatchers(HttpMethod.GET,"/a").authenticated()
//          .requestMatchers(HttpMethod.POST,"/a").permitAll()
//      		.anyRequest().denyAll());
//
//      return http.build();
//  }
  
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
//  {
//      http.httpBasic(Customizer.withDefaults());
//
//      http.authorizeHttpRequests
//      (
//          c -> c.requestMatchers("/product/{code:^[0-9]*$}").permitAll()
//          .anyRequest().denyAll()
//      );
//
//      return http.build();
//  }
	
//	  @Bean
//	  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
//	  {
//	      http.httpBasic(Customizer.withDefaults());
//
//	      http.authorizeHttpRequests
//	      (
//	          c -> c.requestMatchers(new RegexRequestMatcher(".*/[?:us|uk|ca]/[?:en|fr].*", HttpMethod.GET.name())).authenticated()
//	          .anyRequest().hasAuthority("premium")
//	       );
//
//	      return http.build();
//	  }
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults());

        http.authorizeHttpRequests(
                c -> c.requestMatchers(HttpMethod.GET,"/admin/**").access(                		
                        new WebExpressionAuthorizationManager(
                                "hasRole('ADMIN') and hasAuthority('premium')")) 
                
                        .requestMatchers(HttpMethod.GET,"/manager/home").access(
                                new WebExpressionAuthorizationManager(
                                        "hasRole('MANAGER') and hasAuthority('read')"))

                        .requestMatchers(HttpMethod.GET,"/manager/home/write").access(
                                new WebExpressionAuthorizationManager(
                                        "hasRole('MANAGER') and hasAuthority('premium') and hasAuthority('write')"))
                        
                        
                        .requestMatchers(HttpMethod.POST,"/manager/home/write").access(
                                new WebExpressionAuthorizationManager(
                                        "hasRole('MANAGER') and hasAuthority('premium') and hasAuthority('write')"))                		
                        
                        
                        .requestMatchers(HttpMethod.GET,"/manager/**").access(
                                new WebExpressionAuthorizationManager(
                                        "hasRole('MANAGER') and hasAuthority('read') and hasAuthority('premium')"))
                        
                        .requestMatchers(HttpMethod.POST,"/manager/**").access(
                                new WebExpressionAuthorizationManager(
                                        "hasRole('MANAGER') and hasAuthority('read') and hasAuthority('premium')"))
                        
                        
                        
                        .requestMatchers(new RegexRequestMatcher(".*/[?:us|uk|ca]/[?:en|fr].*", HttpMethod.GET.name())).authenticated()
                        
                        .requestMatchers(HttpMethod.GET,"/user/**").hasAuthority("premium")
                        .requestMatchers(HttpMethod.GET,"/public/**").permitAll()
                        .anyRequest().authenticated()
        );

        http.csrf(
                c -> c.disable()
        );

        return http.build();
    }
}
