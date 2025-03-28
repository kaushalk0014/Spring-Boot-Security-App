package com.app.security.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.elk")
@EntityScan(basePackages = "com.app.entiry")
public class SpringBootSecurityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAppApplication.class, args);
	}

}
