package com.app.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAppApplication.class, args);
	// Removed invalid duplicate main method
		System.out.println("Hello World");
	}

}
