package com.mych09_03.mych09_03.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/product")
public class ProductController 
{
	private Logger logger = LoggerFactory.getLogger(ProductController.class.getName());


	@PostMapping("/add")
	
	public String add(@RequestParam("nane")String name)
	{
		logger.info("add product" + name);
		return "main";
	}
}
