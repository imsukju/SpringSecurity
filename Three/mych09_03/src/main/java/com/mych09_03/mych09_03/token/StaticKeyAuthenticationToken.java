package com.mych09_03.mych09_03.token;


import org.springframework.security.authentication.AbstractAuthenticationToken;

public class StaticKeyAuthenticationToken extends AbstractAuthenticationToken {

    private final String token;

    public StaticKeyAuthenticationToken(String token, boolean authenticated) {
        super(null);
        this.token = token;
        setAuthenticated(authenticated);
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }
}
