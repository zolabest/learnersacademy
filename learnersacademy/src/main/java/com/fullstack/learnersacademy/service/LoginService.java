package com.fullstack.learnersacademy.service;


import com.fullstack.learnersacademy.model.User;
import com.fullstack.learnersacademy.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;
    public String login(String username, String password) {
        User user = loginRepository.findByUsername(username);
        if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
            return "success";
        }
        else
            return "fail";
    }
}

