package br.com.coolpon.coolpon.controller;

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
        User user = null;
        
        for(User users : listUser){
            if(users.getPhone().equals(info.getPhone()) &&
                    users.getFullName().equals(info.getFullName())) {

                user = users;
                break;
            }
        }

        if(user != null)
            return user;
        else
            return "User not found";

    }

    @GetMapping("/allUsers")
    public List<User> allUser(){
        return listUser;
    }
}
