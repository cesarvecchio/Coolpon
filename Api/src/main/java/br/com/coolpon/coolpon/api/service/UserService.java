package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.api.model.LoginForm;
import br.com.coolpon.coolpon.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void register(UserDto dto) {
        userRepository.save(dto.toEntity());
    }

    public List<UserDto> login(LoginForm login) {
        List<UserDto> userDtos = new ArrayList<>();
        userRepository.findByPhone(login.getPhone()).forEach(user -> userDtos.add(new UserDto(user)));
        return userDtos;
    }

    public List<UserDto> getAllUser() {
        List<UserDto> userDtos = new ArrayList<>();
        userRepository.findAll().forEach(user -> userDtos.add(new UserDto(user)));
        return userDtos;
    }

    public UserDto getUserById(Integer id) {
        return new UserDto(userRepository.findById(id).get());
    }
}
