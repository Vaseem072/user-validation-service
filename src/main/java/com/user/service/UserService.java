package com.user.service;

import com.user.dto.UserRequest;
import com.user.entity.User;
import com.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public User getUser(UUID id) {
        return userRepository.findByUserId(id);
    }
    public User getUser(String userName){
        return userRepository.findByName(userName);
    }

    public List<User> saveUsers(Set<UserRequest> users){
       // User user=new User();
        Set<User> collect = users.stream().map((u) -> new User(u.getName(), u.getEmail(), u.getMobile(), u.getGender(), u.getAge(), u.getNationality())).collect(Collectors.toSet());
        List<User> users1 = userRepository.saveAll(collect);
        for(UserRequest use:users){
            System.out.println(use);
        }
        return users1;
    }
}
