package com.user.repository;

import com.user.entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User , Id>{

    public  User findByUserId(int id);

    User findByName(String userName);
}