package com.example.SpringDataMongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String id;

    @Field("title")  // Explicitly map the 'title' field
    private String title;

    @Field("author")  // Explicitly map the 'author' field
    private String author;

    @Field("price")  // Explicitly map the 'price' field
    private double price;
}
