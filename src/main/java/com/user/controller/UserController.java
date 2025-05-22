package com.user.controller;

import com.user.dto.UserRequest;
import com.user.entity.User;
import com.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }
    @PostMapping("/saveList")
    public ResponseEntity<List<User>> saveListOfUser(@RequestBody @Valid Set<UserRequest> users) {
        return new ResponseEntity<>(userService.saveUsers(users), HttpStatus.CREATED);
    }
    @GetMapping("/FetchAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("{userId}")
    public ResponseEntity<User> getUser(@PathVariable UUID userId){
        return  ResponseEntity.ok(userService.getUser(userId));
    }
}
