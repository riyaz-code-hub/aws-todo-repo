package com.riyaz.aws.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/")
	public String test()
	{
		return "AWS TODO APP ";
	}
	
	@GetMapping(value = "/test/{name}")
	public String welcome(@PathVariable("name") String name)
	{
		return "Welcome to AWS TODO APP Mr/Mrs::"+ name;
	}
}
