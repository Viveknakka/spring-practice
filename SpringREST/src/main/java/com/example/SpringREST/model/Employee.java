package com.example.SpringREST.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Entity
@Scope("prototype")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    private double salary;
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
    private Date dateOfBirth;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

}
