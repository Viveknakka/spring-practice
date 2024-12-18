package com.telusko.springdatajpaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springdatajpaex.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);
	  Student s1= context.getBean(Student.class);
	  Student s2=context.getBean(Student.class);
	  Student s3=context.getBean(Student.class);
	 
	  StudentRepo repo=context.getBean(StudentRepo.class);
	  System.out.println(repo.findAll());
	  System.out.println(repo.findById(102));
	  System.out.println(repo.findByName("ram"));
	  System.out.println(repo.findByMarks(30));
	  System.out.println(repo.findByMarksGreaterThanOrEqual(80));
		s1.setRollNo(108);
		s1.setName("raghu");
		s1.setMarks(30);
	// repo.save(s1);for update and insert
		repo.delete(s1);
//

//
//
//	  s2.setRollNo(104);
//	  s2.setName("ram");
//	  s2.setMarks(89);
//
//
//	  s3.setRollNo(191);
//	  s3.setName("rohini");
//	  s3.setMarks(86);
//
//	  repo.save(s1);
//	  repo.save(s2);
//	  repo.save(s3);
	}

}
