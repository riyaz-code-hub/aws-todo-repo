package com.riyaz.tution.web.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping(value = "/")
	public String homePage()
	{
		return "Welcome to home page";
	}
	
	
}
