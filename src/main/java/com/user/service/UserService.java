package com.user.service;

import com.user.dto.UserRequest;
import com.user.entity.User;
import com.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setMobile(userRequest.getMobile());
        user.setGender(userRequest.getGender());
        user.setAge(userRequest.getAge());
        user.setNationality(userRequest.getNationality());
        User save = userRepository.save(user);
        return save;

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) {
        return userRepository.findByUserId(id);
    }
    public User getUser(String userName){
        return userRepository.findByName(userName);
    }
}
