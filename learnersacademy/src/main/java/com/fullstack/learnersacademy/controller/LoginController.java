package com.fullstack.learnersacademy.controller;

import com.fullstack.learnersacademy.model.User;
import com.fullstack.learnersacademy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

//    @GetMapping("/")
//    public String index(@ModelAttribute User user1) {
//        return "Dashboard";
//    }

    @GetMapping("/")
    public String login() {

        return "user";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute User user, Model model) {
        String status = loginService.login(user.getUsername(), user.getPassword());
        if(status.equals("success")){
            return "Dashboard";
        }

          return "redirect:/";
    }
}
