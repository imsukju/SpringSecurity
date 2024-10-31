package com.mych09_01.mych09_01.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public String getMethodName()
	{
		return "hello";
	}
	
	
	
}
