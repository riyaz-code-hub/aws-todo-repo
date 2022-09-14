package com.riyaz.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.riyaz.todo.*")
public class AwsTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsTodoApplication.class, args);
		
		System.out.println("Test git ");
	}

}
