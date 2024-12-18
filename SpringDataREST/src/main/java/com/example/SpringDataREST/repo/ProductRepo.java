package com.example.SpringDataREST.repo;

import com.example.SpringDataREST.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepo  extends JpaRepository<Product,Integer> {
    List<Product> findByName(String name);
}
