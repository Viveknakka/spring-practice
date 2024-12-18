package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        System.out.println("saved...");
        String sql="insert into Student (rollno,name,marks) values (?,?,?)";
        int row = jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(row+" affected");
    }

    public List<Student> findAll() {
        List<Student>li= new ArrayList<>();
        String sql = "Select * from Student";
        RowMapper<Student>mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        li = jdbc.query(sql,mapper);
        return li;
    }
}
