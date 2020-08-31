package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.model.LoginForm;
import br.com.coolpon.coolpon.api.model.User;

import java.util.List;

public class UserService {

    public Object login(List<User> listUser, LoginForm form) {
        User user = null;
        for (User users : listUser) {
            if (users.getPhone().equals(form.getPhone()) &&
                    users.getFullName().equals(form.getFullName())) {

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
