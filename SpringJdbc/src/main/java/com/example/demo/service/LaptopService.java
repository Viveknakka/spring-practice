package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo repo;
    public LaptopRepo getRepo() {
        return repo;
    }
    public void setRepo(LaptopRepo repo) {
        this.repo = repo;
    }
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public void deleteLaptop(int id) {
        repo.deleteById(id);
    }

    public void updateLaptop(Laptop lap) {
        repo.updateById(lap);
    }
    public void getLap(int id) {
        repo.getById(id);
    }
    public List<Laptop> getLaps(){
        return repo.findAll();
    }

}
