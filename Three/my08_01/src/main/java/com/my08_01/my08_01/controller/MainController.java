package com.my08_01.my08_01.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController 
{
	@GetMapping("/hello")
	public String Hello()
	{
		return "Hello";
	}

	@GetMapping("/ciao")
	public String ciao()
	{
		return "ciao";
	}

	
	@GetMapping("/hola")
	public String hola()
	{
		return "hola";
	}


}
