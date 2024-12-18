package com.telusko.springdatajpaex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.telusko.springdatajpaex.model.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByName(String ram);
    @Query("select s from Student s where s.marks=?1")
    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
    @Query("select s from Student s where s.marks>=?1")
    List<Student> findByMarksGreaterThanOrEqual(int marks);

}
