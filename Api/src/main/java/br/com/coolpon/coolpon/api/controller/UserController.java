package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.api.model.LoginForm;
import br.com.coolpon.coolpon.api.model.User;
import br.com.coolpon.coolpon.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UserDto user) {
        service.register(user);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginForm loginForm) {
        List<UserDto> userDto = service.login(loginForm);
        if (userDto.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(userDto);
        }
    }

    @GetMapping
    public ResponseEntity allUser() {
        List<UserDto> userDtos = service.getAllUser();
        if (userDtos.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(userDtos);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Integer id) {
        UserDto userDto = service.getUserById(id);
        if (userDto == null){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(userDto);
        }
    }


}
