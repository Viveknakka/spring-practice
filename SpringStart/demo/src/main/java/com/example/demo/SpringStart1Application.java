package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringStart1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringStart1Application.class, args);
		Student s = context.getBean(Student.class);
		System.out.println("enter Student Details.");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rollno:");
		s.setRollNo(sc.nextInt());
		System.out.println("enter name:");
		s.setName(sc.next());
		System.out.println("enter marks:");
		s.setMarks(sc.nextInt());
		StudentService service= context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> li = service.getStudents();
		System.out.println(li);
	}

}
