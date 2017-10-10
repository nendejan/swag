package com.nendejan.swag.controllers;


import com.nendejan.swag.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="")
    public String index(Model model){

        model.addAttribute("title", "Welcome to SWAG!");
        model.addAttribute("signUp", "New to SWAG?");
        model.addAttribute("signIn", "Already a Member?");

        return "login/index";

    }

}
