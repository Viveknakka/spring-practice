package com.telusko.springsecdemo.service;

import com.telusko.springsecdemo.dao.UserRepo;
import com.telusko.springsecdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
    public void saveUser(User user){
        if (user.getPassword() == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }

        user.setPassword(encoder.encode(user.getPassword())); // Check this line
        repo.save(user);
    }

}
