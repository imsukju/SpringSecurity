package com.mych09_04.mych09_04.encoder;

import java.security.MessageDigest;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoders implements PasswordEncoder
{

	
	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return hashWtihSHA512(rawPassword.toString());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		String hashpw = encode(rawPassword);
		
		return encodedPassword.equals(hashpw);
	}
	
	private String hashWtihSHA512(String input)
	{
		// 
		StringBuilder result = new StringBuilder();
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			byte [] digested = md.digest(input.getBytes());
			for(byte b : digested) {
				result.append(String.format("%02x", b));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result.toString();
	}
	
}
