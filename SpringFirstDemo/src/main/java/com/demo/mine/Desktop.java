package com.demo.mine;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
//@Primary
public class Desktop implements Computer {
	
	public Desktop(){
		System.out.println("desk created");
	}
@Override
 public void compile() {
	 System.out.println("compile using desktop..");
 }
}
