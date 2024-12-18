package com.telusko.springdatajpaex.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Scope("prototype")
@Entity
public class Student {

	//properties 
	@Id
	private int rollNo;
	private String name;
	private int marks;

	@Override
	public String toString() {
		return "{ "+this.rollNo+" "+this.name+" "+this.marks+" }";
	}

	//getters and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
