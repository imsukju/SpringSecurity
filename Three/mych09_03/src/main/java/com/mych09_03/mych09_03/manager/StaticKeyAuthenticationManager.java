package com.mych09_03.mych09_03.manager;


import java.util.List;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.mych09_03.mych09_03.provider.StaticKeyAuthenticationProvider;

@Component
public class StaticKeyAuthenticationManager implements AuthenticationManager {

    private final ProviderManager providerManager;

    public StaticKeyAuthenticationManager(StaticKeyAuthenticationProvider staticKeyProvider) {
        this.providerManager = new ProviderManager(List.of(staticKeyProvider));
    }

    @Override
    public Authentication authenticate(Authentication authentication) {
        return providerManager.authenticate(authentication);
    }
}
