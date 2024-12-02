package com.mych09_04.mych09_04.encoder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyCustomDelegatePasswordEncoder {
	
	public PasswordEncoder encoders()
	{
		String defaultEncoder = "custom";
		Map<String, PasswordEncoder> encoders = new HashMap<>();
		
		  // 커스텀 인코더를 등록
        encoders.put("custom", new PasswordEncoders());
  
        
        return new DelegatingPasswordEncoder(defaultEncoder, encoders);
	}

}
