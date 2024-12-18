package com.example.demo.repository;

import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class LaptopRepo {
    @Autowired
    private  JdbcTemplate jdbc ;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Laptop lap) {
        String sql="insert into Laptop (id,name,price) values (?,?,?)";
        int row=jdbc.update(sql,lap.getId(),lap.getName(),lap.getPrice());
        System.out.println(row+" rows are affected...");
    }

    public void deleteById(int id) {
        String sql = "delete from Laptop where id="+id;
        int row=jdbc.update(sql);
        System.out.println(row+" deleted....") ;
    }

    public void updateById(Laptop lap) {
        String sql = "UPDATE Laptop SET name = ?, price = ? WHERE id = ?";
        int row = jdbc.update(sql, lap.getName(), lap.getPrice(), lap.getId());
        System.out.println(row + " row(s) updated...");
    }


    public void getById(int id) {
        String sql = "select * from Laptop where id ="+id;
        List<Laptop>lap = jdbc.query(sql,(rs,rowNum)->{
           Laptop l= new Laptop();
            l. setId(rs.getInt("id"));
            l.setName(rs.getString("name"));
            l.setPrice(rs.getFloat("price"));
            return l;
        });
        System.out.println(lap);

    }

    public List<Laptop> findAll() {
        String sql = "select * from Laptop";
        RowMapper<Laptop> mapper = new RowMapper<Laptop>() {
            @Override
            public Laptop mapRow(ResultSet rs, int rowNum) throws SQLException {
                Laptop l = new Laptop();
                l.setId(rs.getInt("id"));
                l.setName(rs.getString("name"));
                l.setPrice(rs.getFloat("price"));
                return l;
            }
        };
        return jdbc.query(sql,mapper);
    }

}
