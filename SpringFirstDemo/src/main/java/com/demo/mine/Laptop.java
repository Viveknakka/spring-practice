package com.demo.mine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap1")
@Primary
public class Laptop implements Computer{
//	Laptop(){
//		System.out.println("laptop created..");
//	}
	@Override
	public void compile(){
		System.out.println("complining using laptop");
	}
   void showName() {
	   System.out.println("Dell");
   }
}
