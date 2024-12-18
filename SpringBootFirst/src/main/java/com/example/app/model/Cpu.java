package com.example.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
	@Autowired
	Processor p;
 void CpuDetails() {
	 System.out.println("intel octcore");
	 System.out.println("processor"+p.getProcessor());
	 
 }
}
