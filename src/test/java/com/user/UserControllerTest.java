package com.user;

import com.user.controller.UserController;
import com.user.entity.User;
import com.user.service.UserService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @Mock
    private UserService userService;
    @InjectMocks
    UserController userController;

    @Test
    public void getAllUsers() {
        List<User> users = new ArrayList<>(Arrays.asList(User.builder().userId(UUID.randomUUID()).age(12).name("vaseem").gender("male").mobile("8448859822").build()));
        when(userService.getAllUsers()).thenReturn(users);
        ResponseEntity<List<User>> response = userController.getAllUsers();
        List<User> body = response.getBody();
        assertNotNull(body);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(1, body.size());
        assertFalse(response.getBody().isEmpty());


    }



}

