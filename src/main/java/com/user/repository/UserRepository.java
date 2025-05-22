package com.user.repository;

import com.user.entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository  extends JpaRepository<User, UUID>{

    public  User findByUserId(UUID id);

    User findByName(String userName);
}