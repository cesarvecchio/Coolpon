package br.com.coolpon.coolpon.controller;

import br.com.coolpon.coolpon.dao.UserDao;
import br.com.coolpon.coolpon.model.User;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    private List<User> listUser = new ArrayList<User>();


    @PostMapping("/register")
    public String register(@RequestBody User user){
        listUser.add(user);

        return "Sucess";
    }

    @PostMapping("/login")
    public Object login(@RequestBody User info){

        return new UserDao().login(listUser, info);

    }

    @GetMapping("/allUsers")
    public List<User> allUser(){
        return listUser;
    }
}
