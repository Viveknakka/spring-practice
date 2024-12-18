package com.example.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.app.model.Laptop;

@Component
public class LaptopRepository {
   @Autowired
   private JdbcTemplate jdbc;
   public void setJdbc(JdbcTemplate jdbc) {
	   this.jdbc=jdbc;
   }
   public JdbcTemplate getJdbc() {
	   return this.jdbc;
   }
   public void save(Laptop lap) {
	   System.out.println("lap saved....");
	   String sql = "insert into Laptop (name,version,price) values(?,?,?)";
	   int res=jdbc.update(sql,lap.getName(),lap.getVersion(),lap.getPrice());
	   System.out.println(res+" laptop is added");
   }

public List<Laptop> findAll() {
	List<Laptop>li = new ArrayList<>();
	return li;
}
}
