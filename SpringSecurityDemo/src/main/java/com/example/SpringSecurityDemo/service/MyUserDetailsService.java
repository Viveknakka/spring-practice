package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.model.User;
import com.example.SpringSecurityDemo.model.UserPrincipal;
import com.example.SpringSecurityDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    // Constructor Injection for better testing and clarity
    @Autowired
    public MyUserDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Fetch user from database
        User user = userRepo.findByUsername(username);
        if(user==null)
        {
            throw  new UsernameNotFoundException("User not found with username: " + username);
        }
        // Return a custom UserPrincipal object
        return new UserPrincipal(user);
    }
}
