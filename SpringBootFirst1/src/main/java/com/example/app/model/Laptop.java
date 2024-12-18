package com.example.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	private String name;
	private int version;
	private int price;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setVersion(int version) {
		this.version=version;
	}
	public int getVersion() {
		return this.version;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	@Override
     public void compile() {
    	 System.out.println("Compiling using laptop...");
     }
}
