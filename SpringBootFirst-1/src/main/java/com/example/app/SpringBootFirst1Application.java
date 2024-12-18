package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.app.model.Laptop;


@SpringBootApplication
public class SpringBootFirst1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirst1Application.class, args);
	 Laptop l= (Laptop) context.getBean("laptop");
	 l.compile();
		
		
		
	
	}

}
