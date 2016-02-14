package com.pragmatics.cinema.service;

import com.pragmatics.cinema.domain.User;
import com.pragmatics.cinema.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.saveUser(user);
    }

    public User getById(int id) {
        return userRepository.getById(id);
    }
}
