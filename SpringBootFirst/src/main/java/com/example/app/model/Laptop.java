package com.example.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer{
	@Autowired
	Cpu c;
public void compile() {
	System.out.println("compiling from laptop...");
	
}
 void displayName() {
	 System.out.println("Dell");
	 c.CpuDetails();
 }
}
