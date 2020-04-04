package com.thymelogin.logindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LogindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogindemoApplication.class, args);
	}

}
