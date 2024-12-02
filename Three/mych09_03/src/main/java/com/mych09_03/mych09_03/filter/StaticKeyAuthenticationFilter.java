package com.mych09_03.mych09_03.filter;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mych09_03.mych09_03.manager.StaticKeyAuthenticationManager;
import com.mych09_03.mych09_03.token.StaticKeyAuthenticationToken;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class StaticKeyAuthenticationFilter implements Filter {

    private final StaticKeyAuthenticationManager authenticationManager;

    @Autowired
    public StaticKeyAuthenticationFilter(StaticKeyAuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        var httpRequest = (HttpServletRequest) request;
        var httpResponse = (HttpServletResponse) response;
        String authentication = httpRequest.getHeader("Authorization");

        try {
            // AuthenticationManager로 인증 처리
            authenticationManager.authenticate(new StaticKeyAuthenticationToken(authentication, false));
            chain.doFilter(request, response); // 인증 성공 시 다음 필터로
        } catch (Exception e) {
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 인증 실패 시 401 응답
        }
    }
}