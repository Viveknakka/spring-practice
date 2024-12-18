package com.example.SpringSecurityDemo.repo;

import com.example.SpringSecurityDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
  User findByUsername(String username);
}
