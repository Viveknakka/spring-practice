package com.example.demo;

import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
	    Laptop lap = context.getBean(Laptop.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter laptop id:");
		lap.setId(sc.nextInt());
		System.out.println("enter laptop name:");
		lap.setName(sc.next());
		System.out.println("enter laptop price:");;
		lap.setPrice(sc.nextFloat());
		LaptopService service= context.getBean(LaptopService.class);
		System.out.println("choos the option from the menu:" +"\n1.create"+"\n2.read"+"\n3.update"+"\n4.delete"+"\n5.getAll\n6.exit");
		int choice;
		do {
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					service.addLaptop(lap);
					break;
				case 2:
					service.getLap(lap.getId());
					break;
				case 3:
					service.updateLaptop(lap);
					break;
				case 4:
					service.deleteLaptop(lap.getId());
					break;
				case 5:
					System.out.println(service.getLaps());
					break;
				case 6:
					System.out.println("sucessfully exited...");
					exit(1);
				default:
					System.out.println("invalid option");
					;

			}
		}
		while(choice!=6);
	}

}
