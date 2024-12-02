package com.mych09_03.mych09_03.provider;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.mych09_03.mych09_03.token.StaticKeyAuthenticationToken;

@Component
public class StaticKeyAuthenticationProvider implements AuthenticationProvider {

    @Value("${authorization.key}")
    private String authorizationKey;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String token = (String) authentication.getCredentials();

        if (authorizationKey.equals(token)) 
        {
            return new StaticKeyAuthenticationToken(token, true); // 인증 성공
        } else {
            throw new AuthenticationException("인증 실패") {}; // 인증 실패
        }
    }

    @Override
    public boolean supports(Class<?> authentication) 
    {
        return StaticKeyAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
