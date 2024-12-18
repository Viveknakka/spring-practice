package com.demo.mine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Allien {
	
	 private int age;
	 @Autowired
	 //@Qualifier("lap1")
	 private Computer com;
	 public Computer getCom() {
         return com;
     }
     
     public void setCom(Computer com) {
         this.com = com;
     }
   
     Allien(int age,Computer com){
  		this.age=age;
  		this.com=com;
  	}
     public Allien(){
    	 
     }
	    // Getter
	    public int getAge() {
	        return age;
	    }

	    // Setter
	    public void setAge(int age) {
	    	System.out.println("setter called");
	        this.age = age;
	    }
//	Allien(){
//		System.out.println("allien created");
//	}
	
  void code() {
	  System.out.println("code");
	  com.compile();
	  
  }
}
