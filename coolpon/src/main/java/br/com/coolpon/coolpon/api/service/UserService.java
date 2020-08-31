package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.model.User;

import java.util.List;

public class UserService {

    public Object login(List<User> listUser, User info) {
        User user = null;
        for (User users : listUser) {
            if (users.getPhone().equals(info.getPhone()) &&
                    users.getFullName().equals(info.getFullName())) {

                user = users;
                break;
            }
        }

        if (user != null)
            return user;
        else
            return "User not found";

    }
}