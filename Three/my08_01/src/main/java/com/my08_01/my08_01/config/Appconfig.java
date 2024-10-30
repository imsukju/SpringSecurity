package com.my08_01.my08_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
public class Appconfig 
{
    @Bean
    public UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager();

        var user1 = User.withUsername("john")
                        .password("12345")
                        .roles("ADMID")
                        .build();

        var user2 = User.withUsername("jane")
                        .password("12345")
                        .roles("MANAGER")
                        .build();

        manager.createUser(user1);
        manager.createUser(user2);

        return manager;
    }
}
