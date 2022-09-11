package com.riyaz.aws.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.riyaz.aws.app.*")
public class AwsTodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsTodoAppApplication.class, args);
	}

}
