package com.example.SpringDataMongoDB.repo;

import com.example.SpringDataMongoDB.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BookRepo extends MongoRepository<Book, String> {

}
