package com.example.SpringREST;

import com.example.SpringREST.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringRestApplication.class, args);
		System.out.println("server started...");
		Employee e= context.getBean(Employee.class);
	}

}
