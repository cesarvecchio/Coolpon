package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.api.service.UserService;
import br.com.coolpon.coolpon.api.model.User;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/autentication")
public class UserController {
    private List<User> listUser = new ArrayList<User>();


    @PostMapping("/register")
    public String register(@RequestBody User user){
        listUser.add(user);
        return "Sucess";
    }

    @PostMapping("/login")
    public Object login(@RequestBody User info){
        return new UserService().login(listUser, info);
    }

    @GetMapping("/allUsers")
    public List<User> allUser(){
        return listUser;
    }
}
