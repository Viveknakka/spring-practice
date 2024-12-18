package com.example.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Allien {
  @Value("27")
  private int age;
  //@Autowired
 // @Qualifier("desktop")
  private Computer com;
  
  @Autowired
  @Qualifier("laptop")
  public void setCom(Computer com) {
	  this.com = com;
  }
  public Computer getCom() {
	  return this.com;
  }
  
  public void setAge(int age) {
	  this.age=age;
  }
  public int getAge() {
	  return this.age;
  }
  public void code() {
	  System.out.println("coding..");
	  com.compile();
  }
}
