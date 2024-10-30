package com.laurentiuspilca.ssia.config;


import com.laurentiuspilca.ssia.handler.CustomAuthenticationFailureHandler;
import com.laurentiuspilca.ssia.handler.CustomAuthenticationSuccessHandler;
import com.laurentiuspilca.ssia.services.AuthenticationProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {
	
	
    private final CustomAuthenticationSuccessHandler authenticationSuccessHandler;

    private final CustomAuthenticationFailureHandler authenticationFailureHandler;

    public ProjectConfig(CustomAuthenticationSuccessHandler authenticationSuccessHandler,
                     CustomAuthenticationFailureHandler authenticationFailureHandler) {
    	this.authenticationSuccessHandler = authenticationSuccessHandler;
        this.authenticationFailureHandler = authenticationFailureHandler;
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http.formLogin(c ->
                c.successHandler(authenticationSuccessHandler)
                        .failureHandler(authenticationFailureHandler)
        );

//        http.httpBasic(Customizer.withDefaults());
//        http.exceptionHandling()
//        		.authenticationEntryPoint(new CustomEntryPoint());

        http.authorizeHttpRequests(c -> c.anyRequest().authenticated());

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SCryptPasswordEncoder sCryptPasswordEncoder() {
        return new SCryptPasswordEncoder(16384, 8, 1, 32, 16);
    }
}
