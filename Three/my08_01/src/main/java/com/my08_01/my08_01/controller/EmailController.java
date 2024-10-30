package com.my08_01.my08_01.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@GetMapping("/email/{email}")
	public String getEmail(@PathVariable String email)
	{
		return email;
	}

}
