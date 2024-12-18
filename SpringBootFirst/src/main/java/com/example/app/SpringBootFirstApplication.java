package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.app.model.Allien;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);

		Allien a = context.getBean("allien",Allien.class);
		a.code();
		System.out.println("a.ge"+a.getAge());
		
		
		
		
		
		
		
		//		//System.out.println("Hello world");
////		Laptop l = new Laptop();
////		l.displayName();
//		Laptop l=a.getBean(Laptop.class);
//		//Cpu c= a.getBean(Cpu.class);
//		//c.CpuDetails();
//		l.displayName();
	}

}
