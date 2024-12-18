package com.demo.mine.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.demo.mine.Allien;
import com.demo.mine.Computer;
import com.demo.mine.Desktop;
import com.demo.mine.Laptop;

@Configuration
@ComponentScan("com.demo.mine")
public class AppConfig {
//	@Bean
//	public Allien allien( Computer com) {//@Qualifier("desktop")
//		Allien a= new Allien();
//		a.setAge(30);
//		a.setCom(com);
//		//a.setCom(laptop1());
//		return a;
//	}
//	@Bean(name= {"d1","d2","abc"})
//	@Scope("prototype")
//	//@Qualifier("desktop")
//	@Primary
//   public Desktop desktop() {
//	   return new Desktop();
//   }
//	@Bean
//	//@Primary
//   public Laptop laptop1() {
//	   return new Laptop();
//   }
//	@Bean
//	public Laptop laptop2() {
//		return new Laptop();
//	}
}
