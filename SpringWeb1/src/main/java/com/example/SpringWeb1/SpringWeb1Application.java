package com.example.SpringWeb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;

@SpringBootApplication
public class SpringWeb1Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringWeb1Application.class, args);
		System.out.println("hello world...");
	}

}
