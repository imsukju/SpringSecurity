package com.mych09_03.mych09_03.config;

import org.apache.tomcat.util.http.Rfc6265CookieProcessor;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfFilter;

import com.mych09_03.mych09_03.filter.CsrfTokkenLogger;

@Configuration
public class AppConfig {
	@Bean
    public ServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addContextCustomizers((context) -> {
            Rfc6265CookieProcessor cookieProcessor = new Rfc6265CookieProcessor();
            cookieProcessor.setSameSiteCookies("Strict"); // SameSite 속성을 Strict로 설정
            context.setCookieProcessor(cookieProcessor);
        });
        return factory;
    }
	
//	@Bean
//	public SecurityFilterChain mychain(HttpSecurity http) 
//	{
//
//
//		try 
//		{
//			http.formLogin(c -> c.defaultSuccessUrl("/main",true));
//			
//			http.csrf(c ->c.ignoringRequestMatchers("/ciao"));
//			
//			http.addFilterAfter(new CsrfTokkenLogger(),
//					CsrfFilter.class).authorizeHttpRequests(c->c.anyRequest().authenticated());
//
//			return http.build();
//		} 
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//		
//	}

}
