package com.example.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Laptop;
import com.example.app.repository.LaptopRepository;
@Service
public class LaptopService {
	@Autowired
    private LaptopRepository repo;
	public void addLaptop(Laptop lap) {
		// TODO Auto-generated method stub
		System.out.println("lap added...");
		repo.save(lap);
	}
	public void setRepo(LaptopRepository repo) {
		this.repo = repo;
	}
	public LaptopRepository getRepo() {
		return this.repo;
	}
	public List<Laptop> getLaps() {
		return repo.findAll();
		
	}

}
