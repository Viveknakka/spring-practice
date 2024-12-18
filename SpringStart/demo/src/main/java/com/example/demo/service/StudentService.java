package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public StudentRepository getRepo() {
        return repo;
    }

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }
    public void addStudent(Student s) {
        System.out.println("student added..");
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }


}
